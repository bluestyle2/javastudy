package basic_p;


abstract class AbsShape{
	
	String name;
	double area, border;
	double pi = 3.141592;
	public String toString() {
		calc();
		return name+"\t"+area+"\t"+border;
	}
	
	abstract void calc();
	
}

	class AbsRectangle extends AbsShape{
	int w, h;

	AbsRectangle(int w, int h) {
		name = "직사각형";
		this.w = w;
		this.h = h;
	}
	
	void calc() {
		area = w * h;
		border = (w+h) *2;
	}
}
	
	class AbsCircle extends AbsShape{
	int r;
	
	AbsCircle(int r){
		name ="원";
		this.r=r;
	}
	void calc() {
		area = r*r*pi;
		border = (r*pi)/2;
	}
	}

public class AbsShapeMain {

	public static void main(String[] args) {
		AbsShape [] shapes = {
				new AbsRectangle(5, 6),
				new AbsRectangle(10, 7),
				new AbsCircle(6)
		};
		
		for (AbsShape sh : shapes) {
			System.out.println(sh);
		}

	}

}
