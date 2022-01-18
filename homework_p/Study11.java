package homework_p;



/*///커피전문점을 구현하세요
/// 총판 --- Outer
/// 지점 --- Inner
/// 메뉴 -- 아메리카노, 까페라떼, 카푸치노
 * 아 문제가 이게 아니었구나 .........ㅜㅜㅜㅜㅜㅜㅜ 오늘 내부클래스 배웠지! 문법이라서 쉬운가보네? 했는데
 * .... 어쩐지 쉽더라구요.. 
 * 
*/
	class OutCof{
		String name;
		
		OutCof(String name){
			this.name = name;
		}

		int resame = 0;
		int resmoca = 0;
		int cafame = 0;
		int cafmoca = 0;
		public String toString() {
			return name+" 매장의 "+"\n" +"아메리카노 판매금액 : " + resame +
					"원"+"\n"+ "카페모카 판매금액 : " + resmoca+"원"+"\n"+
					"판매량 : "+"\n"+"아메리카노 : "+cafame+" 카페모카 : "+cafmoca;
		}
		
		class Incof{
			
			String name;
			int ame;
			int moca;
			int res;
			int totame;
			int totmoca;
			
			public Incof(String name, int ame, int moca) {
				this.name = name;
				this.ame = ame;
				this.moca = moca;
				
				calc();
			}
			void calc() {
				
				
				totame = ame * 3000;
				totmoca = moca * 4200;
				resame += totame;
				resmoca += totmoca;
				cafame += ame;
				cafmoca += moca;
						
			}
			public String toString() {
				return OutCof.this.name+name+"의 판매량 "+"\n"+"아메리카노 : "
			+ame+ " 카페모카 : "+moca+"\n"+"판매 금액 "+"아메리카노 : "+totame+" 카페모카 : "+totmoca;
						
			}
			
		}
	}
public class Study11 {

	public static void main(String[] args) {
		OutCof j1 = new OutCof("스타벅스");
		OutCof j2 = new OutCof("캔모아");
		OutCof.Incof [] sales = {
				j1.new Incof("종로점",50,30),
				j1.new Incof("구로점",60,10),
				j2.new Incof("주안점",20,40),
				j2.new Incof("역삼점",30,20)
		};
		for (OutCof.Incof show : sales) {
			System.out.println(show);
		}
		
		System.out.println(j1);
		System.out.println(j2);
	}
	

}
