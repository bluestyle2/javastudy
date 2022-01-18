package anno_p.model;

import org.springframework.beans.factory.annotation.Required;

public class Person {

	String pname;
	//@Required
	int age;
	
	Company com;

	public String getPname() {
		return pname;
	}
	
	@Required	//setter 에 설정
	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Company getCom() {
		return com;
	}

	public void setCom(Company com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", age=" + age + ", com=" + com + "]";
	}
	
	
}

class Company{
	String title, addr;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Company [title=" + title + ", addr=" + addr + "]";
	}
	
	
	
}
