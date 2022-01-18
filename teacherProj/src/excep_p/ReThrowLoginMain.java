package excep_p;
import java.util.Scanner;
class RTLogin{
	   
	  LoginData [] mems = {
	            new LoginData("aa", "1111", "이효리"),
	            new LoginData("bb", "2222", "삼효리"),
	            new LoginData("cc", "3333", "사효리"),
	            new LoginData("dd", "4444", "오효리"),
	            new LoginData("ee", "5555", "육효리")
	      };
	  Scanner sc = new Scanner(System.in);
	  	
	  LoginData idChk() throws Exception {
		 
		  LoginData now = null;
		  
		  System.out.print("id:");
		  String id = sc.nextLine();
		
		  for(LoginData mm: mems) {
		
			  if(mm.id.equals(id)) {
				  now = mm;
				  break;
			}
		}
	
	if(now==null) {
		throw new Exception("id 에러");
		}
	
		return now;
	}

	
	void pwChk(LoginData now) throws Exception {
		 System.out.print("pw:");
         String pw = sc.nextLine();
         
         if(!now.pw.equals(pw)) {
            throw new Exception("pw 에러");
         }   
	}
	
	
	
	
	void loginTry() throws Exception {
		LoginData dd =idChk();
        
		pwChk(dd);
   	 
		System.out.println(dd.name+"로그인 성공");
	}
}


public class ReThrowLoginMain {

	public static void main(String[] args) {
		
	      RTLogin rt1 = new RTLogin();

	      while(true) {
	         
	         try {
	           
	        	 rt1.loginTry();
	            
	            break;
	         } catch (Exception e) {
	            
	            System.out.println(e.getMessage());
	         }
	     }
	}
}
