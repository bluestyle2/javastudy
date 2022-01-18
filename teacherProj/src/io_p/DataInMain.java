package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInMain {

   public static void main(String[] args) throws Exception {

      FileInputStream fis = new FileInputStream("fff/eee.abc");
      DataInputStream dis = new DataInputStream(fis);
      
//      dos.writeBoolean(false);
//      dos.writeInt(123);
//      dos.writeDouble(123.456);
//      dos.writeUTF("안녕하세요");
      
      System.out.println(dis.readBoolean());
      System.out.println(dis.readInt());
      System.out.println(dis.readDouble());
      System.out.println(dis.readUTF());
      
      dis.close();
      fis.close();

   }

}