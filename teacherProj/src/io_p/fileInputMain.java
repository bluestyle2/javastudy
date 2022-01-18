package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileInputMain {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("fff/aaa.txt");
		
		int data;
		while( (data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		
		fis.close();
	}

}
