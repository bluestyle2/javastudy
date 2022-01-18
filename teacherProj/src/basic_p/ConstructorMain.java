
package basic_p;

class Grand{
	int g = 8;
}

class ConstPar extends Grand {
	
	public ConstPar() {
		System.out.println("부모 생성자 실행");
	}
	
	int pb = setPB();
	int c = 3000, d= 4000;
	int g = 8888;
	
	static int pa = setPA();
	static int pa2 = 5000;
	
	int setPB() {
		System.out.println("부모 인스턴스 메소드 setPB() 실행");
		return 2000;
	}
	
	
	static int setPA() {
		System.out.println("부모 스태틱 setPA() 실행");
		return 1000;
	}
	
	void meth_1() {
		
		System.out.println("부모 meth_1()");
	}
	
	void meth_2() {
		
		System.out.println("부모 meth_2()");
	}
	
	static void meth_3() {
		
		System.out.println("static 부모 meth_3()");
	}


	int q = setQ();
	int r = setR();

	int setQ() {
		System.out.println("부모 setQ() 실행");
		
		return 5000;
	} 
	int setR() {
		System.out.println("부모 setR() 실행");
		
		return 6000;
	} 
}
class ConstChild extends ConstPar{

	
	
	public ConstChild() {
		System.out.println("자식 생성자 실행");
	}
	int b = setB();
	int d = 40;	//부모 멤버와 중첩 -- hiding
	int ddd = super.d;	//부모 멤버 호출
	//int ggg = super.super.g;
	//int ggg = mega.g;
	int ggg = super.g;
	
	static int pa2 = 50;
	
	//static int suPa2 = super.pa2; static은 부모 접근지정자 사용 불가
	//부모의 pa2로 접근 불가
	static int a = setA();
	
	static int setA() {
		System.out.println("자식 스태틱 setA() 실행");
		return 10;
	}
	
	static void meth_3() {
		
		System.out.println("staitc 자식 meth_3()");
	}
	
	static void meth_33() {
		
		System.out.println("static 자식 meth_33()");
		//super.meth_3(); static 부모 메소드 호출 불가
	}
	
	
	int setB() {
		System.out.println("자식 인스턴스 메소드 setB() 실행");
		return 20;
	}
	
	
	
	
	void meth_2() { //overriding
		
		System.out.println("자식 meth_2()");
	}
	
	int setR() { //overriding
		System.out.println("자식 setR() 실행");
		
		return 60;
	}
}



public class ConstructorMain {

	public static void main(String[] args) {

		System.out.println("------------------");
		int a = 1234;
		ConstChild cc1 = new ConstChild();
		System.out.println("------------------");
		ConstChild cc2 = new ConstChild();
		System.out.println("------------------");
		System.out.println(cc1);
		System.out.println(cc1.c+","+cc1.d+","+cc1.ddd);
		//System.out.println(cc1.c+","+cc1.d+","+super.cc1.d);
		System.out.println(cc1.g+","+cc1.ggg);
		
		cc1.meth_1();
		cc1.meth_2();
		
		System.out.println("------------------");
		System.out.println("static:"+cc1.pa2);
		System.out.println(cc1.q+","+cc1.r);
	}

}
