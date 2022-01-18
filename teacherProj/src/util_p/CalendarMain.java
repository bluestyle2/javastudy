package util_p;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain {
   
   public static void ppp(Calendar cday) {
      String ttt = cday.get(Calendar.YEAR)+"년 ";
      ttt += cday.get(Calendar.MONTH)+1 +"월 ";
      ttt += cday.get(Calendar.DATE)+"일 (";
      ttt += " 日月火水木金土".charAt(cday.get(Calendar.DAY_OF_WEEK))+"요일) ";
      ttt += cday.get(Calendar.HOUR_OF_DAY)+":";
      ttt += cday.get(Calendar.MINUTE)+":";
      ttt += cday.get(Calendar.SECOND)+".";
      ttt += cday.get(Calendar.MILLISECOND);
      
      System.out.println(ttt);
   } 

   public static void main(String[] args) {
      Calendar today = Calendar.getInstance();
      
      System.out.println(today);
      
      System.out.println(today.get(1));
      System.out.println(today.get(Calendar.YEAR));
      System.out.println(  today.get(Calendar.MONTH)+1   );
      System.out.println(today.get(Calendar.DATE));
      System.out.println(today.get(Calendar.DAY_OF_YEAR));
      System.out.println(today.get(Calendar.DAY_OF_MONTH));
      System.out.println("-------");
      System.out.println(today.get(Calendar.DAY_OF_WEEK));
      
      System.out.println(today.get(Calendar.WEEK_OF_YEAR));
      System.out.println(today.get(Calendar.WEEK_OF_MONTH));
      
      
      System.out.println(today.get(Calendar.AM_PM));
      System.out.println(today.get(Calendar.HOUR));
      System.out.println(today.get(Calendar.HOUR_OF_DAY));
      System.out.println(today.get(Calendar.MINUTE));
      System.out.println(today.get(Calendar.SECOND));
      System.out.println(today.get(Calendar.MILLISECOND));

      
      //// 출력 방식 1984 년 3 월 20일 (수요일) 13:34:56.789
      
      ppp(today);
      today.set(1991, 3-1, 20);
      today.set(1991, 3-1, 20,10,20);
      today.set(1991, 3-1, 20 , 10, 23, 45);
      ppp(today);
      
      today.set(Calendar.YEAR, 2002);
      today.set(Calendar.MONTH, 9-1);
      today.set(Calendar.DATE, 16);
      ppp(today);
      today.set(Calendar.DAY_OF_WEEK, 3);
      ppp(today);
      today.set(Calendar.HOUR_OF_DAY, 17);
      today.set(Calendar.MINUTE, 31);
      today.set(Calendar.SECOND, 58);
      today.set(Calendar.MILLISECOND, 777);
      ppp(today);
      today.set(Calendar.AM_PM,0);
      ppp(today);
      
      today.set(1991, 20-1, -5 , 180, -453, 12345);
      ppp(today);
      today.set(Calendar.MONTH, 0-1);
      ppp(today);
      today.add(Calendar.YEAR, 2);
      ppp(today);
      today.add(Calendar.MONTH, -5);
      ppp(today);
      
      
      long tt = today.getTimeInMillis();
      System.out.println(tt);
      System.out.println(tt/1000/60/60/24/365+1970);
      
      today.setTimeInMillis(0);
      ppp(today);
      
      
      System.out.println(today.getActualMaximum(Calendar.MONTH));
      System.out.println(today.getActualMaximum(Calendar.DATE));
      today.set(1992, 2-1, 20);
      System.out.println(today.getActualMaximum(Calendar.DATE));
      
      Calendar now = Calendar.getInstance();
      Date.now();
      System.out.println(today.before(now));
      System.out.println(today.after(now));
   }

}