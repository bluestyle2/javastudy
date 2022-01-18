package swing_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ExamMain extends JFrame implements ActionListener{

   int time = 10;
   
   ArrayList<JRadioButton> qq1 = new ArrayList<JRadioButton>();
   ArrayList<JCheckBox> qq2 = new ArrayList<JCheckBox>();
   JLabel res = new JLabel("결과:");
   JLabel timeLB = new JLabel("남은 시간 : " + time);
   
   JButton btn = new JButton("확인");
   
   class Timer extends Thread{
      @Override
      public void run() {
         
         for (time = 10 ; time>=0; time--) {
            try {
               sleep(1000);
               timeLB.setText("남은 시간 : " + time);
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
         
         btn.setEnabled(false);
      }
   }
   
   
   public ExamMain() {
      super("시험");
      setBounds(100, 50, 800, 900);
      setLayout(new GridLayout(13,2));
      
      timeLB.setHorizontalAlignment(JLabel.RIGHT);
      add(timeLB);
      
      add(new JLabel("1. 선생님 특기는?"));
      
      ButtonGroup bg = new ButtonGroup();
      for (String str : "깜찍해요,귀여워요,이뻐요,웃겨요".split(",")) {
         JRadioButton rr = new JRadioButton(str);
         qq1.add(rr); 
         bg.add(rr);
         add(rr);
      }
      
      add(new JLabel("2. 학생 과제할때는?"));
      
      for (String str : "부지런히,열심히,최선을 다해서,포기하지 말고".split(",")) {
         JCheckBox rr = new JCheckBox(str);
         qq2.add(rr);
         add(rr);
      }
      
      
      
      btn.addActionListener(this);
      add(btn);
      add(res);
      
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      new Timer().start();
   }
   
   public static void main(String[] args) {
      
      new ExamMain();

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      
      int tot = 0;
      if(qq1.get(1).isSelected()) {
         tot = 20;
      }
      
      for (JCheckBox box : qq2) {
         if(box.isSelected()) {
            tot += 20;
         }
      }
      
      //System.out.println("눌렀다:"+qq1.get(1).isSelected());
      
      res.setText("결과 : "+ tot);
      
   }

}