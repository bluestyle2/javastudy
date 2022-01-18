package util_p;

import java.util.Calendar;

/* 사원번호 -- 20020320a2lsh
 * ex) 입사일 : 20020320, a - 부서명, 2 - 직급, lsh - 이름
 * 부서명 : a 인사, b 총무, c 두부, d 부부
 * 직급 : 0 사장, 1 부장, 2 과장, 3 대리, 4 사원
 * 정년은 근속 30년째임
 * 현재 호봉과 정년 퇴임일자, 정년 퇴임식 일자, d-day, 플랜카드 내용을 출려하세요
 * 정년 퇴임식은 퇴임전 목요일 실시, 플랜카드 내용 -- ...부 이름 약어 직급명 님 만수무강 하세요
 * 단, 이 회사는 승진이 불가함
 * */
public class RetirementMain {

	public static void main(String[] args) {
		String sawon = "20020821a4lsh";
		//              01234567890
		String buseo = "인사,총무,두부,부부".split(",")[sawon.charAt(8)-'a'];
		String pos = "사장,부장,과장,대리,사원".split(",")[ Integer.parseInt(sawon.substring(9,10) )  ];
		System.out.println("부서명:"+buseo);
		System.out.println("직급:"+pos);
		
		Calendar start = Calendar.getInstance();
		int yy = Integer.parseInt(sawon.substring(0,4));
		start.set(
				 yy,
				Integer.parseInt(sawon.substring(4,6) )-1,
				Integer.parseInt(sawon.substring(6,8) ),
				0,0,0 );
		
		CalendarMain.ppp(start);
		Calendar today = Calendar.getInstance();
		int hobong = today.get(Calendar.YEAR)-yy;
		
		start.set(Calendar.YEAR, today.get(Calendar.YEAR));
		
		if(start.after(today)) {
			hobong--;
		}
		
		System.out.println("호봉:"+hobong);
		start.set(Calendar.YEAR, yy+30);
		System.out.print("정년 퇴임:");
		CalendarMain.ppp(start);
		
		int dd = start.get(Calendar.DAY_OF_WEEK);
		if(dd<5)
			dd+=7;
		
		start.add(Calendar.DATE, 5-dd);
		System.out.print("정년 퇴임식:");
		CalendarMain.ppp(start);
		
		System.out.println("dday:"+(start.getTimeInMillis()-today.getTimeInMillis())/1000/60/60/24);
		
		String ttt = buseo+"부 "+sawon.substring(10)+" "+pos+"님 만수무강 하세요";
		
		System.out.println("플랜카드:"+ttt);
		/*
		  1  2  3  4  5  6  7
		------------------------
		  8  9 10 11 12 13 14 		요일번호 >= 5				요일번호 < 5
		 15 16 17 18 19 20 21		날짜-(요일번호-5)			날짜-(요일번호+7-5)
		 22 23 24 25 26 27 28
		 
		 * */
		
		
		
	}

}


