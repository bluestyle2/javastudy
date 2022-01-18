package io_p;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderMain {

   public static void main(String[] args) throws Exception {

//
//      FileReader fr = new FileReader("fff/aaa.txt");
//      FileWriter fw = new FileWriter("fff/ggg.txt");
//      
////      int data;
////      while((data=fr.read())!=-1) {
////         System.out.print((char)data);
////         
////         fw.write(data);
////         
////      }
//      
//      
//      char [] arr = new char[10];
//      int len;
//      
//      while(true) {
//         len = fr.read(arr);
//         if(len<0)
//            break;
//         
//         String str = new String(arr,0,len);
//         System.out.println(str+":"+len);
//         fw.write(str.toCharArray());
//      }
//      
//      fw.close();
//      fr.close();
      
      FileReader fr1 = new FileReader("fff/exam2.csv");
      FileWriter fw1 = new FileWriter("fff/exam_res.csv");
      
      char [] arr1 = new char[11];
      int len1;
      
      while(true) {
         len1 = fr1.read(arr1);
         if(len1<0)
            break;
         
         String str1 = new String(arr1,0,len1);
         System.out.println(str1+":"+len1);
         fw1.write(str1.toCharArray());
      }
      
      fw1.close();
      fr1.close();
   }

}