package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;



public class UDPUniChatt {
   
   static class UDPSender extends Thread{
      
      InetAddress addr;
      int port;
      public UDPSender(String addr, int port) {
         
         try {
            this.addr = InetAddress.getByName(addr);
            this.port = port;
         } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
         
      }
      
      @Override
      public void run() {
         
         
         try {
            Scanner sc = new Scanner(System.in);
            DatagramSocket ds = new DatagramSocket();
         
            while(true) {
            
               String msg = sc.nextLine();
               
               byte []  arr = msg.getBytes();
               
               DatagramPacket dp = new DatagramPacket(
                  arr, arr.length, addr, port
                  
               );
               
               System.out.println("[나]"+msg);
               ds.send(dp);
            }
         } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();         
         }
   
      }   
   }
   
   static class UDPReceiver extends Thread{
      
      int port;

      public UDPReceiver(int port) {
         super();
         this.port = port;
      }
      
      @Override
      public void run() {
         
         try {
            DatagramSocket ds = new DatagramSocket(port);
            
            while(true) {
               byte [] arr = new byte[2048];
               
               DatagramPacket dp = new DatagramPacket(arr, arr.length);
               ds.receive(dp);
               
               System.out.println(dp.getAddress()+":"+new String(arr).trim());
            }   
            
         } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
         }
      }
   }

   public static void main(String[] args) {
      String ip = "192.168.219.113";
      new UDPSender(ip, 8888).start();
      new UDPReceiver(8888).start();

   }

}