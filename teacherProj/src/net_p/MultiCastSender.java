package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastSender {

	public static void main(String[] args) {

		try {
			MulticastSocket ms = new MulticastSocket();
			String msg = "니들도 언젠간 빠질날이 올꺼야";

			byte [] arr = msg.getBytes();
			
			InetAddress addr = InetAddress.getByName("230.0.0.1");
			
			DatagramPacket data = new DatagramPacket(arr, arr.length, addr, 8888);
			
			ms.send(data);
			
			
			ms.close(); 

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
