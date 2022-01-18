package thread_p;


class ThSRS extends Thread{
   
   public ThSRS(String name) {
      super(name);
   }
   
   @Override
   public void run() {
      
      while(true) {
         try {
            sleep(1000);
            System.out.println(getName());
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
   }
}


public class SRSMain {

   public static void main(String[] args) throws Exception {
      ThSRS t1 = new ThSRS("*");
      ThSRS t2 = new ThSRS("**");
      ThSRS t3 = new ThSRS("***");
      
      t1.start();
      t2.start();
      t3.start();

      Thread.sleep(2000);
      t1.suspend();
      Thread.sleep(2000);
      t2.suspend();
      Thread.sleep(2000);
      t1.resume();
      Thread.sleep(2000);
      t1.stop();
      t2.stop();
      Thread.sleep(2000);
      t3.stop();
      Thread.sleep(2000);
      //t1.start();
   }

}