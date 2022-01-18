package di_p;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ComputerMain {

	public static void main(String[] args) {
				
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/computer1.xml","di_xml/computer2.xml");
	
		System.out.println(context.getBean("ss"));
		System.out.println(context.getBean("dd"));
		System.out.println(context.getBean("nn"));
		System.out.println(context.getBean("tt"));
	}

}
