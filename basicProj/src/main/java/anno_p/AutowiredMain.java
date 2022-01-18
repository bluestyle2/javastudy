package anno_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				 new ClassPathXmlApplicationContext("anno_xml/autowired.xml");
		
		System.out.println(context.getBean("mm"));
		System.out.println(context.getBean("cc"));
		System.out.println(context.getBean("cc1"));
		System.out.println(context.getBean("cc3"));
		System.out.println(context.getBean("cc4"));
		System.out.println(context.getBean("cc5"));
	
	}

}
