package util_p;

import java.util.Arrays;
import java.util.Calendar;

public class BirthMan {

	public static void main(String[] args) {
		String jumin = "930824-1234567";

		int [] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(jumin.substring(i*2, i*2+2));
			
		}
		
		arr[0] += ((jumin.charAt(7)-'0'-1)%4/2+19)*100;
		//System.out.println(Arrays.toString(arr));
		Calendar today = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.set(today.get(Calendar.YEAR), arr[1]-1, arr[2],0,0,0);
		//CalendarMain.ppp(today);
		//CalendarMain.ppp(birth);
		
		System.out.print("올해생일:");
		CalendarMain.ppp(birth);
		
		int age = today.get(Calendar.YEAR)-arr[0];
		
		System.out.println("한국나이:"+(age+1));
		
		if(birth.after(today)) { //생일이 지나지 않았따면
			age--;
		}else {
			birth.add(Calendar.YEAR, 1);
		}
		System.out.println("만나이:"+age);
		System.out.print("다가올생일:");
		CalendarMain.ppp(birth);
		
		int dd = birth.get(Calendar.DAY_OF_WEEK);
		if(dd==1) {
			birth.add(Calendar.DATE, -2);
		}else if(dd==7) {
			birth.add(Calendar.DATE, -1);
		}
		System.out.print("생일파티:");
		CalendarMain.ppp(birth);
		
		int dday = (int)(birth.getTimeInMillis()-today.getTimeInMillis())/1000/60/60/24;
		System.out.println("dday:"+dday);
	}

}

/*
 * int yy = Integer.parseInt(num.substring(0,4));  //입사한 해
		int mm = Integer.parseInt(num.substring(4,6));  //월
		int dd = Integer.parseInt(num.substring(6,8));  //일
		String team = num.substring(8, 9);				//소속
		int rank = Integer.parseInt(num.substring(9,10)); //직급
		String name = num.substring(10);
 * 
 *
 * 
 * 
 * 
 */

