package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;



public class ObjInExamMain {

   public static void main(String[] args) throws Exception {
      
      FileInputStream fis = new FileInputStream("fff/qqq.asd");
      ObjectInputStream ois = new ObjectInputStream(fis);
      
      
      while( fis.available()>0) {
         System.out.println(ois.readObject());
      }
      
      ois.close();
      fis.close();
   }

}