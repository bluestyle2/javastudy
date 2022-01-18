package aop_p.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceAdvice {

	/*
	Object befffff(ProceedingJoinPoint joinPoint) {
		Object res = null;
		System.out.println("befffff 실행()");
		return res;
	}
	*/
	
	void befffff(JoinPoint joinPoint) {
//		joinPoint.proceed(); 실행 불가
		System.out.println("befffff 실행()"+joinPoint.getSignature().toShortString());
	}
	
	void arRet(JoinPoint joinPoint, Object rrr) {
//		joinPoint.proceed(); 실행 불가
		System.out.println("arRet 실행()"+joinPoint.getSignature().toShortString()+"=>"+rrr);
	}
	
	void arThrow(JoinPoint joinPoint, Throwable ee) { //에러가 나면 실행

		System.out.println("arThrow 실행()"+joinPoint.getSignature().toShortString()+"=>"+ee);
	}
	
	void aftt(JoinPoint joinPoint) { //에러가 나든 안나든 항상 실행

		System.out.println("aftt 실행()"+joinPoint.getSignature().toShortString());
	}
}
