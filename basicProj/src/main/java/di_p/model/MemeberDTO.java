package di_p.model;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MemeberDTO implements BeanNameAware, InitializingBean, DisposableBean{
	String pname;
	
	int age;
	
	School sch;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
		System.out.println("MemeberDTO.setPname("+pname+") 실행 ------");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public School getSch() {
		return sch;
	}

	public void setSch(School sch) {
		this.sch = sch;
	}

	@Override
	public String toString() {
		return "memeberDTO [pname=" + pname + ", age=" + age + ", sch=" + sch + "]";
	}
	
	public MemeberDTO() {
		System.out.println("MemeberDTO 기본생성자");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MemberDTO.destroy() 실행 ------------");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MemberDTO.afterPropertiesSet() 실행 ------------");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("MemberDTO.setBeanName() 실행 ------------");
	}
}

