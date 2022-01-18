package basic_p;

abstract class ExSwimming{
	
	String name, jongmok;
	int meter;
	int sec;
	
	public String toString(){
		calc();
		return jongmok+"::"+name+"\n"+meter+"\n"+sec;
	}
	abstract void calc(); {
	}
	
	class jayu extends ExSwimming {
	int meter1;
	
	jayu(String jongmok, String name, int meter1) {
		jongmok = "자유형";
		this.name = name;
		this.meter1 = meter;
	}
	void calc(){
		
		meter = meter1;
		
	}
}
}
	
			

	


public class SwimMain {

	public static void main(String[] args) {
	//	ExSwimming [] play = {
			//	new jayu("박태환", 5),
			//	new jayu("오준혁", 7)
			//	};
				
		//		for (ExSwimming as : play) {
		//			System.out.println(as);
			}
		}
		
