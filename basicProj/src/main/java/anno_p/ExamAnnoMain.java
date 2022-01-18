package anno_p;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamAnnoMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(ExamConfig.class);
		System.out.println(context.getBean("exam"));
	
		
		
		/*
		 
AnnotationConfigApplicationContext 로 성적을 구현

5명의 학생들의 정보를 이용하여 성적순으로 출력하는 프로그램을 구현 


		 * */
	}

}
