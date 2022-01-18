package basic_p;

public class ForMain {

	public static void main(String[] args) {	
		
		String [] nick = {"정우성","현빈","장동건","차은우","조인성"};
		
		for (int i = 0; i < nick.length; i++) {
			System.out.println(nick[i]);
		}
	
	System.out.println("------------------");
	for (String ttt : nick) {
		System.out.println(ttt);
		}
	
	System.out.println("------------------");	
	
	int [] arr = {87,56,34,23,86,45,12,9,34};
	
	int tot = 0;
	
	for (int i : arr) {
		if(i%2==0) {
			tot+= i;
			System.out.println(i+":"+tot);
		}
	}
	
	System.out.println(tot);
	
	
	}
}
