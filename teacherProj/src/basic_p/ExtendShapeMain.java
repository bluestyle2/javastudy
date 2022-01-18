package basic_p;


class ExShape{
	
	String name;
	int area, border;
	
	public ExShape() {
		// TODO Auto-generated constructor stub
	}

	public ExShape(String name) {
		this.name = name;
	}

	public ExShape(String name, int area, int border) {

		this.name = name;
		this.area = area;
		this.border = border;
	}

	public String toString() {
		return name+"의 넓이 : " + area+" , 둘레 : "+border;
	}
}

class ExRectangle extends ExShape{
	
	private int w, h;

	public ExRectangle(int w, int h) {
		name = "직사각형";
		this.w = w;
		this.h = h;
		
		calc();
	}
	
	private void calc() {
		area = w * h;
		border = (w + h) * 2;
	}	
}


class ExCircle extends ExShape{
	
	private int r;
	private final double PI = 3.141592;

	public ExCircle(int r) {
		super("원");
		this.r = r;
			
		calc();
	}
	
	private void calc() {
		area = (int)(r * r * PI);
		border = (int)(r * PI * 2);
	}	
}

class ExTriangle extends ExShape{
	
	

	public ExTriangle(int w, int h, int l) {
		//int aa = 100;
		super("직각삼각형", w * h /2, w+h+l);
		
	}
	
		
}
public class ExtendShapeMain {

	public static void main(String[] args) {
		ExRectangle rec1 = new ExRectangle(5, 6);
		
		System.out.println(rec1);
		
		System.out.println(new ExRectangle(10, 9));
		System.out.println(new ExCircle(5));
		System.out.println(new ExCircle(8));
		System.out.println(new  ExTriangle(5,6,8));
		System.out.println(new  ExTriangle(10,7,16));
	}

}
