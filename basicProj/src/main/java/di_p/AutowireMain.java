package di_p;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AutowireMain {

	public static void main(String[] args) {
				
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/autowire.xml");
		
		System.out.println(context.getBean("adult"));	
		System.out.println(context.getBean("gal_1"));	
		System.out.println(context.getBean("gal_2"));
		System.out.println(context.getBean("mem1"));	
		System.out.println(context.getBean("drink1"));	
	}

}
