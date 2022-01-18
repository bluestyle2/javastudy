package collection_p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class LottoMain {

   public static void main(String[] args) {
      HashSet lotto1 = new HashSet();
      ArrayList lotto2 = new ArrayList();
      
      Random rr = new Random();
      
      while(true) {
         
         int no = rr.nextInt(45)+1;
         
         lotto1.add(no);
         lotto2.add(no);
         
         if(lotto1.size()==7)
            break;
         
      }
      
      System.out.println("lotto1:"+lotto1);
      System.out.println("lotto2:"+lotto2);
      
      
      HashSet bingo = new HashSet();
      
      while(true) {
         
         int no = rr.nextInt(100)+1;
         
         bingo.add(no);
         
         if(bingo.size()==25)
            break;
         
      }
      //System.out.println("bingo:"+bingo);
      int cnt = 0;
      for (Object bb : bingo) {
         System.out.print(bb+"\t");
         cnt++;
         if(cnt%5==0) {
            System.out.println();
         }
      }

   }

}