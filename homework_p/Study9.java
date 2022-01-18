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

public class Study9 {

	private static String as;

	public static void main(String[] args) {
		
		
		Calendar today = Calendar.getInstance();
		
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DATE);
		
		
		today.set(2021, 8-1, 1);
		StudyCal.ppp(today);
		
		int last = today.getActualMaximum(Calendar.DATE);
		
		
		for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.println("\t");
		}
		
		for (int i = 1; i <= last; i++) {
			today.set(Calendar.DATE, i);
						
			int cm = today.get(Calendar.MONTH);
						
			String pre=" ", sur=" ";
			
			
			if(cm==month && i==day) {
				pre = "[";
				sur = "]";
				
			}
			if(i<10) {
				pre += " ";
			}
						
			System.out.print(pre+i+sur+"\t");
			
			if(today.get(Calendar.DAY_OF_WEEK)==7) {
				System.out.println();
		}
			
	}
		System.out.println("\n"+"-----------------------------------------");
		
		today.set(2021, 8-1, 1);
		StudyCal.ppp(today);
		
		int last2 = today.getActualMaximum(Calendar.DATE);
	
		
		for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.println("\t");
		}
		
		for (int i = 1; i <= last2; i++) {
			today.set(Calendar.DATE, i);
						
			int cm = today.get(Calendar.MONTH);
						
			String pre=" ", sur=" ";
			
			
			if(cm==month && i==day) {
				pre = "[";
				sur = "]";
				
			}
			if(i<10) {
				pre += " ";
			}
						
			System.out.print(pre+i+sur+"\t");
			
			if(today.get(Calendar.DAY_OF_WEEK)==7) {
				System.out.println();
		}
			
	}	
		System.out.println("\n"+"------------------------");
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


