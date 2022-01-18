package homework_p;

/*///커피전문점을 구현하세요
/// 총판 --- Outer
/// 지점 --- Inner
/// 메뉴 -- 아메리카노, 까페라떼, 카푸치노
 * 
 */

	class Menu{
		String name;
		int cpcof;
		int price;
		Menu(String name, int price){
//			super;
			this.name=name;
		}
		
		void CpPrice(int price) {
			this.price = price;
		}
		
		void addCof() {
			cpcof++;
		}
	}
	class Brand{
		String name;
		
		Menu [] menus = {
				new Menu("아메리카노",0),
				new Menu("카페모카",0)
				
		};
		
//		Brand(String name, int ...is price){
//			super();
//			this.name=name;
//			this.price=price;
//			
//		}
//		
		
	}
	
	public class Study12 {
	
		public static void main(String[] args) {
			
	
		}
	
	}
