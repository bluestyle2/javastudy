package pac_1;

import pac_2.CCC;
import pac_2.GGG; 
//import pac_2.DDD; 
//BBB는 같은 패키지라서 디폴트라도 상관없다
import pac_2.*;

class AAA{
	public String a = "pac_1.AAA.public a";
	String b = "pac_1.AAA.b";
	private String c = "pac_1.AAA.c";
	
	public void meth_1() {
		
		System.out.println("pac_1.AAA.public meth_1() 실행");
	}
	
	void meth_2( ) {
		
		System.out.println("pac_1.AAA.meth_2() 실행"+a+","+b+","+c);
	}
	private void meth_3() {
		
	
		System.out.println("pac_1.AAA.private meth_3() 실행");
	}
} 

class ChildBBB extends BBB{
	void test( ) {
		//System.out.println("ChildBBB.test() 실행:"+a+","+b+","+c+","+d);
		
		System.out.println("ChildBBB.test() 실행:"+a+","+b+","+d);
		
		meth_1();
		meth_2();
		//meth_3();
		meth_4();
		
		System.out.println("ChildBBB.test() 끝------------------------");
	}
}
class ChildEEE extends EEE{
	void test() {
		//System.out.println("ChildBBB.test() 실행:"+a+","+b+","+c+","+d);
		
		System.out.println("ChildEEE.test() 시작:"+a+","+d);
		
		meth_1();
		//meth_2(); 다른패키지 기본 접근 지정자로 접근 불가
		//meth_3();
		meth_4(); //protected ::> 다른패키지 부모클래스 접근 가능
		
		System.out.println("ChildEEE.test() 끝------------------------");
	}
}
public class PacMain {

	public static void main(String[] args) {
		
	
		AAA p1a = new AAA();
		BBB p1b = new BBB();
		CCC p2c = new CCC();
		
		System.out.println("p1a:"+p1a.a+","+p1a.b); //+","+p1a.c);
		p1a.meth_1();
		p1a.meth_2();
		//p1a.meth_3();
		
		System.out.println("p1b:"+p1b.a+","+p1b.b); //+","+p1b.c);
		p1b.meth_1();
		p1b.meth_2();
		//p1b.meth_3();
		
		System.out.println("p2c:"+p2c.a);//+p2c.b); //+","+p2c.c);
		p2c.meth_1();
		//p2c.meth_2();
		//p1b.meth_3();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		EEE p2e = new EEE();
		FFF p1f = new FFF();
		GGG p2g = new GGG();
		
		pac_1.GGG p1g = new pac_1.GGG();
		pac_1.sub.GGG p1sg = new pac_1.sub.GGG();
		System.out.println("p2e:"+p2e.a);
		p2e.meth_1();
		System.out.println("p1f:"+p1f.a);
		p1f.meth_1();
		System.out.println("p2g:"+p2g.a);
		p2g.meth_1();
		System.out.println("p1g:"+p1g.a);
		p1g.meth_1();
		System.out.println("p1sg:"+p1sg.a);
		p1sg.meth_1();
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>");
		ChildBBB cb = new ChildBBB();
		System.out.println("cb:"+cb.a+","+cb.b+","+cb.d);
		cb.meth_1();
		cb.meth_2();
		cb.meth_4();
		cb.test();
		
		ChildEEE ce = new ChildEEE();
	//	System.out.println("ce:"+ce.a+","+ce.d);
		System.out.println("ce:"+ce.a);
		ce.meth_1();
		//ce.meth_4(); protected는 다른 패키지 자식 클래스 정의부에서만 사용가능
		ce.test();
	}

}
