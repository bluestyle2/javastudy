package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.model.Member;
import aop_p.model.daum.FatherSup;
import aop_p.model.naver.FashionKing;
import aop_p.model.naver.SoundOfHeart;

public class FirstMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("aop_xml/first.xml");

		Member mm = context.getBean("member",Member.class);
		SoundOfHeart soh = context.getBean("soundOfHeart",SoundOfHeart.class);
		FatherSup fs = context.getBean("fatherSup",FatherSup.class);
		FashionKing fash = context.getBean("fashionKing",FashionKing.class);
		
		System.out.println("===========> mm:"+mm);
		String ttt = soh.josuk();
		System.out.println("ttt:"+ttt);
		System.out.println("--------------------------------------------");
		int i = soh.ironKing();
		System.out.println("i:"+i);
		System.out.println("--------------------------------------------");
		boolean bb = soh.aebong(100, 123.456);
		System.out.println("bb:"+bb);
		System.out.println("--------------------------------------------");
		fs.meth_1();
		System.out.println("--------------------------------------------");
		ttt = fs.meth_2(999, false);
		System.out.println("ttt:"+ttt);
		System.out.println("--------------------------------------------");
		ttt = fash.gian();
		System.out.println("ttt:"+ttt);
		System.out.println("--------------------------------------------");
		bb = fash.marriage();
		System.out.println("bb:"+bb);
		System.out.println("--------------------------------------------");
		fash.changJu();
		mm.setAge(44);
		System.out.println("--------------------------------------------");
		ttt = soh.josuk();
		System.out.println("ttt:"+ttt);
	}

}
