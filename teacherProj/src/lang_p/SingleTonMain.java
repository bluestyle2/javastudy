package lang_p;

class SSS{
	int a = 10;
	String b = "아기상어";
	
	
	private static SSS me = null;
	
	public static SSS getInstance() {
		
		System.out.println("getInstance() 시작-------------");
		if(me==null)
			me = new SSS();
		
		
		System.out.println("getInstance() 끝-------------");
		return me;
		
	}
	
	private SSS(){
		System.out.println("생성자 실행");
	}

	@Override
	public String toString() {
		return "SSS [a=" + a + ", b=" + b + "]";
	}
	
}

public class SingleTonMain {

	public static void main(String[] args) {
		//SSS s1 = new SSS();
		SSS s1 = SSS.getInstance();
		System.out.println(s1);
		
		s1.a = 20;
				
		SSS s2 = SSS.getInstance();
		System.out.println(s2);
		
		s1.b= "엄마상어";
		
		SSS s3 = SSS.getInstance();
		System.out.println(s3);
	}

}
