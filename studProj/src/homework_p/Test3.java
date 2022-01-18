package homework_p;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test3 extends JFrame {

	JLabel menubar, sellinfo1, sellinfo2, logo, pdinfo1, pdinfo2, pdinfo3, pdinfo4;
	JButton login;
	JButton member;
	JButton cofbean;
	JButton coftool;
	JButton howto;
	JButton service;
	JButton cofsell1;
	JButton cofsell2;
	JButton banner;
	JPanel home;
	Font iden = new Font("맑은 고딕", Font.BOLD, 16);
	ImageIcon co1 = new ImageIcon("testsorce/Testlogo.jpg");
	ImageIcon co2 = new ImageIcon("testsorce/product.jpg");
	ImageIcon co3 = new ImageIcon("testsorce/product2.jpg");
	ImageIcon co4 = new ImageIcon("testsorce/banner1.jpg");
	ImageIcon co5 = new ImageIcon("testsorce/예가체프설명.jpg");
	ImageIcon co6 = new ImageIcon("testsorce/엘소코로설명.jpg");
	JFrame pd1 = new JFrame();
	JFrame pd2 = new JFrame();

	public Test3() {

		super("::아이러브커피::");
		setBounds(500, 10, 900, 1000);
		setLayout(null);
		setResizable(false);

		getContentPane().setBackground(new Color(140, 96, 57));

		logo = new JLabel();
		logo.setOpaque(true);
		logo.setIcon(co1);
		logo.setBounds(50, 10, 124, 123);
		logo.setForeground(Color.white);
		add(logo);

		login = new JButton("LOGIN");
		login.setBounds(540, 130, 100, 40);
		login.setBackground(new Color(66, 44, 39));
		login.setForeground(Color.white);
		login.setFont(iden);
		add(login);

		member = new JButton("회원가입");
		member.setBounds(650, 130, 100, 40);
		member.setFont(iden);
		member.setBackground(new Color(66, 44, 39));
		member.setForeground(Color.white);
		add(member);

		banner = new JButton();
		banner.setBounds(100, 320, 690, 300);
		banner.setFont(iden);
		banner.setBackground(new Color(66, 44, 39));
		banner.setForeground(Color.white);
		banner.setIcon(co4);
		add(banner);

		cofbean = new JButton("커피원두");
		cofbean.setBounds(100, 220, 150, 80);
		cofbean.setFont(iden);
		cofbean.setBackground(new Color(66, 44, 39));
		cofbean.setForeground(Color.white);
		add(cofbean);

		coftool = new JButton("커피기구");
		coftool.setBounds(280, 220, 150, 80);
		coftool.setFont(iden);
		coftool.setBackground(new Color(66, 44, 39));
		coftool.setForeground(Color.white);
		add(coftool);

		howto = new JButton("사용법과 설명");
		howto.setBounds(460, 220, 150, 80);
		howto.setFont(iden);
		howto.setBackground(new Color(66, 44, 39));
		howto.setForeground(Color.white);
		add(howto);

		service = new JButton("고객센터");
		service.setBounds(640, 220, 150, 80);
		service.setFont(iden);
		service.setBackground(new Color(66, 44, 39));
		service.setForeground(Color.white);
		add(service);

		menubar = new JLabel();
		menubar.setBounds(0, 220, 900, 80);
		menubar.setBackground(new Color(120, 58, 4));
		menubar.setOpaque(true);
		add(menubar);

		cofsell1 = new JButton();
		cofsell1.setBounds(180, 650, 200, 200);
		cofsell1.setOpaque(true);
		cofsell1.setIcon(co2);
		add(cofsell1);

		cofsell2 = new JButton();
		cofsell2.setBounds(510, 650, 200, 200);
		cofsell2.setOpaque(true);
		cofsell2.setIcon(co3);
		add(cofsell2);

		pdinfo1 = new JLabel("에티오피아 예가체프");
		pdinfo1.setBounds(180, 850, 200, 20);
		pdinfo1.setForeground(Color.white);
		pdinfo1.setFont(iden);
		add(pdinfo1);

		pdinfo2 = new JLabel("price 18900");
		pdinfo2.setBounds(180, 875, 200, 20);
		pdinfo2.setForeground(Color.white);
		pdinfo2.setFont(iden);
		add(pdinfo2);

		pdinfo3 = new JLabel("과테말라 엘 소코로");
		pdinfo3.setBounds(510, 850, 200, 20);
		pdinfo3.setForeground(Color.white);
		pdinfo3.setFont(iden);
		add(pdinfo3);

		pdinfo4 = new JLabel("price 23900");
		pdinfo4.setBounds(510, 875, 200, 20);
		pdinfo4.setForeground(Color.white);
		pdinfo4.setFont(iden);
		add(pdinfo4);

		pd1.setBounds(300, 20, 850, 950);
		pd1.setLayout(null);
		pd1.setResizable(false);
		pd1.setVisible(false);
		pd1.getContentPane().setBackground(new Color(140, 96, 57));

		JLabel pd1in = new JLabel();
		pd1in.setBounds(1, 1, 850, 600);
		pd1in.setIcon(co5);
		pd1.add(pd1in);

		JButton pd1buy = new JButton("구매");
		pd1buy.setBounds(300, 800, 210, 100);
		pd1buy.setFont(iden);
		pd1buy.setBackground(new Color(66, 44, 39));
		pd1buy.setForeground(Color.white);
		pd1.add(pd1buy);

		pd2.setBounds(300, 20, 850, 950);
		pd2.setLayout(null);
		pd2.setResizable(false);
		pd2.setVisible(false);
		pd2.getContentPane().setBackground(new Color(140, 96, 57));

		JLabel pd2in = new JLabel();
		pd2in.setBounds(1, 1, 850, 600);
		pd2in.setIcon(co6);
		pd2.add(pd2in);

		JButton pd2buy = new JButton("구매");
		pd2buy.setBounds(300, 800, 210, 100);
		pd2buy.setFont(iden);
		pd2buy.setBackground(new Color(66, 44, 39));
		pd2buy.setForeground(Color.white);
		pd2.add(pd2buy);

		cofsell1.addActionListener(new pdclick1());
		cofsell2.addActionListener(new pdclick2());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class pdclick2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			pd2.setVisible(true);
		}

	}

	class pdclick1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			pd1.setVisible(true);

		}

	}

	public static void main(String[] args) {
		Test3 go = new Test3();

	}

}
