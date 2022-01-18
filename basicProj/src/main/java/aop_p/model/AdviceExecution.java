package aop_p.model;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceExecution {

	
	Object retStr(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("retStr() 실행:"+joinPoint.getSignature().toShortString());
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return res;
	}
	
	Object retBool(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("retBool() 실행:"+joinPoint.getSignature().toShortString());
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return res;
	}
	
	Object argIntplus(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("argIntplus() 실행:"+joinPoint.getSignature().toShortString());
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return res;
	}
	
	Object argZero(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("argZero() 실행:"+joinPoint.getSignature().toShortString());
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return res;
	}
	
	
	
	Object methStartM(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("methStartM() 실행:"+joinPoint.getSignature().toShortString());
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return res;
	}
	
	Object classStartF(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("classStartF() 실행:"+joinPoint.getSignature().toShortString());
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return res;
	}
	
	Object pacStart_n(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("pacStart_n() 실행:"+joinPoint.getSignature().toShortString());
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return res;
	}
	
	Object methStudyt(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("methStudyt() 실행:"+joinPoint.getSignature().toShortString()+"\n슈슈슉");
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return res;
	}
	
	Object methStudyp(ProceedingJoinPoint joinPoint) {
		Object res = null;
		
		System.out.println("methStudyp() 실행:"+joinPoint.getSignature().toShortString()+"\n폴리변신!");
		
		try {
			res = joinPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
		return res;
	}
}
