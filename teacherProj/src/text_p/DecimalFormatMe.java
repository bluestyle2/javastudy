package text_p;

import java.text.DecimalFormat;

public class DecimalFormatMe {

	public static void main(String[] args) {
		
		int [] jum = {67,78,89,98,76,54,78,77,90,56};
		DecimalFormat df = new DecimalFormat();
		for(int i : jum) {
			df= new DecimalFormat("▲0;▼0");
			
			System.out.println(i+"->"+df.format(i-70).charAt(0));
		}
	}

}
