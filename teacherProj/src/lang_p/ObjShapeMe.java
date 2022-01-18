package lang_p;

public class ObjShapeMe {
	
	String name;
	int tot, w,h;
	double r;
	double area;
	double border;
	
	public ObjShapeMe(String name,int w, int h) {
		super();
		this.name = name;
		this.w=w;
		this.h=h;
			
		calc();
	}
	
	void calc() {
		area = w*h;
		border = w*h/2;
		}
	public ObjShapeMe(String name,double r) {
		super();
		this.name = name;
		this.r=r;
		calc1();
	}
	void calc1() {
		area = r*r*3.141592;
		border = r*r*2;
	}
	

		
	@Override
	public String toString() {
		return  name+ "\t"+"넓이 : "+area+" 둘레 : "+border+" 합계"+tot;
	
}
	
	public boolean equals(Object oo) {
		ObjShapeMe you = (ObjShapeMe)oo;
		return name.equals(you.name);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObjShapeMe [] shapes = {
					new ObjShapeMe("직사각형",5,6),
					new ObjShapeMe("직사각형",6,7),
					new ObjShapeMe("직사각형",7,8),
					new ObjShapeMe("원",5),
					new ObjShapeMe("원",6),
					new ObjShapeMe("원",7)
		};
		ObjShapeMe gg = new ObjShapeMe("직사각형",0,0);
		
		
		for(ObjShapeMe st : shapes) {
			System.out.println(st);
		}
	}
	
}
