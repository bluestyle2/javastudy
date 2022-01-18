package swing_p;

import java.awt.Color;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class ComponentMain extends JFrame {
	
	
	
	JButton b2 = new JButton("버튼2");
	
	public ComponentMain() {
		super("제이프레임이지");	
		System.out.println("기본생성자");
		//width,height
//		setSize(800, 500);
		
//					//x,y
//		setLocation(200, 300);
		setBounds(200, 300, 900, 700);		
		setLayout(null);
		
		JButton b1 = new JButton("버튼이지롱");
		b1.setBounds(50, 50, 100, 50);		
		add(b1);
		
		b2.setSize(100, 50);
		b2.setLocation(180, 50);
		//b2.setBounds(180, 50, 100, 50);		
		add(b2);
		
		JButton lb = new JButton("PW:");
		lb.setBounds(50, 120, 100,50);
		lb.setBackground(new Color( 	255, 255,  0 , 100 ));
		lb.setOpaque(true);	  	 //Red,Green, Blue ,alpha
		add(lb);
		
		ImageIcon img = new ImageIcon("fff/코딩중중중침팬지.jpg");
		JButton b3 = new JButton(img);
		b3.setBounds(50, 100, 200, 200);		
		add(b3);
		
		JButton b4 = new JButton("버튼이지롱");
		b4.setBackground(Color.pink);
		b4.setForeground(Color.yellow);
		b4.setBounds(50, 330, 100, 50);		
		add(b4);
		
		
		
		JToggleButton tb1 = new JToggleButton("토글1");
		JToggleButton tb2 = new JToggleButton("토글2", true);
		JToggleButton tb3 = new JToggleButton("토글3");
		tb1.setBounds(50, 400, 100, 50);
		tb2.setBounds(150, 400, 100, 50);
		tb3.setBounds(250, 400, 100, 50);
		add(tb1);
		add(tb2);
		add(tb3);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(tb1);
		bg.add(tb2);
		bg.add(tb3);
		
		Vector<String>email = new Vector<String>();
		email.add("네이버");
		email.add("다음");
		email.add("구글");
		email.add("야후");
		
		JComboBox box = new JComboBox(email);
		box.setBounds(50, 480, 100, 50);
		box.setSelectedItem("구글");
		add(box);
		
		JRadioButton rb1 = new JRadioButton("남자");
		JRadioButton rb2 = new JRadioButton("여자");
		JRadioButton rb3 = new JRadioButton("IT인", true);
		
		rb1.setBounds(50, 550, 50, 50);
		rb2.setBounds(100, 550, 50, 50);
		rb3.setBounds(150, 550, 50, 50);
		add(rb1);
		add(rb2);
		add(rb3);
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		
		JCheckBox cb1 = new JCheckBox("음악");
		JCheckBox cb2 = new JCheckBox("독서");
		JCheckBox cb3 = new JCheckBox("코딩",true);
		cb1.setBounds(50, 610, 50, 50);
		cb2.setBounds(100, 610, 50, 50);
		cb3.setBounds(150, 610, 50, 50);
		
		add(cb1);
		add(cb2);
		add(cb3);
		
		String [] arr = {"의사","판사","왜사","안사","장의사","못사","사사",};
		
		JList<String> list = new JList<String>(arr);
		list.setBounds(250, 480, 100, 150);
		add(list);
		
		JLabel lb1 = new JLabel("ID:");
		lb1.setBounds(500, 50, 100,50);
		lb1.setBackground(new Color(120,225,130));
		lb1.setOpaque(true);
		add(lb1);
		
		JTextField id = new JTextField();
		id.setBounds(630, 50, 150, 50);
		add(id);
		
		
		JLabel lb2 = new JLabel("PW:");
		lb2.setBounds(550, 120, 100,50);
		lb2.setBackground(new Color( 	255, 225,  0 , 100 ));
		lb2.setOpaque(true);	  	 //Red,Green, Blue ,alpha
		add(lb2);
		
		JPasswordField pw = new JPasswordField();
		pw.setBounds(630, 120, 150, 50);
		add(pw);
		JProgressBar bar = new JProgressBar(0, 100);
		bar.setBounds(550, 180, 300, 50);
		bar.setValue(30);
		add(bar);
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 100,200,150);
		slider.setBounds(550, 240, 300, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		add(slider);
		
		Object [][] data = {
				{"현빈",87,88,81},
				{"원빈",57,58,51},
				{"젤리빈",97,98,91},
				{"커피빈",67,68,61},
				{"장희빈",77,78,71}
				
		};
		
		String [] title = {"이름","국어","영어","수학"};
		
		JTable table = new JTable(data, title);
		//table.setBounds(550, 350, 300, 200);
		//add(table);
		
		JScrollPane sp1 = new JScrollPane(table);
		sp1.setBounds(550, 350, 300, 150);
		add(sp1);
		//JFrame > sp1 > table > (data, title)
		
		JTextArea area = new JTextArea("안냐세요");
		//area.setBounds(550, 510, 300, 100);
		//add(area);
		
		JScrollPane sp2 = new JScrollPane(area);
		sp2.setBounds(550, 510, 300, 100);
		add(sp2);
		
		setVisible(true);
		
		//창닫기 버튼 눌렀을때 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
		void b2Move() {
		System.out.println("b2Move");
		
		for (int i = 180; i < 700; i+=3) {
			try {
				Thread.sleep(30);
				//System.out.println(i);
				
				b2.setLocation(i, 50);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
	
	public static void main(String[] args) {
		
		ComponentMain cm = new ComponentMain();
		
		//cm.b2Move();
	}

}
