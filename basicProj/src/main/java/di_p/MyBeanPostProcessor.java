package di_p;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import di_p.model.MemeberDTO;
import di_p.model.School;
import di_p.model.Studs;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	
		System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization() 시작 :"+beanName+"-------");
		
		if(beanName.equals("dto")) {	//beanName을 확인하고 bean의 property 변경
			MemeberDTO dto = (MemeberDTO)bean;
			dto.setAge(37);
			System.out.println(dto);
		}
		if(beanName.equals("green")) {	//beanName을 확인하고 bean 객체 변경
			School sc = new School();
			sc.setName("MIT");
			sc.setAddr("미국 지방대");		
			bean = sc;
		}
		
		if(beanName.equals("blue")) {	//beanName을 확인하고 bean 객체 변경
			Studs rd2 = (Studs)bean;
			int b;
			b = rd2.getJum();
			if(b>=90) {
				rd2.setGrade("A");
				bean = rd2;
			}else if(b>=80){
				rd2.setGrade("B");
				bean = rd2;
			}else if(b>=70){
				rd2.setGrade("C");
				bean = rd2;
			}else if(b>=60){
				rd2.setGrade("F");
				bean = rd2;
			}else{
				rd2.setGrade("가");
				bean = rd2;
			}
		}
		
		if(beanName.equals("red")) {	//beanName을 확인하고 bean 객체 변경
			Studs rd = (Studs)bean;
			int a;
			a = rd.getJum();
			if(a>=90) {
				rd.setGrade("수");
			bean = rd;
			}else if(a>=80){
				rd.setGrade("우");
				bean = rd;
			}else if(a>=70){
				rd.setGrade("미");
				bean = rd;
			}else if(a>=60){
				rd.setGrade("양");
				bean = rd;
			}else{
				rd.setGrade("가");
				bean = rd;
			}
			
		}
			
		System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization() 끝 :"+beanName+"-------");
		
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("MyBeanPostProcessor.postProcessAfterInitialization() 실행 :"+beanName+"-------");
		
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
