package aop_p.model;

import java.util.Arrays;

import javax.annotation.Resource;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AdviceNaver {
	
	
	@Resource
	Member mem;
	
	
	Object sohGoGo(ProceedingJoinPoint joinPoint) {
		
		System.out.println("sohGoGo 시작():"+joinPoint.getSignature().getName());	//getSignature = 누구때문에 들어왔는지를 알수있게해준다
		System.out.println("sohGoGo 매개변수():"+Arrays.toString(joinPoint.getArgs()));
		mem.cnt++;
		System.out.println("sohGoGo mem:"+mem);
		Object res = null;
		try {
			res = joinPoint.proceed(); //실제 메소드 실행
			
			if(res instanceof String && res.equals("조석")) {
				//System.out.println("이거 문자열이야");
				if(mem.age<30) {
				res = "센세이션";
				}else {
					res = "조준";
				}
			}
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return res;	//메소드 리턴 돌려주기
	}
}
