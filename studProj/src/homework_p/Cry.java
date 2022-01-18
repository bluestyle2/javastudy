package homework_p;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Cry extends JFrame implements ActionListener {
	 JProgressBar bar;
	 JButton j1;
	 JPanel p1;
	 boolean time = true;
	public Cry() {
		
		setLayout(null);
	    setResizable(false);
		setBounds(50,10,1000,800);
		
		
		
		p1 = new JPanel();		
		p1.setBounds(-3000, 0, 8000, 800);
		p1.setLayout(null);
		
		add(p1);	
		int hp = 50;
		
		j1 = new JButton();
		j1.setBounds(500,500,200,200);
		add(j1);
		
		bar = new JProgressBar(0,hp*10);
		bar.setBounds(3010, 10, 300, 50);
		bar.setForeground(new Color(255,0,0));
		bar.setValue(hp*10);
		//bar.setValue(bar.getValue()-1);
		bar.setBorder(null);
		bar.setBackground(new Color(255,255,255,180));
		p1.add(bar);
		
		if(time) {
			bar.setValue(bar.getValue()-50);
		}
		
		
		j1.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hp회복!");
				
				bar.setValue(bar.getValue()+5);
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
void hpLeft() {
		
	
	//	hit();
		
	}
	public static void main(String[] args) throws Exception {
		new Cry();

		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	


}

