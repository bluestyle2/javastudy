package dynamic_p;


interface InFather{
	
	void play();
	
	void work();
}

interface Husband{
	void work();
	
	void talk(String story);
}

interface Teacher{
	
	void test();
	
	void explain(String content);
}


class InMe implements InFather, Husband, Teacher{
	
	
	String name;
	
	public InMe(String name) {
		
		this.name = name;
	}
	
	public void test() {
		// TODO Auto-generated method stub
		System.out.println(name +" 확인해요");
	}
	public void explain(String content) {
		// TODO Auto-generated method stub
		System.out.println(name +" "+content+" 설명해요");
	}
	
	public void talk(String story) {
		// TODO Auto-generated method stub
		System.out.println(name +" "+story+" 이야기해요");
	}
	
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(name +"놀아요");
	}
	
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name +"일해요");
	}
		
}


public class MeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InMe [] me2 = {new InMe("오준혁"),
				new InMe("아무개")};
		
		for (int i = 0; i < me2.length; i++) {
			
		}
		
		InMe me = new InMe("이신협");
		
		InFather ff;
		Husband hh;
		Teacher tt;
		
		ff = me;
		ff.play();
		ff.work();
		hh = me;
		hh.talk("갤럭시워치4");
		hh.work();
		tt = me;
		tt.test();
		tt.explain("인터페이스");
		
		
	}

}
