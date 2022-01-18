package aop_p.model;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnoAdvice {
	
	@Pointcut("execution(boolean *..*(..))")
	void pointcccc() {}

	@Before("pointcccc()")	//pointcccc메소드가 실행될때 before가 출력
	void befffff(JoinPoint joinPoint) {
//		joinPoint.proceed(); 실행 불가
		System.out.println("befffff 실행()"+joinPoint.getSignature().toShortString());
	}
	
	@Before("execution(* aop_p.model.naver.SoundOfHeart.*(..))")
	void bef2(JoinPoint joinPoint) {
//		joinPoint.proceed(); 실행 불가
		System.out.println("bef2실행()"+joinPoint.getSignature().toShortString());
	}
	@Before("pointcccc() && execution(* aop_p.model.naver.SoundOfHeart.*(..))")
	void bef3(JoinPoint joinPoint) {
//		joinPoint.proceed(); 실행 불가
		System.out.println("bef3실행()"+joinPoint.getSignature().toShortString());
	}
	
	@AfterReturning(pointcut = "pointcccc()", returning = "rrr")
	void arRet(JoinPoint joinPoint, Object rrr) {
//		joinPoint.proceed(); 실행 불가
		System.out.println("arRet 실행()"+joinPoint.getSignature().toShortString()+"=>"+rrr);
	}
	@AfterThrowing(pointcut = "pointcccc()", throwing = "ee")
	void arThrow(JoinPoint joinPoint, Throwable ee) { //에러가 나면 실행

		System.out.println("arThrow 실행()"+joinPoint.getSignature().toShortString()+"=>"+ee);
	}
	@After("pointcccc()")
	void aftt(JoinPoint joinPoint) { //에러가 나든 안나든 항상 실행

		System.out.println("aftt 실행()"+joinPoint.getSignature().toShortString());
	}
	@AfterReturning(pointcut = "execution(* aop_p.model.adminchk.AdminChk.*(..))", returning = "aaa")
	void adminChk(JoinPoint joinPoint, String aaa) {
		System.out.println("받은입력값:"+aaa);
		if(aaa.equals("admin")) {
			System.out.println("관리자페이지 이동하였습니다.");
		}else {
			System.out.println("메인페이지.메인화면으로 이동합니다.");
		}
	}
}
