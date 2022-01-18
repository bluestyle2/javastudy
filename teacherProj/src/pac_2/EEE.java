package pac_2;

public class EEE {
	
	public String a = "pac_2.EEE.public a";
	String b = "pac_2.EEE.b";
	private String c = "pac_2.EEE.c";
	protected String d = "pac_2.EEE.protected d";
	
	public void meth_1() {
		
		System.out.println("pac_2.EEE.public meth_1() 실행");
	}
	
	void meth_2() {
		
		System.out.println("pac_2.EEE.meth_2() 실행");
	}
	private void meth_3() {
		
		System.out.println("pac_2.EEE.private meth_3() 실행");
	}
	protected void meth_4() {
		
		System.out.println("pac_2.EEE.protected meth_4() 실행");
	}
}