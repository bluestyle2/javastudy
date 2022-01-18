package anno_p.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Member {
	String pname;
	
	@Autowired
	int age;
	
	/*
	 * 우선순위
	 1. @Qualifier("cc2") //bean 지정	 
	 2. byName
	 3. byType
	 * */
	
	@Autowired	
	@Qualifier("cc2")	//bean 지정(명시)
	Company com;

	public String getPname() {
		return pname;
	}
	@Autowired(required = false)	//필수 : true/false	, 생략시 : true
	public void setPname(String pname) {
		this.pname = pname;
	}

	
	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", com=" + com + "]";
	}
	
	
}

	