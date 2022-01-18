package lang_p;

import java.util.Scanner;

public class MathGawebaweMe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String [] res = {"가위","바위","보"};
		
		while(true) {
			
			System.out.println("가위바위보게임 0:가위, 1: 바위, 2: 보");
			System.out.print("입력:");
			
			int user = sc.nextInt();
			
			if(user==9)
				break;
			
			int com = (int)(Math.random()*3);
			
			String ttt= "패";
			int Ga,Ba,Bo;
			
//			if(res) {
//				
//			else if (res.equals("보"))
//			ttt = "무승부";			
			}
//			
//			System.out.println("게이머:"+res[user]);
//			System.out.println("컴퓨터:"+res[com]);
//			System.out.println("결과"+ttt);
//			}
		
//		System.out.println("가위바위보 종료");
//					
		}
	
	}


