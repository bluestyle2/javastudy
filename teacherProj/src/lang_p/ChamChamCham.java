package lang_p;

import java.util.Scanner;

public class ChamChamCham {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String [] res = {"왼쪽","오른쪽"};
		
		while(true) {
			
			System.out.println("추억의 게임 참참참 0:왼쪽, 1:오른쪽, 9:종료");
			System.out.print("입력:");
			
			int user = sc.nextInt();
			
			if(user==9)
				break;
			
			int com = (int)(Math.random()*2);
		
			String ttt = "패";
			
			if(user==com) {
				ttt = "승";
			}
			
		System.out.println("게이머:"+res[user]);
		System.out.println("컴퓨터:"+res[com]);
		System.out.println("결과:"+ttt);
	}
		
		System.out.println("참참참 종료");

	}

}
