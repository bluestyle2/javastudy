package pac_2;

public class CCC {
	
	public String a = "pac_2.CCC.public a";
	String b = "pac_2.CCC.b";
	private String c = "pac_2.CCC.c";
	
	public void meth_1() {
		
		System.out.println("pac_2.CCC.public meth_1() 실행");
	}
	
	void meth_2( ) {
		
		System.out.println("pac_2.CCC.meth_2() 실행");
	}
	private void meth_3() {
		System.out.println("pac_2.CCC.private meth_3() 실행");
	}

}


class DDD{
	
	public String a = "pac_2.DDD.public a";
	String b = "pac_2.DDD.b";
	private String c = "pac_2.DDD.c";
	
	public void meth_1() {
		
		System.out.println("pac_2.DDD.public meth_1() 실행");
	}
	
	void meth_2( ) {
		
		System.out.println("pac_2.DDD.meth_2() 실행");
	}
	private void meth_3() {
		System.out.println("pac_2.DDD.private meth_3() 실행");
	}
	
	}
