package basic_p;
/*
 * 스포츠카 속도 : 50, 연비 : 20, 디자인 : 30
 * 트럭	  연비 : 60, 적재량 : 40
 * 승합차	  속도 : 15, 연비 : 35, 탑승 : 50
 * */
class DyCar{
	
	String kind, name;
	
	double jum;
	
	void calc() {}
	
	public String toString() {
		return kind+"\t"+name+"\t"+(int)jum;
	}	
}

class DyTruck extends DyCar{
	
	int fuel, carry;

	public DyTruck(String name, int fuel, int carry) {
		kind = "트럭";
		this.name = name;
		this.fuel = fuel;
		this.carry = carry;
	}
	
	void calc() {
		
		jum = fuel *0.6 + carry *0.4;
		
	}
	
}

class DySports extends DyCar{
	int speed, fuel, design;
	
	public DySports(String name,int speed, int fuel, int design) {
		kind = "스포츠카";
		this.name = name;
		this.speed = speed;
		this.fuel = fuel;
		this.design = design;
	}
	
	void calc() {
		
		jum = speed * 0.5 + fuel *0.2 + design * 0.3;
	}
}


class DyVan extends DyCar{
	int speed, fuel, cnt;
	
	public DyVan(String name,int speed, int fuel, int cnt) {
		kind = "승합차";
		this.name = name;
		this.speed = speed;
		this.fuel = fuel;
		this.cnt = cnt;
	}
	
	void calc() {
		
		jum = speed * 0.15 + fuel *0.35 + cnt * 0.5;
	}
}
public class DyCarMain {

	public static void main(String[] args) {
		DyCar [] cars = {
			new DyTruck("타이탄", 70, 40),
			new DyTruck("1.5포터", 40, 70),
			new DySports("봉고르기니", 80, 60, 40),
			new DySports("뭘실을라고", 40, 60, 80),
			new DyVan("에셈파이브", 50, 40, 80),
			new DyVan("붕붕이", 40, 30, 70)
		};
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].calc();
		}
		
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
//도형 정보 계산 클래스를 완성하세요
//도형 정보 클래스 : 도형 종류, 넓이, 둘레, 색상

//도형의 종류 : 직사각형, 원, 직각삼각형

