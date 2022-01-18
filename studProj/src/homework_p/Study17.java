package homework_p;

import java.awt.Color;
import java.awt.Font;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;



public class Study17 extends JFrame{
	
	
	JButton verify = new JButton("회원가입");
	JButton cancel = new JButton("취소");	
	JButton bar = new JButton("");
	JButton bar2 = new JButton("");
	JButton bar3 = new JButton("");
	JButton idchk = new JButton("중복확인");
	
	JLabel bar4 = new JLabel("");
	JLabel bar5 = new JLabel("");
	JLabel bar6 = new JLabel("");
	JLabel bar7 = new JLabel("");
	JLabel bar8 = new JLabel("");
	JLabel bar9 = new JLabel("");
	JLabel bar10 = new JLabel("");
	JLabel bar11 = new JLabel("");
	JLabel bar12 = new JLabel("");
	JLabel bar13 = new JLabel("");
	
	JLabel outmember = new JLabel("회원가입");
	JLabel outresult = new JLabel("기본정보(필수)");
	JLabel id = new JLabel(" *회원아이디");
	JLabel pw = new JLabel(" *비밀번호");
	JLabel pwchk = new JLabel(" *비밀번호확인");
	JLabel name = new JLabel(" *성명");
	JLabel birth = new JLabel(" *생년월일");
	JLabel gender = new JLabel( " *성별");
	JLabel email = new JLabel(" *E-Mail");
	JLabel phone = new JLabel(" *휴대폰");
	JLabel userinfo = new JLabel("  기타정보");
	JLabel inmailing = new JLabel(" ");
	JLabel idchklb = new JLabel("아이디를 입력해주세요.");
	JLabel pwlb = new JLabel("영문+숫자로 입력 하시기 바랍니다.");
	JLabel pwchklb = new JLabel("비밀번호를 다시 한번 입력해 주세요.");
	JLabel golbangee = new JLabel("@");
	JLabel hobby = new JLabel	("당신의 취미에 투표하세요!");

	
	public Study17() {
		super("회원가입");	
		setBounds(500,30,1000,1060);
		setLayout(null);
		setBackground(Color.black);
		
		verify.setBounds(390,950,107,46);
		verify.setFont(new Font("바탕체",Font.PLAIN,17));
		verify.setBackground(new Color(16, 11, 163));
		verify.setForeground(Color.white);
		add(verify);
		
		getContentPane().setBackground(new Color(255,255,255));

		Vector<String>ecombo = new Vector<String>();
		//ecombo.setBackground(new Color(68,68, 68));
		ecombo.add("선택");
		ecombo.add("naver.com");
		ecombo.add("gmail.com");
		ecombo.add("daun.net");
		
		JComboBox box = new JComboBox(ecombo);
		box.setBounds(517, 540, 80, 31);
		box.setSelectedItem("선택");
		add(box);
	
		cancel.setBounds(500,950,107,46);
		cancel.setFont(new Font("바탕체",Font.PLAIN,17));
		cancel.setBackground(new Color(166, 166, 166));
		cancel.setForeground(Color.white);
		add(cancel);
		
		idchk.setBounds(503,191,85,33);
		idchk.setFont(new Font("굴림체",Font.PLAIN,12));
		idchk.setBackground(new Color(68,68, 68));
		idchk.setForeground(Color.white);
		add(idchk);
				
		bar.setSize(943, 3);
		bar.setLocation(20,100);
		bar.setBackground(new Color(9, 9, 9));
		
		add(bar);
		
		bar2.setSize(943, 2);
		bar2.setLocation(20,180);
		bar2.setBackground(new Color(9, 9, 9));
		
		add(bar2);
				
		
		bar4.setBounds(20,237,943, 2);
		bar4.setBackground(new Color(166,166,166));
	
		bar4.setOpaque(true);
		add(bar4);
		
		bar5.setBounds(20,295,943, 2);
		bar5.setBackground(new Color(166,166,166));
	
		bar5.setOpaque(true);
		add(bar5);
		
		bar6.setBounds(20,352,943, 2);
		bar6.setBackground(new Color(166,166,166));
	
		bar6.setOpaque(true);
		add(bar6);
		
		bar7.setBounds(20,410,943, 2);
		bar7.setBackground(new Color(166,166,166));
	
		bar7.setOpaque(true);
		add(bar7);
		
		bar8.setBounds(20,469,943, 2);
		bar8.setBackground(new Color(166,166,166));
	
		bar8.setOpaque(true);
		add(bar8);
		
		bar9.setBounds(20,527,943, 2);
		bar9.setBackground(new Color(166,166,166));
	
		bar9.setOpaque(true);
		add(bar9);
		
		bar10.setBounds(20,585,943, 2);
		bar10.setBackground(new Color(166,166,166));
	
		bar10.setOpaque(true);
		add(bar10);
		
		bar11.setBounds(20,642,943, 2);
		bar11.setBackground(new Color(166,166,166));
	
		bar11.setOpaque(true);
		add(bar11);
		
		bar12.setBounds(20,715,943, 1);
		bar12.setBackground(new Color(9,9,9));
	
		bar12.setOpaque(true);
		add(bar12);
		
		bar13.setBounds(20,917,943, 1);
		bar13.setBackground(new Color(166,166,166));
	
		bar13.setOpaque(true);
		add(bar13);
		
		outmember.setBounds(20,25,200,80);
		outmember.setBackground(new Color(255,255,255));
		outmember.setFont(new Font("바탕체",Font.PLAIN,30));
		outmember.setOpaque(true);
		add(outmember);
		
		
		outresult.setBounds(20,125,200,50);
		outresult.setBackground(new Color(255,255,255));
		outresult.setFont(new Font("바탕체",Font.PLAIN,20));
		outresult.setOpaque(true);
		add(outresult);
		
		id.setBounds(20,180,190,57);
		id.setBackground(new Color(139,189,255));
		id.setFont(new Font("바탕체",Font.PLAIN,15));
		id.setOpaque(true);
		add(id);
		
		pw.setBounds(20,238,190,57);
		pw.setBackground(new Color(139,189,255));
		pw.setFont(new Font("바탕체",Font.PLAIN,15));
		pw.setOpaque(true);
		add(pw);
		
		pwchk.setBounds(20,296,190,57);
		pwchk.setBackground(new Color(139,189,255));
		pwchk.setFont(new Font("바탕체",Font.PLAIN,15));
		pwchk.setOpaque(true);
		add(pwchk);
		
		name.setBounds(20,354,190,57);
		name.setBackground(new Color(139,189,255));
		name.setFont(new Font("바탕체",Font.PLAIN,15));
		name.setOpaque(true);
		add(name);
		
		birth.setBounds(20,412,190,57);
		birth.setBackground(new Color(139,189,255));
		birth.setFont(new Font("바탕체",Font.PLAIN,15));
		birth.setOpaque(true);
		add(birth);
		
		gender.setBounds(20,470,190,57);
		gender.setBackground(new Color(139,189,255));
		gender.setFont(new Font("바탕체",Font.PLAIN,15));
		gender.setOpaque(true);
		add(gender);
		
		email.setBounds(20,528,190,57);
		email.setBackground(new Color(139,189,255));
		email.setFont(new Font("바탕체",Font.PLAIN,15));
		email.setOpaque(true);
		add(email);
		
		phone.setBounds(20,586,190,57);
		phone.setBackground(new Color(139,189,255));
		phone.setFont(new Font("바탕체",Font.PLAIN,15));
		phone.setOpaque(true);
		add(phone);
		
		userinfo.setBounds(20,665,200,50);
		userinfo.setBackground(new Color(255,255,255));
		userinfo.setFont(new Font("바탕체",Font.PLAIN,20));
		userinfo.setOpaque(true);
		add(userinfo);
		
		inmailing.setBounds(20,710,190,207);
		inmailing.setBackground(new Color(139,189,255));
		inmailing.setFont(new Font("바탕체",Font.PLAIN,15));
		inmailing.setOpaque(true);
		add(inmailing);
		
		JTextField id = new JTextField();
		id.setBounds(220, 192, 280, 33);
		add(id);
		
		setVisible(true);
				
		JPasswordField pw = new JPasswordField();
		pw.setBounds(220, 251, 280, 33);
		add(pw);
		
		setVisible(true);
		
		JPasswordField pwchk = new JPasswordField();
		pwchk.setBounds(220, 310, 280, 33);
		add(pwchk);
		
		JTextField nametxt = new JTextField();
		nametxt.setBounds(220, 367, 280, 33);
		add(nametxt);
		
		JTextField birthtxt = new JTextField();
		birthtxt .setBounds(220, 424, 280, 33);
		add(birthtxt );
		
		JTextField gendertxt = new JTextField();
		gendertxt .setBounds(220, 481, 280, 33);
		add(gendertxt );
		
		JTextField email = new JTextField();
		email.setBounds(220, 540, 280, 33);
		add(email);
		
		JTextField phonetxt = new JTextField();
		phonetxt.setBounds(220, 597, 280, 33);
		add(phonetxt);
		
		idchklb.setBounds(600,180,400,57);
		idchklb.setBackground(new Color(255,255,255));
		idchklb.setFont(new Font("Serif",Font.PLAIN,13));
		idchklb.setForeground(new Color(103,153,255));
		idchklb.setOpaque(true);
		add(idchklb);
		
		pwlb.setBounds(505,238,400,57);
		pwlb.setBackground(new Color(255,255,255));
		pwlb.setFont(new Font("Serif",Font.PLAIN,13));
		pwlb.setForeground(new Color(103,153,255));
		pwlb.setOpaque(true);
		add(pwlb);
		
		pwchklb.setBounds(505,298,400,57);
		pwchklb.setBackground(new Color(255,255,255));
		pwchklb.setFont(new Font("Serif",Font.PLAIN,13));
		pwchklb.setForeground(new Color(103,153,255));
		pwchklb.setOpaque(true);
		add(pwchklb);
		
		golbangee.setBounds(503,528,30,57);
		golbangee.setBackground(new Color(255,255,255));
		golbangee.setFont(new Font("Serif",Font.PLAIN,13));
		golbangee.setOpaque(true);
		add(golbangee);
		
		JRadioButton agree = new JRadioButton("코딩");
		JRadioButton disagree = new JRadioButton("독서");
		JRadioButton cycle = new JRadioButton("자전거");
		
		agree.setBackground(new Color(255,255,255));
		disagree.setBackground(new Color(255,255,255));
		cycle.setBackground(new Color(255,255,255));
		agree.setBounds(220, 760, 80, 30);
		disagree.setBounds(300, 760, 50, 30);
		cycle.setBounds(370, 760, 80, 30);
		add(agree);
		add(disagree);
		add(cycle);
		
		hobby.setBounds(215,720,470,50);
		hobby.setBackground(new Color(255,255,255));
		hobby.setFont(new Font("Serif",Font.PLAIN,13));
		hobby.setOpaque(true);
		add(hobby);
		
		
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(agree);
		bg1.add(disagree);
		
		
		
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}



	
	 
	
	public static void main(String[] args) {
		
		Study17 go = new Study17();

	}

}
