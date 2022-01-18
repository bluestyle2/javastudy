package excep_p;


import java.util.Scanner;



//회원가입 프로그램을 작성하세요
//입력사항 - id, pw, pw확인, 성명, 이메일, 취미, 특기, 전화번호, 핸드폰, 생년월일, 성별
//필수 입력사항 - id, pw, pw확인, 성명, 전화번호, 생년월일, 성별 (값이 없으면 에러 발생)
//유효성 검사 - 생년 : 1999 이전 출생자만 가입 가능  :: >   1997년 8월 23일  --> 19980823
//          비밀번호, 비밀번호 확인은 값이 같아야만 가능

class UserJoinData{
   String id, pw, name, email, hobby, spec, tel, phone, birth, gender;

   @Override
   public String toString() {
      
      String ttt = "id=" + id +"\npw=" + pw +"\nname=" + name +"\nemail=" + email +"\nhobby=" + hobby
            +"\nspec=" + spec +"\ntel=" + tel +"\nphone=" + phone +"\nbirth=" + birth +"\ngender=" + gender
            ;
      
      return ttt;
   }
   
   
}



public class UserJoinMain {

   public static void main(String[] args) {
      UserJoinData data = null;
      Scanner sc = new Scanner(System.in);
      
      while(true) {
         
         try {
            data = new UserJoinData();
            
            System.out.print("ID:");
            data.id = sc.nextLine();
            
            if(data.id.isEmpty()) {
               throw new Exception("id 없음");
            }
            
            System.out.print("PW:");
            data.pw = sc.nextLine();
            
            if(data.pw.isEmpty()) {
               throw new Exception("pw 없음");
            }
            
            System.out.print("PW확인:");
            String pw = sc.nextLine();
            
            if(!data.pw.equals(pw)) {
               throw new Exception("pw 불일치");
            }
            
            System.out.print("이름:");
            data.name = sc.nextLine();
            
            if(data.name.isEmpty()) {
               throw new Exception("이름 없음");
            }
            System.out.print("이메일:");
            data.email  = sc.nextLine();
            
            
            System.out.print("취미:");
            data.hobby = sc.nextLine();
            
            
            System.out.print("특기:");
            data.spec = sc.nextLine();
            
            
            System.out.print("전화:");
            data.tel = sc.nextLine();
            
            if(data.tel.isEmpty()) {
               throw new Exception("전화번호 없음");
            }
            System.out.print("핸드폰:");
            data.phone = sc.nextLine();
            
            
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
            
            System.out.print("num:"+num);
            
            if(num/10000>=2000) {
               throw new Exception("생년월일 기간 불일치");
            }
            
            
            System.out.print("성별:");
            data.gender = sc.nextLine();
            
            if(data.gender.isEmpty()) {
               throw new Exception("성별 없음");
            }
            
            
            break;
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
         
      }
      
      System.out.println(data);

   }

}