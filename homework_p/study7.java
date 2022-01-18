package homework_p;

import java.util.Scanner;

public class study7 {

	public static void main(String[] args) {
		
		class Mukzzibba{
			Scanner sc = new Scanner(System.in);
			
			String [] res = {"가위", "바위", "보"};

			String [] res2 = {"찌","묵","빠"};
			
			String [][] ttt = {
					{"비김", "패", "승"},
					{"승","비김","패"},
					{"패","승","비김"}
			};
		
			while(true) {
				System.out.println("묵찌빠게임! 가위바위보! 9:종료, 1:가위, 2:바위, 3:보");
				System.out.print("입력 : ");
				int user = sc.nextInt();
				
				if(user==9)
					
					break;
			
				user--;
				int com = (int)(Math.random()*3);
				
				if(ttt[user][com] == "비김") {
					
						System.out.println("나"+res[user]);
						System.out.println("컴퓨터"+res[com]);
						System.out.println("결과:"+ttt[user][com]);
						
				continue;
				
				}
				
				System.out.println("나"+res[user]);
				System.out.println("컴퓨터"+res[com]);
				System.out.println("결과:"+ttt[user][com]);
				
				}
			
			while(true) {
				
				System.out.println("묵찌빠 9:종료, 1:가위, 2:바위, 3:보");
				System.out.print("입력:");
				
				int user2 = sc.nextInt();
						
				if(user==9)
							
				break;
				
				user2--;
					int com2 = (int)(Math.random()*3);
					
				if(ttt[user][com].equals("이겼다!")) {
					
					if(ttt[user2][com2].equals("비김")) {
						
						System.out.println("나"+res2[user]);
						System.out.println("컴퓨터"+res2[com]);
						System.out.println("결과:"+ttt[user][com]);
						
						break;
					}
				}
			
		
		}
	}
