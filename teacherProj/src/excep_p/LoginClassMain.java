package excep_p;

import java.util.Scanner;


class LoginData{
   
   String id, pw, name;

   
   public LoginData(String id, String pw, String name) {
	super();
	this.id = id;
	this.pw = pw;
	this.name = name;


}

   @Override
   public String toString() {
      return "LoginData [id=" + id + ", pw=" + pw + ", name=" + name + "]";
   };
   
   
   
   
}


public class LoginClassMain {

   public static void main(String[] args) {
      
      LoginData [] mems = {
            new LoginData("aa", "1111", "이효리"),
            new LoginData("bb", "2222", "삼효리"),
            new LoginData("cc", "3333", "사효리"),
            new LoginData("dd", "4444", "오효리"),
            new LoginData("ee", "5555", "육효리")
      };
      
      LoginData now = null;
      
      
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         
         try {
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
            
            System.out.print("pw:");
            String pw = sc.nextLine();
            
            if(!now.pw.equals(pw)) {
               throw new Exception("pw 에러");
            }   
            
            break;
         } catch (Exception e) {
            
            System.out.println(e.getMessage());
         }
      }
      
      
      System.out.println(now.name+" 로그인 성공");
      
      

   }

}