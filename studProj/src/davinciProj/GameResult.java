package davinciProj;

import java.awt.Color;
import java.awt.Font;
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

public class GameResult extends JFrame {
	
	String id;
	int jelly;
	int dino;
	ImageIcon img1 = new ImageIcon("gameimg/gameres.png"); 
	String j ="";
	PlayerInfoDTO dto;
	
	public GameResult(String id, int jellyNum, int dino) {		
		super("달려라!! 고대파충류!!");
		this.id = id;
		this.j = Integer.toString(jellyNum);
		this.jelly = jellyNum;
		this.dino = dino;
		
		dto = new PlayerInfoDTO();
		dto.setId(id);
		dto.setJelly(jellyNum);
		new PlayerInfoDAO().modify2(dto);
		
		
		setBounds(305, 150, 400, 250);
		setLayout(null);
		
		JLabel title = new JLabel("게임종료");
		title.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setBounds(50, 20, 300, 50);
		title.setBackground(new Color(255,255,255));
		title.setOpaque(true);
		add(title);
		
		JLabel jellyTot = new JLabel(j + " 젤리");
		jellyTot.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		jellyTot.setBounds(200, 100, 80, 30);
		jellyTot.setForeground(Color.BLUE);
		jellyTot.setOpaque(false);
		add(jellyTot);
		
		JLabel jellyRes = new JLabel("   게임결과 :");		
		jellyRes.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		jellyRes.setBounds(100, 100, 180, 30);
		jellyRes.setBackground(new Color(255,255,255, 180));
		jellyRes.setForeground(Color.BLUE);
		jellyRes.setOpaque(true);
		add(jellyRes);
		
		
		JButton endBt = new JButton("확인");
		endBt.setBounds(160, 150, 60, 30);
		endBt.addActionListener(new BtnAction());
		add(endBt);
		
		
		JLabel background = new JLabel(img1);
		background.setBounds(0, 0, 400, 250);
		background.setOpaque(true);
		add(background);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class BtnAction implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
		     try {
		         AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/085_마우스클릭.wav"));

		         
		         Clip clip = AudioSystem.getClip();
		         clip.stop();
		         clip.open(ais);
		         
		         clip.start();         
		     	System.out.println("클릭!");
		      } catch (Exception e2) {
		         
		      }
		     dispose();
		     new LobbyRun(id, dino);
		   }
		
			
		}
			
/*
	public static void main(String[] args) {
		new GameResult("SungYun",50, 2);

	}
*/
}
