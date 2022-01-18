	/*
	회원 가입 유효성 검사를 실시하세요
	1. 아이디 : 영문 숫자 조합
	2. 비번 , 비번확인 
	3. 이메일  -  아이디:영문,숫자   @  도메인 : 영문 점
	4. 전화번호 - 숫자 :  ###-####-####,   ##(#)-###-####
	5. 이름 (한글만 가능)
	6. 주민번호 
	7. 사진 첨부-->영문,숫자.이미지 확장자
	이미지(jpg, jpeg, bmp, png, gif)  --  대소문자 구분없음
	8. 우편번호 검색 - 구단위 (초성검색)
	예외처리로 처리할 것
	*/
package homework_p;

import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Study10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] info = {"id ", "pw ", "pw 확인", 
			"email ", "전화번호", "이름 ","주민번호 ", "사진첨부 "};
		
	
		while(true)
		{
			try {
				System.out.println("ID입력 : ");
				info[0] = sc.nextLine();
				
				if (!Pattern.matches("[0-9a-zA-Z]*", info[0])||
						Pattern.matches("[0-9]*", info[0])||
						Pattern.matches("[a-zA-Z,]*", info[0])) {
					throw new Exception("ID는 영문, 숫자 조합이어야 합니다");
					}
				
				System.out.println("PW입력 : ");
				info[1] = sc.nextLine();
				
				System.out.println("PW확인을 위해 재입력하세요 : ");
				info[2] = sc.nextLine();
				
				if(!info[2].equals(info[1]))	{
					throw new Exception("비밀번호가 다릅니다.");
					}
				System.out.println("email입력 : ");
				info[3] = sc.nextLine();
				
				if (!Pattern.matches("[0-9a-zA-Z]*@[a-zA-Z.]*", info[3])) {
					throw new Exception("아이디:영문,숫자@도메인 : 영문 점 이어야합니다.");
				}
				System.out.println("전화번호입력 : ");
				info[4] = sc.nextLine();
				
				if(!Pattern.matches("[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}",info[4]))	{
					throw new Exception("잘못된 전화번호입니다.");
				}
				System.out.println("이름입력 : ");
				info[5] = sc.nextLine();
				
				if(!Pattern.matches("[가-힣]*", info[5])) {
					throw new Exception("이름은 한글만 가능합니당");
				}
				System.out.println("주민번호입력 : ");
				info[6] = sc.nextLine();
				
				if(!Pattern.matches("[0-9]*{6}-[0-9]*{7}", info[6])) {
					throw new Exception("올바르지않은 주민번호입니다.");
				} 
				
				System.out.println("사진첨부 : ");
				info[7] = sc.nextLine();
				if(!Pattern.matches("[0-9a-zA-Z]*.[a-zA-Z]*", info[7]))
								
					
				{
					throw new Exception("사진확장자가 잘못되었습니다.");
				
				}			
				
				
				
					break;
			}catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
			
		System.out.println("회원가입완료");
		
		}
	

}
