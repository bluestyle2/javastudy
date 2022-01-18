package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontMain extends JFrame {

	public FontMain() {
		super("글꼴");
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		Font [] arr = ge.getAllFonts();
		
		for (Font font : arr) {
			System.out.println(font.getFontName());
		}
					
		setBounds(100,100,1600,500);
		
		Font [] ff = {
				new Font("Serif", Font.PLAIN, 20),
				new Font("Serif", Font.BOLD, 20),
				new Font("Serif", Font.ITALIC, 20),
				new Font("Serif", Font.BOLD+Font.ITALIC, 20),
				new Font("맑은 고딕", Font.PLAIN, 20),
				new Font("맑은 고딕", Font.PLAIN, 40),
				new Font("맑은 고딕", Font.PLAIN, 60),
				new Font("맑은 고딕", Font.PLAIN, 20),
				
				
		};
		
		
		setLayout(new GridLayout(ff.length,1));
		
		for (Font font : ff) {
			JLabel lb = new JLabel("선생님은 귀여워요 QWER qwer 1234567890 !@#$");
			lb.setFont(font);
			add(lb);
		}
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FontMain();
	}

}
