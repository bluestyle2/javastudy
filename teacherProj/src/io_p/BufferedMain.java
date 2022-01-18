package io_p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("fff/aaa.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		String line = br.readLine();
//		
//		System.out.println(line);
		
		FileWriter fw = new FileWriter("fff/hhh.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String line;
		
		int cnt = 0;
		while((line=br.readLine()) != null) {
			cnt++;
			System.out.println(cnt+":"+line);
			bw.write(line+"\n");
		}
		
		bw.close();
		fw.close();
		
		br.close();
		fr.close();
	}

}
