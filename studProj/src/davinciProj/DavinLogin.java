package davinciProj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;


class DavinLogin extends JFrame{
   
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   JTextField [] ta = new JTextField[7];
   JPasswordField pwarea, pwarea1;
   JButton [] btn = new JButton[10];
   JProgressBar [] bar = new JProgressBar[7]; 
   JLabel [] lb = new JLabel[35];
   
   ImageIcon bg,bg1;
   PlayerInfoDTO dto;
   
   public DavinLogin() {
      super("회원가입창");
      setBounds(0, 0, 750, 1000);
      setLayout(null);
      
      Font font = new Font("Jokerman",Font.ITALIC,20);
      Font font1 = new Font("Jokerman",Font.ITALIC,10);
      
////////////////////////////////////////////////////////////////////////////////
      
      lb[0] = new JLabel("JOIN");
      lb[0].setFont(font);
      lb[0].setBounds(140, 25, 100, 50);
      lb[0].setBackground(new Color(255,255,0));
      lb[0].setOpaque(false);
      lb[0].setHorizontalAlignment(JLabel.CENTER);
      add(lb[0]);
      
      
      
      lb[1] = new JLabel("ID*");
      lb[1].setFont(font1);
      lb[1].setBounds(70, 100, 100, 20);
      lb[1].setBackground(new Color(255,255,0));
      lb[1].setOpaque(false);
      add(lb[1]);
      

      lb[2] = new JLabel("PASSWORD*");
      lb[2].setFont(font1);
      lb[2].setBounds(50, 150, 100, 20);
      lb[2].setBackground(new Color(255,255,0));
      lb[2].setOpaque(false);
      add(lb[2]);
      
      lb[3] = new JLabel("PASSWORD*");
      lb[3].setFont(font1);
      lb[3].setBounds(50, 200, 100, 20);
      lb[3].setBackground(new Color(255,255,0));
      lb[3].setOpaque(false);
      add(lb[3]);
      
      lb[4] = new JLabel("PHONE*");
      lb[4].setFont(font1);
      lb[4].setBounds(50, 250, 100, 20);
      lb[4].setBackground(new Color(255,255,0));
      lb[4].setOpaque(false);
      add(lb[4]);
      
      lb[5] = new JLabel("NAME*");
      lb[5].setFont(font1);
      lb[5].setBounds(50, 300, 100, 20);
      lb[5].setBackground(new Color(255,255,0));
      lb[5].setOpaque(false);
      add(lb[5]);
      
      lb[6] = new JLabel("BIRTH*");
      lb[6].setFont(font1);
      lb[6].setBounds(50, 350, 100, 20);
      lb[6].setBackground(new Color(255,255,0));
      lb[6].setOpaque(false);
      add(lb[6]);
////////////////////////////////////////////////////////////////////////////////
      //휴대전화 텍스트 사이 라벨
      
      lb[7] = new JLabel("-");
      lb[7].setBounds(200, 250, 20, 20);
      lb[7].setBackground(new Color(255,255,0));
      lb[7].setOpaque(false);
      add(lb[7]);
      
      lb[8] = new JLabel("-");
      lb[8].setBounds(260, 250, 20, 20);
      lb[8].setBackground(new Color(255,255,0));
      lb[8].setOpaque(false);
      add(lb[8]);
      
      
////////////////////////////////////////////////////////////////////////////////
      //유효성 멘트 라벨
      lb[9] = new JLabel("영문/숫자(12자 이내)");
      lb[9].setBounds(400, 100, 250, 20);
      lb[9].setBackground(new Color(255,255,0));
      lb[9].setOpaque(false);
      add(lb[9]);
      
      lb[10] = new JLabel("영문/숫자/영문+숫자");
      lb[10].setBounds(400, 150, 250, 20);
      lb[10].setBackground(new Color(255,255,0));
      lb[10].setOpaque(false);
      add(lb[10]);
      
      lb[11] = new JLabel("3~4/3~4자리");
      lb[11].setBounds(400, 250, 250, 20);
      lb[11].setBackground(new Color(255,255,0));
      lb[11].setOpaque(false);
      add(lb[11]);

      lb[12] = new JLabel("영문/한글");
      lb[12].setBounds(400, 300, 250, 20);
      lb[12].setBackground(new Color(255,255,0));
      lb[12].setOpaque(false);
      add(lb[12]);
      
      lb[13] = new JLabel("ex)920509");
      lb[13].setBounds(400, 350, 250, 20);
      lb[13].setBackground(new Color(255,255,0));
      lb[13].setOpaque(false);
      add(lb[13]);
      
////////////////////////////////////////////////////////////////////////////////
      //휴대전화 확인 라벨
      
      lb[14] = new JLabel();
      lb[14].setBounds(600, 250, 250, 20);
      lb[14].setForeground(Color.red);
      add(lb[14]);
      
      lb[15] = new JLabel();
      lb[15].setBounds(600, 250, 250, 20);
      lb[15].setForeground(Color.red);
      add(lb[15]);
      
      lb[28] = new JLabel();
      lb[28].setBounds(600, 250, 250, 20);
      add(lb[28]);



////////////////////////////////////////////////////////////////////////////////
      //이름 확인 라벨
      
      lb[16] = new JLabel();
      lb[16].setBounds(600, 300, 250, 20);
      lb[16].setForeground(Color.red);
      add(lb[16]);
      
      lb[17] = new JLabel();
      lb[17].setBounds(600, 300, 250, 20);
      add(lb[17]);
      
////////////////////////////////////////////////////////////////////////////////
      //생일 확인 라벨
      
      lb[18] = new JLabel();
      lb[18].setBounds(600, 350, 250, 20);
      lb[18].setForeground(Color.red);
      add(lb[18]);
      
      lb[19] = new JLabel();
      lb[19].setBounds(600, 350, 250, 20);
      lb[19].setForeground(Color.red);
      add(lb[19]);
      
      lb[31] = new JLabel();
      lb[31].setBounds(600, 350, 250, 20);
      add(lb[31]);
      
////////////////////////////////////////////////////////////////////////////////
      //pw 확인 라벨
      lb[20] = new JLabel();
      lb[20].setBounds(600, 150, 250, 20);
      lb[20].setForeground(Color.red);
      add(lb[20]);
      
      lb[21] = new JLabel();
      lb[21].setBounds(600, 150, 250, 20);
      add(lb[21]);
      
      lb[22] = new JLabel();
      lb[22].setBounds(582, 200, 250, 20);
      lb[22].setForeground(Color.red);
      add(lb[22]);
      
      lb[23] = new JLabel();
      lb[23].setBounds(570, 200, 250, 20);
      add(lb[23]);
      
////////////////////////////////////////////////////////////////////////////////
      //id 확인 라벨
      
      lb[24] = new JLabel();
      lb[24].setBounds(600, 100, 250, 20);
      lb[24].setForeground(Color.red);
      add(lb[24]);
      
      lb[25] = new JLabel();
      lb[25].setBounds(600, 100, 250, 20);
      add(lb[25]);
      
      lb[26] = new JLabel();
      lb[26].setBounds(600, 100, 250, 20);
      lb[26].setForeground(Color.red);
      add(lb[26]);      
      
      lb[27] = new JLabel();
      lb[27].setBounds(600, 100, 250, 20);
      add(lb[27]);
      
      
////////////////////////////////////////////////////////////////////////////////
      //사이 간격 선
      
      bar[0] = new JProgressBar(0, 100);
      bar[0].setBounds(30, 135, 700,1);
      bar[0].setValue(100);
      add(bar[0]);
      
      bar[1] = new JProgressBar(0, 100);
      bar[1].setBounds(30, 185, 700,1);
      bar[1].setValue(100);
      add(bar[1]);
      
      bar[2] = new JProgressBar(0, 100);
      bar[2].setBounds(30, 235, 700,1);
      bar[2].setValue(100);
      add(bar[2]);
      
      bar[3] = new JProgressBar(0, 100);
      bar[3].setBounds(30, 285, 700,1);
      bar[3].setValue(100);
      add(bar[3]);
      
      bar[4] = new JProgressBar(0, 100);
      bar[4].setBounds(30, 335, 700,1);
      bar[4].setValue(100);
      add(bar[4]);
      
      
////////////////////////////////////////////////////////////////////////////////
      
      //id 텍스트
      ta[0] = new JTextField();
      ta[0].setBounds(150, 100, 150, 20);
      add(ta[0]);
      //휴대전화 텍스트1
      ta[1] = new JTextField();
      ta[1].setBounds(210,250,50,20);
      add(ta[1]);
      //휴대전화 텍스트2
      ta[2] = new JTextField();
      ta[2].setBounds(270,250,50,20);
      add(ta[2]);
      //휴대 전화 텍스트3
      ta[5] = new JTextField();
      ta[5].setBounds(150,250,50,20);
      add(ta[5]);
      
      //이름 텍스트
      ta[3] = new JTextField();
      ta[3].setBounds(150,300,150,20);
      add(ta[3]);
      //생년월일 텍스트
      ta[4] = new JTextField();
      ta[4].setBounds(150,350,150,20);
      add(ta[4]);
      //pw 필드
      pwarea = new JPasswordField();
      pwarea.setBounds(150, 150, 150, 20);
      add(pwarea);
      //pw 확인 필드
      pwarea1 = new JPasswordField();
      pwarea1.setBounds(150, 200, 150, 20);
      add(pwarea1);
      
      
////////////////////////////////////////////////////////////////////////////////
      
      //id 확인버튼
      btn[0] = new JButton("확인");
      btn[0].setBounds(310, 100, 60, 20);      
      add(btn[0]);
      //pw 확인버튼
      btn[1] = new JButton("확인");
      btn[1].setBounds(310, 200, 60, 20);      
      add(btn[1]);
      
      //전화 확인버튼
      btn[2] = new JButton("확인");
      btn[2].setBounds(330, 250, 60, 20);      
      add(btn[2]);
      
      //이름 버튼
      btn[3] = new JButton("확인");
      btn[3].setBounds(310, 300, 60, 20);      
      add(btn[3]);
      //생일 버튼
      btn[4] = new JButton("확인");
      btn[4].setBounds(310, 350, 60, 20);      
      add(btn[4]);
      
      //엔드 버튼
      btn[7] = new JButton("완료");
      btn[7].setBounds(150, 400, 100, 30);      
      add(btn[7]);
      
      //회원가입 버튼
      btn[9] = new JButton("회원가입");
      btn[9].setBounds(300, 400, 100, 30);      
      btn[9].setEnabled(false);
      add(btn[9]);
      
      

      
      
////////////////////////////////////////////////////////////////////////////////
      
   
      btn[0].addActionListener(new IdAction());
      
      btn[1].addActionListener(new PwAction());
      
      btn[2].addActionListener(new PhoneAction());
      
      btn[3].addActionListener(new NameAction());
      
      btn[4].addActionListener(new BirthAction());
      
      
      btn[7].addActionListener(new EndAction());
      
      btn[9].addActionListener(new JoinAction());
      
      setResizable(false);
      setVisible(true);
      
      
      bg = new ImageIcon("gameimg/배경3.png");
       lb[29] = new JLabel(bg);      
       lb[29].setBackground(new Color(255,255,255));
       lb[29].setOpaque(false);
       lb[29].setBounds(-45, 200, 800, 521);      
        add(lb[29]);
        
        bg1 = new ImageIcon("gameimg/배경2_1.png");
        lb[30] = new JLabel(bg1);      
        lb[30].setBackground(new Color(255,255,255));
        lb[30].setOpaque(false);
        lb[30].setBounds(530, 10, 200, 70);      
        add(lb[30]);
      
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
   }
   
////////////////////////////////폰 버튼 액션///////////////////////////////////////
   
