package util_p;

import java.util.Calendar;

class SpecDay{
	
	String day, label;

	public SpecDay(String day, String label) {
		
		this.day = day;
		this.label = label;
	}
	
}

public class YearDiaryMain2 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		int year =  today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day =  today.get(Calendar.DATE);
		
		int yy = 2021;

		SpecDay [] spArr = {
				new SpecDay("1_1", "신정"),
				new SpecDay("3_1", "3.1절"),
				new SpecDay("3_20", "탄신일"),
				new SpecDay("5_5", "어린이날"),
				new SpecDay("8_15", "광복절"),
				new SpecDay("12_25", "성탄절"),
				new SpecDay("10_9", "한글날"),
				new SpecDay("8_25", "휴강일"),
				new SpecDay("6_6", "현충일")
		};
		
		
		today.set(yy, 0, 1);
		int last = today.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(last);
		
		String [][][]arr = new String[12][6][7];
		String [][][]spec = new String[12][6][7];
		
		//spec[4][1][3] = "어린이날";
		
		
		
		for (int i = 1; i <=last;
i++) {
			
			
			//CalendarMain.ppp(today);
			/*
			System.out.println(i+","+
			today.get(Calendar.MONTH)+","+
			(today.get(Calendar.WEEK_OF_MONTH)-1)+","+
			(today.get(Calendar.DAY_OF_WEEK)-1)+","+
			today.get(Calendar.DATE)
					);
			*/
			
	String spChk = today.get(Calendar.MONTH)+1+"_"+today.get(Calendar.DATE);
	

	for (SpecDay sd: spArr) {
		//System.out.println(sd.day);
		if(spChk.equals(sd.day)) {
			System.out.println(sd.day);
			spec[today.get(Calendar.MONTH)]
					[today.get(Calendar.WEEK_OF_MONTH)-1]
							[today.get(Calendar.DAY_OF_WEEK)-1] = sd.label;
			break;
		}
	}
	
	
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
						String t= arr[mm][ww][dd];
						if(t==null)
							t="";
						System.out.print(t+"\t");
					}
					
					//System.out.print(mm+"_"+ww+"\t\t");
					System.out.print("\t");
				}
				System.out.println();
				
				
				for (int mm = big; mm < big+3; mm++) {
					//System.out.println(arr[i][j]);
					
					for (int dd = 0; dd < 7; dd++) {
						String t= spec[mm][ww][dd];
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


		




