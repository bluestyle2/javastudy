package lang_p;

import java.util.Scanner;

public class MZBMain {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String [] title1 = {"가위","바위","보"};
      String [] title2 = {"찌","묵","빠"};
      
      int [][] res = { //패:0, 비김:1, 승:2
            {1,0,2},
            {2,1,0},
            {0,2,1}
      };
      
      int now, last;
                     
      String [] middle = {"수비","비김","공격"};
      String [] done = {"패","비김","승"};
      
      TOT:while(true) {
         System.out.println("추억의 게임 묵찌빠 시작");
         
         GBB:while(true) {  //가위바위보
            System.out.println("0:가위, 1:바위, 2:보, 9:종료");
            System.out.print("입력:");
            
            int user = sc.nextInt();
            
            if(user==9)
               break TOT;
            
            int com = (int)(Math.random()*3);
            now = res[user][com];
            
            System.out.println("게이머:"+title1[user]);
            System.out.println("컴퓨터:"+title1[com]);
            System.out.println("결과:"+ middle[now]);
            
            if(now!=1) {
               break GBB;
            }
         }
         
         MZB:while(true) { //묵찌빠 
            System.out.println("0:찌, 1:묵, 2:빠, 9:종료");
            System.out.print("입력:");
            
            int user = sc.nextInt();
            
            if(user==9)
               break TOT;
            
            int com = (int)(Math.random()*3);
            last = now;
            now = res[user][com];
            
            System.out.println("게이머:"+title2[user]);
            System.out.println("컴퓨터:"+title2[com]);
            
            
            if(now==1) {
               System.out.println("결과:"+ done[last]);
               break MZB;
            }else {
               System.out.println("결과:"+ middle[now]);
            }
            
         }
      }
      
      System.out.println("묵찌빠 종료");

   }

}