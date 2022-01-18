package swing_p;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuPrisellMe extends JFrame {

	public MenuPrisellMe() {
		
		super("프리셀");
		setBounds(200,100,500,400);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu m1 = new JMenu("게임(G)");
		JMenu m2 = new JMenu("도움말(H)");
		
		bar.add(m1);
		bar.add(m2);
		
		JMenuItem m1_1 = new JMenuItem("새 게임(N)");
		JMenuItem m1_2 = new JMenuItem("게임 선택(G)...");
		JMenuItem m1_3 = new JMenuItem("실행 취소(U)");
		JMenuItem m1_4 = new JMenuItem("힌트(H)...");
//		JMenuItem m1_4 = new JMenuItem("통계(S)");
//		JMenuItem m1_4 = new JMenuItem("옵션(O)");
//		JMenuItem m1_4 = new JMenuItem("모양 변경(A)");
//		JMenuItem m1_4 = new JMenuItem("끝내기(X)");
		
		KeyStroke newg = KeyStroke.getKeyStroke(KeyEvent.VK_F2, KeyEvent.KEY_LOCATION_NUMPAD);
		m1_1.setAccelerator(newg);
		
		m1.add(m1_1);
		m1.add(m1_2);
		m1.addSeparator();
		m1.add(m1_3);
		m1.add(m1_4);
		m1.addSeparator();
		
		
		setJMenuBar(bar);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuPrisellMe();
	}

}
