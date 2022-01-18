package aop_p.model;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceDaum {
	
	Object adad(ProceedingJoinPoint joinPoint) {
		
		System.out.println("adad 시작():"+joinPoint.getSignature().getName());	//getSignature = 누구때문에 들어왔는지를 알수있게해준다
		System.out.println("adad 매개변수():"+Arrays.toString(joinPoint.getArgs()));
		Object res = null;
		try {
			res = joinPoint.proceed(); //실제 메소드 실행
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;	//메소드 리턴 돌려주기
	}
}
