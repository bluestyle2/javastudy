package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutputMain {

   public static void main(String[] args) throws Exception {
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      bos.write(10);
      bos.write(1);
      bos.write(255);
      bos.write(256);
      bos.write(127);
      bos.write(128);
      bos.write(-1);
      bos.write(-2);
      bos.write(0);

      byte [] arr = bos.toByteArray();
      bos.close();
      
      System.out.println(Arrays.toString(arr));

   }

}