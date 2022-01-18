package di_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/sec.xml");
		
		System.out.println(context.getBean("gal"));
		System.out.println(context.getBean("adult"));
		System.out.println(context.getBean("adult2"));
	}

}
