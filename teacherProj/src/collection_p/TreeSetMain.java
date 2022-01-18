package collection_p;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


///정렬방식클래스
class MyCom implements Comparator{

   @Override  //정렬메소드 재정의
   public int compare(Object o1, Object o2) {
      // o1 : 현재 add 된 값
      // o2 : 현재 set 에 들어있는 값(한개씩 비교한다. 모두 비교하지는 않는다) 
      //System.out.println(o1+":"+o2);
      //0 : 삭제
      //1(양수) : 뒤
      //-1(음수): 앞
      return -1;
   }
   
}

///정렬방식클래스
class MyCom2 implements Comparator{

   @Override  //정렬메소드 재정의
   public int compare(Object o1, Object o2) {
      // o1 : 현재 add 된 값
      // o2 : 현재 set 에 들어있는 값(한개씩 비교한다. 모두 비교하지는 않는다) 
      int me = (int)o1;
      int you = (int)o2;
      //0 : 삭제
      //1(양수) : 뒤
      //-1(음수): 앞
      
      int res = you-me;
      System.out.println(me+":"+you+"=>"+res);
      if(res==0)
         res = 1;
      
      return res;
   }
   
}


public class TreeSetMain {

   public static void main(String[] args) {
      
      Object [] arr = {34,56,32,12,23,78,90,78,90,56}; //,"asdf"};
      HashSet s1 = new HashSet();
      LinkedHashSet s2 = new LinkedHashSet();
      TreeSet s3 = new TreeSet();
      TreeSet s4 = new TreeSet(  new MyCom() );
      TreeSet s5 = new TreeSet(  new MyCom2() );
      
      
      
      for (Object i: arr) {
         s1.add(i);
         
         s2.add(i);
         s3.add(i);
         s4.add(i);
         s5.add(i);
         System.out.println("-----------------");
      }
      
      System.out.println("s1:"+s1);
      System.out.println("s2:"+s2);
      System.out.println("s3:"+s3);
      System.out.println("s4:"+s4);
      System.out.println("s5:"+s5);
      
   }

}