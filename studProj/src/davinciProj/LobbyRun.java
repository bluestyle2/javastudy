package davinciProj;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class LobbyRun extends JFrame implements MouseListener, ActionListener {  //마우스이벤트 액션리스너


   private static final long serialVersionUID = 1L;
   private static final Graphics Graphics = null;
   String id;
   int dino;
   
   ArrayList<PlayerInfoDTO> whprplayer;  // 콤보박스에 받아올 귓속말 사용자들
   ArrayList<PlayerInfoDTO> playerRank;  // 랭크 사용자,젤리개수 저장용
   
    JRadioButton rb1, rb2;   
    String multiAddr ="230.0.0.1";             //멀티캐스트 주소
    int multiPort = 7777, singlePort =8888;    //포트번호

   
   PlayerInfoDTO dto;  //통신
    JTextArea id1;
    JTextField id2;
    InetAddress ipp;
    String host;
    JComboBox box;    
    MulticastSocket mr;
    DatagramSocket ds;
    Object[][] data;
   
    Vector<String> whisperbox;
    
   public LobbyRun(String id, int dino) { 
         
      super("LOBBY");
      this.id = id;
      this.dino = dino;
      
      
      try {  //접속ip db저장,변경 : 귓속말 채팅용
         ipp = InetAddress.getLocalHost();
         this.host = ipp.getHostAddress(); 
         dto = new PlayerInfoDTO();
         dto.setId(id);
         dto.setIpNum(host);
         new PlayerInfoDAO().modify3(dto);   
         
         whprplayer = new PlayerInfoDAO().list2();
         playerRank = new PlayerInfoDAO().list();
                                             
      } catch (Exception e1) {
      
         e1.printStackTrace();
      }    
              

      setBounds(50, 10, 1000, 800);
      setLayout(null);

      
      JButton a1 = new JButton("게임시작");
      a1.setSize(120, 40);
      a1.setLocation(40, 685);
      add(a1);
      a1.addMouseListener(this);
            
      
      JButton a2 = new JButton("로그아웃");
      a2.setSize(120, 40);
      a2.setLocation(830, 685);
      add(a2);
      a2.addMouseListener(this);
      
      JButton p1 = new JButton("게임방법");
      p1.setSize(120, 40);
      p1.setLocation(180, 685);
      add(p1);
      p1.addMouseListener(this);

      
      ImageIcon img1 = new ImageIcon("gameimg/dino"+dino+".png");
      JLabel a3 = new JLabel(img1);
      a3.setBounds(50, 200, 300, 300);
      add(a3);
      
      JLabel b1 = new JLabel("나의 공룡");
      b1.setHorizontalAlignment(JLabel.CENTER);
      b1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      b1.setForeground(Color.BLACK);
      b1.setBackground(new Color(255,255,255,100));
      b1.setBounds(70, 110, 250, 30);
      b1.setOpaque(true);
      add(b1);
      
      whisperbox = new Vector<String>(); // 귓속말 콤보박스 접속자 목록
      
      box = new JComboBox(whisperbox); //귓속말 콤보박스 설정
      box.setBounds(400, 180, 250, 30);
      add(box);
      
      
      rb1 = new JRadioButton("단체", false);  
      rb2 = new JRadioButton("귓속말", false);  

      
      ButtonGroup gr1 = new ButtonGroup();  
      gr1.add(rb1);
      gr1.add(rb2);
      
      rb1.setHorizontalAlignment(JRadioButton.CENTER);
      rb2.setHorizontalAlignment(JRadioButton.CENTER); 
      
      rb1.setBounds(400, 140, 125, 30);
      rb2.setBounds(525, 140, 125, 30);
      rb1.setOpaque(true);
      rb2.setOpaque(true);
      add(rb1);
      add(rb2);
      rb1.addMouseListener(this);
      rb2.addMouseListener(this);
      
      
      JLabel b2 = new JLabel("채팅창");
      b2.setHorizontalAlignment(JLabel.CENTER);
      b2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      b2.setForeground(Color.BLACK);
      b2.setBackground(new Color(255,255,255,100));
      b2.setBounds(400, 110, 250, 30);
      b2.setOpaque(true);
      add(b2);
      
            
      
      
      JLabel b3 = new JLabel("랭킹");
      b3.setHorizontalAlignment(JLabel.CENTER);
      b3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
      b3.setForeground(Color.BLACK);
      b3.setBackground(new Color(255,255,255,100));
      b3.setBounds(700, 110, 250, 30);
      b3.setOpaque(true);
      add(b3);     


      data = new Object [playerRank.size()] [3];          
      
      int j = 1; 
      int i = 0;
      
      for(PlayerInfoDTO dto : playerRank) {                 
                         
         data [i] [0] = j;
         data [i] [1] = dto.id;
         data [i] [2] = dto.jelly;

         i++;         
         j++;
      }

      String [] title = {"순위", "사용자", "젤리"};
      
      
      JTable table = new JTable(data, title);     
      table.setEnabled(false);
      JScrollPane sp1 = new JScrollPane(table);
      sp1.setBounds(700, 150, 250, 420);
      add(sp1);
      
      
      
      
      id1 = new JTextArea(); // 채팅창     
      
      JScrollPane jsp = new JScrollPane(id1);
      jsp.setBounds(400, 220, 250, 315);
      add(jsp); 
      
      id2 = new JTextField(); // 채팅창 입력칸
      id2.setBounds(400, 540, 250, 30);
      add(id2);
      id2.addActionListener(this);
      
      JButton a4 = new JButton("전송");
      a4.setFont(new Font("맑은 고딕", Font.BOLD, 8));
      a4.setSize(50, 30);
      a4.setLocation(600, 440);
      add(a4);
      a4.addMouseListener(this);
      

      
      ImageIcon img2 = new ImageIcon("gameimg/backgroundimg (6).png");
      JLabel b4 = new JLabel(img2);
      b4.setBounds(0, 0, 1000, 800);
      add(b4);

      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      box.addItemListener(new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getStateChange() == ItemEvent.SELECTED) {
		           String selected = ((JComboBox)e.getSource())
		                               .getSelectedItem().toString();
		           box.setSelectedItem(selected);
		        }			
			}
      });
      
      
      a1.addActionListener(new ActionListener() { //게임시작 버튼

         public void actionPerformed(ActionEvent e) {
   		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
              
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  
   		  
            new PlayGame(id, dino); 
            mr.close();
            ds.close();
            dispose();
         }
      });
      
      a2.addActionListener(new ActionListener() {  //로그아웃버튼

         public void actionPerformed(ActionEvent e) {
            
      		  try {
                  AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
                  
                  Clip clip = AudioSystem.getClip();
                  clip.stop();
                  clip.open(ais);
                  
                  clip.start();         
                  
               } catch (Exception e2) {
                  
               } 
      		  
 
            mr.close();
            ds.close();
            new LoginFrame2();
            dispose();
         }
      });
      
      p1.addActionListener(new ActionListener() {//게임방법 버튼

          public void actionPerformed(ActionEvent e) {     		  
            
             new DinoManual();
            
          }
       });

      
     try { // 리시버 스타트(단톡, 개인톡)
        new MultiReceiver(multiAddr, multiPort).start();
        new SingleReceiver(singlePort).start();
      
   } catch (Exception e1) {
      
      e1.printStackTrace();
   }
     }
   
   public void mouseClicked(MouseEvent e) {
      
      try {
         AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
         
         Clip clip = AudioSystem.getClip();
         clip.stop();
         clip.open(ais);
         
         clip.start();         
         
      } catch (Exception e2) {
         
      }  
   }
      
   public void mousePressed(MouseEvent e) {
   
   }

   public void mouseReleased(MouseEvent e) {
      
   }
   
   public void mouseEntered(MouseEvent e) {
      
   }

   public void mouseExited(MouseEvent e) {
      
   }



 //엔터키 클릭, 메시지 보낼 때
   public void actionPerformed(ActionEvent e) { 
      
      
      if(rb1.isSelected()) {      //단체 라디오버튼 
         System.out.println("단체");
         
         try {
            InetAddress ip = InetAddress.getByName(multiAddr);
            MulticastSocket ms = new MulticastSocket();
                              
            String msg = id+ ":" + id2.getText();
            
            byte[] arr = msg.getBytes();
            
            DatagramPacket data = new DatagramPacket(
                  arr, arr.length, ip, multiPort);
            
            ms.send(data);   
            ms.close();
            
            System.out.println(msg);      
            
            id2.setText("");
            
         } catch (Exception e2) {
            
         }

      }else if(rb2.isSelected()){   //귓속말 라디오버튼 
         System.out.println("귓속말");
         String msg= "[귓속말]"+id+": "+id2.getText();
              
         try {
            
            for(PlayerInfoDTO dto : whprplayer) {    //수신지 ip지정하기
            
               if(box.getSelectedItem().equals(dto.id)) {
                  new SingleSender(dto.ipNum, singlePort, msg).send();
                  System.out.println(dto.ipNum);
                  box.update((Graphics) box.getSelectedItem());
                  
               }
            }
            
         } catch (Exception e2) {
            
         }  
      }      
   }
   

   
   class MultiReceiver extends Thread{      //단체 채팅: 수신(리시버)   
      
      int port;           //수신용
      InetAddress addr;                                                          
      MulticastSocket ms1; //로비 입장시 자동 발신용
      
      
      public MultiReceiver(String ip, int port) {
         System.out.println("단체 리시버 실행");      
         
         try {                                    //입장시 기존 접속자에게 발송
            addr = InetAddress.getByName(ip);
            this.port = port;
            ms1 = new MulticastSocket();
                              
            String msg = id + ":" + "입장";
            
            byte[] arr = msg.getBytes();
            
            DatagramPacket data = new DatagramPacket(
                  arr, arr.length, addr, multiPort);
            
            ms1.send(data);               
            ms1.close();
            
            id1.append("로비에 입장하셨습니다." + "\n");
            id1.setCaretPosition(id1.getDocument().getLength());
            
         } catch (Exception e2) {
            
         }
      }
   
   
      public void run() {   
         
         try {
            mr = new MulticastSocket(port);
            mr.joinGroup(addr);                 //그룹에 속함
            String chatOn="";  
            
            while(true) {      
            	
               byte [] arr2 = new byte[2048];   
               DatagramPacket data = new DatagramPacket(arr2, arr2.length);
               
               mr.receive(data);               
         
               String msg = new String(arr2).trim();                //수신데이터 전체                  
               String chkid = msg.substring(0, (msg.indexOf(':')));   //발신자 id            
               String chat= msg.substring(msg.indexOf(':')+1);      //메시지만   
                   

               if(chat.length()<=1) {
                  chatOn = chat.substring(0); 
               }else if(chat.length()>1) {
                  chatOn = chat.substring(chat.length()-2);
               }
               
               
               if(msg.length()==(chkid.length()+1)) {        //메시지가 빈칸(엔터만 누른 경우)
                  
                  if(id.equals(chkid)) {                  //발신자가 나일 경우
                     id1.append("나"+": " +"\n");
                     id1.setCaretPosition(id1.getDocument().getLength());
                     
                  }else {
                     id1.append(chkid+": "+"\n");        //타인일 경우
                     id1.setCaretPosition(id1.getDocument().getLength());
                  }   
                  
                  
               }else if(msg.length()>=(chkid.length()+1)){      //메시지가 있는 경우 
                  
                     
                     if(id.equals(chkid)) {  //발신자, 수신자 동일할 경우: (나 : 메시지)
                        id1.append("나"+": "+ chat +"\n");
                        id1.setCaretPosition(id1.getDocument().getLength());
                        
                     }else if((!id.equals(chkid)) && (!chkid.equals("접속"))){
                        id1.append(new String(arr2).trim()+"\n");
                        id1.setCaretPosition(id1.getDocument().getLength());
                     }   
                     
                     
                     if(chatOn.equals("입장")) {              //누군가 입장했을 때, 
                        for(PlayerInfoDTO dto : whprplayer) {                           
                           whisperbox.remove(dto.id);                           
                        }
                        
                        try {
                           InetAddress ip2 = InetAddress.getByName(multiAddr);
                           MulticastSocket ms2 = new MulticastSocket();
                                             
                           String addList = "접속:"+id;  
                           
                           byte[] arr3 = addList.getBytes();
                           
                           DatagramPacket data2 = new DatagramPacket(
                                 arr3, arr3.length, ip2, multiPort);
                           
                           ms2.send(data2);              
                           ms2.close();
                           
                        } catch (Exception e2) {
                           
                        }
                        
                        for(PlayerInfoDTO dto : whprplayer) {
                           if(dto.id.equals(chkid) && !dto.id.equals(id)) {
                              whisperbox.add(dto.id);
                              
                             box = new JComboBox(whisperbox); //귓속말 콤보박스 설정
                             box.setBounds(400, 180, 250, 30);
                             add(box);
                           }
                           
                        }
                  
                     }
                     
                     if(chkid.equals("접속")) {                     
                        
                        for(PlayerInfoDTO dto : whprplayer) {
                           if(dto.id.equals(chat) && !(dto.id.equals(id))) {
                              whisperbox.add(dto.id);
                              
                             box = new JComboBox(whisperbox); //귓속말 콤보박스 설정
                             box.setBounds(400, 180, 250, 30);
                             add(box);
                           }
                        }                        
                     }
                     
                     if(chatOn.equals("퇴장")) {
                           for(PlayerInfoDTO dto : whprplayer) {
                              if(dto.id.equals(chkid)) {
                                 whisperbox.remove(dto.id);
                              }
                           }
                     }
                  }
               }            
            
         } catch (Exception e) {
            try {
               InetAddress ip2 = InetAddress.getByName(multiAddr);
               MulticastSocket ms = new MulticastSocket();
                                 
               String msg = id + ":퇴장";
               
               byte[] arr = msg.getBytes();
               
               DatagramPacket data = new DatagramPacket(
                     arr, arr.length, ip2, multiPort);
               
               ms.send(data);   
               
               id1.append(msg +"\n");
               id1.setCaretPosition(id1.getDocument().getLength());                     
               id2.setText("");
               
            } catch (Exception e2) {
               
            }
            
            e.printStackTrace();
         }
      }      
   }
    
   

   class SingleSender extends Thread{     //귓속말 sender
      
      InetAddress addr;                      //수신지 주소
      int port;                              //수신지 포트번호
      String msg;
      public SingleSender(String addr, int port, String msg) {            
         
         try {
            this.addr = InetAddress.getByName(addr);
            this.port = port;
            this.msg = msg;
         } catch (Exception e) {
            e.printStackTrace();      
            
         }                  
      }
      
      public void send() {
         try {
            
            DatagramSocket ds = new DatagramSocket();   
               
            byte [] arr = msg.getBytes();     
            
            DatagramPacket dp = new DatagramPacket(    
                  arr, arr.length, addr, port                  
            );
            
            ds.send(dp);              
            ds.close();                     
            
            String chat = msg.substring(msg.indexOf(':')+2);       //메시지
            
            id1.append("[귓속말]나"+": "+ chat +"\n");
            id1.setCaretPosition(id1.getDocument().getLength());               
            
            id2.setText("");
            
         } catch (Exception e) {
            e.printStackTrace();
         }
      }      
   }

   
   
   class SingleReceiver extends Thread{  //귓속말 리시버

      int port;      
      
      public SingleReceiver(int port) {
         System.out.println("귓속말 리시버 실행");         

         this.port = port;
      }
      
      @Override
      public void run() {         
         
         try {
            ds = new DatagramSocket(port);
            
            while(true) {
            
               byte [] arr = new byte[1000];            
               
               DatagramPacket data = new DatagramPacket(arr, arr.length);
               
               ds.receive(data);             
            
               id1.append(new String(arr).trim()+"\n");
               id1.setCaretPosition(id1.getDocument().getLength());
            
            }
                     

         }catch (Exception e) {
            
            e.printStackTrace();
         }         
      }      
   }
}
      
 
      