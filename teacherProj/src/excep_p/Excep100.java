package excep_p;

public class Excep100 {

   public static void main(String[] args) {
      for (int i = 1; i <= 100; i++) {
         
         int cnt = 0;
         int one = i%10;
         int ten = i/10;
         String res = "";
         
         //one 연산
         try {
            int a = 1234/(one%3);
         } catch (Exception e) {
            
            try {
               int a = 1234/one;
               cnt++;
               res += "짝";
               //System.out.println("one-369");
            } catch (Exception ee) {
               
            }   
         }
         
         //ten 연산
         try {
            int a = 1234/(ten%3);
         } catch (Exception e) {
            
            try {
               int a = 1234/ten;
               cnt++;
               res += "짝";
               //System.out.println("ten-369");
            } catch (Exception ee) {
               
            }   
         }
         
         
         //짝이 없을때
         try {
         
            int a = 1234/cnt;
               
         }catch(Exception e) {
             res =i+"";
         }
         
         System.out.println(res);
      }

   }

}