package thread_p;

class ThJoin extends Thread{
   
   public ThJoin(String name) {
      super(name);
   }
   
   @Override
   public void run() {
      
      for (int i = 0; i < 100; i++) {
         try {
            sleep(100);
            System.out.print(getName());
         } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
      
   }
}

public class JoinMain {

   public static void main(String[] args) throws Exception {
      ThJoin th1 = new ThJoin("+");
      ThJoin th2 = new ThJoin("?");
      ThJoin th3 = new ThJoin("$");

      //th1.join();
      th1.start();
      th2.start();
      
      th1.join(3000);
      
      
      th3.start();
   }

}