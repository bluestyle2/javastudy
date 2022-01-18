package davinciProj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


class FirstlogGacha extends JFrame implements ActionListener {
	
   JButton rdchBtn;
   ImageIcon gachaimg = new ImageIcon("gameimg/eggimg.png");
   ImageIcon gachaimg2 = new ImageIcon("gameimg/forest.png");
   JLabel fstlgfm = new JLabel(gachaimg2);
   int firstch;   //캐릭터 변수
   
   //-------------------------------------
   
   String name; //이름 받아올 변수
   Font fstfont = new Font("Serif", Font.PLAIN, 20);
   
   public FirstlogGacha(String id, String pw) {
      
      Random r = new Random();
      int rdch = r.nextInt(3) + 1;

      setBounds(300, 300, 700, 500);
      setLayout(null);
      setResizable(false);

      rdchBtn = new JButton(gachaimg);
      rdchBtn.setBounds(250, 150, 170, 200);
      rdchBtn.setBackground(Color.white);
      add(rdchBtn);
      rdchBtn.setOpaque(false);

      JLabel rdchtxt = new JLabel("이 알에서 뭐가 나올까?");
      rdchtxt.setBounds(245, 360, 250, 50);
      rdchtxt.setForeground(Color.WHITE);
      rdchtxt.setFont(fstfont);
      add(rdchtxt);

      JLabel rdchres = new JLabel();
      rdchres.setBounds(248, 400, 250, 50);
      rdchres.setForeground(Color.WHITE);
      rdchres.setFont(fstfont);
      add(rdchres);
      
      add(fstlgfm);
      fstlgfm.setBounds(0, 0, 700, 500);
      
      System.out.println(id+"님이 로그인"); //테스트용
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      
      rdchBtn.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {
            
            
            
         //   PlayerInfoDAO().modify(dto);
         //   dto = new ExamDTO("final","rrr", 22,22,33);
         //   new ExamDAO().modify(dto);
      
            switch (rdch) {
            case 1:
               System.out.println("1번캐릭터를 뽑으셨습니다");
               JOptionPane.showMessageDialog(null, "티라노를가 부화했습니다");
               firstch=1;
               
               break;
               

            case 2:
               System.out.println("2번캐릭터를 뽑으셨습니다.");
               JOptionPane.showMessageDialog(null, "트리케라가 부화했습니다");
               firstch=2;
               break;                  
               
            case 3:
               System.out.println("3번캐릭터를 뽑으셨습니다.");
               JOptionPane.showMessageDialog(null, "브라키오가 부화했습니다");
               firstch=3;
               break;
            }
            
            PlayerInfoDTO dto = new PlayerInfoDAO().detail(id);
            dto = new PlayerInfoDTO(name,id,pw, dto.birth, dto.tel, 0,firstch,50);
            
            int dino = rdch;
            dto.setDino(dino);
            
            
            new PlayerInfoDAO().modify(dto);
            //로비 불러오기
            System.out.println("로비 불러오기");
            dispose();
            
            
            new LobbyRun(dto.id, dto.dino);
            
         }
      });
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
   }
}