package util_p;

import java.util.Calendar;

public class DiaryMain {

   public static void main(String[] args) {

      Calendar today = Calendar.getInstance();
      
      int month = today.get(Calendar.MONTH);
      int day =  today.get(Calendar.DATE);
      //System.out.println(month+","+day);
      
      today.set(2021, 8-1, 1);
      CalendarMain.ppp(today);
      
      int last = today.getActualMaximum(Calendar.DATE);
      //System.out.println(last);
      
      for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
         System.out.print("\t");
      }
      
      for (int i = 1; i <=last; i++) {
         today.set(Calendar.DATE, i);
         //System.out.print(i+","+today.get(Calendar.DAY_OF_WEEK)+"\t");
         
         int cm = today.get(Calendar.MONTH);
         //System.out.println(cm+","+i);
         

         String pre=" ", sur=" ";
         
         
         if(cm==month && i==day) {
            pre = "[";
            sur = "]";
         }
         if(i<10) {
            pre += " ";
         }
         
         
         
         System.out.print(pre+i+sur+"\t");
         
         if(today.get(Calendar.DAY_OF_WEEK)==7) {
            System.out.println();
         }
      }
      
      
      /*

 1    2    3    4     5       6    7   
 8    9   10   11    12      13   14   
15   16   17   18   [19]   20   21   
22   23   24   25    26      27   28   
29   30   31   

       * */
      
      
   }

}