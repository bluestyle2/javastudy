package homework_p;

import java.util.Random;

public class Projchar {
	static int firstlogin = 0; // 최초 캐릭터를 알기위해 첫로그인지 알아내는 변수

	Projchar() {

	}

	public static void main(String[] args) {
		Random s = new Random();
		int ranchar = 0;

		if ((int) firstlogin == 0) {

			for (int i = 0; i < 1; i++) {

				ranchar = s.nextInt(3);
				System.out.println(ranchar);
		
				
			}
			firstlogin++;
		}
		





		

	}

}
