package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


class TCPSingleSender extends Thread{   //sender Thread 입니다!
   
   String name;                 //이름은 socket주소로 할 것입니다. 
   DataOutputStream dos;         //전송이니까 Output!
   
   
   public TCPSingleSender(Socket socket) {
      
      try {
         name = "["+InetAddress.getLocalHost()+"]";    //보내는 건 내 주소만 있으면 돼
         dos = new DataOutputStream(socket.getOutputStream());
         
         
      } catch (Exception e) {
               e.printStackTrace();
      }   
      
   }
   
   //보내는 애
   public void run() {
      Scanner sc = new Scanner(System.in);   //콜솔에 입력받은걸 dos 접속된 애한테 보낸다.
                                             //에러가 나면 dos닫고 나갈거야 라는 얘기
      
      try { //잘못돼면 통신이 끊어지게 하기 위해 바깥에 둡니다. 
         
      while(dos!= null) { //dos가 통신이 살아있을 때까지
         
            String str = sc.nextLine();         
            dos.writeUTF(name+str);             //dos로 출력해서 보냅니다~!
            
            }
      
         }catch (Exception e) {
            
            e.printStackTrace();
            
         }finally {
            try {
               dos.close();
               
            }catch(IOException e) {
               
               e.printStackTrace();
         }
      }
   }   
}


    //받는 thread
class TCPSingleReceiver extends Thread{
   
   DataInputStream dis;        //보내는 쪽에서 이름을 알려주니까 받는 쪽은 이름은 출력 안 함
   
   
   public TCPSingleReceiver(Socket socket) throws Exception {   //받을 때 socket을 받습니다.    
      dis = new DataInputStream(socket.getInputStream());   //트라이캐치 선언 아무거나 하세요
                                                            //받는 것이니까 Input!
   }
   

   public void run() {
      
      try {
         while(dis!=null) {              //dis가 null인 것은 socket이 끊겼다는 것입니다.
                                        //메시지를 입력하지 않아도 dis는 null이 아닌 겁니다.

            System.out.println(dis.readUTF());     //콘솔에 메시지가 보입니다.         
            
         }
         
      } catch (Exception e) {
         
         
      }finally {
         try {
            dis.close();           //제대로 못 받을 수 있기 때문이다. 
                                   //닫으려고 했는데 봤더니 이미 닫힌 경우가 있습니다.
            
         } catch (IOException e) {
            
            e.printStackTrace();
         }
      }
   }
}


public class TCPSingleServerMain {
   

   public static void main(String[] args) throws Exception {
      
      ServerSocket server = new ServerSocket(7777);    //포트번호를 지정했습니다.
      System.out.println("서버 준비");
      
      
      Socket client = server.accept();        // 맨 처음 접속한 애만 인정하고 나머지는 안함
      System.out.println(client.getInetAddress()+" 접속");
      
                                               //클라이언트가 연결되면 !
      new TCPSingleSender(client).start();      //sender Thread
      new TCPSingleReceiver(client).start();      //receiver Thread 둘다 start()
      
      
      
   }

}