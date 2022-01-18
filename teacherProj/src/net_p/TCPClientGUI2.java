package net_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TCPClientGUI2 extends JFrame implements ActionListener {

   Vector<String> arr = null;
   
   class TCPGUIReceiver extends Thread{
      ObjectInputStream dis;
      
      TCPGUIReceiver(Socket socket) throws Exception {
         dis = new ObjectInputStream(socket.getInputStream());
      }
      
      
      @Override
      public void run() {
         // TODO Auto-generated method stub
         try {
            while(dis!=null) {
               //System.out.println(dis.readUTF());
               
               TCPData td = (TCPData)dis.readObject();
               System.out.println(td);
               
               switch(td.kind) {
               
               case "채팅":
                  ta.append(td.src + td.data + "\n");
                  ta.setCaretPosition(ta.getDocument().getLength());
                  
                  break;
               case "접속자":
                  
                  if(box!=null) {
                  //기존의 접속자 콤보박스 제거
                     getContentPane().remove(box);
                  }
                  arr = (Vector<String>)td.data; 
                  
                  box = new JComboBox<String>(arr);
                  box.addItem("전체");
                  
                  //새로운 접속자 콤보박스 추가
                  add(box,"North");
                  
                  ///화면 갱신
                  getContentPane().revalidate();
                  getContentPane().repaint();
                  
                  
                  
                  break;
               }
            }
         } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
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
         //dos.writeObject(tf.getText());
         
                                           //귓속말인지, 전체인지 --> dst
         dos.writeObject(new TCPData(name, (String)box.getSelectedItem(), "채팅", tf.getText() ) );
         dos.flush();
         dos.reset();
         
         tf.setText("");
      } catch (IOException e1) {
         // TODO Auto-generated catch block
         e1.printStackTrace();
      }
   }
   
   JTextArea ta;
   JTextField tf;
   String name;
   ObjectOutputStream dos;
   JComboBox<String> box;
   
   public TCPClientGUI2() throws Exception {
      
      
      setBounds(200, 100, 400, 600);
      
//      box = new JComboBox<String>();
//      box.addItem("전체");
//      add(box,"North");
      
      ta = new JTextArea();
      JScrollPane jsp = new JScrollPane(ta);
      
      add(jsp,"Center");
      
      tf = new JTextField();
      add(tf,"South");
      
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      Socket socket = new Socket("192.168.10.155", 8888);
      System.out.println("클라이언트 서버 접속 성공");
      
      name = "["+InetAddress.getLocalHost().getHostAddress()+"]";
      dos = new ObjectOutputStream(socket.getOutputStream());
      
      //new TCPSingleSender(socket).start();
      tf.addActionListener(this);  //sender 대신에 ActionListener 로 보내겠다
      
      new TCPGUIReceiver(socket).start();
      
      
      
   }

   public static void main(String[] args) throws Exception {
      
      new TCPClientGUI2();
   }
   
   

}