package lang_p;

public class MathMain {

	public static void main(String[] args) {
		
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		System.out.println("ceil");
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.ceil(987.654));
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(-987.654));
		
		System.out.println("floor");
		System.out.println(Math.floor(123.456));
		System.out.println(Math.floor(987.654));
		System.out.println(Math.floor(-123.456));
		System.out.println(Math.floor(-987.654));
		
		System.out.println("round");
		System.out.println(Math.round(123.456));
		System.out.println(Math.round(987.654));
		System.out.println(Math.round(-123.456));
		System.out.println(Math.round(-987.654));
	
		System.out.println("abs");
		System.out.println(Math.abs(123.456));
		System.out.println(Math.abs(987.654));
		System.out.println(Math.abs(-123.456));
		System.out.println(Math.abs(-987.654));
		
		System.out.println(Math.max(20, 10));
		System.out.println(Math.min(20, 10));
		
		System.out.println(Math.sin(30));
		System.out.println(Math.sin(30*Math.PI/180));
		System.out.println(Math.cos(30*Math.PI/180));
		System.out.println(Math.tan(30*Math.PI/180));
		
		System.out.println(Math.exp(3));	//	지수승
		System.out.println(Math.log(3));	//	로그
		System.out.println(Math.pow(2, 3)); // 2의 3승
		System.out.println(Math.sqrt(2));
		
		System.out.println(Math.random());
		
		//5~8
		int no = (int)(Math.random()*4)+5;
		System.out.println(no);
	}

}