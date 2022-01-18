package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class FileStreamMain {

   public static void main(String[] args) throws Exception {
      // TODO Auto-generated method stub

      FileInputStream fis = new FileInputStream("fff/son1.jpg");
      FileOutputStream fos = new FileOutputStream("qqq/child1.jpg");
      /*
      int data;
      while((data=fis.read())!=-1) {
         //System.out.println(data);
         fos.write(data);
      }*/
      int pp = 10000;
      byte [] buf = new byte[pp];
      
      int tot = fis.available();
      
      System.out.println(tot);
      
      DecimalFormat df = new DecimalFormat("0.00%");
      
      while(fis.available()>0) {
         double dd = (double)fis.available()/tot;
         
         System.out.println(df.format(dd));
         
         int len = fis.read(buf);
         fos.write(buf, 0, len);
         Thread.sleep(100);
         
      }
      fos.close();
      fis.close();
   }

}