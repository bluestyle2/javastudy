package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteBufMain {

   public static void main(String[] args) throws Exception {
      byte [] arr = {11,-1,45,23,78,-123,1,123,-85,67,-9,0,1};

      byte [] newArr;
      // in -> out  -> newArr 
      
      ByteArrayInputStream bis = new ByteArrayInputStream(arr);
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      
      byte [] buf = new byte[5];
      
      System.out.println(bis.available()); //남아있는 요소 갯수
      
      //int data = bis.read();
//      int size = bis.read(buf);   //buf 배열 크기 만큼 가져옴
//      //int size = bis.read(buf, 1, 3); //임시배열, 임시배열 시작위치, 가져올 갯수
//      System.out.println(bis.available());
//      System.out.println(size);   //cnt : bis에서 가져온 요소 갯수
//      System.out.println(Arrays.toString(buf));
      
//      bos.write(buf);   //buf 에 있는 원소를 bos 에 대입함
//      bos.write(buf,1,2);   //임시배열, 임시배열 시작위치, 가져올 갯수
      
      int cnt = 0;
      while(bis.available()>0) {
         cnt++;
         int size = bis.read(buf);
         System.out.println(cnt+":"+Arrays.toString(buf)+":"+size);
         bos.write(buf,0,size);
      }
      
      
      newArr = bos.toByteArray();
      
      bos.close();
      bis.close();
      
      System.out.println(Arrays.toString(arr));
      System.out.println(Arrays.toString(newArr));
      
      
      //안녕하세요 그린Computer 123456789!@#$%
      
      byte [] ttt1 = "안녕하세요 그린Computer 123456789!@#$%".getBytes();
      bis = new ByteArrayInputStream(ttt1);
      bos = new ByteArrayOutputStream();
      
      cnt = 0;
      while(bis.available()>0) {
         cnt++;
         int size = bis.read(buf);
         System.out.println(cnt+":"+Arrays.toString(buf)+":"+size);
         bos.write(buf,0,size);
      }
      
      
      byte [] ttt2 = bos.toByteArray();
      
      bos.close();
      bis.close();
      
      String str = new String(ttt2);
      
      System.out.println(Arrays.toString(ttt1));
      System.out.println(Arrays.toString(ttt2));
      System.out.println(str);

   }

}