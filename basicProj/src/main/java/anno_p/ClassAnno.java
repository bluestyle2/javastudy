package anno_p;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import anno_p.model.Exam;
import anno_p.model.Stud;
import anno_p.model.ZaeRyo;
import anno_p.model.ZzlGae;


@ComponentScan(basePackages = "anno_p.model")
@ImportResource("anno_xml/autowired.xml")
public class ClassAnno {

	@Bean
	ZaeRyo bigpa() {		//메소드명이 빈이름
		
		ZaeRyo res = new ZaeRyo();
		res.setTitle("대파");
		res.setKind("채소");
		return res;
	}
	
	@Bean
	ZaeRyo dubu() {		//메소드명이 빈이름
		
		ZaeRyo res = new ZaeRyo();
		res.setTitle("두부");
		res.setKind("콩류");
		return res;
	}
	
	@Bean
	ZaeRyo dongTae() {		//메소드명이 빈이름
		
		ZaeRyo res = new ZaeRyo();
		res.setTitle("동태");
		res.setKind("생선");
		return res;
	}
	
	
	@Bean
	ZzlGae kczg(ZaeRyo bigpa, ZaeRyo dubu) {	//자동으로 매개변수 이름에 맞는 메소드의 bean 가져온다
		
		System.out.println("kczg 실행:"+bigpa+","+dubu);
		ZzlGae res = new ZzlGae();
		res.setTitle("김치찌개");
		res.setZr1(bigpa);
		res.setZr2(dubu);
		
		return res;
	}
	
	@Bean
	ZaeRyo zr1() {		//메소드명이 빈이름
		
		ZaeRyo res = new ZaeRyo();
		res.setTitle("707특임대");
		res.setKind("육군");
		return res;
	}
	
	@Bean(name = "zr2")
	ZaeRyo udt() {		//메소드명이 빈이름
		
		ZaeRyo res = new ZaeRyo();
		res.setTitle("UDT");
		res.setKind("해군");
		return res;
	}
	
	@Bean(autowire = Autowire.BY_NAME) //해당 페이지의 현재 메소드와 해당 클래스에서 선언한 변수명이 일치하면 자동으로 가져온다
	ZzlGae military() {	
		
	
		ZzlGae res = new ZzlGae();
		res.setTitle("부대찌개");
		
		return res;
	}
	
	//@Bean(autowire = Autowire.BY_TYPE)
	ZzlGae soyBean() {	
		
	
		ZzlGae res = new ZzlGae();
		res.setTitle("된장찌개");
		
		return res;
	}


}
