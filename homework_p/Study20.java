package homework_p;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Study20 extends JFrame implements ActionListener {
	
	JButton b1;

	public Study20() {

		setBounds(600, 100, 800, 400);
		setLayout(null);

		b1 = new JButton("파일 업로드 Click!");
		b1.setBounds(300, 200, 200, 100);
		b1.setOpaque(true);
		add(b1);

//	ff.setVisible(true);

		b1.addActionListener(this);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
//			ff.setLocation(300, 400);
//			
//			System.out.println(ff.getDirectory());
//			System.out.println(ff.getFile());
		
		FileDialog open = new FileDialog(this, "파일 열기", FileDialog.LOAD);
		open.setDirectory("C:\\Users\\blues\\Desktop");
		open.setVisible(true);
		
		byte [] info = new byte[10000];
		
		String getd = open.getDirectory();
		String getf = open.getFile();
		System.out.println(open.getDirectory());
		System.out.println(open.getFile());
		
		
		
		
		ByteArrayInputStream bis = new ByteArrayInputStream(info);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int data;
		while((data=bis.read())!=-1) {
			bos.write(data);
		}
		
//		try {
//			bis.close();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			bos.close();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
//		bis.close();
//		bos.close();
	}

	public static void main(String[] args) {
		Study20 gogo = new Study20();

	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		

}
