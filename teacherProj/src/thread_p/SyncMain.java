package thread_p;

import java.util.Random;

class Mom{
   int total = 100;
   
   synchronized boolean showMeTheMoney(int money) {

      //System.out.println("showMeTheMoney:"+Thread.currentThread());
      boolean res;
      
      if(res= money <= total) {
         try {
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
      return res;
   }
}


class ThChild extends Thread{
   
   Mom mm;
   Random rd = new Random();
   int myMoney = 0;
   
   public ThChild(String name, Mom mm) {
      super(name);
      this.mm = mm;
   }
   
   @Override
   public void run() {
      
      while(mm.total>0) {
         int money = rd.nextInt(50)+1;
         
         if(mm.showMeTheMoney(0)) {
            myMoney += money;
            mm.total -= money;
            
            System.out.println(getName()+":"+money+"("+myMoney+")");
            System.out.println("\t잔액:"+mm.total);
         }
         
      }
      
   }
}


class ThSCV extends Thread{
   Mom mm;
   Random rd = new Random();
   int myMoney = 0;
   public ThSCV(Mom mm) {
      super("아빠");
      this.mm = mm;
   }
   
   @Override
   public void run() {
      // TODO Auto-generated method stub
      while(true) {
         try {
            sleep(1000);
            
            if(mm.total < 40) {
               int money = rd.nextInt(50)+40;
               myMoney += money;
               mm.total += money;
               
               System.out.println(getName()+":"+money+"("+myMoney+")");
               System.out.println("\t잔액:"+mm.total);
            }
            
         } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
   
}



public class SyncMain {

   public static void main(String[] args) {
      Mom mm = new Mom();
      ThChild son = new ThChild("아들", mm);
      ThChild daughter = new ThChild("딸", mm);
      new ThSCV(mm).start();
      son.start();
      daughter.start();

   }

}