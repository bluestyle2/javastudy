package swing_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventMain extends JFrame {

	public EventMain() {
		setBounds(0,0,300,200);
		setLayout(null);		
		
		JButton btn = new JButton("눌러바");
		btn.setBounds(100,100,100,50);
		add(btn);
		
		res = new JLabel("횟수 : "+cnt);
		res.setBounds(100,10,100,50);
		add(res);
		
		//btn :: 이벤트 소스
		//addActionListener :: 이벤트리스너
		btn.addActionListener(new BtnAction());
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	JLabel res;
	int cnt = 0;
	
	class BtnAction implements ActionListener{

		@Override	//action
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("눌렀다");
			cnt++;
			res.setText("횟수 : "+cnt);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventMain();
	}

}
