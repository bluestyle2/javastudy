package db_p;

import java.util.ArrayList;

public class MemberMain {

   public static void main(String[] args) {
      /*
      ArrayList<MemberDTO> arr = new ArrayList<MemberDTO>();
      
      arr.add(new MemberDTO("ddd", "정우성", "333", "디버깅"));
      arr.add(new MemberDTO("eee", "정좌성", "444", "기획"));
      arr.add(new MemberDTO("aaa", "정남성", "555", "프로젝트"));  // 에러발생 구간
      arr.add(new MemberDTO("fff", "정중성", "666", "숙제"));
      arr.add(new MemberDTO("ggg", "정북성", "777", "연습"));
      
      System.out.println(arr);
      
      new MemberDAO().insert(arr);
      
      
      
      ArrayList<MemberDTO> arr2 = new ArrayList<MemberDTO>();
      
      arr2.add(new MemberDTO("qqq", "현빈", "123", "개발"));
      arr2.add(new MemberDTO("www", "원빈", "456", "소발"));
      arr2.add(new MemberDTO("aaa", "투빈", "789", "닭발"));  //에러발생구간
      arr2.add(new MemberDTO("rrr", "장희빈", "741", "양발"));
      arr2.add(new MemberDTO("ttt", "젤리빈", "852", "양말"));
      
      System.out.println(arr2);
      
      new MemberDAO().insert2(arr2);
      */
      
      
      ArrayList<MemberDTO> arr3 = new ArrayList<MemberDTO>();
      
      arr3.add(new MemberDTO("qqq", "현빈", "123", "개발"));
      arr3.add(new MemberDTO("www", "원빈", "456", "소발"));
      arr3.add(new MemberDTO("nnn", "투빈", "789", "닭발"));
      arr3.add(new MemberDTO("rrr", "장희빈", "741", "양발"));
      arr3.add(new MemberDTO("ttt", "젤리빈", "852", "양말"));
      
      System.out.println(arr3);
      
      new MemberDAO().insert2(arr3);
      
      
      for (MemberDTO dto : new MemberDAO().list()) {
         System.out.println(dto);
      }
   }

}