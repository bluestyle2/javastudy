package collection_p;

import java.util.HashSet;

//기존의 야구팀원리스트--------> 1군리스트
//2군리스트
//FA리스트----> FA 가능 리스트
//변경전
//1군 리스트  박재상, 박정권, 최정, 김광현, 엄정욱, 박희수, 이호준
//2군 리스트  이호준 , 엄정욱, 박재홍, 이신협, 장동건
//FA리스트  이병규,이승엽, 박정권, 장동건, 박용택, 홍성흔
//변경후
//1군      박재상, 최정, 김광현, 박희수
//2군      이호준 , 엄정욱, 박재홍, 이신협, 
//FA 가능  이병규,이승엽, 박용택, 홍성흔

public class BaseBallMain {

   public static void main(String[] args) {
      HashSet t1 = new HashSet();
      HashSet t2 = new HashSet();
      HashSet fa = new HashSet();
      
      for (String str: "박재상,박정권,최정,김광현,엄정욱,박희수,이호준".split(",")) {
         t1.add(str);
      }
      
      for (String str: "이호준,엄정욱,박재홍,이신협,장동건".split(",")) {
         t2.add(str);
      }
      for (String str: "이병규,이승엽,박정권,장동건,박용택,홍성흔".split(",")) {
         fa.add(str);
      }
      
      System.out.println("변경전 >>>");
      System.out.println("1군:"+t1);
      System.out.println("2군:"+t2);
      System.out.println("FA:"+fa);

      HashSet newFA = new HashSet(fa);
      
      newFA.removeAll(t1);
      newFA.removeAll(t2);
      
      t1.removeAll(t2);
      t1.removeAll(fa);      
      t2.removeAll(fa);
      
      System.out.println("변경후 >>>");
      System.out.println("1군:"+t1);
      System.out.println("2군:"+t2);
      System.out.println("FA:"+newFA);
   }

}