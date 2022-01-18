package net_p;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlDataMain {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://comic.naver.com/webtoon/detail?titleId=738174&no=82&weekday=tue");
		System.out.println(url.getAuthority());	//명시적인 포트번호가 있으면 포트번호까지 알려줌
		System.out.println(url.getDefaultPort());	//포트번호
		System.out.println(url.getPort());
		System.out.println(url.getHost());	
		System.out.println(url.getPath());
		System.out.println(url.getQuery());	//변수
		System.out.println(url.getProtocol());
		System.out.println(url.getContent());	//stream으로 준것
		System.out.println(url.toURI());
		
		System.out.println("--------------------------------");
		
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		
		String line;
		
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
		isr.close();
		
	}

}
