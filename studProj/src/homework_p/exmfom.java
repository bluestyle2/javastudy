package homework_p;

import java.util.ArrayList;

class Studa{
	String name;
	int jum;
	
	public Studa(String name, int jum) {
			super();
			this.name = name;
			this.jum = jum;	
			
			
			
		
		
		
	}
}
public class exmfom {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int a = 0;
		for(int i = 0; i<=10 ; i++){
			a = a+i;
			Studa st = new Studa("좋앙",a);
			System.out.println(st.jum);
			}
	}

}
