package aop_p.model.adminchk;

import org.springframework.stereotype.Component;
@Component
public class AdminChk {
	
	
	public String chk(String a) {
		System.out.println("관리자체크 메소드 실행() 받은 매개변수:"+a);
		
		return a;
	}
}
