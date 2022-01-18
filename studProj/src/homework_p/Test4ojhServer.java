package homework_p;
/*
 * 
2. 수행 요구 사항

TCP 기반 1대1 채팅 프로그램을 구현하세요

​

요구사항

1. 자바 notwork 기반으로 구현[10점]

2. TCP 서버/ 클라이언트 기반으로 구현[20점]

3. Multi Thread를 사용할 것[20점]

4. console 창으로 메시지 송수신 처리할 것[20점]

5. “통신종료” 송수신시 프로그램 종료할 것[20점]

6. 최종결과물은 수행한 결과 소스코드 및 PPT(스크린 샷을 캡쳐)하여 압축파일로 제출[10점]

​
 * */

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class TCPSingleSender extends Thread {
	String nm;
	DataOutputStream dos;
	boolean isrun = true;

	public TCPSingleSender(Socket socket) {

		try {
			nm = "[" + InetAddress.getLocalHost() + "]";
			dos = new DataOutputStream(socket.getOutputStream());

		} catch (Exception e) {
	
			e.printStackTrace();
		}
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			while (dos != null && isrun) {
				String str = sc.nextLine();
				dos.writeUTF(nm + str);
				if (str.equals("통신종료")) {
					System.out.println("채팅방을 나가셨습니다");
					isrun = false;
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				dos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}

class TCPSingleReceiver extends Thread {
	DataInputStream dis;

	public TCPSingleReceiver(Socket socket) throws Exception {
		dis = new DataInputStream(socket.getInputStream());

	}

	@Override
	public void run() {

		try {
			while (dis != null) {
				System.out.println(dis.readUTF());
			}
		} catch (Exception e) {

		} finally {
			try {
				dis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}
}

public class Test4ojhServer {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(8888);
		System.out.println("서버를 준비합니다");

		Socket client = server.accept();
		System.out.println(client.getInetAddress() + " 접속");

		new TCPSingleSender(client).start();
		new TCPSingleReceiver(client).start();

	}

}
