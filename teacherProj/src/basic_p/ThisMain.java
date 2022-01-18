package basic_p;


class ClaThis{
	
	int a = 10, b = 20, c = 30;
	
	void meth_1(int a) {
		//this : 현재 인스턴스 멤버 접근 지정자 --> 클래스 정의부에서만 사용 가능
		//매개변수와 멤버변수의 중첩 -> 우선권은 매개변수
		System.out.println("meth_1 : "+a+","+b+","+c);
		System.out.println("meth_1 : "+this.a+","+this.b+","+this.c);
	}
	
	void meth_2() {
	//매개변수와 멤버변수의 중첩 -> 우선권은 지역변수
		String b = "지역변수 b";
		System.out.println("meth_2 : "+a+","+b+","+c);
		System.out.println("meth_2 : "+this.a+","+this.b+","+this.c);
	}
	public String toString() {
		return a+","+b+","+c;
	}
	
}

public class ThisMain {

	public static void main(String[] args) {
		ClaThis ct1 = new ClaThis();
		ClaThis ct2 = new ClaThis();
		
		ct1.a = 111;
		ct2.b = 222;
		
		System.out.println("ct1:"+ct1);
		System.out.println("ct2:"+ct2);
		ct1.meth_1(123);
		ct2.meth_1(456);
		
		ct1.meth_2();
		ct2.meth_2();
		
		//System.out.println("ct1.this.a:"+ct1.this.a);
	}
	
}
