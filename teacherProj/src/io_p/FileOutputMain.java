package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileOutputMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
		
		String str = "zxcxvcxcvmsd dnowf fnowef woef/"+
		"n0987654321+_)(*%"+"세운다 머리털을 세운다 신통하구나 그 도술";
		
		char [] arr = str.toCharArray();
		for (char c : arr) {
			System.out.println(c);
			fos.write(c);
		}
		
		fos.close();

		
	
		
		
		
		System.out.println(arr);
	    
	}

}
////aaa.txt -> ccc.txt