   class PhoneAction implements ActionListener{
      
      
      
      public void actionPerformed(ActionEvent e) {
    	  
		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
                                        
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  
		  
         String str = ta[2].getText(); // 내가 입력하는 번호 마지막
         String str1 = ta[1].getText(); // 내가 입력하는 번호 가운데
         String str2 = ta[5].getText(); // 010
                  
         
         PlayerInfoDTO ddd = new PlayerInfoDAO().detail3(str2+str1+str);

         String ddd_num1;
         String ddd_num2;
         String ddd_num_1;
         String ddd_num_2;
         
         
         
         
         if(new PlayerInfoDAO().detail3(str2+str1+str)!=null) {
         
         ddd_num1 = ddd.getTel().substring(3,6); //가운데 
         
         ddd_num2 = ddd.getTel().substring(3,7); //가운데
         
         ddd_num_1 = ddd.getTel().substring(6,10); //마지막
         
         ddd_num_2 = ddd.getTel().substring(7,11); //마지막

         
         if(!ta[1].getText().equals("") && !ta[2].getText().equals("") &&
               !ta[5].getText().equals("")) {
            
            if(!( Pattern.matches("^[0-9]{3,4}$", str) &&
               Pattern.matches("^[0-9]{3,4}$", str1) && 
               Pattern.matches("^[0-9]{3,4}$", str2) )) {
               
               remove(lb[28]);
               lb[14].setText("형식이 틀렸습니다.");
               ta[1].setText(null);
               ta[2].setText(null);
               ta[5].setText(null);
               
            } else {
               if( 
                     
                     (str1.equals(ddd_num1) && str.equals(ddd_num_1)) ||
                     (str1.equals(ddd_num2) && str.equals(ddd_num_2))
                     
                     ) {

               remove(lb[14]);
               lb[15].setText("번호 중복입니다.");
               ta[1].setText(null);
               ta[2].setText(null);
               ta[5].setText(null);
                  
               } 
                  
            }
         }
      } else if(new PlayerInfoDAO().detail3(str2+str1+str)==null) {
            
            if(!ta[1].getText().equals("") && !ta[2].getText().equals("") &&
                  !ta[5].getText().equals("")) {
               
               if(!( Pattern.matches("^[0-9]{3,4}$", str) &&
                  Pattern.matches("^[0-9]{3,4}$", str1) && 
                  Pattern.matches("^[0-9]{3,4}$", str2) )) {
                  
                  remove(lb[28]);
                  lb[14].setText("형식이 틀렸습니다.");
                  ta[1].setText(null);
                  ta[2].setText(null);
                  ta[5].setText(null);
                  
               } else {
                  
                  remove(lb[14]);
                  remove(lb[15]);
               lb[28].setText("확인 되었습니다.");
               btn[2].setEnabled(false);
               ta[1].setEnabled(false);
               ta[2].setEnabled(false);
               ta[5].setEnabled(false);      
                  
               }
            }
         
         }
   }
}
         

   
///////////////////////////////생일 버튼 액션///////////////////////////////////////
   
   
   class BirthAction implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {

		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
              
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  
		  
