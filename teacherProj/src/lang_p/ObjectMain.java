package lang_p;

class AAA{
	
	int a, b;
	
	AAA(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
}


public class ObjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AAA a1 = new AAA(10, 20);
		AAA a2 = new AAA(10, 20);
		AAA a3 = new AAA(30, 40);
		AAA a4 = a1;
		
		System.out.println(a1);
		System.out.println(a2);		
		
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		System.out.println(a1.equals(a2));
		System.out.println("a1--a2:"+(a1==a2)); //인스턴스 주소 비교
		System.out.println("a1--a3:"+(a1==a3));
		System.out.println("a1--a4:"+(a1==a4));
	}

}
