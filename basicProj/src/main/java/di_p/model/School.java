package di_p.model;

public class School{
	String name, addr;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("School.setName("+name+") 실행 ------");
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", addr=" + addr + "]";
	}
	
	public School() {
		System.out.println("School 기본생성자");
	}
}