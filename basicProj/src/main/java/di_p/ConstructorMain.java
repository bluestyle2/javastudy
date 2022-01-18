package di_p;

import java.util.LinkedList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("di_xml/constructor.xml");
				
		System.out.println(context.getBean("mdb")); //getBean 안에 이름만 쓰는것 = 오브젝트 
		System.out.println(context.getBean("cc1")); //클래스 쓰는것 = 클래스로 형변환 된다
		System.out.println(context.getBean("cc2"));
		System.out.println(context.getBean("cc3"));

		System.out.println(context.getBean("ach1"));
		System.out.println(context.getBean("circle"));
		System.out.println(context.getBean("react"));
		System.out.println(context.getBean("trang"));
		/**
		 * 
		 *도형을 생성자로 구분하여 출력하세요 
		 
		 원 : 반지름
		 직사각형 : 가로,세로
		 직각삼각형 : 높이, 밑변, 빗변
		 
		 출력 요소 : 이름, 넓이, 둘레
		 */
	}

}
