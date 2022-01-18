package homework_p;				
/*
100까지 나오는건 구현했지만 짝짝이 않나오네요..
그래서 생각나는데로 적어서 실행만 여러번했는데 않나와요...
제 마음도 짝짝..
맘이 아픕니다


*/
public class Study4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) {
			
			int one = i&99;
			
			int z = i&66;
			
			int three = one%3;
			
			
			try {
				
				int a = 1234/three;
				
				System.out.println(i);
				
			}catch (Exception e) {
					
				try {
					int b = 1234/one;
					
					System.out.println("짝");
					
				}catch (Exception d) {
					
					try {
						int c = 1234/z;
						
						System.out.println("짝짝");
						
					}catch (Exception f) {
						System.out.println(i);
					}
				
				}
				}
				}
			}
		
	}

