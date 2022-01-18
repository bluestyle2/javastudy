package aop_p.model.car;

import org.springframework.stereotype.Component;

@Component
public class Car {

	public String martiz(){
		
		System.out.println("martiz 나갑니다 따르릉()");
		
		return "";
	}
	
	public String policeCar() {
		
		System.out.println("경찰차 나갑니다 삐용삐용()");
		
		return "";
	}
}
