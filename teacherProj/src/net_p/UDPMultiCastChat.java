package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.Scanner;



public class UDPMultiCastChat {
   
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
            MulticastSocket ds = new MulticastSocket();
         
            while(true) {
            
               String msg = sc.nextLine();
               
               byte []  arr = msg.getBytes();
               
               DatagramPacket dp = new DatagramPacket(
                  arr, arr.length, addr, port
                  
               );
               
               ds.send(dp);
            }
         } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();         
         }
   
      }   
   }
   
   static class UDPReceiver extends Thread{
      
      InetAddress addr;
      int port;

      public UDPReceiver(String addr, int port) {
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
            MulticastSocket ds = new MulticastSocket(port);
            ds.joinGroup(addr);
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
      String ip = "230.0.0.1";
      new UDPSender(ip, 8888).start();
      new UDPReceiver(ip,8888).start();

      
   }

}