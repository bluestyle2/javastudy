package excep_p;

import java.util.Iterator;

public class Excep369 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 29; i++) {
				
			int one = i%10;	
			
			int three = one%3;
			
			try {
				
				int a = 1234/three;
				
				System.out.println(i);
				
			}catch (Exception e) {
				
				
				try {
					int b = 1234/one;
					
					System.out.println("짝");
					
				}catch (Exception ee) {
					System.out.println(i);
				}
				
				
			
			}
			
		}
	}

}
