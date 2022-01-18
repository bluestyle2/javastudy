package dynamic_p;

interface Counter{

	void calc(int cash, int tablecash);
		
	void hello();
}
interface Hall{
	
	void serving(int tablehow);
	
	void bye();
}
interface Kitchen{

	
	void wash(int bowl);
}

	class Albawork implements Counter, Hall, Kitchen{
	
	int bowl, tablehow, cash, tablecash;
	
	
	public Albawork() {
		
		
	}
	
	@Override
	public void wash(int bowl) {
		
		System.out.println("그릇"+bowl+"개를 닦아요");
	}

	@Override
	public void serving(int tablehow) {
		
		System.out.println("음식"+tablehow+"개를 서빙해요");
		
	}

	@Override
	public void hello() {
		
		System.out.println("어서오세요");
	}
	public void bye() {
		
		System.out.println("감사합니다 또 오세요");
	}


	@Override
		public void calc(int cash, int tablecash) {
			
		System.out.println(tablecash+"음식"+cash+"원 받았습니다");
		}
	
	
	}
	public class AlbaMan {

	public static void main(String[] args) {
		
	Albawork order = new Albawork();
	
	Counter cc;
	Hall hh;
	Kitchen kk;
	
	cc = order;
	hh = order;
	kk = order;
	cc.hello();
	hh.serving(3);
	cc.calc(100,1000);
	hh.bye();
	kk.wash(3);
	
	
	}

}
