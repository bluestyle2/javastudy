package collection_p;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

//mp3 노래듣기를 구현하세요
//1. 노래 정보 :  트랙번호, 노래제목, 가수
//2. 노래 리스트 -->next 에 넣기
//3. 구현내용 다음곡, 이전곡, 트랙번호

class StackSong{
   int no;
   String title, singer;
   
   StackSong(int no, String song) {
      this.no = no;
      String [] arr = song.split("_");
      this.title = arr[0];
      this.singer = arr[1];
   }

   @Override
   public String toString() {
      return  no + ", 제목 : " + title + ", 가수 : " + singer;
   }
   
   boolean sch(String reg, String kind) {
      
      String pp1 = "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㅃㅉㄸㄲㅆ";
      String pp2 = "가나다라마바사아자차카타파하빠짜따까싸";
      String pp3 = "깋닣딯맇밓빟싷잏짛칳킿팋핗힣삫찧띻낗앃";
      
            
      String pp = ".*";
      for (char ch : reg.toCharArray()) {
            
         int pos = pp1.indexOf(ch);
         
         if(pos>=0) {
            pp += "["+pp2.charAt(pos)+"-"+pp3.charAt(pos)+"]";
         }else {
            pp+=ch;
         }
      }
      pp+= ".*";
      
      String ttt = title;
      
      if(kind.equals("가수")) {
         ttt = singer;
      }
      //System.out.println(ttt+"==>"+reg);
      
      return Pattern.matches(pp, ttt);
      
   }
   
   
}

class StackMP3{
   Scanner sc = new Scanner(System.in);
   Stack next = new Stack();
   Stack back = new Stack();
   StackSong now = null;
   
   int tot;
   
   void add(String ...songs ) {
      
      next.clear();
      back.clear();
      tot = songs.length;
      for (int i = songs.length-1; i >=0 ; i--) {
         next.push(new StackSong(i+1, songs[i]));
      }
   }
   
   void nextModule() {
      if(now!=null) {
         back.push(now);
      }
      
      now = (StackSong)next.pop();
   }
   
   void backModule() {
      if(now!=null) {
         next.push(now);
      }
      
      now = (StackSong)back.pop();
   }
   
   void trackModule(int no) {
      while(true) {
         if(now.no == no) {
            break;
         }else if(now.no<no) {
            nextModule();   
         }else {
            backModule();
         }
      }
   }
   
   
   void goNext() {
      System.out.println("다음 곡 듣기--------------------");
      
      if(!next.empty()) {
         
         nextModule();
         ppp();
      }else {
         System.out.println("마지막 곡입니다");
      }      
   }
   
   void goBack() {
      System.out.println("이전 곡 듣기--------------------");
      
      if(!back.empty()) {
         
         backModule();

         ppp();
      }else {
         System.out.println("처음 곡입니다");
      }
      
   }
   
