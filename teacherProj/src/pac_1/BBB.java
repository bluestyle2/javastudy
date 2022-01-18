package pac_1;

class BBB {
	public String a = "pac_1.BBB.a";
	String b = "pac_1.BBB.b";
	private String c = "pac_1.BBB. private c";
	protected String d = "pac_1.BBB.protected d";
	
	public void meth_1() {
		
		System.out.println("pac_1.BBB.public meth_1() 실행");
	}
	
	void meth_2( ) {
		
		System.out.println("pac_1.BBB.meth_2() 실행");
	}
	
	private void meth_3() {
		System.out.println("pac_1.BBB.private meth_3() 실행");
	}

	void meth_4() {
		
		System.out.println("pac_1.BBB.protected meth_4() 실행");
	}

}
