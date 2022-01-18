package basic_p;

class Par {
	
	String a = "부모 a";
	
	int b = 10;
	
	void meth_1() {
		System.out.println("부모 meth_1() ");
	}
	
	void meth_2() {
		System.out.println("부모 meth_2() ");
	}
}

class Uncle{
	
}

class Child_1 extends Par { //상속관계 형성 , Uncle{ // 이중상속 불가
	String c = "자식 c";
	
	void meth_3() {
		System.out.println("자식 meth_3()");
	}
}

class Child_2 extends Par { //상속관계 형성
	String d = "자식2 d";
	
	void meth_4() {
		System.out.println("자식2 meth_4()");
	}
}



public class ExtendsMain {

	public static void main(String[] args) {
		Par pp = new Par();
		Child_1 cc1 = new Child_1();
		Child_2 cc2 = new Child_2();
		
		System.out.println("pp:"+pp.a+","+pp.b);
		//부모는 자식의 멤버에 접근 불가
		//System.out.println("pp:"+pp.a+","+pp.b+","+pp.c);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3(); -부모는 자식의 멤버에 접근 불가

		System.out.println("cc1:"+cc1.a+","+cc1.b+","+cc1.c);
		//System.out.println("cc1:"+cc1.d); 같은 부모를 상속받아도 형제 클래스의 멤버 접근 불가
		cc1.meth_1();
		cc1.meth_2();
		cc1.meth_3();
		//cc1.meth_4();
		
		System.out.println("cc2:"+cc2.a+","+cc2.b+","+cc2.d);
		//System.out.println("cc2:"+cc2.c; 같은 부모를 상속받아도 형제 클래스의 멤버 접근 불가
		cc2.meth_1();
		cc2.meth_2();
		//cc2.meth_3();// 같은 부모를 상속받아도 형제 클래스의 멤버 접근 불가
		cc2.meth_4();
		
		

	}

}
