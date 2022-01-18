package homework_p;

class ExShape{
	String color, name;
	
	double area;
	
	double border;
	
	final double pi = 3.141592;
	
	void calc() {}
	
	public String toString() {
		return color+" "+name+"의 넓이 "+area+" 둘레 "+border;
	}
}

	class Rectangle extends ExShape{
		
		int width, height;
		
	public Rectangle(String color, int width, int height) {
		name = "직사각형";
		this.color = color;
		this.width = width;
		this.height = height;
		
	}
	void calc() { //
	
		area = width * height;
		border = (width + height) * 2;
	}
}

	class Circle1 extends ExShape{
		
		int r;
		
	public Circle1(String color, int r) {
		name = "원";
		this.color = color;
		this.r = r;
		
		
	}
	void calc() {
	
		area = r * r * pi;
		border = 2 * r * pi;
	}
}
	class Triangle extends ExShape{
		
		int width, height, hypotenuse;
		
	public Triangle(String color, int width, int height, int hypotenuse) {
		name = "삼각형";
		this.color = color;
		this.width = width;
		this.height = height;
		this.hypotenuse = hypotenuse;
		
	}
	void calc() {
	
		area = width * height /2;
		border = width + height + hypotenuse;
	}
}

public class Study2 {
	
	public static void main(String[] args) {
		ExShape [] figures = {
		new Rectangle("빨간색", 5, 6),
		new Circle1("파란색", 6),
		new Triangle("노란색",7,8,9)
		};
		
		
		for (int i = 0; i < figures.length; i++) {
			figures[i].calc();
		}
		
		for (int i = 0; i < figures.length; i++) {
			System.out.println(figures[i]);
		}
	}

}
//도형 정보 계산 클래스를 완성하세요
//도형 정보 클래스 : 도형 종류, 넓이, 둘레, 색상

//도형의 종류 : 직사각형, 원, 직각삼각형