         String str = ta[4].getText();
         
         
         
         if(!ta[4].getText().equals("")) {
            if(!Pattern.matches("^[0-9]{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|[3][01])$", str)) {
               lb[18].setText("형식이 틀렸습니다.");
               ta[4].setText(null);
            } else {
               
            
            try {
               
               
               SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
               Date day = sdf.parse(str);
               String test = sdf.format(day);                   
               
                         if(str.equals(test)) {
                            remove(lb[19]);
                              lb[31].setText("확인 되었습니다.");
                              btn[4].setEnabled(false);
                              ta[4].setEnabled(false);
                     
                           } else {
                              remove(lb[18]);
                              lb[19].setText("형식이 틀렸습니다.");
                              ta[4].setText(null);
                              
                           }

            } catch (ParseException e1) {
                
               
                  e1.printStackTrace();
               }
            }
         }
      }
   }
   
   
/////////////////////////////이름 버튼 액션/////////////////////////////////////////
   
   
   
   class NameAction implements ActionListener{
      
      
      public void actionPerformed(ActionEvent e) {
         
		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
              
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  
         
         String str = ta[3].getText();
         
         
         
         if(!ta[3].getText().equals("")) {
         
         if(!Pattern.matches("^[가-힣]*$|^[a-zA-Z]*$", str)) {
         
            lb[16].setText("형식이 틀렸습니다.");
            ta[3].setText(null);
         } else {
            
            remove(lb[16]);
            lb[17].setText("확인 되었습니다.");
            btn[3].setEnabled(false);
            ta[3].setEnabled(false);
            }
         }
   
      }
   }
   
   
