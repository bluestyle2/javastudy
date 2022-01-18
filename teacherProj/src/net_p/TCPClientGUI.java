package net_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPClientGUI extends JFrame implements ActionListener {

   class TCPGUIReceiver extends Thread{
      DataInputStream dis;
      
      TCPGUIReceiver(Socket socket) throws Exception {
         dis = new DataInputStream(socket.getInputStream());
      }
      
      
      @Override
      public void run() {
         // TODO Auto-generated method stub
         try {
            while(dis!=null) {
               //System.out.println(dis.readUTF());
               ta.append(dis.readUTF()+"\n");
               ta.setCaretPosition(ta.getDocument().getLength());
            }
         } catch (Exception e) {
            // TODO: handle exception
         }finally {
            try {
               dis.close();
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
      }
   }
   
   
   @Override
   public void actionPerformed(ActionEvent e) {
      // 엔터를 친다 --> 서버로 내용을 보내겠다.
      try {
         dos.writeUTF(name+tf.getText());
         tf.setText("");
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
   }
   
   JTextArea ta;
   JTextField tf;
   String name;
   DataOutputStream dos;
   
   public TCPClientGUI() throws Exception {
      
      
      setBounds(200, 100, 400, 600);
      
      ta = new JTextArea();
      JScrollPane jsp = new JScrollPane(ta);
      
      add(jsp,"Center");
      
      tf = new JTextField();
      add(tf,"South");
      
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      Socket socket = new Socket("192.168.219.113", 8888);
      System.out.println("클라이언트 서버 접속 성공");
      
      name = "["+InetAddress.getLocalHost().getHostAddress()+"]";
      dos = new DataOutputStream(socket.getOutputStream());
      
      //new TCPSingleSender(socket).start();
      tf.addActionListener(this);  //sender 대신에 ActionListener 로 보내겠다
      
      new TCPGUIReceiver(socket).start();
      
      
      
   }

   public static void main(String[] args) throws Exception {
      
      new TCPClientGUI();
   }
   
   

}