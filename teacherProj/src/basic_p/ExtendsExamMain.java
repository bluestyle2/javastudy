package basic_p;

/*
 * 학생(부모)
 * 
 * 일반학생(자식)
 * 점수 - 평균
 * 
 * 특기생(자식)
 * 점수 - 비균등
 * 
 *  
 **/

class ExStud {

	String name;
	int tot, avg;

	@Override
	public String toString() {
		return name + "\t" + tot + "\t" + avg;
	}
}

class ExGeneral extends ExStud {

	private int[] jum;

	ExGeneral(String name, int kor, int eng, int mat) {
		this.name = name;
		jum = new int[] { kor, eng, mat };
		calc();
	}

	private void calc() {
		tot = 0;

		for (int i = 0; i < jum.length; i++) {
			tot += jum[i];
		}
		avg = tot/jum.length;
	}

}

class ExSpec extends ExStud {
	private int [] jum;
	
	ExSpec(String name, int kor, int eng, int mat, int art){
		this.name = name;
		jum = new int[] {kor, eng, mat, art};
		
		calc();
	}


	private void calc() {
		double [] rate = {0.3, 0.15, 0.05, 0.5};
		tot = 0;
		avg = 0;
		for (int i = 0; i < rate.length; i++) {
			tot += jum[i];
			avg += jum[i] * rate[i];
		}
	}
}
public class ExtendsExamMain {

	public static void main(String[] args) {
		ExGeneral st1 = new ExGeneral("현빈", 77, 78, 71);
		ExGeneral st2 = new ExGeneral("원빈", 57, 58, 51);
		ExGeneral st3 = new ExGeneral("젤리빈", 97, 98, 91);
		ExGeneral st4 = new ExGeneral("미스터빈", 97, 68, 31);
		ExGeneral st5 = new ExGeneral("장희빈", 37, 68, 91);
		ExSpec st44 = new ExSpec("커피빈", 97, 78, 51, 31);
		ExSpec st55 = new ExSpec("골빈", 37, 58, 71, 91);
		
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(st5);
		System.out.println(st44);
		System.out.println(st55);

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

