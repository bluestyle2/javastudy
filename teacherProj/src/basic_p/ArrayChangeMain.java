package basic_p;

import java.util.Arrays;

public class ArrayChangeMain {

   public static void main(String[] args) {

      int [] arr = {11,22,33};
      
      System.out.println(Arrays.toString(arr));
      
      int no = 44;
      
      int [] buf = new int[arr.length+1];
      
      for (int i = 0; i < arr.length; i++) {
         buf[i]=arr[i];
      }
      
      buf[arr.length] = no;
      System.out.println(Arrays.toString(buf));
      
      arr = buf;
      System.out.println(Arrays.toString(arr));
   }

}