package net_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

public class TCPMulServerMain {
   
   ArrayList<DataOutputStream> arr = new ArrayList<DataOutputStream>();
   
   public TCPMulServerMain() throws Exception {
      Collections.synchronizedList(arr);
      
      ServerSocket server = new ServerSocket(8888);
      System.out.println("서버시작");
      
      while(true) {
         
         new TCPMulReceiver(server.accept()).start();
      }
   }
   
   class TCPMulReceiver extends Thread{
      
      String name;
      DataOutputStream dos;
      DataInputStream dis;
      
      public TCPMulReceiver(Socket socket) throws Exception {
         name = "["+socket.getInetAddress()+"]";
         dos = new DataOutputStream(socket.getOutputStream());
         dis = new DataInputStream(socket.getInputStream());
      }
      
      @Override
      public void run() {
         
         try {
            
            sendToAll(name+" 입장");
            arr.add(dos);
            sendToAll("접속자 수:"+arr.size());
            
            while(dis!=null) {
               sendToAll(dis.readUTF());
            }
            
         } catch (IOException e) {
            
            e.printStackTrace();
         } finally {
            
            arr.remove(dos);
            sendToAll(name+" 퇴장");
            sendToAll("접속자 수:"+arr.size());
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
      
      new TCPMulServerMain();
   }

}