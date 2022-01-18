package homework_p;
enum Coffee{
	Ame("아메리카노"), Cafu("카푸치노"), Moca("카페모카");
	
	String menu;
	int result = 0;
	int ame;
	int cafu;
	int moca;
	boolean cc = false;
	
	Coffee(String menu){
		if (ordinal()==1) {
			ame += 1;
		}
	
	}
	void calc() {
		System.out.println("결과 : "+this+" 판매한횟수 : "+ame+" 판매금액 : "+result);
		
	}
}
public class Study13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee cc;
		cc = Coffee.valueOf(null);
		
		System.out.println(Coffee.values());
		
		Coffee [] arr = Coffee.values();
		for(Coffee menu : arr) {
			System.out.println(menu);
		cc.menu = "아메리카노";
		cc.menu = "아메리카노";
			
		}
		for (Coffee coffee : arr) {
			coffee.calc();
		} 
		
	}

}
