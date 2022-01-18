package pac_1;

public class GGG {
	
	public String a = "pac_1.GGG.public a";
	String b = "pac_1.GGG.b";
	private String c = "pac_1.GGG.c";
	
	public void meth_1() {
		
		System.out.println("pac_1.GGG.public meth_1() 실행");
	}
	
	void meth_2( ) {
		
		System.out.println("pac_1.GGG.meth_2() 실행");
	}
	private void meth_3() {
		
		System.out.println("pac_1.GGG.private meth_3() 실행");
	}
}