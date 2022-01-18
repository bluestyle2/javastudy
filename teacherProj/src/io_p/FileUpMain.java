


package io_p;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class FileUpMain extends JFrame {
   
   class Btn1Action implements ActionListener{

      @Override
      public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method stub
         FileDialog fd = new FileDialog(FileUpMain.this, "파일선택", FileDialog.LOAD);
         fd.setLocation(200, 200);
         fd.setVisible(true);
         
         if(!fd.getDirectory().isEmpty()) {
            fName.setText( fd.getDirectory()+fd.getFile());
            srcDir = fd.getDirectory();
            srcFile = fd.getFile();
         }
      }
      
   }
   
   HashMap<String, String> map = new HashMap<String, String>();
   
   class Btn2Action implements ActionListener{

      @Override
      public void actionPerformed(ActionEvent e) {
         
         
      
         
         if(fName.getText().isEmpty()) {
            status.setText("선택된 파일이 없습니다.");
            return;
         }
         String fn = fName.getText();
      
         String cate = "etc";
         
         for (Map.Entry<String, String> me : map.entrySet()) {
            if(Pattern.matches(me.getKey(), fn)) {
               cate = me.getValue();
            }
         }
         String dst = "ddd/"+cate+"/"+ srcFile;
         
         
         
         new BarGo(fn, dst).start();
         // ActionListener -> actionPerformed 안에서는 JFrame의 컴포넌트 상태 갱신에 제약이 있슴
         //                따라서 JProgressBar 의 상태는 다른 쓰레드에서 작업하도록 해야함
         
         
      }
      
   }
   String srcDir, srcFile;
   JLabel fName, status;
   JProgressBar bar;
   
   
   class BarGo extends Thread{
      String fn, dst;
      
      
      
      public BarGo(String fn, String dst) {
         super();
         this.fn = fn;
         this.dst = dst;
      }

      // ActionListener -> actionPerformed 안에서는 JFrame의 컴포넌트 상태 갱신에 제약이 있슴
      //                따라서 JProgressBar 의 상태는 다른 쓰레드에서 작업하도록 해야함

      @Override
      public void run() {
         try {
            FileInputStream fis = new FileInputStream(fn);
            FileOutputStream fos = new FileOutputStream(dst);
            
            byte [] buf = new byte[100];
            int tot = fis.available();
            
            while(fis.available()>0) {
               int len = fis.read(buf);
               fos.write(buf, 0, len);
               
               
               int vv = 100-fis.available()*100/tot;
               
               bar.setValue(vv);
               
               bar.setString(vv+"%");
               
               sleep(1); //안해도 됨
            }
         
            fos.close();
            fis.close();
            
            status.setText(dst+" 파일저장 완료");
         } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
      }
   }
   
   
   public FileUpMain() {
      
      map.put(".*(bmp|png|jpg|jpeg|gif)","img");
      map.put(".*(mp3|wma|midi)","music");
      map.put(".*(hwp|doc|docx|ppt|pptx|xls|xlsx|txt)","oa");
      
      
      setBounds(100, 100, 600, 500);
      setLayout(null);
      JButton btn1 = new JButton("파일선택");
      btn1.setBounds(100,50,100,50);
      add(btn1);
      
      fName = new JLabel("");
      fName.setBounds(200,50,400,50);
      add(fName);
      
      JButton btn2 = new JButton("파일저장");
      btn2.setBounds(100,150,100,50);
      add(btn2);
      
      status = new JLabel("");
      status.setBounds(200,150,400,50);
      add(status);
      
      bar = new JProgressBar(0, 0, 100);
      bar.setStringPainted(true);
      bar.setString("0%");
      bar.setBounds(50,300,500,30);
      add(bar);
      
      btn1.addActionListener(new Btn1Action());
      btn2.addActionListener(new Btn2Action());
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
   }

   public static void main(String[] args) {
      new FileUpMain();
   }

}