////////////////////////////완료 버튼 액션//////////////////////////////////////////
   
   
   
   class EndAction implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         
		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
              
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  
         
         String [] txt = {ta[0].getText(),ta[1].getText(),ta[2].getText(),ta[3].getText(),ta[4].getText()};
         
         
         if(!txt[0].equals("") && !txt[1].equals("") && !txt[2].equals("") && !txt[3].equals("") && !txt[4].equals("")
               && !new String(pwarea.getPassword()).equals("")   && !new String(pwarea1.getPassword()).equals("")
               ) {
            
            btn[9].setEnabled(true);
            
            } else {
               
               btn[9].setEnabled(false);
            }
         }      
      }
   
///////////////////////////////아이디 중복 확인 액션//////////////////////////////////
   
    class IdAction implements ActionListener{ //인터페이스
       
         @Override //Action
         public void actionPerformed(ActionEvent e) {
           
		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
              
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  
          
        if(!ta[0].getText().equals("")) {
            
            if(!Pattern.matches("^[0-9a-zA-Z]{1,13}$", ta[0].getText())) {
                  lb[24].setText("형식이 틀렸습니다.");
                  ta[0].setText(null);
                  
                  
            } else {
            

               PlayerInfoDTO dto = new PlayerInfoDTO(ta[0].getText());
             
             
                if(new PlayerInfoDAO().detail(dto.id)==null) {

                       remove(lb[24]);
                        remove(lb[25]);
                        remove(lb[26]);
                        lb[27].setText("확인 되었습니다.");
                        ta[0].setEnabled(false);
                        btn[0].setEnabled(false);
   
                } else if(new PlayerInfoDAO().detail(dto.id)!=null){
                        
                        remove(lb[24]);
                          remove(lb[25]);
                          lb[26].setText("아이디 중복입니다.");
                          ta[0].setText(null);
                       
                   }
               }

          }
       }
     }

