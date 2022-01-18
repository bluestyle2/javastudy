package net_p;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetInfoMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		InetAddress ip = InetAddress.getByName("www.naver.com");
		
		System.out.println(ip);
		System.out.println(ip);		
		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		
		InetAddress [] ipArr = InetAddress.getAllByName("www.naver.com");
		for (InetAddress i : ipArr) {
			System.out.println(i);
		}
		
		ip = InetAddress.getLocalHost();
		System.out.println(ip);
		
	}

}
