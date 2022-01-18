package text_p;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatMain {

	public static void main(String[] args) throws ParseException {
		
		DecimalFormat df = new DecimalFormat();
		
		double dd = (double)df.parse("13,789.456");
		
		System.out.println(dd+100);
		
		dd = 456.789;
		df = new DecimalFormat("0000000000");
		System.out.println(df.format(dd));
		
		String [] ppArr = {
				"0", "#", "0000000000", "##########",
				"####0000",//"#0#0#0#0#0","0000####"
				
		};
		
		double [] ddArr = {
				13456, -123456,
				123.45678, -123.45678,
				.9876, -.9876,
				.4321, -4321, 0				
		};
		
		
		for (String pp : ppArr) {
			System.out.println("\n"+pp+" >>> ");
			
			df = new DecimalFormat(pp);
			
			for (double d : ddArr) {
				System.out.println("\t"+d+" -> "+ df.format(d));
			}
			
			
		}
		
	}

}
