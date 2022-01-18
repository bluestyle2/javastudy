package thread_p;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
기획
2. 데이터를 가지고-> 과목들
3. 과목
     - 문제지
     - 시계
     3.1. 시계 시작
      3.1.1. 문제를 보여주고 
      3.1.2. 답변받고 
      3.1.3. 정답과 비교?
      3.1.4. 맞은 답의 개수를 세는 기능!
       3.1.5. 시험종료와 동시에 카운트도 종료되며 점수 도출 
   //3.2 시간 끝나면 다음 과목으로 넘어가게 하기  --> 3.1 부터 다시 시작
     3.2 시간 끝 -> 과목종료
4. 과목들 반복시키기
     4.1 각 과목 반복시키며 3.1 시작
     4.2 과목 종료시 다음 과목 4.1 시작
5. 시험종료(과목 반복 종료)와 동시에 점수 도출

설계
1. 데이터
과목들 - 과목, 평균                  
과목 - 문제지, 시계, 정답, 오답, 점수, 갯수, 과목이름, 종료
문제 - 문제, 정답, 배점, 학생답, 결과
시계 - 제한시간

2. 기능
과목들 -> 각 과목 반복, 과목 시작, 과목 종료 확인, 평균계산 및 보여주기
과목 -> 과목이름/문제지/시간설정  , 시계 시작, 문제들 보여주기,  정답 갯수, 시계 종료
문제 -> 문제/답안/배점 설정, 문제출력, 답변받기, 비교 채점
시계 -> 제한시간 설정, 시간 흐르기, 시간 종료
*/


class ExamTimer extends Thread{
   int limit;

   boolean chk = false;
   public ExamTimer(int limit) {

      this.limit = limit;
   }



   public void run() {
      for (int i = limit; i >=0; i--) {
         try {
            sleep(1000);
            System.out.println(i);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
      chk = true;
   };
}

class ExamQQ{
   String qq, ans, input;
   int score, res;
   public ExamQQ(String qq, String ans, int score) {
      
      this.qq = qq;
      this.ans = ans;
      this.score = score;
   }
   
   void ppp(ExamTimer timer) {
      input = JOptionPane.showInputDialog(qq);
      
      res = 0;
      if(timer.chk) {
         input = null;
         return;
      }
      
      if(input.equals(ans)) {
         res = score;
      }   
   }

   @Override
   public String toString() {
      return qq + " => " + input + "(" + ans + ") , " + res + "(" + score + ")";
   }
   
   
}

class ExamSubject{
   String title;
   
   ArrayList<ExamQQ>arr = new ArrayList<ExamQQ>(), 
         success = new ArrayList<ExamQQ>(), 
         fail = new ArrayList<ExamQQ>();
   
   ExamTimer timer;
   
   int res = 0;

   public ExamSubject(String title, int time, ExamQQ... arr) {
      
      this.title = title;
      timer = new ExamTimer(time);
      
      for (ExamQQ examQQ : arr) {
         this.arr.add(examQQ);
      }
       
   }
   
   void startttt() {
      System.out.println(title+" 시작 -----");
      timer.start();
      for (ExamQQ examQQ : arr) {
            
         examQQ.ppp(timer);
         
         if(timer.chk)
            break;   
      }
      
      fff();
   }
   
   void fff() {
      System.out.println(title+" 종료 -----");
      res = 0;
      timer.chk = true;
      for (ExamQQ examQQ : arr) {
         res += examQQ.res; 
         if(examQQ.res==0) {
            fail.add(examQQ);
         }else {
            
            success.add(examQQ);
         }
      }
   }
   
   void ppp() {
      System.out.println(title+":"+res);
      System.out.println("정답:");
      for (ExamQQ examQQ : success) {
         System.out.println(examQQ);
      }
      System.out.println("오답:");
      for (ExamQQ examQQ : fail) {
         System.out.println(examQQ);
      }
   }
}

class ExamToT{
   int now = 0;
   ArrayList<ExamSubject> arr = new ArrayList<ExamSubject>();

   public ExamToT() {
      arr.add(new ExamSubject("국어", 20, 
            new ExamQQ("홍길동전의 저자는?", "허균", 20),
            new ExamQQ("선생님 성함은?", "이신협", 30),
            new ExamQQ("7번째 날을 우리말로 하면?", "이레", 15),
            new ExamQQ("한글을 만든 사람은?", "세종대왕", 10),
            new ExamQQ("가나다", "라마바", 25)
            ));
      
      arr.add(new ExamSubject("영어", 30, 
            new ExamQQ("사과?", "apple", 30),
            new ExamQQ("바나나?", "banana", 30),
            new ExamQQ("ASAP?", "as soon as possible", 15),
            new ExamQQ("ASCII?", "American Standard Code for Information Interchange", 25)
            ));
      
      arr.add(new ExamSubject("수학", 25, 
            new ExamQQ("1+1?", "2", 10),
            new ExamQQ("3x7?", "21", 30),
            new ExamQQ("10+3*13", "49", 15),
            new ExamQQ("3^6?", "729", 10),
            new ExamQQ("5-2", "3", 25),
            new ExamQQ("15/3", "5", 10)
            ));
      
      starttt();
   }
   
   
   void starttt() {
      
      arr.get(now).startttt();
      
      while(true) {
         
         if(arr.get(now).timer.chk) {
            if(now==arr.size()-1 ) {
               break;
            }
            now++;
            arr.get(now).startttt();
         }   
      }
      ppp();
   }
   
   void ppp() {
      System.out.println("[[[[[ 시험 종료 ]]]]]");
      
      int tot = 0;
      for (ExamSubject es : arr) {
         es.ppp();
         tot += es.res;
      }
      
      int avg = tot/arr.size();
      
      System.out.println(tot+","+avg);
   }
   
}




public class ExamMain0902 {

   public static void main(String[] args) {
   
      new ExamToT();
   }

}