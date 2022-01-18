package excep_p;

public class ThrowExcepMain {

	public static void main(String[] args) {
		
		
		try {
			System.out.println("try 실행 1");
			
			System.out.println("try 실행 2");
			
			//Exception ex = new Exception("내가 만든 예외");
			
			//throw ex;			
			throw new Exception("내가 만든 예외");
			//System.out.println("try 실행 3");
		} catch (Exception e) {
			//.System.out.println(e);
			//e.printStackTrace();
			System.out.println("예외내용 : "+e.getMessage());
		}
		
		

	}

}
