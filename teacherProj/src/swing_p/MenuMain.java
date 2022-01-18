package swing_p;

import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MenuMain extends JFrame {
	
	public MenuMain() {
		
		super("메뉴바");
		setBounds(200,100,500,400);
		
		
		JMenuBar bar = new JMenuBar();
		
		JMenu m1 = new JMenu("파일");
		JMenu m2 = new JMenu("편집");
		JMenu m3 = new JMenu("보기");
		
		
		ImageIcon co1 = new ImageIcon("fff/cross.png");
		ImageIcon co2 = new ImageIcon("fff/pensel.png");
		
		
		JMenuItem s1_1 = new JMenuItem("새로 만들기",co1);
		JMenuItem s1_2 = new JMenuItem("개로 만들기");
		s1_2.setText("가로만들기");	
		s1_2.setIcon(co2);
		JMenuItem s1_3 = new JMenuItem("소로 만들기");
		
		KeyStroke ks = KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK);
		s1_3.setAccelerator(ks);
		
		m1.add(s1_1);
		m1.add(s1_2);
		m1.add(s1_3);
		m1.addSeparator();
		m1.add(new JMenuItem("종료"));
		
		JMenu s2_1 = new JMenu("속성");
		JMenuItem s2_1_1 = new JMenuItem("인쇄");
		JMenuItem s2_1_2 = new JMenuItem("머리글");
		
		s2_1_1.setEnabled(false); //못누르게 설정
		s2_1_2.setSelected(true);
		
		s2_1.add(s2_1_1);
		s2_1.add(s2_1_2);
		
		m2.add(s2_1);
		
		
		JCheckBoxMenuItem s3_1 = new JCheckBoxMenuItem("안내선");
		JCheckBoxMenuItem s3_2 = new JCheckBoxMenuItem("격자",true);
		s3_2.setSelected(false);
		
		JRadioButtonMenuItem s3_3 = new JRadioButtonMenuItem("데스크탑");
		JRadioButtonMenuItem s3_4 = new JRadioButtonMenuItem("태블릿",true);
		JRadioButtonMenuItem s3_5 = new JRadioButtonMenuItem("핸드폰");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(s3_3);
		bg.add(s3_4);
		bg.add(s3_5);
		
		m3.add(s3_1);
		m3.add(s3_2);
		m3.addSeparator();
		m3.add(s3_3);
		m3.add(s3_4);
		m3.add(s3_5);
		
		
		bar.add(m1);		
		bar.add(m2);		
		bar.add(m3);		
		
		setJMenuBar(bar);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {		
		new MenuMain();
		
	}

}
