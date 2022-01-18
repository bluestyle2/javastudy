package swing_p;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutMain {

	public static void main(String[] args) {
		
		JFrame f1 = new JFrame("Border");
		f1.setBounds(0,0,300,200);
		f1.setLayout(new BorderLayout());
		
		f1.add(new JButton("위")  , "North"  );
		f1.add("South",new JButton("아래"));
//		f1.add("East",new JButton("오른쪽"));
		f1.add("West",new JButton("왼쪽"));
		f1.add("Center",new JButton("가운데"));
		
		
		f1.setVisible(true);
		
		JFrame f2 = new JFrame("Flow");
		f2.setBounds(300,0,300,200);
		//f2.setLayout(new FlowLayout(FlowLayout.RIGHT, 0,0));
		f2.setLayout(new FlowLayout(FlowLayout.RIGHT, 50,10));
		
		for (int i = 0; i < 10; i++) {
			f2.add(new JButton("버튼"+i));
		}
		
		f2.setVisible(true);
		
		JFrame f3 = new JFrame("Flow");
		f3.setBounds(600,0,300,200);
		
		f3.setLayout(new GridLayout(4,2, 100,20));
		
		for (int i = 0; i < 8; i++) {
			f3.add(new JButton("버튼"+i));
		}
		
		f3.setVisible(true);
		
		JFrame f4 = new JFrame("Box");
		f4.setBounds(900,0,300,200);
		
		f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.Y_AXIS));
		
		for (int i = 0; i < 8; i++) {
			f4.add(new JButton("버튼"+i));
		}
		
		f4.setVisible(true);
		
		
		JFrame f5 = new JFrame("Card");
		f5.setBounds(0,200,300,200);
		
		CardLayout card = new CardLayout();
		f5.setLayout(card);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(255,0,0));
		f5.add(p1, "rr");
		
		JPanel p2 = new JPanel();
		p2.setBackground(new Color(255,255,0));
		f5.add(p2, "yy");
		
		JPanel p3 = new JPanel();
		p3.setBackground(new Color(0,0,255));
		f5.add(p3, "bb");
		
		card.show(f5.getContentPane(), "yy");
		
		f5.setVisible(true);
		
		while(true) {
			
			for (String tt : "rr,yy,bb".split(",")) {
				
				card.show(f5.getContentPane(), tt);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
	}

}
