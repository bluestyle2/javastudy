package excep_p;

import java.util.Scanner;

class ReJoin2{
 Scanner sc = new Scanner(System.in);
 
 String nullChk(String title) throws Exception{
	 System.out.print(title+" : ");
     String res = sc.nextLine();         
     if(res.isEmpty()) {
        throw new Exception(title+" 없음");
     }
	 return res;
 }
 
 void idChk(UserJoinData data) throws Exception{
	 
	 System.out.print("ID:");
     data.id = sc.nextLine();         
     if(data.id.isEmpty()) {
        throw new Exception("id 없음");
     }
	 
  }
 
 void pwChk(UserJoinData data) throws Exception {
	 
	  System.out.print("PW:");
      data.pw = sc.nextLine();
      
      if(data.pw.isEmpty()) {
         throw new Exception("pw 없음");
      }
 }
 void pwEq(UserJoinData data) throws Exception {
	 
       System.out.print("PW확인:");
       String pw = sc.nextLine();
       
       if(!data.pw.equals(pw)) {
          throw new Exception("pw 불일치");
       }
 }
void nameChk(UserJoinData data) throws Exception {
	System.out.print("이름:");
    data.name = sc.nextLine();
    
    if(data.name.isEmpty()) {
       throw new Exception("이름 없음");
    }
 }
void telChk(UserJoinData data) throws Exception {
	 System.out.print("전화:");
     data.tel = sc.nextLine();
     
     if(data.tel.isEmpty()) {
        throw new Exception("전화번호 없음");
     }
 }
void birthChk(UserJoinData data) throws Exception {
	 System.out.print("생년월일:");
     data.birth = sc.nextLine();
     
     if(data.birth.isEmpty()) {
        throw new Exception("생년월일 없음");
     }
     
     if(data.birth.length()!=8) {
        throw new Exception("생년월일 형식 불일치");
     }
     int num = 0;
     for(char ch: data.birth.toCharArray()) {
        int buf = ch-'0';
        
        if(buf<0 || buf>=10) {
           throw new Exception("생년월일 형식 불일치");
        }
        
        num*=10;
        num += buf;
     }
     
     //System.out.print("num:"+num);
     
     if(num/10000>=2000) {
        throw new Exception("생년월일 기간 불일치");
     }
 }
void genderChk(UserJoinData data) throws Exception {
	 System.out.print("성별:");
     data.gender = sc.nextLine();
     
     if(data.gender.isEmpty()) {
        throw new Exception("성별 없음");
         }
	 }
	
}

public class  Edu2 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	      ReJoin2 rj = new ReJoin2();
	      while(true) {
	         
	         try {
	        	 UserJoinData data = new UserJoinData();
	             data.id = rj.nullChk("id");
	             data.pw = rj.nullChk("pw");
	             
	        	// rj.idChk(data);
	        //	 rj.pwChk(data);
	        	 rj.pwEq(data);
	        	 data.name = rj.nullChk("이름");
	             
	        	// rj.nameChk(data);
	        	 
	            System.out.print("이메일:");
	            data.email  = sc.nextLine();
	            
	            
	            System.out.print("취미:");
	            data.hobby = sc.nextLine();
	            
	            
	            System.out.print("특기:");
	            data.spec = sc.nextLine();
	            data.tel = rj.nullChk("전화");
	             
	        //    rj.telChk(data);
	           
	            System.out.print("핸드폰:");
	            data.phone = sc.nextLine();
	            
	            rj.birthChk(data);
	            data.gender = rj.nullChk("성");
	             
	          //  rj.genderChk(data);
	            
	            System.out.println(data);
	            
	            
	            break;
	         } catch (Exception e) {
	            System.out.println(e.getMessage());
	         }
	         
	      }
	      
	      

	}

}
