package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Study22 {

	ArrayList<DataOutputStream> arr = new ArrayList<DataOutputStream>();
	JTextArea area1, area2;
	JButton msgsend;
	
	
	
	class Frame extends JFrame{
		
		Frame() throws Exception {
			setBounds(100,100,600,500);
			setLayout(null);
			
			
			area1 = new JTextArea("접속자 수:"+arr.size()); //메세지 출력화면
			area2 = new JTextArea();	//메세지 전송 창
			msgsend = new JButton("Send");	//메세지 전송 버튼
			
			JScrollPane sp1 = new JScrollPane(area1); 
			sp1.setBounds(130, 110, 300, 100);
			add(sp1);
			
			setVisible(true);
			
			JScrollPane sp2 = new JScrollPane(area2);
			sp2.setBounds(130, 230, 300, 20);
			add(sp2);
			
			msgsend.setBounds(220, 280, 100, 30);
			add(msgsend);
			
			
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			

		}
	}
	
	public Study22() throws Exception {
		Collections.synchronizedList(arr);
//			dos = new DataOutputStream(socket.getOutputStream());
//			dis = new DataInputStream(socket.getInputStream());
		ServerSocket server = new ServerSocket(8888);
		new Frame();
		while (true) {

		new TCPMulReceiver(server.accept()).start();
//			dos = new DataOutputStream(socket.getOutputStream());
//			dis = new DataInputStream(socket.getInputStream());
			
//		Socket socket = new Socket("192.168.219.113",8888);
//		System.out.println("접속 성공");
//			
//		new TCPSingleSender(socket).start();
//		new TCPSingleReceiver(socket).start();
		}
	}

	class TCPMulReceiver extends Thread {

		String name;
		DataOutputStream dos;
		DataInputStream dis;

		public TCPMulReceiver(Socket socket) throws Exception {
			name = "[" + socket.getInetAddress() + "]";
			dos = new DataOutputStream(socket.getOutputStream());
			dis = new DataInputStream(socket.getInputStream());
		}

		@Override
		public void run() {

			try {

				
				arr.add(dos);
				

				while (dis != null) {
					sendToAll(dis.readUTF());
				}

			} catch (IOException e) {

				e.printStackTrace();
			} finally {

				arr.remove(dos);

			}

		}

	}


	
	void sendToAll(String msg) {
		for (DataOutputStream dd : arr) {
			try {
				dd.writeUTF(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {

		new Study22();
		
	}

}