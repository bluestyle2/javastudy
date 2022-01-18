package homework_p;
/*
 * 회원가입 프로그램을 작성하세요
 * 입력사항 - id, pw, pw확인, 성명, 전화번호, 생년원일, 성별 
 * 필수 입력사항 - id , pw, pw확인, 성명, 전화번호, 생년월일, 성별(값이 없으면 에러 발생)
 * 유효성 검사 - 생년 : 1999 이전 출생자만 가입 가능  > 1997년 8월 23일 --> 19970823
 * 비밀번호, 비밀번호 확인은 값이 같아야 가능
 * 
 * 추가 유효성 검사 : 전화번호의 자리수가 11자리인지, 전화번호가 숫자로만 되어있는지, 
 * 					생년월일이 8자리인지, 생년월일이 숫자로만 되어있는지, 성별이 남자 혹은 여자
 * 					인지 
 * 추가 입력사항 - 이메일, 취미, 특기
 * */

import java.util.Scanner;

class UserInfo{
	String id, pw, pwc, name, ph, birth, gender;

	public UserInfo(String id, String pw, String pwc, String name, String ph, 
					String birth, String gender) {
		super();
		this.id = id;
		this.pw = pw;
		this.pwc = pwc;
		this.name = name;
		this.ph = ph;
		this.birth = birth;
		this.gender = gender;
	}
	
}

public class Study6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserInfo in = new UserInfo("","","","","","","");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print("ID : ");
				String id = sc.nextLine();
				
				System.out.print("PW : ");
				String pw = sc.nextLine();
				
				System.out.print("PW 확인 : ");
				String pwc = sc.nextLine();
		
				if(!pw.equals(pwc)){
					
					throw new Exception("패스워드가 일치하지 않습니다");
				
					}
				System.out.print("name : ");
				String name= sc.nextLine();
				
				
				if(name.equals("")){ 
					
					throw new Exception("필수입력사항입니다.");
				
					}
				
				System.out.print("phone number : ");
				String ph = sc.nextLine();
				
				
				if(ph.equals("")){ 
					
					throw new Exception("필수입력사항입니다.");
				
					}
				
				System.out.print("birth : ");
				String birth= sc.nextLine();
				
				if(birth.equals("")){ 
					
					throw new Exception("필수입력사항입니다.");
				
					}
				
				System.out.println("Gender : ");
				String gender= sc.nextLine();
				
				if(gender.equals("")){ 
					
					throw new Exception("필수입력사항입니다.");
				
					}
				break;
			}catch (Exception e){ 
				System.out.println(e.getMessage());
			}
			
		
		}
}
}