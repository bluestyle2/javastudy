package net_p;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPUniReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(8888);
		
		byte [] arr = new byte[2048];
		
		DatagramPacket data = new DatagramPacket(arr, arr.length);
		
		ds.receive(data);
		
		System.out.println(data.getAddress());
		System.out.println(new String(arr));
		
		ds.close();

	}

}
