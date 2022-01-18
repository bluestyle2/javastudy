package davinciProj;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DinoManual extends JFrame implements ActionListener {

   public DinoManual() {
      super("플레이 메뉴얼");

      setBounds(100, 100, 815, 630); // 전체창 크기

      getContentPane().setBackground(new Color(255, 255, 255)); // 전체창 색깔

      setLayout(null);

      ImageIcon img = new ImageIcon("gameimg/manual.png");
      JLabel p1 = new JLabel(img);
      p1.setBounds(0, 0, 800, 600);
      add(p1);

      JButton a1 = new JButton();
      a1.setBounds(0, 0, 815, 630);
      add(a1);
      a1.setOpaque(false);

      setVisible(true);

      a1.addActionListener(new ActionListener() {

         public void actionPerformed(ActionEvent e) {

         
            dispose();

         }
      });
   }

   @Override
   public void actionPerformed(ActionEvent e) {

   }
}