package lang_p;

import java.util.Scanner;

public class GBBMain {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String [] res = {"가위","바위","보"};
                           //게이머
      String [][] ttt = {
            {"비김",   "패","승"},   //가위   
            {"승", "비김","패"},   //바위
            {"패","승", "비김"}   //보
      //com     가위,   바위, 보   
      };
      
      while(true) {
         
         System.out.println("추억의 게임 가위바위보 0:가위, 1:바위, 2:보, 9:종료");
         System.out.print("입력:");
         
         int user = sc.nextInt();
         
         if(user==9)
            break;
         
         int com = (int)(Math.random()*3);
         
         
         System.out.println("게이머:"+res[user]);
         System.out.println("컴퓨터:"+res[com]);
         System.out.println("결과:"+ttt[user][com] );
      }
      
      System.out.println("가위바위보 종료");

   }

}