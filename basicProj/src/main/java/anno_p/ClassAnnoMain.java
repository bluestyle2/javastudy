package anno_p;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassAnnoMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				new AnnotationConfigApplicationContext(ClassAnno.class);
		System.out.println(context.getBean("member"));
		System.out.println(context.getBean("dubu"));
		System.out.println(context.getBean("bigpa"));
		System.out.println(context.getBean("dongTae"));
		System.out.println(context.getBean("kczg"));
		System.out.println(context.getBean("military"));
		//System.out.println(context.getBean("soyBean"));
		System.out.println(context.getBean("mm"));
		System.out.println(context.getBean("Junhyuk"));
		System.out.println(context.getBean("Minho"));
		System.out.println(context.getBean("Jihun"));
		
		/*
		 
AnnotationConfigApplicationContext 로 성적을 구현

5명의 학생들의 정보를 이용하여 성적순으로 출력하는 프로그램을 구현 


		 * */
	}

}
