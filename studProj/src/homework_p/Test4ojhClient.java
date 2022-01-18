package homework_p;

import java.net.Socket;

public class Test4ojhClient {

	public static void main(String[] args) throws Exception {
		
			Socket socket = new Socket("192.168.219.113",8888);
			System.out.println("채팅창에 접속합니다. 종료를 원하시면 통신종료를 입력하세요");
			
			new TCPSingleSender(socket).start();
			new TCPSingleReceiver(socket).start();
			
			
	}

}