package thread_p;

class ThDaemon extends Thread{
   
   @Override
   public void run() {
      
      while(true) {
         
         try {
            sleep(3000);
            System.out.println("자동저장");
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
   }
}


public class DaemonMain {

   public static void main(String[] args) throws Exception {
      
      ThDaemon td = new ThDaemon(); 
      td.setDaemon(true);      
      td.start();
      
      //td.setDaemon(true);
      
      for (int i = 0; i <10; i++) {
         System.out.println(i);
         Thread.sleep(1000);
      }
      
      
   }

}