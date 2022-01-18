package anno_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComponentMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =
				 new ClassPathXmlApplicationContext("anno_xml/component.xml");
		
		System.out.println(context.getBean("member"));
		//System.out.println(context.getBean("masuri"));
		System.out.println(context.getBean("hsm"));
		System.out.println(context.getBean("cof"));
		System.out.println(context.getBean("cof2"));
		System.out.println(context.getBean("cof3"));
	}

}
