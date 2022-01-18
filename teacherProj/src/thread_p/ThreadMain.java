package thread_p;



class MyTh extends Thread{
   
   public MyTh(String name) {
      super(name);
   }
   
   public void run() {
   
      for (int i = 0; i < 100; i++) {
         try {
            sleep(10);
            System.out.print(getName());
            
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }         
      }
   }
}

public class ThreadMain {

   public static void main(String[] args) throws Exception {
      MyTh t1 = new MyTh("?");
      MyTh t2 = new MyTh("*");
      MyTh t3 = new MyTh("@");
      
      /*
      t1.run();
      t2.run();
      t3.run();
      */
      
      t1.start();
      t2.start();
      t3.start();
      
      Thread.sleep(2000);

      System.out.println("\n 쓰레드 완료");
      /*
      t1.start(); 재호출 불가
      t2.start();
      t3.start();
      */
   }

}