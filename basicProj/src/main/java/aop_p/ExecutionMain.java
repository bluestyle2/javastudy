package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.model.Member;
import aop_p.model.car.Airplain;
import aop_p.model.car.Car;
import aop_p.model.daum.FatherSup;
import aop_p.model.naver.FashionKing;
import aop_p.model.naver.SoundOfHeart;

public class ExecutionMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("aop_xml/execution.xml");

		SoundOfHeart soh = context.getBean("soundOfHeart",SoundOfHeart.class);
		FatherSup fs = context.getBean("fatherSup",FatherSup.class);
		FashionKing fash = context.getBean("fashionKing",FashionKing.class);
		Car cc = context.getBean("car",Car.class); 
		Airplain aa = context.getBean("airplain",Airplain.class);
		soh.josuk();
		System.out.println("---------------------");
		soh.ironKing();
		System.out.println("---------------------");
		soh.aebong(123,456.789);
		System.out.println("---------------------");
		soh.flower(200);
		System.out.println("---------------------");
		fs.meth_1();
		System.out.println("---------------------");
		fs.meth_2(100, false);
		System.out.println("---------------------");		
		fash.gian();
		System.out.println("---------------------");
		fash.marriage();
		System.out.println("---------------------");
		fash.changJu();
		System.out.println("---------------------");
		cc.martiz();
		cc.policeCar();
		System.out.println("---------------------");
		aa.turbo();
		aa.muin();
	}

}
