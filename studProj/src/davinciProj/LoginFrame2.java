package davinciProj;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * 로그인 클래스 
1. 사용자 ID, PW 입력받기

2.메소드: 유효성 검사
     2-1. 데이터: ID, PW를 가지고 유효성 검사
            - ID:    알파벳 + 숫자 or 알파벳   
            - pw   알파벳 + 숫자  
    2-2. id,pw 확인 멘트 기능
    2-3. 첫 로그인인지 확인하는 기능
3.유효성 검사 일치
     3-1 로그인 성공: 로비로 화면 이동           ○ NEW LOBBY(ID);

4. 유효성 검사 불일치
     4-1 로그인 실패: ID, PW 빈칸으로 변경

5. 회원가입 버튼 클릭
 * 
 * */

public class LoginFrame2 extends JFrame implements ActionListener {


   private static final long serialVersionUID = 1L;
   JPanel loginframe;
   JTextField tfUsername; 
   JPasswordField tfPassword;
   JButton loginBtn, joinBtn;
   ImageIcon loginimg = new ImageIcon("gameimg/backgroundimg (6).png");
   JLabel logintitle = new JLabel(loginimg);
   String moveid;

   public LoginFrame2() {

      setBounds(50, 20, 1000, 800);
      setLayout(null);
      setResizable(false);
      JLabel lblLogin = new JLabel("ID :");
      lblLogin.setBounds(350, 480, 69, 35);
      lblLogin.setForeground(Color.white);
      add(lblLogin);

      JLabel lblPassword = new JLabel("PW :");
      lblPassword.setBounds(350, 520, 69, 35);
      lblPassword.setForeground(Color.white);
      add(lblPassword);

      tfUsername = new JTextField();
      tfUsername.setBounds(410, 480, 176, 35);
      add(tfUsername);
      // tfUsername.setColumns(10); //최대 입력글자수 10으로 설정..?

      tfPassword = new JPasswordField();
      tfPassword.setColumns(10);
      tfPassword.setBounds(410, 520, 176, 35);
      add(tfPassword);
      
      joinBtn = new JButton("회원가입");
      joinBtn.setBounds(485, 580, 100, 40);
      // joinBtn.setBackground(new Color(171, 242, 0));
      joinBtn.setBackground(new Color(18, 102, 255));
      joinBtn.setForeground(Color.white);
      add(joinBtn);

      loginBtn = new JButton("로그인");
      loginBtn.setBounds(380, 580, 100, 40);
      loginBtn.setBackground(new Color(18, 102, 255));
      loginBtn.setForeground(Color.white);
      add(loginBtn);

      add(logintitle);
      logintitle.setBounds(0, 0, 1000, 800);

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);

      loginBtn.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
    	 
		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
                                            
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  

            PlayerInfoDAO dao = new PlayerInfoDAO();

            String user_id = tfUsername.getText(); // user_id에 아이디 넣기
            String user_pw = tfPassword.getText(); // user_pw에 비밀번호 넣기
            PlayerInfoDTO dto = dao.details2(user_id, user_pw);

            // res.setText("결과 : " + arr1.name + "님, 로그인 성공");

            if (dto != null) {
	               JOptionPane.showMessageDialog(null, user_id + " 님 로그인 성공하셨습니다.");
	
	               moveid = tfUsername.getText();
	               // 첫로그인인지 알아내야함..
	               // DB에서 int타입 컬럼의 값으로..? (컬럼의 초기값 1 로그인하면 2)
	               // 로그인을 했을때 해당 로그인의 DB 정보를 로비나 인게임으로..?
	
	               new PlayerInfoDAO().fstLogin(dto);
	
	               if (dto.getFstLogin().equals("1")) {	
	                  new FirstlogGacha(dto.getId(), dto.getPw());
	                  dispose();	                  
	                  
	               }
	               
	               if (dto.getFstLogin().equals("2")) {	                  
	                  System.out.println("로비 불러오기");
	                  dispose();
	                                   
	                  new LobbyRun(dto.id, dto.dino);	                                   
	               }
	               
            } else {
               JOptionPane.showMessageDialog(null, "로그인 실패하셨습니다.");
               tfUsername.setText(null);
               tfPassword.setText(null);
               
            }               
         }
      });
      
      joinBtn.addActionListener(new ActionListener() {

	
		public void actionPerformed(ActionEvent e) {
			
			  try {
	              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));
	                       	              
	              Clip clip = AudioSystem.getClip();
	              clip.stop();
	              clip.open(ais);
	              
	              clip.start();         
	              
	           } catch (Exception e2) {
	              
	           }  
			  
			new DavinLogin();			
		}
    	  
      });
    }
  


   @Override
   public void actionPerformed(ActionEvent e) {
	
   }

}