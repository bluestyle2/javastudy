package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class UDPUniSender {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket();

		InetAddress addr = InetAddress.getByName("192.168.219.113");
		
		String msg = "오늘 점심 뭐 먹어?";
		byte [] arr = msg.getBytes();
		
		
		DatagramPacket data = new DatagramPacket(
				arr,
				arr.length,
				addr,
				8888);
				
		ds.send(data);
		
		ds.close();
	}

}
