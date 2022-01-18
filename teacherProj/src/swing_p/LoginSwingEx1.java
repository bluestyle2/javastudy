
package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



/*
 * 1. 로그인 화면
 * 
 * 2. 

 */

class LoginData{
      
      String id, pw, name;

      public LoginData(String id, String pw, String name) {
         super();
         this.id = id;
         this.pw = pw;
         this.name = name;
      }

      @Override
      public String toString() {
         return "LoginData [id=" + id + ", pw=" + pw + ", name=" + name + "]";
      }
      
   }


public class LoginSwingEx1 extends JFrame implements ActionListener {
   
   
   JButton b1 = new JButton("확인");
   
   ArrayList<LoginData> arr = new ArrayList<LoginData>();
   
   String id;
   JTextField f1;
   JTextField f2;
   JLabel res = new JLabel("결과 :");
   
   public LoginSwingEx1() {
       super("로그인");
      setBounds(100,50,500,500);
      setLayout(null);
      
         LoginData [] mems = {
                 new LoginData("aa", "1111", "이효리"),
                 new LoginData("bb", "2222", "삼효리"),
                 new LoginData("cc", "3333", "사효리"),
                 new LoginData("dd", "4444", "오효리"),
                 new LoginData("ee", "5555", "육효리")
           };
      
      for(LoginData st : mems) {
         arr.add(st);
      }
      
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      
      Font ft = new Font("Serif", Font.ITALIC + Font.BOLD, 30);   
      Font ft2 = new Font("Serif", Font.PLAIN, 30);   
      
      JLabel l1 = new JLabel("Log In");
      l1.setBounds(180, 30, 100, 100);
      l1.setFont(ft);         
      add(l1);
      
      
      JLabel idl = new JLabel("아이디 :");
      idl.setBounds(80, 150, 50, 20);
      add(idl);
      
   
      f1 = new JTextField();      
      f1.setBounds(150, 150, 200, 20);
      add(f1);
      
      
      JLabel pwl = new JLabel("비밀번호 :");
      pwl.setBounds(80, 180, 90, 20);
      add(pwl);
      
      f2 = new JTextField();       
      f2.setBounds(150, 180, 200, 20);
      add(f2);
      
      
      
      b1.addActionListener(this);
      b1.setBounds(100, 230, 250, 40);
      b1.setBackground(new Color(5,0,153));
      b1.setForeground(new Color(255,255,255));
      b1.setFont(ft2);   
      add(b1);
      
      
      res.setBounds(100, 280, 200, 20);
      add(res);
            
      
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      System.out.println("로그인 시도");
      System.out.println("입력한 아이디:" + f1.getText());
      System.out.println("입력한 비밀번호:" + f2.getText());
      
      for(LoginData arr1 : arr) {

         if(f1.getText().equals(arr1.id) && f2.getText().equals(arr1.pw)){         
               
               res.setText("결과 : " + arr1.name + "님, 로그인 성공");            
               break;            

         } else {         
            res.setText("결과 : "+ "불일치");
         }
      }
   }   

   public static void main(String[] args) {
      new LoginSwingEx1();

   }
}