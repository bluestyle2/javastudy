package basic_p;

	abstract class FFPar { //추상메소드가 정의된 클래스는 abstract : 추상클래스로 정의해야 함
	
	int a= 10;
	final int b = 20;
	
	void meth_1() {
		System.out.println("부모_meth_1() 실행");
	}
	
	final void meth_2() { //overriding 불가
		System.out.println("부모_meth_2() 실행");
	}
	
	void meth_3() {
		
	}
	
	abstract void meth_4(); //추상메소드 --> 구현 내용 이 없음 (상속받는 자식 클래스에서 반드시 재정의 해야함)
}

	class FFChild extends FFPar {	//추상클래스 상속시 반드시 추상메소드 재정의 해야 함
		
		int a = 99;
		int b = 88; //hiding 이기 때문에 final 과 상관없음
		
		void meth_1() {
			System.out.println("자식_meth_1() 실행");
		}
		
		/*final void meth_2() { //상수화 된 메소드 재정의 불가
			System.out.println("부모_meth_2() 실행");
		}*/
		
		void meth_4() {	//반드시 재정의 해야 함
			System.out.println("자식_meth_4() 실행");
		}
	}
	
	public class FinalMain	{
		
	public static void main(String[] args) {
		FFChild cc1 = new FFChild();
		
		cc1.a = 1111;
		//cc.b = 2222;
		
		System.out.println(cc1.a+","+cc1.b);
		
		cc1.meth_1();
		cc1.meth_2();
		cc1.meth_3();
		cc1.meth_4();
		
		FFChild cc2 = new FFChild() {
		
		int a = 1357;	//hiding
		int c = 777;
		
		void meth_1() {	//overriding
			System.out.println("생성시 재정의 meth_1() 실행 시작"+a+","+b+"------");
			meth_5();
			System.out.println("생성시 재정의 meth_1() 실행 끝------");
		}
		
		void meth_5() {	//새로 정의된 메소드는 정의부에서만 호출 가능
			System.out.println("생성 meth_5() 실행");
		}
	};
		
		System.out.println("여기"+cc2.a+","+cc2.b);
		cc2.a = 1010;
		
		
		System.out.println(cc2.a+","+cc2.b);
	
		
		cc2.meth_1();
		cc2.meth_2();
		cc2.meth_3();
		cc2.meth_4();
		//cc2.meth_5();
		
		
		FFPar pp = new FFPar() {
			void meth_4() { // 반드시 재정의 해야함
				System.out.println("부모 생성시 meth_4() 실행");
			}
			
		};
		
	}

}
