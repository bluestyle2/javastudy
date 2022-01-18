package net_p;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastReceiver {

	public static void main(String[] args) {
		
		try {
			MulticastSocket ms = new MulticastSocket(8888);
			InetAddress addr = InetAddress.getByName("230.0.0.1");
			ms.joinGroup(addr);
			
			byte [] arr = new byte[2048];
			
			DatagramPacket data = new DatagramPacket(arr, arr.length);
			ms.receive(data);
			
			System.out.println(new String(arr).trim());
			
			ms.leaveGroup(addr);
			ms.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
