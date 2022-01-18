package basic_p;

class DyPar{
	String a = "부모a", b = "부모b";
	
	void meth_1() {
		
		System.out.println("부모 meth_1()");
	}
	void meth_2() {
		
		System.out.println("부모 meth_2()");
	}	
}

class DyChild extends DyPar{
	String a = "자식a", c = "자식c";
	
	void meth_1() {
		
		System.out.println("자식 meth_1()");
	}
	void meth_3() {
		
		System.out.println("자식 meth_3()");
	}	
}

class DyUncle{
	
}

public class DynamicMain {

	public static void main(String[] args) {
		DyPar pp = new DyPar();
		DyPar pc = new DyChild();
		//DyChild cp = new DyPar();
		DyChild cc = new DyChild();

		System.out.println("pp-------------------");
		System.out.println(pp.a);
		System.out.println(pp.b);
		//System.out.println(pp.c);
		pp.meth_1();
		pp.meth_2();
		//pp.meth_3();
		System.out.println("pc-------------------");
		System.out.println(pc.a);
		System.out.println(pc.b);
		//System.out.println(pp.c);
		pc.meth_1();
		pc.meth_2();
		//pc.meth_3();
		System.out.println("cc-------------------");
		cc.c = "자식ccc";
		System.out.println(cc.a);
		System.out.println(cc.b);
		System.out.println(cc.c);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		DyPar pcc = cc;
		System.out.println("pcc-------------------");
		System.out.println(pcc.a);
		System.out.println(pcc.b);
		//System.out.println(pcc.c);
		pcc.meth_1();
		pcc.meth_2();
		//pcc.meth_3();
		
		DyChild cpcc = (DyChild)pcc;
		System.out.println("cpcc-------------------");
		System.out.println(cpcc.a);
		System.out.println(cpcc.b);
		System.out.println(cpcc.c);
		cpcc.meth_1();
		cpcc.meth_2();
		cpcc.meth_3();
		
		//DyChild cpp = (Dychild)pp;
		
		System.out.println(pp instanceof DyPar);
		System.out.println(pp instanceof DyChild);
		System.out.println(cc instanceof DyPar);
		System.out.println(cc instanceof DyChild);
		//System.out.println(cc instanceof DyUncle); 상속관계에서만 사용 가능
	}

}
