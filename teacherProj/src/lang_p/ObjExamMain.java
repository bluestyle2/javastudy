package lang_p;

import java.util.Arrays;

class ObjStud{
	
	String kind, name;
	
	int [] jum;
	
	int tot, avg;

	public ObjStud(String kind, String name, int... jum) {
		super();
		this.kind = kind;
		this.name = name;
		this.jum = jum;
		
		calc();
	}

	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}

	@Override
	public String toString() {
		return kind + "\t" + name + "\t"+"점수합 : " + tot + "\t" + avg;
	}
	
	public boolean equals(Object oo) {
		
		ObjStud you = (ObjStud)oo;
		return kind.equals(you.kind);
	}
	
}

public class ObjExamMain {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ObjStud [] studs = { 
					new ObjStud("일반","현빈",77,78,71),
					new ObjStud("일반","원빈",new int[] {57,58,51}),
					new ObjStud("특기","김우빈",97,98,91),
					new ObjStud("특기","골빈빈",new int[] {67,68,61}),
					new ObjStud("일반","장희빈",87,88,81),
					new ObjStud("특기","젤리빈",new int[] {67,78,81}),
		};
		
		ObjStud gg = new ObjStud("일반", "합계", 0,0,0);
		ObjStud ss = new ObjStud("특기", "합계", 0,0,0);
		
		for (ObjStud st : studs) {
			//System.out.println(gg.equals(st));
			System.out.println(st);
			
			if(gg.equals(st)) {
				
				for (int i = 0; i < gg.jum.length; i++) {
					gg.jum[i]+=st.jum[i];
					
				}
			}
			if(ss.equals(st)) {
				
				for (int i = 0; i < ss.jum.length; i++) {
					ss.jum[i]+=st.jum[i];
					
				}
			}
		}
		System.out.println("---------------------------");
		gg.calc();
		//System.out.println(Arrays.toString(gg.jum));
		System.out.println(gg);
		
		ss.calc();
		System.out.println(ss);
		
		
		/*
		 * 
		 * 도형클래스를 배열로 생성하여 같은 도형의 넓이와 둘레의 합계를 출력하세요
		 * 
		 * */
	}

}
