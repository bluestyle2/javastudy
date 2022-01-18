package excep_p;

import java.util.Scanner;

class ReJoin{
   Scanner sc = new Scanner(System.in);
   
   void idChk(UserJoinData data) throws Exception {
      
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

public class ReThrowJoinMain {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      ReJoin rj = new ReJoin();
      while(true) {
         //입력사항 - id, pw, pw확인, 성명, 이메일, 취미, 특기, 전화번호, 핸드폰, 생년월일, 성별
         try {
            UserJoinData data = new UserJoinData();   

            rj.idChk(data);
            rj.pwChk(data);
            rj.pwEq(data);
            rj.nameChk(data);
            
            System.out.print("이메일:");
            data.email  = sc.nextLine();
            
            
            System.out.print("취미:");
            data.hobby = sc.nextLine();
            
            
            System.out.print("특기:");
            data.spec = sc.nextLine();
            
            rj.telChk(data);
            
            System.out.print("핸드폰:");
            data.phone = sc.nextLine();
            
            rj.birthChk(data);
            rj.genderChk(data);
            
            System.out.println(data);
            
            
            break;
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
         
      }
      
      

   }

}