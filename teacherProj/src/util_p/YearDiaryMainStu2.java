package util_p;

import java.util.Calendar;

public class YearDiaryMainStu2 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year =  today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day =  today.get(Calendar.DATE);
		
		int yy = 2021;

		
		
		
		today.set(yy, 0, 1);
		int last = today.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(last);

		
		String [][][]arr = new String[12][6][7];
		
		for (int i = 1; i <=last; i++) {
			//CalendarMain.ppp(today);
			/*
			System.out.println(i+","+
			today.get(Calendar.MONTH)+","+
			(today.get(Calendar.WEEK_OF_MONTH)-1)+","+
			(today.get(Calendar.DAY_OF_WEEK)-1)+","+
			today.get(Calendar.DATE));	*/
			
			arr[today.get(Calendar.MONTH)]
					[today.get(Calendar.WEEK_OF_MONTH)-1]
							[today.get(Calendar.DAY_OF_WEEK)-1] = today.get(Calendar.DATE)+"";
			
			today.add(Calendar.DATE, 1);
		}
		
		
	
	
	String ttt = String.join("\t ", "일","월","화","수","목","금","토");
	
	String title = "";

	for (int mm = 0; mm < 3; mm++) {
		title+=ttt+"\t\t";
	}
	
	System.out.println(yy+"년");
	
	for (int big = 0; big < 12; big+=3) {
		System.out.println("\n\n");
		
		for (int mm = big+1; mm <= big+3; mm++) {
			
			System.out.print("\t\t\t"+mm+" 월\t\t\t\t\t");
		}
		System.out.println("\n"+title);
		for (int ww = 0; ww < 6; ww++) {
		
			//System.out.println(arr[i]);
			//System.out.println(mm);
			
			for (int mm = big; mm < big+3; mm++) {
				//System.out.println(arr[i][j]);
				
				for (int dd = 0; dd < 7; dd++) {
					String t= arr [mm][ww][dd];
					if(t==null)
						t="";
					System.out.print(t+"\t");
				}
				
				//System.out.print(mm+"_"+ww+"\t\t");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	
	

}

}

