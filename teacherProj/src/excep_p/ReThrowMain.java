package excep_p;

class ReThrow{
	
	void meth_1() {
		
		System.out.println("meth_1시작()");
		meth_2();
		
		System.out.println("meth_1끝()");
	}
	
	void meth_2() {
		
		System.out.println("\t meth_2시작()");
		//meth_3();
		
		System.out.println("\t meth_2끝()");
	}
	
	void meth_3() throws Exception{
		
		System.out.println("\t\t meth_3시작()");
		
		try {			
			
			throw new Exception("meth_3() 에러발생");
			
			
		} catch (Exception e) {
			
			System.out.println("\t\t meth_3 에러처리:"+e.getMessage());
			
			throw e;	//reThrowing
			
		}
	
		//System.out.println("\t\t meth_3끝()");
		
			}
	
}

public class ReThrowMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ReThrow rw = new ReThrow();
			
			rw.meth_1();
	}

}
