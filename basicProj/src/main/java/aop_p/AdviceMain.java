package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.model.Member;
import aop_p.model.car.Airplain;
import aop_p.model.car.Car;
import aop_p.model.daum.FatherSup;
import aop_p.model.naver.FashionKing;
import aop_p.model.naver.SoundOfHeart;

public class AdviceMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("aop_xml/advice.xml");

		SoundOfHeart soh = context.getBean("soundOfHeart",SoundOfHeart.class);
		
	
		boolean res = soh.aebong(123,777.896);
		System.out.println("---------------------");
		soh.err();
	
	}

}
