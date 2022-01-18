package excep_p;

public class ExcepMain {

	public static void main(String[] args) {
		
		try {
			System.out.println("try 시작");
			int a = 10/2;
			
			System.out.println("try 실행1");
			
			int [] arr = {33,55,22,88};
			
			System.out.println("arr:"+arr);
			
			System.out.println("try 실행2");
			
			System.out.println(arr[5]);
			
			System.out.println("try 종료");
			
		
		
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열 에러 발생:"+e);
			
		
		}catch(Exception e) {	//부모 예외처리가 자식 예외처리 다음에 위치해야 함
			
			System.out.println("일반적 에러 발생:"+e);
			return;
			
		}finally {
			System.out.println("프로그램 종료");
		}
		
		
		

	}

}
