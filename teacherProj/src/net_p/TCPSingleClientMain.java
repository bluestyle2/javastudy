package net_p;

import java.net.Socket;


public class TCPSingleClientMain {

   public static void main(String[] args) throws Exception {
      
      //서버 접근                                           //지금은 같은 컴퓨터이지만
      Socket socket = new Socket("192.168.7.237", 7777);  //다른 컴퓨터로 변화해도 채팅 가능
      System.out.println("클라이언트 서버 접속 성공");
      
      new TCPSingleSender(socket).start();             //socket으로 연결되어 있습니다!
      new TCPSingleReceiver(socket).start();            //Thread를 클라이언트도 모두 실행!

   }
}