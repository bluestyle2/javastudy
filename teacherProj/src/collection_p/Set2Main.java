package collection_p;

import java.util.HashSet;

public class Set2Main {

   public static void main(String[] args) {
      HashSet ss1 = new HashSet();
      ss1.add(10);
      ss1.add(20);
      ss1.add(30);
      ss1.add(40);
      ss1.add(50);
      
      HashSet ss2 = new HashSet();
      
      ss2.add(30);
      ss2.add(40);
      ss2.add(50);
      ss2.add(60);
      ss2.add(70);
      
      System.out.println("ss1:"+ss1);
      System.out.println("ss2:"+ss2);
      
      HashSet uni = new HashSet(ss1);
      uni.addAll(ss2);
      System.out.println("합집합:"+uni);

      HashSet ins = new HashSet(ss1);
      ins.retainAll(ss2);
      System.out.println("교집합:"+ins);
            
      HashSet sub_1 = new HashSet(ss1);
      sub_1.removeAll(ss2);
      System.out.println("ss1-ss2:"+sub_1);
      
      
      HashSet sub_2 = new HashSet(ss2);
      sub_2.removeAll(ss1);
      System.out.println("ss2-ss1:"+sub_2);
   }

}
