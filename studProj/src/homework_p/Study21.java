//지정한 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오

/// 하위 폴더까지 검색하세요

/// 같은 파일명인 경우 중복 처리 하세요

//이미지 : bmp, jpg, gif, png 

//음악 : mp3, wma, wav

//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx

//가사 :txt

//기타 : 위의 분류 이외

//확장자의 대소문자 구분하지 않음

//중복처리가 불가능하게 만드는가? x
//자동(2)붙이고 생성 o 사본을 만들어서 처리 o 
// 맵을 사용해서 해야 할것같은데 잘모르겠습니다
package homework_p;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Study21 extends JFrame {

	JLabel name, info;
	JButton btn1;
	JButton btn2;
//	HashMap<String, String> map = new HashMap<String, String>();

	String fileup = "";
	String filedown = "";
	
	File file1 = new File(fileup);
	File file2 = new File(filedown);


	public Study21() {

//		map.put(".*(bmp|png|jpg|jpeg|gif)", "img");
//		map.put(".*(mp3|wma|midi)", "music");
//		map.put(".*(hwp|doc|docx|ppt|pptx|xls|xlsx|txt)", "oa");

		name = new JLabel("");
		name.setBounds(100, 260, 400, 50);
		add(name);

		setBounds(750, 300, 500, 500);
		setLayout(null);

		btn1 = new JButton("파일 선택");
		btn1.setBounds(100, 200, 100, 50);
		add(btn1);

		btn2 = new JButton("파일 저장");
		btn2.setBounds(250, 200, 100, 50);
		add(btn2);

		info = new JLabel("");
		info.setBounds(100, 300, 400, 50);
		add(info);

		btn1.addActionListener(new Btn1Action());
		btn2.addActionListener(new Btn2Action());

		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	class Btn1Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			FileDialog up = new FileDialog(Study21.this, "파일선택", FileDialog.LOAD);
			up.setLocation(200, 200);
			up.setVisible(true);
			name.setText(up.getDirectory() + up.getFile());
		}

	}

	class Btn2Action implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (name.getText().isEmpty()) {
				info.setText("파일을 선택해주세요");
				return;
			}
			info.setText("파일저장 완료");
		}

	}
	
	public static void main(String[] args) {
		new Study21();

	}

}