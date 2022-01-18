package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayMain {

   public static void main(String[] args) throws Exception {
      byte [] arr = {11,-1,45,23,78,-123,1,123,-85,67,-9,0,1};

      byte [] newArr;
      // in -> out  -> newArr 
      
      ByteArrayInputStream bis = new ByteArrayInputStream(arr);
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      
      int data;
      while((data=bis.read())!=-1) {
         
         //System.out.println(data);
         
         bos.write(data);
         
      }
      newArr = bos.toByteArray();
      
      bos.close();
      bis.close();
      
      System.out.println(Arrays.toString(arr));
      System.out.println(Arrays.toString(newArr));
      
   }

}