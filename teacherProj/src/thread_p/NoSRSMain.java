package thread_p;

class ThSRS1 extends Thread{
	
	public ThSRS1(String name) {
		super(name);
	}
	
	public void run() {
		
		while(true) {
			try {
				sleep(1000);
				
				System.out.println();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
class ThSRS2 extends Thread{
	
	public ThSRS2(String name) {
		super(name);
	}
	
	public void run() {
		
		while(true) {
			try {
				sleep(1000);
				System.out.println();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}

class ThSRS3 extends Thread{
	
	public ThSRS3(String name) {
		super(name);
	}
	
	public void run() {
		
		while(true) {
			try {
				sleep(1000);
				System.out.println();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
}
public class NoSRSMain {

	public static void main(String[] args) {
		ThSRS1 t1 = new ThSRS1("*");
		ThSRS2 t2 = new ThSRS2("**");
	    ThSRS t3 = new ThSRS("***");
	    
	    t1.start();
	    t2.start();
	    t3.start();
	       
	}

}
