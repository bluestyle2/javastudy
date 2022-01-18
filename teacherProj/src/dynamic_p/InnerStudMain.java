package dynamic_p;

import java.util.Arrays;

class OutBan{
	
	String name;
	
	
	OutBan(String name) {
		
		this.name = name;
	}
	int success = 0;
	int fail = 0;
	
	public String toString() {
		return name + ", 합격=" + success + ", 불합격 =" + fail;
	}
	
	class Stud{
		
		String name;
		int [] jum;
		int res;
		boolean chk;
		
		public Stud(String name, int ... jum) {			
			this.name = name;
			this.jum = jum;
			calc();
		}
		
		void calc() {
			
			
			int tot = 0;
			for (int i : jum) {
				tot += i;
			}
			res = tot/jum.length;
			
			if(chk=res>=80) {
				success++;
			}else {
				fail++;
			}
		}

		@Override
		public String toString() {
			return OutBan.this.name+"," + name + "," + Arrays.toString(jum) + "," + res + "," + chk;
		}
		
		
	}
}

public class InnerStudMain {

	public static void main(String[] args) {
		OutBan b1 = new OutBan("티라노");
		OutBan b2 = new OutBan("프테라노돈");
		
		OutBan.Stud [] studs = {
				b1.new Stud("현빈", 77,78,71),
				b2.new Stud("원빈", 67,68,61),
				b1.new Stud("투빈", 97,98,91),
				b2.new Stud("장희빈", 57,58,51),
				b1.new Stud("젤리빈", 87,88,81),
				b2.new Stud("미스터빈", 57,68,81),
				b1.new Stud("커피빈", 87,78,51),
				b2.new Stud("자바빈", 97,98,71)
		};
		
		for (OutBan.Stud st : studs) {
			System.out.println(st);
		}
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
