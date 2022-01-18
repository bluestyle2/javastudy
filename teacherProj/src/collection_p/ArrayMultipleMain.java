package collection_p;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayMultipleMain {

   // 23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29 
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int [] ori = {23,45,46,50,10,25,32,8,120,11,67,89,22,43,61,29 };
      
      ArrayList tot = new ArrayList();
      
      for (int i = 0; i <=5; i++) {
         tot.add(new ArrayList());   
      }
      
      
      for (int i: ori) {
         //System.out.println(i);
         for (int j = 2; j <=5; j++) {
            if(j!=4 && i%j==0) {
               //System.out.print(j+",");
               ((ArrayList)tot.get(j)).add(i);
            }
         }
         //System.out.println();
      }
      
      for (String title : "2,3,5".split(",")) {
         ArrayList arr = (ArrayList)tot.get(Integer.parseInt(title));
         Collections.sort(arr);
         System.out.println(title+":"+arr );
         
      }
   }

}