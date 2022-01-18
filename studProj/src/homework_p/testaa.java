package homework_p;

public class testaa {

	public static void main(String[] args) {
		String a = "aaa2.jpg";
		String b = a.substring(a.lastIndexOf(".")+1);
		
		String c = "??";
	
		System.out.println(a);
		System.out.println(b);
		
	    boolean chk = false;
		System.out.println(b.toUpperCase());
		if(b.toUpperCase() == "JPG" || b.toUpperCase() == "PNG"){	
			c+="성공";
			chk = true;
			System.out.println("성공했습니다");
			return;
		}
		System.out.println(c);
	}

}
