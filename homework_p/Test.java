package homework_p;

import java.util.Calendar;

class StudyCal {
	
	   public static void ppp(Calendar cday) {
	      String ttt = cday.get(Calendar.YEAR)+"년 ";
	      ttt += cday.get(Calendar.MONTH)+1 +"월 ";
	      ttt += cday.get(Calendar.DATE)+"일 (";
	      ttt += " 日月火水木金土".charAt(cday.get(Calendar.DAY_OF_WEEK))+"요일) ";
	      ttt += cday.get(Calendar.HOUR_OF_DAY)+":";
	      ttt += cday.get(Calendar.MINUTE)+":";
	      ttt += cday.get(Calendar.SECOND)+".";
	      ttt += cday.get(Calendar.MILLISECOND);
	      
	      System.out.println(ttt);
	      
	   }
}
public class Test {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		today.set(2021, 4-1, 1);
		StudyCal.ppp(today);
		
		int last3 = today.getActualMaximum(Calendar.DATE);
		
		for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.print("\t");
			
		}
		for (int i = 1; i <=last3; i++) {
			today.set(Calendar.DATE, i);
			System.out.print(i+"\t");
			
			if(today.get(Calendar.DAY_OF_WEEK)==7) {
				System.out.println();
			}
		}
	}
}
