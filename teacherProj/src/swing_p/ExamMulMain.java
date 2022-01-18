package swing_p;

import java.awt.CardLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.LinkedHashMap;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class ExamMulMain extends JFrame {
   
   class SubData{  //문제 하나
      
      String qq;
      ArrayList<JRadioButton> bogi = new ArrayList<JRadioButton>();
      int ans, user,score;
      public SubData(String qq, int score, String bogi, int ans) {
         super();
         this.qq = qq;
         this.score = score;
         this.ans = ans;
         ButtonGroup bg = new ButtonGroup();
         for (String string : bogi.split(",")) {
            JRadioButton rr = new JRadioButton(string);
            this.bogi.add(rr);
            bg.add(rr);
         }   
      }
      
      int res() {
         
         if(bogi.get(ans).isSelected()) {
            return score;
         }
         return 0;
         
      }
      
      
   
   }
   
   
   
   
   class SubPP extends JPanel{ //시험과목
      
      SubData [] data;
      
      int total = 0,chk = 0; //0: 시작안함, 1:시험중, 2:시험종료
      
      String title;
      
      Timer timer;
      
      JLabel timeLB = new JLabel();
      
      class Timer extends Thread{
         
         int time;

         public Timer(int time) {
            super();
            this.time = time;
         }
         
         @Override
         public void run() {
            
            while(time>=0) {
                              
               if(chk==2) {
                  break;
               }

               try {
                  timeLB.setText(title+":"+time);
                  time--;
                  
                  sleep(1000);
               } catch (InterruptedException e) {
                  // TODO Auto-generated catch block
                  e.printStackTrace();
               }
            }
            
            chk = 2;
            ffPP.end();
            btns.get(title).setEnabled(false); //시험이 끝나면 과목 변경 버튼 비활성화
            card.show(cards, "빈화면");
         }
      }
      
      
      public SubPP(String title, int ti, SubData...data) {
         this.data = data;
         this.title = title;
         timer = new Timer(ti);
         
         int lineCnt = 1;
         
         for (SubData subData : data) {
            lineCnt+=1+subData.bogi.size();
            
         }
         setLayout(new GridLayout(lineCnt, 1));
         timeLB.setHorizontalAlignment(JLabel.RIGHT);
         add(timeLB);
         
         for (SubData sd : data) {
            add(new JLabel(sd.qq+"["+sd.score+"점]"));
            for (JRadioButton jr : sd.bogi) {
               add(jr);
            }
            
         }
            
      }
      
      String ppp() {
         
         total = 0;
         int success = 0;
         int fail = 0;
         
         for (SubData subData : data) {
            int res = subData.res();
            
            if(res==0) {
               fail++;
            }else {
               success++;
               total+=res;
            }
         }
         
         return "정답:"+success+",오답:"+fail+",점수:"+total;
      }
      
      
      
      void starttt() {
         if(chk==0) {
            chk=1;
            timer.start();
         }
      }   
   }
   
   
   class FinalPP extends JPanel{
      
      
      LinkedHashMap<String,JLabel> lbMap= new LinkedHashMap<String, JLabel>();
      
      public FinalPP() {
         
         setLayout(new GridLayout(map.size(),1));
         
         for (String ttt : map.keySet()) {
            
            JLabel lb = new JLabel(ttt+":시험전");
            lbMap.put(ttt,lb );
            add(lb);
            
         }
      }
      
      
      void end() {
         
         int cnt = 0;
         for (String ttt : map.keySet()) {
            SubPP spp = map.get(ttt);
            
            if(spp.chk==2) {
               cnt++;
               lbMap.get(ttt).setText(ttt+":시험종료");
            }else{
               lbMap.get(ttt).setText(ttt+":시험전");
            }
         }
         if(cnt==3) {
            for (String ttt : map.keySet()) {
               SubPP spp = map.get(ttt);
               
               lbMap.get(ttt).setText("[["+ttt+"]] "+spp.ppp());
               
            }
         }
      }
      
      
   }
   
   //시험과목들
   LinkedHashMap<String, SubPP>map = new LinkedHashMap<String, ExamMulMain.SubPP>();
   LinkedHashMap<String, JToggleButton>btns = new LinkedHashMap<String, JToggleButton>();
   
   //과목선택창
   CardLayout card = new CardLayout();
   JPanel cards = new JPanel();
   
   FinalPP ffPP;
   
   //전체 창
   public ExamMulMain() {
      setBounds(100, 100, 800, 900);
      
      
      JPanel btPP = new JPanel();
      
      
      add(btPP,"North");
      add(cards,"Center");
      
      
      cards.setLayout(card);
      
      
      map.put("국어", new SubPP("국어",10,
            new SubData("선생님 성함은?", 20, "일신협,이신협,삼신협,사신협", 1),
            new SubData( "한글 창제자는?", 30, "세종대왕,세종중왕,세종소왕", 0),
            new SubData( "허균이 쓴 소설은?", 50, "홍길동전,청길동전,흑길동전,백길동전", 0)
            ));
      map.put("영어", new SubPP("영어",5,
            new SubData("사과?", 20, "Grape,Strawberry,Apple,Banana", 2),
            new SubData("스파이를 고르세요.", 20, "socks,tree,flower,leaf", 0),
            new SubData("한국?", 20, "Korea,Italia,America,Germany", 0),
            new SubData("스파이를 고르세요.", 20, "swimming,running,dynamite,tennis,volleyball", 2),
            new SubData("고양이?", 20, "cow,dog,cat,mouse,bird", 2)
            ) );
      map.put("수학", new SubPP("수학",3,
            new SubData( "1+1?", 10, "5,4,3,2,1", 3),
            new SubData( "3x7?", 20, "10,21,37,343,2187", 1),
            new SubData( "10+3*13-1?", 30, "12,24,36,48", 3),
            new SubData( "log8?", 40, "log2,log3,2log3,3log2", 3)
            ) );
      
      ButtonGroup bg = new ButtonGroup();
      
   
      for (String ttt : map.keySet()) {
         cards.add(map.get(ttt),ttt);
            
         JToggleButton tb = new JToggleButton(ttt);
         //tb.setEnabled(false);
         btns.put(ttt,tb);
         btPP.add(tb);
         bg.add(tb);
         
         tb.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
               
               card.show(cards, ttt);
               map.get(ttt).starttt();
            }
         });
         
         
      }
      
      cards.add(ffPP=new FinalPP(),"빈화면");
      card.show(cards, "빈화면");
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      
   }
   

   public static void main(String[] args) {
      
      new ExamMulMain();

   }

}