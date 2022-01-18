package text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateFormatMain {

   public static void main(String[] args) throws Exception {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      
      Date day = sdf.parse("1993-03-20");
      
      System.out.println(day);
      
      //day = sdf.parse("1993/03/20");
      
      //System.out.println(day);
      
       day = sdf.parse("1993-23-54");  //숫자값을 자동으로 변환
         
      System.out.println(day);
      
      Date today = new Date();
      
      String ttt = sdf.format(today);
      
      System.out.println(ttt);
      
      String []  ppArr = {
            
            "y","yy","yyyy",
            "M","MM","MMM","MMMM",
            "d","dd","D","DD","DDD",
            "w","ww","W",
            "E","EE","EEE","EEEE",
            
            "z","Z",
            "a",
            "H","HH","h","hh",
            "m","mm",
            "s","ss",
            "S","SS","SSS"
            
            
      };
      Locale am = new Locale("en");
      for (String pp : ppArr) {
         sdf = new SimpleDateFormat(pp);
         //sdf = new SimpleDateFormat(pp, am);
         System.out.println(pp+":"+sdf.format(today));
      }
      
      /// '89年  nov 28일 (화) 05:07:30 
      
      ttt = new SimpleDateFormat("''yy年 MMM dd일 (",am).format(today);
      ttt += new SimpleDateFormat("E) HH:mm:ss").format(today);
      System.out.println(ttt);
      
   }

}
