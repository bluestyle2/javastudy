package di_p;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import di_p.model.Member;
import di_p.model.Stud;
//import di_p.model.Baby;

public class DiMain {

	public static void main(String[] args) {
		
		Member mm1 = new Member("오병철");
		mm1.setName("하성민");
		mm1.setAge(26);
		
		System.out.println(mm1);
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("di_xml/first.xml");
		String [] names =context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(names));	//정의된 bean보기
		Member mb2 = (Member)context.getBean("mm2");//Member로 형변환
		System.out.println(mb2);
		System.out.println(context.getBean("mm3"));
		
		Member mb3 = context.getBean("mm3", Member.class);	//형변환 mk2.
		System.out.println(mb3.getName());
		
		Member [] arr1 = {
				context.getBean("mm2", Member.class),
				context.getBean("mm3", Member.class),
				context.getBean("st4", Member.class),
				context.getBean("bb5", Member.class),
		};
		System.out.println("arr1------------------------------");
		for (Member mem : arr1) {
			System.out.println(mem);
			
		}
		
		Member mmm1 = new Stud();
		//Member mmm2 = new Baby(); public이 아니라서 못가져옴
		System.out.println("arr2------------------------------");
		ArrayList<Member> arr2 = new ArrayList();
		
		
		for (String str : "mm2,mm3,st4,bb5".split(",")) {
			arr2.add(context.getBean(str,Member.class));
		}
		for (Member mem : arr2) {
			System.out.println(mem);
			
		}
	}

}
