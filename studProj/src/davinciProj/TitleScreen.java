package davinciProj;

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

public class TitleScreen extends JFrame {

	private static final long serialVersionUID = 1L;

	ImageIcon img = new ImageIcon("gameimg/backgroundimg (6).png");
	ImageIcon img2 = new ImageIcon("gameimg/logo2.gif");
	JLabel a1 = new JLabel(img2);
	JLabel jl = new JLabel(img);
	JButton btn = new JButton("click to start");

	public TitleScreen() {
		super("달려라!! 고대파충류!!");
		setBounds(50, 10, 1000, 800);
		setLayout(null);
		
		  try {
              AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/058_등장신(트랜스포머)1.wav"));
              
              Clip clip = AudioSystem.getClip();
              clip.stop();
              clip.open(ais);
              
              clip.start();         
              
           } catch (Exception e2) {
              
           }  

		a1.setBounds(150, 150, 700, 250);

		add(a1);
		jl.setBounds(0, 0, 1000, 800);
		add(jl);

		btn.setBounds(400, 500, 200, 100);
		add(btn);

		btn.addActionListener(new BtnAction());

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	

	}

	class BtnAction implements ActionListener {

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
			new LoginFrame2();
			dispose();
		}

	}

	// 다른 패키지의 클래스 불러오는 메소드

	public static void main(String[] args) {
		new TitleScreen();
	}

}
