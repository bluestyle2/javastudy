package homework_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;



/*
 *  국어 문제 다 풀고 확인을 누르면 ActionListener로 다음문제로 넘어가게하려고하는데 풀었던 문제를 
 *  setText로 바꿔치기하거나 또는 문제를 삭제하고 다시 하려고했지만 실패했습니다..
 * 
 * 
 */
public class Study18 extends JFrame {

	
	JLabel report = new JLabel("점수 : ");
	JButton clear = new JButton("제출");
	
	
	int lantot;
	int engtot;
	int mathtot;
	int time = 20;
		
	
	class Timer extends Thread{
		
		public void run() {
			
			for (time = 20; time>=0; time--) {
				try {
					sleep(1000);
					//미정.setText("time : " + time);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public Study18() {
		
		super("시험과제");
		ArrayList<JRadioButton> lanque1 = new ArrayList<JRadioButton>();
		ArrayList<JRadioButton> lanque2 = new ArrayList<JRadioButton>();
		ArrayList<JRadioButton> lanque3 = new ArrayList<JRadioButton>();
		ArrayList<JRadioButton> lanque4 = new ArrayList<JRadioButton>();
		
		
		
		setBounds(100, 50, 800, 900);
		setLayout(new GridLayout(23,2));
		
	//	add(new JLabel("1. 광복절의 날짜는?"))
		
	//	JRadioButton lanlist1 = new JRadioButton();
	//  add(new JRadioButton("8월 15일") );
		
		add(new JLabel("1. 광복절의 날짜는?"));
		
		ButtonGroup chain1 = new ButtonGroup();
		
		for(String str : "8월 15일,7월15일,5월15일,6월15일".split(",")) {
			JRadioButton list1 = new JRadioButton(str);
			lanque1.add(list1);
			add(list1);
			
			chain1.add(list1);
		}
		
		add(new JLabel("2. 조선최고의 명의는?"));
		
		ButtonGroup chain2 = new ButtonGroup();
		
		for(String str : "허균,허순,허허,허준".split(",")) {
			JRadioButton list2 = new JRadioButton(str);
			lanque2.add(list2);
			add(list2);
			
			chain2.add(list2);
		}
		
		add(new JLabel("3.「쓴 것이 다하면 단 것이 온다」라는 뜻으로, 고생(苦生) 끝에 낙이 온다라는 말?"));
		
		ButtonGroup chain3 = new ButtonGroup();
		
		for(String str : "개옹지마,술이쓰다,고진감래,코딩조아".split(",")) {
			JRadioButton list3 = new JRadioButton(str);
			lanque3.add(list3);
			add(list3);
			
			chain3.add(list3);
		}
		
		add(new JLabel("4. 한글날의 날짜는?"));
		
		ButtonGroup chain4 = new ButtonGroup();
		
		for(String str : "4월5일,10월9일,5월8일,12월6일".split(",")) {
			JRadioButton list4 = new JRadioButton(str);
			lanque4.add(list4);
			add(list4);
			
			chain2.add(list4);
		}
		
		add(clear);
		add(report);
		clear.addActionListener(new Lannext());
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class Lannext implements ActionListener{
		
		ArrayList<JRadioButton> engque2 = new ArrayList<JRadioButton>();
		ArrayList<JRadioButton> engque3 = new ArrayList<JRadioButton>();
		ArrayList<JRadioButton> engque4 = new ArrayList<JRadioButton>();
		
		JRadioButton lanque1 = new JRadioButton();
		
		
			@Override
		public void actionPerformed(ActionEvent e) {
				ArrayList<JRadioButton> engque1 = new ArrayList<JRadioButton>();
				report.setText("점수 : ");
			//	 lanque1.setText("apple,banana,stawberry,pineapple".split(","));
				
				
			//	for(String ss : "apple,banana,strawberry,pineapple".split(",")) {
			//		JRadioButton list1 = new JRadioButton(ss);
			//		engque1.add(list1);
			//		add(list1);
				
				lanque1.remove(lanque1);	
			
			for(String ss : "apple,banana,strawberry,pineapple".split(",")) {
				JRadioButton list1 = new JRadioButton(ss);
				engque1.add(list1);
				add(list1);
				
				}
				
		}
	
	}

		
	public static void main(String[] args) {
		
		new Study18();

	}

}
