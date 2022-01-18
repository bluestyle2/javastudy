package collection_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



class MapCom implements Comparator{

   @Override
   public int compare(Object o1, Object o2) {
      // TODO Auto-generated method stub
      return 1;
   }
   
}

public class MapMultipleMain {

   public static void main(String[] args) {
      int [] ori = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29 };
      
      HashMap nums = new HashMap();
      //TreeMap nums = new TreeMap(new MapCom());
      
      nums.put(2, new ArrayList());
      nums.put(3, new ArrayList());
      nums.put(5, new ArrayList());

      /*
      for (int i : ori) {
         
         if(i%5==0) {
            ArrayList three = (ArrayList)nums.get(5);
            three.add(i);
         }
         
         if(i%2==0) {
            ArrayList three = (ArrayList)nums.get(2);
            three.add(i);
         }
         
         if(i%3==0) {
            ArrayList three = (ArrayList)nums.get(3);
            three.add(i);
         }
      }*/
      
      Set kk = nums.keySet();
      
      for (int i : ori) {
         for (Object key : kk) {
            //System.out.println(i+","+key);
            int k = (int)key;
            if(i%k==0) {
               
               ArrayList three = (ArrayList)nums.get(key);
               
               
               three.add(i);
            }
         }
      }
      
      
      
      //System.out.println(nums);
      for( Object oo:nums.entrySet()) {
         Map.Entry me = (Map.Entry)oo;
         System.out.println(me.getKey()+","+me.getValue());
      }

   }

}