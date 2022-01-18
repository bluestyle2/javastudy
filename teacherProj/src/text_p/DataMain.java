package text_p;

import java.util.Date;

public class DataMain {

	public static void main(String[] args) {
		
		
		Date today = new Date();
		
		System.out.println(today);
		
		Date day1 = new Date(2013-1900,7-1,23);
		System.out.println(day1);
		
		day1 = new Date(2013-1900,7-1,23,14,35);
		System.out.println(day1);
		
		day1 = new Date(0);
		System.out.println(day1);
		
		day1 = new Date("Tue, 23 Jul 2013 14:35:00 +0900");
		System.out.println(day1);
		
		day1 = new Date(2013-1900,25-1,100,48,135, 900);
		System.out.println(day1);
		
		day1.setYear(1993-1900);
		System.out.println(day1);
		
		day1.setMonth(8-1);
		System.out.println(day1);
		
		day1.setDate(9);
		System.out.println(day1);
		
		day1.setHours(11);
		System.out.println(day1);
		
		day1.setMinutes(17);
		System.out.println(day1);
		
		day1.setSeconds(49);
		System.out.println(day1);
		
		day1.setTime(2000);
		System.out.println(day1);
		System.out.println("-----------");
		System.out.println(today.getYear()+1900);
		System.out.println(today.getMonth()+1);
		System.out.println(today.getDate());
		System.out.println(today.getDay());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());
		System.out.println(today.getTime());
		
		System.out.println(today.after(day1));
		System.out.println(today.before(day1));
		
	}

}
