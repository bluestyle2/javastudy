package excep_p;

import java.util.Scanner;


public class ExcepLoginMain2 {

	public static void main(String[] args) {
		String [] pid = {"aaa","bbb","ccc","ddd"},
				  ppw = {"111","222","333","444"},
				name = {"이효리","삼효리","사효리","오효리"};
				
		Scanner sc = new Scanner(System.in);
		
		while(true) {  
			
			try {
				
				System.out.print("ID:");
				
				String id = sc.nextLine();
				
				if(!id.equals(pid[0])) {
					throw new Exception("유효하지 않은 id 입니다.");
									
				}
				
				System.out.println("PW:");
				
				String pw = sc.nextLine();
				
				if(!pw.equals(ppw[0])) {
					throw new Exception("유효하지 않은  pw 입니다.");
				}
				
				break;
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(name[0]+"님 환영합니다");
	}
	
}
/*
로그인 성공시 이름으로 출력
aa, 1111, 이효리
bb, 2222, 삼효리

*/