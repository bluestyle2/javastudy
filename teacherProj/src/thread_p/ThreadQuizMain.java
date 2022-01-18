package thread_p;

import java.util.ArrayList;

import javax.swing.JOptionPane;


class QuizData{
   
   String qq , ans, correct ;
   
   boolean res = false;

   public QuizData(String qq, String correct ) {
      super();
      this.qq = qq;
      this.correct  = correct;
   }
   
   void play(ThTimer timer) {
      ans = JOptionPane.showInputDialog(qq);
      
      if(timer.chk) {
         ans = null;
         return;   
      }
      
      res = correct.equals(ans);
   }

   @Override
   public String toString() {
      return qq + ": " + ans + "(" + correct + ") =>" + res;
   }
   
   
   
}

class ThQuiz extends Thread{
   
   //String [] arr = {"1+1=?", "빨강색을 영어로?", "선생님 특기는?"   };
   
   ArrayList<QuizData> arr;
   
   ThTimer timer;
   

   public ThQuiz(ThTimer timer) {
      super();
      this.timer = timer;
      
      arr = new ArrayList();
      arr.add(new QuizData("1+1=?","2"));
      arr.add(new QuizData("빨강색을 영어로?","red"));
      arr.add(new QuizData("선생님 특기는?","귀요미"));
   }

   @Override
   public void run() {
      
      for (QuizData qd : arr) {
         //System.out.println(str);
         
         qd.play(timer);
         if(timer.chk)
            break;
      }
      timer.chk = true;
      System.out.println("게임 종료");
      
      for (QuizData qd : arr) {
         System.out.println(qd);
      }
   }
}

class ThTimer extends Thread{
   
   boolean chk = false;
   
   @Override
   public void run() {
      for (int i = 10; i >= 0; i--) {
            
         try {
            
            sleep(1000);
            
            if(chk)
               break;
            
            System.out.println(i);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      chk = true;
      //System.out.println("타이머 종료");
   }
}

public class ThreadQuizMain {

   public static void main(String[] args) {
      
      ThTimer tt = new ThTimer();
      ThQuiz qq = new ThQuiz(tt);
      
      
      tt.start();
      qq.start();
      
   }
}