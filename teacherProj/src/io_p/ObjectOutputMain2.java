package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class ObjectOutputMain2 {

   public static void main(String[] args) throws Exception {
      
      
      
      FileOutputStream fos = new FileOutputStream("fff/ppp.xcv");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      
      for (int i = 0; i < 5; i++) {
         //oos.writeObject("보낸다:"+i);
         oos.writeObject(new ObjAAA(i, "아기상어", false));
      }
      
      
      oos.close();
      fos.close();
   }

}