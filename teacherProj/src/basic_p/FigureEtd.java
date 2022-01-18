package basic_p;

	class Figure {
		String name;	
		double area, perimeter;	//원의 넓이와 둘레는 정수로 표현이불가해서 double 사용했습니다
		double pi = 3.141592;	
	
	public String toString() {
		return name + "의 넓이 : " + area +  " 둘레 : " + perimeter;
	}
}
	class Rectangle extends Figure { //직사각형
		private int width, height; 
		
		Rectangle(String name, int width, int height){
			this.name = name;
			area = width * height; //직사각형의 넓이 계산
			perimeter = (width + height) * 2; //직사각형의 둘레 계산
		}
	}
	
	class Circle extends Figure { //원 
		int radius;

		Circle(String name, int radius){	
		this.name = name;	
		
		 area = radius * radius * pi;	//원의 넓이 계산
		 perimeter = 2 * radius * pi;	//원의 둘레 계산
		}
	}
	
	class Triangle extends Figure{	//직각삼각형
		int width2, height2, hypotenuse;

		Triangle(String name, int width2, int height2, int hypotenuse){
			this.name = name;
			area = width2 * height2 / 2;	//직각삼각형의 넓이 계산
			perimeter = width2 + height2 + hypotenuse; //직각삼각형의 둘레 계산
		}
	}
	


public class FigureEtd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Rectangle rt = new Rectangle("직사각형",5,6);
			Circle ci = new Circle("원",6);
			Triangle tr = new Triangle("직각삼각형",7,8,9);
			System.out.println(rt);
			System.out.println(ci);
			System.out.println(tr);
			
	}

}



/*
도형 클래스를 구현하세요
부모 : 도형 -- 이름, 넓이, 둘레

자식 : 			넓이						둘레
	직사각형	가로 * 세로				(가로 + 세로) * 2
	원		반지름 * 반지름 * 원주율		2 * 반지름 * 원주율
	직각삼각형 가로 * 세로 /2				가로 + 세로 + 빗변
	
	
	원주율 : 3.141592
	
	
클래스 출력시 toString 형태로 정보 출력할 것

ex)
ExRectangle sh1 = new ExRectangle(5,6);
System.out.println(sh1);	---> 직사각형의 넓이 : 30, 둘레 : 22
* 
* 
* 
* 
* 
* 
*/
