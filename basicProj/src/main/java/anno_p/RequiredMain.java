package anno_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequiredMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				 new ClassPathXmlApplicationContext("anno_xml/required.xml");
		
		System.out.println(context.getBean("pp"));

	}

}
