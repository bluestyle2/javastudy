package swing_p;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ContainerMain {

	public static void main(String[] args) {
		JFrame f1 = new JFrame("JPanel");
		f1.setBounds(0,0,300,200);
		f1.setLayout(null);
		
		
		JPanel p1 = new JPanel();
		p1.setBounds(10, 10, 100, 100);
		p1.setBackground(new Color(255,255,0));
		
		for (int i = 0; i < 5; i++) {
			p1.add(new JButton("버튼"+i));
		}
		
		f1.add(p1);
		
		JPanel p2 = new JPanel();
		p2.setBounds(120, 10, 100, 100);
		p2.setBackground(new Color(255,200,200));
		
		for (int i = 0; i < 5; i++) {
			p2.add(new JButton("버튼"+i));
		}
		
		f1.add(p2);
		
		f1.setVisible(true);
		
		
		JFrame f2 = new JFrame("JScollPane");
		f2.setBounds(300,0,300,200);
		f2.setLayout(null);
		
		JPanel p3 = new JPanel();
		JScrollPane sp1 = new JScrollPane(p3);
		sp1.setBounds(10,10,100,100);
		
		p3.setBackground(new Color(0,255,255));
		
		for (int i = 0; i < 5; i++) {
			p3.add(new JButton("버튼"+i));
		}
		
		f2.add(sp1);
		
		JPanel p4 = new JPanel();
		p4.setPreferredSize(new Dimension(100,250));
		
		JScrollPane sp2 = new JScrollPane(p4);
		sp2.setBounds(120,10,120,100);
		
		p4.setBackground(new Color(255,0,255));
		
		for (int i = 0; i < 5; i++) {
			p4.add(new JButton("버튼"+i));
		}
		
		f2.add(sp2);
		
		
		f2.setVisible(true);
		
		JFrame f3 = new JFrame("JDialog");
		f3.setBounds(0,200,300,200);
		f3.setLayout(null);
		
		
		
		//true : modal, false : modaless
		JDialog dd = new JDialog(f3, "메세지 창", false);
		dd.setBounds(0,400,300,200);
		dd.setLayout(new FlowLayout());
		dd.add(new JLabel("경고창입니다."));
		dd.add(new JButton("확인"));		
		dd.setVisible(true);
		//f3.add(dd);
		
		f3.setVisible(true);
		
		JFrame f4 = new JFrame("FileJDialog");
		f4.setBounds(300,200,300,200);
		f4.setLayout(null);
				
		f4.setVisible(true);
		
		FileDialog ff = new FileDialog(f4, "파일열기", FileDialog.LOAD);
		ff.setLocation(300,400);
		ff.setDirectory("C:\\Users\\blues\\Desktop\\문서");
		ff.setVisible(true);
		
		System.out.println(ff.getDirectory());
		System.out.println(ff.getFile());
	}

}
