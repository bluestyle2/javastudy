package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("di_xml/lifeCycle.xml");
		
		context.registerShutdownHook();	//destroy() 실행 설정
		/*
		 	postProcessBeanFactory	:	BeanFactoryPostProcessor
		 	각 생성자가 돌고 있다. : 인스턴스
		 	각 property 설정 (setter)		: 인스턴스
		 	각 bean의 setBeanName(dto) 실행 :	인스턴스 <= BeanNameAware
		 	각 bean의 MyBeanPostProcessor.postProcessBefore	:	BeanPostProcessor
			각 bean의 MyBeanPostProcessor.postProcessAfter	:	BeanPostProcessor
			각 bean의 afterPropertiesSet() 실행 : 인스턴스 <= InitializingBean
			//실행
			각 bean의 destroy()	: 인스턴스 <= DisposableBean
		 * 
		 * 
		 * 학생 bean을 구현하세요
		 * 
		 * bean 이름이 
		 * red로 시작되는    객체의 평균 점수를 이용하여 수우미양가
		 * blue로 시작되는   객체의 평균 점수를 이용하여 A BC DF
		 * yellow로 시작되는 객체의 평균 점수를 이용하여 12 34 5
		 * 
		 * 로 등급을 처리하세요
		 * */
		
		
		System.out.println(context.getBean("dto"));
		System.out.println(context.getBean("red"));
		System.out.println(context.getBean("blue"));
		context.close();
		
	}

}