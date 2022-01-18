package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class ObjectOutputMain {

   public static void main(String[] args) throws Exception {
      
      
      ArrayList<Integer> arr = new ArrayList();
      arr.add(10);
      arr.add(50);
      arr.add(30);
      arr.add(40);
      
      FileOutputStream fos = new FileOutputStream("fff/nnn.xcv");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      
      
      
      oos.writeBoolean(true);
      oos.writeInt(123);
      oos.writeDouble(987.654);
      oos.writeUTF("안냐세요");
      oos.writeObject(arr);
      oos.writeObject(new ObjAAA());
      oos.writeObject(new ObjAAA(20,"엄마상어",false));
      oos.writeObject(new ObjAAA(30,"아빠상어",true));
      oos.writeObject(new ObjAAA(40,"할머니상어",false));
      
      oos.close();
      fos.close();
   }

}