package aop_p.model.daum;

import org.springframework.stereotype.Component;

@Component
public class FatherSup {

	public void meth_1() {
		System.out.println("FatherSup meth_1() 실행");
	}
	
	public String meth_2(int aa, boolean bb) {
		System.out.println("FatherSup meth_1() 실행:"+aa+","+bb);		
		return "아기상어";
	}
	
}
