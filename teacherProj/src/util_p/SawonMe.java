package util_p;
import java.util.Calendar;
public class SawonMe {

	public static void main(String[] args) {
		String Info = "20020320a2lsh";
		System.out.println("사원번호 : "+Info);
		Calendar today = Calendar.getInstance();
		
		int year = Integer.parseInt(Info.substring(0,4));
		int month = Integer.parseInt(Info.substring(4,6));
		int day = Integer.parseInt(Info.substring(6,8));
		int rank = Integer.parseInt(Info.substring(9,10));
		
		
		
		int preyear = today.get(Calendar.YEAR);
		int hobong = preyear-year;
			System.out.println("호봉 : "+hobong);
		System.out.println("정년퇴임 일자 : "+(year+(30))+("년")+month+day);
			//정년퇴임일자 0320을 출력해야되는데 println으로 출력해서 할순있지만 
			//다른 방법으로 해야할거같은느낌이들어서 시도했으나 앞에 달력에서 너무 시간을 잡아먹어서 실패했습니다..
		}
		
	}


