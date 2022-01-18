package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {

	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(7777);
		
		while(true) {
			
			System.out.println("클라이언트 접속 대기");
			
			Socket client = server.accept();
			
			System.out.println(client.getInetAddress()+" 접속");
		//	OutputStream os = client.getOutputStream();
		//	DataOutputStream dos = new DataOutputStream(os);
			
		//	dos.writeUTF("서버가 보내는 메세지");
			
		//	dos.close();
		//	os.close();		
			
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
				
			System.out.println("서버 받음 :"+dis.readUTF());
			
				
				
			dis.close();
			is.close();
			
			client.close();
			System.out.println("접속종료");
			
			
			
		}

	}

}
