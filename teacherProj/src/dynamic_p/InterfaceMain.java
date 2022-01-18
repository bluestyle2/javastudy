package dynamic_p;

interface InAAA{
	int a = 10;
	int b = 20;
	
	//메소드 선언 가능
	void meth_1();
	void meth_3();
	
	
	/* 메소드 정의 불가
	void meth_2() {
		System.out.println("meth_2()");
	}
	*/
}

interface InBBB{
	int a = 999;
	int b = 888;
	int c = 777;
	
	
	//메소드 선언 가능
	void meth_1();
	void meth_4();
}
//class AAAImpl extends InAAA
class AAAImpl implements InAAA, InBBB{ //interface의 구현은 implements로 가능하며
								//모든 메소드를 재정의 해야 한다.
	
	int a = 1234;	//hiding -- 변수가 되어 대입 가능
	
	public void meth_1() {
		System.out.println("AAAImpl.meth_1() 실행");
}
	public void meth_3() {
		System.out.println("AAAImpl.meth_3() 실행");
	}
	public void meth_4( ) {
		System.out.println("AAAImpl.meth_4() 실행");
	}
}


public class InterfaceMain {

	public static void main(String[] args) {
		AAAImpl ai = new AAAImpl();
		
		//System.out.println("ai:"+ai.a+","+ai.b);
		System.out.println("ai:"+ai.a+","+ai.c);
		ai.a = 1000;
		//ai.b = 2000;
		//System.out.println("ai:"+ai.a+","+ai.b);
		System.out.println("ai:"+ai.a+","+ai.c);
		ai.meth_1();
		ai.meth_3();
		ai.meth_4();
		
		InAAA ii = new InAAA() {
			public void meth_1() {
				System.out.println("ii 생성시 재정의 meth_1() 실행");
			}
			public void meth_3() {
				System.out.println("ii 생성시 재정의 meth_3() 실행");
			
			}
		};
		
		//ii.a = 1000;
		//ii.b = 2000;
		
		System.out.println("ii:"+ii.a+","+ii.b);
		ii.meth_1();
		ii.meth_3();
		
		
		InAAA ia;
		InBBB ib = ai;
		
		ia = ai;
		//System.out.println("ia:"+ia.a+","+ia.b+","+ia.c);
		System.out.println("<<<<<<<<<<<<<<<<");
		System.out.println("ia:"+ia.a+","+ia.b);
		ia.meth_1();
		ia.meth_3();
	//	ia.meth_4();
		
		System.out.println("ib:"+ib.a+","+ib.b+","+ib.c);
		ib.meth_1();
		//ib.meth_3();
		ib.meth_4();
		
	}
}
