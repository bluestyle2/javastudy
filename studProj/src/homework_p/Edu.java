package homework_p;

import java.util.Scanner;

class Signin2{
	
	String newData [] = new String [10];// 새로운 회원가입 정보를 넣을 장소
	String list [] = {"아이디[0]", "비밀번호[1]", "비밀번호 확인[2]", "이메일[3]", "취미[4]", "특기[5]", "전화번호[6]",
			"핸드폰[7]", "생년월일[8]", "성별[9]"}; // 입력할 목록 title들
}

public class Edu {
	
	public static void main(String[] args) {
		Signin2 si = new Signin2();
		
	
		for (int j = 0; j < si.newData.length; j++) {
			si.newData[j] = null;
		}// null값으로 si.newData 초기값 세팅해서 사용자 입력 값과 비교하려 함
		
		Scanner sc = new Scanner(System.in);
	    //스캐너 메소드 생성  
		
		// 기입할 목록
		
		while (true) {
//	        while(a < si.list.length) {	
//	        	try {
//	        		System.out.print(si.list[0]);
//	        		// 입력할 목록 출력
//	        		si.newData[0] = sc.nextLine();
//		            // 사용자가 입력한 값을 Signin 클래스의 newData 배열에 저장
//	        		if (si.newData[0].equals(null)) {
//	        			throw new Exception("아이디가 존재하지 않습니다.");
//	        		}
//	        		if (si.newData[0].equals(null)) {
//	        		//아이디 입력값이 없을 경우 	
//	        			throw new Exception("아이디가 존재하지 않습니다.");
//	        			//예외 처리 
//	        		}
//	        		if (si.newData[1].equals(null)) {
//	        		//비밀번호 입력값이 없을 경우 	
//	        			throw new Exception("비밀번호가 존재하지 않습니다.");
//	        			//예외 처리 
//	        		}
//	        		if (si.newData[2].equals(null)) {
//	    			//비밀번호 입력값이 없을 경우 	
//	    	        	throw new Exception("비밀번호 확인이 존재하지 않습니다.");
//	    			    //예외 처리 
//	    	        }
//	        		if (!si.newData[2].equals(si.newData[1])) { 
//	        		// 비밀번호 확인일 때 && 비밀번호 확인의 값이 비밀번호와 일치하지 않을 때 
//	        			throw new Exception("비밀번호가 일치하지 않습니다.");	
//	        			//예외처리
//	        		}
//	        		
//	        	} catch (Exception e) {
//		            System.out.println(e.getMessage());
//		        }
//	       }
//	        System.out.println("회원가입 완료");
//	        
//	        break;   
	      
		}
	}
}
