package homework_p;

import java.util.Scanner;

class Login {
	Login() {
		String pid = "aaa", ppw = "111";

		Scanner sc = new Scanner(System.in);

		while (true) {

			try {

				System.out.print("ID:");

				String id = sc.nextLine();

				if (!id.equals(pid)) {
					throw new Exception("유효하지 않은 id 입니다.");
				}

				System.out.print("PW:");

				String pw = sc.nextLine();

				if (!pw.equals(ppw)) {
					throw new Exception("유효하지 않은 pw 입니다.");
				}

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("로그인 성공");
	}
}

public class DalgopaLg {

	public static void main(String[] args) {
		Login a = new Login();

	}

}
