package net_p;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class TCPMulServerMain2 {
   int i = 0;
   HashMap<String, ObjectOutputStream> arr = new HashMap<String, ObjectOutputStream>();
   
   public TCPMulServerMain2() throws Exception {
      Collections.synchronizedMap(arr);
      
      ServerSocket server = new ServerSocket(8888);
      System.out.println("서버시작");
      
      while(true) {
         
         new TCPMulReceiver(server.accept()).start();
      }
   }
   
   class TCPMulReceiver extends Thread{
      
      String name;
      ObjectOutputStream dos;
      ObjectInputStream dis;
      
      public TCPMulReceiver(Socket socket) throws Exception {
         i++;
         name = "["+i+"->"+socket.getInetAddress()+"]";
         dos = new ObjectOutputStream(socket.getOutputStream());
         dis = new ObjectInputStream(socket.getInputStream());
      }
      
      @Override
      public void run() {
         
         try {
            
            sendToAll(new TCPData(name, "전체", "채팅", name+" 입장"));
            arr.put(name,dos);
            //sendToAll("접속자 수:"+arr.size());
            sendToAll(new TCPData(name, "전체", "채팅", "접속자 수:"+arr.size()));
            //sendToAll(new ArrayList<String>(arr.keySet()));
            sendToAll(new TCPData(name, "전체", "접속자", new Vector<String>(arr.keySet())));
            
            while(dis!=null) {
               TCPData td = (TCPData)dis.readObject();
               td.src = name;
               
               switch(td.dst) {
               case "전체":
                  sendToAll(td);
                  break;
               default:
                  sendToOne(td);
                  break;
               }
            }
            
         } catch (Exception e) {
            
            e.printStackTrace();
         } finally {
            
            arr.remove(name);
            //sendToAll(name+" 퇴장");
            sendToAll(new TCPData(name, "전체", "채팅", name+" 퇴장"));
            //sendToAll("접속자 수:"+arr.size());
            sendToAll(new TCPData(name, "전체", "채팅", "접속자 수:"+arr.size()));
            //sendToAll(new ArrayList<String>(arr.keySet()));
            sendToAll(new TCPData(name, "전체", "접속자", new Vector<String>(arr.keySet())));
         }
   
      }
      
   }
   
   //귓속말일 경우
   void sendToOne(TCPData td) {
      
      System.out.println("sendToOne:"+td);
      
      try {
         //발생지
         arr.get(td.src).writeObject(td);
         arr.get(td.src).flush();
         arr.get(td.src).reset();
         
         //도착지
         arr.get(td.dst).writeObject(td);
         arr.get(td.dst).flush();
         arr.get(td.dst).reset();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
   }
   
   //전체일 경우
   void sendToAll(TCPData td) {
      
      System.out.println("sendToAll:"+td);
      for (ObjectOutputStream dd : arr.values()) {
         try {
            dd.writeObject(td);
            dd.flush();
            dd.reset();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }
   
   
   
   

   public static void main(String[] args) throws Exception {
      
      new TCPMulServerMain2();
   }

}