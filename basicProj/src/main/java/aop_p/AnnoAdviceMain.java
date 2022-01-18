package aop_p;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop_p.model.adminchk.AdminChk;
import aop_p.model.daum.FatherSup;
import aop_p.model.naver.FashionKing;
import aop_p.model.naver.SoundOfHeart;

public class AnnoAdviceMain {

	public static void main(String[] args) {

		AbstractApplicationContext context =
				new ClassPathXmlApplicationContext("aop_xml/anno.xml");

		SoundOfHeart soh = context.getBean("soundOfHeart",SoundOfHeart.class);
		FatherSup fs = context.getBean("fatherSup",FatherSup.class);
		FashionKing fash = context.getBean("fashionKing",FashionKing.class);
		AdminChk ch = context.getBean("adminChk",AdminChk.class);
		boolean res = soh.aebong(123,777.896);
		System.out.println("---------------------");
	
		soh.ironKing();
		System.out.println("---------------------");
		fash.marriage();
		System.out.println("---------------------");
		//soh.err();
		System.out.println("---------------------");
		ch.chk("admin");
		/*
		 * 회원관리.메인화면 진입시 Member의 pname 가 admin 이면 진입 그렇지 않으면 메인페이지.메인화면로 이동하는aop를 구성하세요
		 * 
		 * 
		 * 
		 * */
	}

}
