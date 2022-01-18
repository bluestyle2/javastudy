package homework_p;


	import java.util.Scanner;
	import java.util.regex.Pattern;



	// 유효성 검사 클래스
	class ExRegexSignUp {
		// 입력받기 위한 객체
		Scanner sc = new Scanner(System.in); 
		
		// 정규표현식 배열
		String[] regexArr = { 
				"[a-zA-Z0-9]{1,}",
				".*[0-9].*`.*[a-zA-Z].*`.{6,}",
				"[a-zA-Z0-9]{1,}@[a-zA-Z]*\\.[a-zA-Z]{1,}",
				"[0-9]{2,3}-[0-9]{4}-[0-9]{4}",
				"[가-힣]{1,}",
				"[0-9]{6}-[0-9]{7}",
				"[a-zA-Z0-9]*.(jpg|jpeg|bmp|png|gif)",
		};
		
		// 입력받는 정보의 배열
		String[] inputArr = new String[7];
		
		// 입력받는 정보의 이름 배열
		String[] nameArr = {
					"아이디", 
					"비밀번호", 
					"이메일", 
					"전화번호", 
					"이름",
					"주민등록번호", 
					"이미지", 
				};
		
		// 유효성 검사 오류의 메세지 배열
		String[] errorArr = {
				"id가 영문과 숫자외로 입력되거나 아예 입력되지 않았습니다.",
				"비밀번호는 영문과 숫자를 하나 이상씩 사용하여 6글자 이상이여야 합니다.",
				"이메일아이디는 한글자 이상이고 영문, 숫자조합이여야 하며 @와 .이 있어야 합니다.",
				"전화번호는 xx(x)-xxxx-xxxx 의 형식으로 입력해주세요.",
				"이름은 한글만 입력됩니다.",
				"주민번호는 xxxxxx-xxxxxxx 의 형식으로 입력해주세요.",
				"파일이름은 영문과 숫자조합이며 이미지 확장자만 사용가능합니다."
		};
		
		// 어디까지 입력했는지 저장
		int level = 0;
		
		// 유효성 검사 메소드
		void regexTest() throws Exception {
			
			// 정보 입력
			System.out.print(nameArr[level] + ":");
			inputArr[level] = sc.nextLine();
			
			
			if (level != 1) { // 비밀번호 입력단계가 아니면 
				// 유효성 검사가 맞으면
				if (!Pattern.matches(regexArr[level], inputArr[level])) {
					throw new Exception(errorArr[level]);
				}
				// 비밀번호의 유효성 검사
			} else if (Pattern.matches(regexArr[level].split("`")[0], inputArr[level])
					&& Pattern.matches(regexArr[level].split("`")[1], inputArr[level])
					&& Pattern.matches(regexArr[level].split("`")[2], inputArr[level])) {
				
				System.out.println("등록할 pw를 다시 입력해주세요");
				System.out.print("pw : ");
				
				// 비밀번호 2차확인
				if (!inputArr[level].equals(sc.nextLine())) {
					throw new Exception("pw 와 다시 입력한 pw가 일치하지 않습니다.");
				}
			} else {
				throw new Exception(errorArr[level]);
			}
			// 다음 단계로
			level++;

		}
	}

	public class Test2 {
		
		
		public static void main(String[] args) {
			System.out.println("회원가입 실행");
			
			ExRegexSignUp ersu = new ExRegexSignUp();
			
				// 유효성 검사 메소드를 7단계까지 함
				while(ersu.level<7) {
					try {
					ersu.regexTest();
					} catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}
				
				for (int i = 0; i < ersu.nameArr.length; i++) {
					System.out.println(ersu.nameArr[i] + " : " + ersu.inputArr[i]);
				}
				System.out.println("회원가입 성공!");

				
		}

		
	}