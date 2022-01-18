package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketMain {

	public static void main(String[] args) throws Exception {
		
		Socket socket = new Socket("192.168.219.113", 7777);
		System.out.println("서버 접속 성공");
		
	//	InputStream is = socket.getInputStream();
	//	DataInputStream dis = new DataInputStream(is);
		
	//	System.out.println("클라이언트 받음 :"+dis.readUTF());				
	//	dis.close();
	//	is.close();
		
		
		
		OutputStream os = socket.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeUTF("클라이언트가가 보내는 메세지");
		
		dos.close();
		os.close();			
		
		socket.close();
		System.out.println("서버 접속 종료");
		
		
	
		}
	}


