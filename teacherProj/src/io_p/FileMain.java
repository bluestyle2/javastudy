package io_p;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileMain {

	public static void main(String[] args) throws Exception {
		
		File ff = new File("fff\\aaa.txt");
		
		System.out.println(ff.exists());	
		System.out.println(ff.isFile());	//파일이냐
		System.out.println(ff.isDirectory());	
		System.out.println(ff.isAbsolute());
		System.out.println(ff.isHidden());	//숨긴파일이냐
		System.out.println(ff.canRead());
		System.out.println(ff.canWrite());	
		System.out.println(ff.canExecute());	//실행가능하냐
		
		System.out.println(ff.getParent());	//너의 경로가어디냐
		System.out.println(ff.getName());	//너의이름은
		System.out.println(ff.getAbsolutePath());	
		System.out.println(ff.length());
		System.out.println(new Date(ff.lastModified())); //마지막에 만든날짜가 언제냐
		
		ff = new File("fff/bbb.txt");
		ff.delete(); //파일삭제
		
		ff = new File("fff/ccc.txt");	
		File ff2 = new File("qqq/zzz.txt");	//ccc를 qqq라는 폴더에 zzz로 이동
		
		ff.renameTo(ff2);
		
		ff = new File("fff/mmm.txt");	//mmm이라는 빈파일만듬
		ff.createNewFile();
		
		ff = new File("fff/qqq");	//qqq라는 디렉토리 만듬
		ff.mkdir();
		
		ff = new File("fff/rrr/ttt");	
//		ff.mkdir();
		ff.mkdirs();	//여러개의 폴더를 만듬
		
		ff.delete(); // 폴더도 지울수있음
		
		ff = new File("ddd/img");	
		ff2 = new File("qqq/pic");
		ff.renameTo(ff2);
		
		ff = new File("ddd/oa");
		ff.delete();
		
		ff = new File("fff");
		File [] arr = ff.listFiles();
		
		for (File file : arr) {
			System.out.println(file.getName());
		}
	}

}
//