//////////////////////////////////패스워드 확인 액션/////////////////////////////////
   
   class PwAction implements ActionListener{
      
      
         
      @Override
      public void actionPerformed(ActionEvent e) {
         
		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
              
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  

         String str = new String(pwarea.getPassword());
         
         if(!str.equals("")) {
            
             if(!Pattern.matches("^[0-9a-zA-Z]*$", str)){
                
                lb[20].setText("형식이 틀렸습니다.");
                pwarea.setText(null);
                
             } else {
                remove(lb[20]);
                lb[21].setText("올바른 형식입니다.");
             
                //패스워드 확인 검사
                if(!new String(pwarea.getPassword()).equals(new String(pwarea1.getPassword()))) {
                  lb[22].setText("비밀번호가 맞지 않습니다.");
                  pwarea1.setText(null);
                  
               } else {
                  remove(lb[22]);
                  lb[23].setText("비밀번호가 확인 되었습니다.");
                  btn[1].setEnabled(false);
                  pwarea.setEnabled(false);
                  pwarea1.setEnabled(false);
                  
                  
               }
             }
          
         }
      }
   }
      

//////////////////////////////////회원가입 버튼 액션/////////////////////////////////
   
   //빈칸 다 채울시 회원가입 버튼 사용 가능    


   class JoinAction implements ActionListener{
      @Override
      public void actionPerformed(ActionEvent e) {    
    	  
		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
              
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  
                  
         String pw = new String(pwarea.getPassword());
                  
         PlayerInfoDTO dto =new PlayerInfoDTO();
            
            dto = new PlayerInfoDTO(
                  ta[3].getText(), //이름
                  ta[0].getText(), //id
                  pw,
                  ta[4].getText(), //생년월일
                  ta[5].getText()+ta[1].getText()+ta[2].getText()
                  //휴대전화 			//
                  );

      
            new PlayerInfoDAO().insert(dto);
            
            System.out.println(dto);
            
            setVisible(false);
            
         }
      }


}