package anno_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				 new ClassPathXmlApplicationContext("anno_xml/resource.xml");
		
		System.out.println(context.getBean("ww"));
	}

}
