package collection_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class MyMapCom implements Comparator{
   @Override
   public int compare(Object o1, Object o2) {
      int me = (int)o1;
      int you = (int)o2;
      return you-me;
      
      //return 1;
   }
}

class MyMapCom2 implements Comparator{
   @Override
   public int compare(Object o1, Object o2) {
      
      //return 1;
      
      MapMem me = (MapMem)o1;
      MapMem you = (MapMem)o2;
      
      int res = me.jum-you.jum;
      
      if(res==0)
         res = me.name.compareTo(you.name);
      
      return res;
   }
}


class MapMem{
   
   String name;
   int jum;
   public MapMem(String name, int jum) {
      
      this.name = name;
      this.jum = jum;
   }
   @Override
   public String toString() {
      return name + ", " + jum ;
   }
}




public class TreeMapMain {

   public static void main(String[] args) {
      
      
      TreeMap t1 = new TreeMap();
      TreeMap t2 = new TreeMap(new MyMapCom());
      LinkedHashMap lh = new LinkedHashMap();
      HashMap hm = new HashMap();
      TreeMap t3 = new TreeMap(new MyMapCom2() );
      TreeMap t4 = new TreeMap(new MyMapCom());
      
      
      int [] arr = {11,44,33,66,55,44};
      
      for (int j = 0; j < arr.length; j++) {
         
      
         t1.put(arr[j], "배"+j);
         t2.put(arr[j], "배"+j);
         lh.put(arr[j], "배"+j);
         hm.put(arr[j], "배"+j);
      }
      
      System.out.println(t1);
      System.out.println(t2);
      System.out.println(lh);
      System.out.println(hm);
      
      t4.put(3, new ArrayList());
      t4.put(25, new ArrayList());
      t4.put(7, new ArrayList());
      t4.put(12, new ArrayList());
      
      System.out.println(t4);
      
      t3.put(new MapMem("한가인", 17),new ArrayList());
      t3.put(new MapMem("두가인", 27),new ArrayList());
      t3.put(new MapMem("삼가인", 17),new ArrayList());
      t3.put(new MapMem("사가인", 37),new ArrayList());
      
      System.out.println(t3);
      

   }

}
