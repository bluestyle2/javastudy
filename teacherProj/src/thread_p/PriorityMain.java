package thread_p;

class ThPr extends Thread{
   
   public ThPr(String name) {
      super(name);
   }
   
   @Override
   public void run() {
      // TODO Auto-generated method stub
      for (int i = 0; i < 100; i++) {
         System.out.print(getName());
      }
   }
   
}


class RunImpl implements Runnable{

   int cnt=0;
   
   @Override
   public void run() {
      for (int i = 0; i < 100; i++) {
         System.out.print("R");
         cnt++;
      }
      
   }
}



public class PriorityMain {

   public static void main(String[] args) throws Exception {
      ThPr t1 = new ThPr("+");
      ThPr t2 = new ThPr("?");
      ThPr t3 = new ThPr("@");
      
      RunImpl rr = new RunImpl();
      Thread tr1 = new Thread(rr);
      Thread tr2 = new Thread(rr);
      
      t1.setPriority(1);
      t2.setPriority(5);
      t3.setPriority(10);
      
      t1.start();
      t2.start();
      t3.start();
      tr1.start();
      tr2.start();
      //rr.start();
      
      System.out.println(Thread.activeCount());
      System.out.println(Thread.currentThread());
      
      Thread.sleep(1000);
      System.out.println("\n"+Thread.activeCount());
      System.out.println(rr.cnt);
   }

}