   void goTrack(int no) {
      System.out.println(no+" 트랙 듣기--------------------");
      
      if(tot<no || no<1) {
         System.out.println("잘못된 트랙 번호 입니다.");
         return;
      }
      
      trackModule(no);
      
      ppp();
      
   }
   
   
   void sch(String reg) {
      System.out.println(reg+" 검색 --------------------");
      reg = ".*"+reg+".*";
      
      int nowNo = now.no;
      boolean res = false;
      
      while(!next.empty()) {
         
         nextModule();
         if(res=Pattern.matches(reg, now.title)) {
            break;
         }
      }
      
      if(!res) {
         while(!back.empty()) {
            backModule();
         }
         
         res=Pattern.matches(reg, now.title);
         
         while(nowNo > now.no) {
            
            nextModule();
            if(res=Pattern.matches(reg, now.title)) {
               break;
            }
         }
      }
      
      
      if(res) {
         
      }else {
         System.out.println("찾는 곡이 없습니다.");
      }
      
      ppp();
      
   }
   
   
   void sch2(String reg) {
      System.out.println(reg+" 검색2 --------------------");
      reg = ".*"+reg+".*";
      
      int nowNo = now.no;
      boolean res = false;
      
      ArrayList resList = new ArrayList();
      
      
      while(!next.empty()) {
         
         nextModule();
         if(Pattern.matches(reg, now.title)) {
            //break;
            res=true;
            resList.add(now);
         }
      }
      
      
      while(!back.empty()) {
         backModule();
      }
      
      if(Pattern.matches(reg, now.title)) {
         //break;
         res=true;
         resList.add(now);
      }
      
      while(nowNo > now.no) {
         
         nextModule();
         if(Pattern.matches(reg, now.title)) {
            //break;
            res=true;
            resList.add(now);
         }
         
      }
      
      
      if(res) {
         System.out.println("검색결과:"+resList);
         System.out.print("번호선택:");
         int no = sc.nextInt();
         
         trackModule(no);
      }else {
         System.out.println("찾는 곡이 없습니다.");
      }
      
      ppp();
      
   }
   
   void sch3(String reg, String kind) {
      System.out.println(kind+"=>"+reg+" 검색3 --------------------");
      //reg = ".*"+reg+".*";
      
      int nowNo = now.no;
      boolean res = false;
      
      ArrayList resList = new ArrayList();
      
      
      while(!next.empty()) {
         
         nextModule();
         if(now.sch( reg, kind)) {
            //break;
            res= true;
            resList.add(now);
         }
      }
      
      
      while(!back.empty()) {
         backModule();
      }
      if(now.sch( reg, kind)) {
         //break;
         res= true;
         resList.add(now);
      }
      
      while(nowNo > now.no) {
         
         nextModule();
         if(now.sch( reg, kind)) {
            //break;
            res= true;
            resList.add(now);
         }
         
      }
      
      
      if(res) {
         System.out.println("검색결과:"+resList);
         System.out.print("번호선택:");
         int no = sc.nextInt();
         
         trackModule(no);
      }else {
         System.out.println("찾는 곡이 없습니다.");
      }
      
      ppp();
      
   }
   
   
   
   void ppp() {
      System.out.println("현재곡:"+now);
      System.out.println("이전곡 : "+back);
      System.out.println("다음곡 : "+next);
   }
}


public class StackMP3Main {

   public static void main(String[] args) {
      StackMP3 mp3 = new StackMP3();
      mp3.add("낙하 (with 아이유)_AKMU(악뮤)",
             "신호등_이무진",
            "Next Level_aespa",
             "Permission to Dance_방탄소년단",
             "Weekend_태연(TAEYEON)",
             "Stay_The Kid LAROI, Justin Bieber",
             "Butter_방탄소년단",
             "Queendom_Red Velvet (레드벨벳)",
             "바라만 본다_MSG워너비(M.O.M)",
             "DUMB dUMB_전소미");
      
      mp3.goNext();
      mp3.goNext();
      mp3.goNext();
//      mp3.goNext();
//      mp3.goNext();
//      mp3.goNext();
//      mp3.goNext();
//      mp3.goNext();
//      mp3.goNext();
//      mp3.goNext();
//      mp3.goNext();
//      mp3.goNext();
//      
//      mp3.goBack();
//      mp3.goBack();
//      mp3.goBack();
//      mp3.goBack();
//      mp3.goBack();
//      mp3.goBack();
//      mp3.goBack();
//      mp3.goBack();
//      mp3.goBack();
//      mp3.goBack();
      mp3.goBack();
      mp3.goTrack(11);
      mp3.goTrack(9);
      mp3.goTrack(5);
      //mp3.sch("d");
      mp3.sch("아브라카타브라");
      //mp3.sch("호");
      //mp3.sch("e");
      //mp3.sch2("e");
      //mp3.sch3("e","가수");
      mp3.sch3("ㅇㅁ","가수");
   }

}