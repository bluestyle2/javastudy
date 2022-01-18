package aop_p.model.car;

import org.springframework.stereotype.Component;

@Component
public class Airplain {

	public String turbo(){
		
		System.out.println("제트기 출격");
		return "";
	}
	
	public String muin(){
		
		System.out.println("무인항공기 출격");
		return "";
	}
}
