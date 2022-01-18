package anno_p.model;

import javax.annotation.Resource;

public class Worker {
	
	@Resource
	String pname;
	
	int age;
	
	@Resource(name="cc1")
	Company com;

	@Override
	public String toString() {
		return "Worker [pname=" + pname + ", age=" + age + ", com=" + com + "]";
	}


	
	
}
