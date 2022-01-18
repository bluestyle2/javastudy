package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class BlockBreakGame extends JFrame implements MouseMotionListener {

   JLabel me,ball;
   Random rd = new Random();
   //Block bb;
   LineBorder border = new LineBorder(new Color(255,0,0),1);
   
   ArrayList<Block>bbs = new ArrayList<BlockBreakGame.Block>();
   
   HashMap<Block, String> colBBs = new HashMap<BlockBreakGame.Block, String>();
   
   
   Color [] colors = {
         new Color(0,0,0),
         new Color(200,200,255),
         new Color(100,100,255),
         new Color(0,0,255),
         new Color(0,0,0)
         };
   
   int limit = 0;
   
   class Block extends JLabel{
      
      int life;
      
      public Block(int i, int j, int life) {
         this.life = life;
         setBorder(border);
         setOpaque(true);
         setBackground(colors[life]);
         setBounds(50+(100*i), 100+(50*j), 100, 50);
         BlockBreakGame.this.add(this);
         bbs.add(this);
      }
      
      
      int collision() {
         
         int res= 0; //0: 안부딪힘, 1:부딪힘, 2: 제거
         
         //x, y 가 다 부딛힐때
         if( getX()+getWidth() > ball.getX()  && 
               getX() < ball.getX() + ball.getWidth() &&
               getY()+getHeight()  > ball.getY()  && 
               getY() < ball.getY() + ball.getHeight()) {

            res = 1;
            if(life!= colors.length-1) {
               life--;
               
               if(life==0) {
                  res = 2;
               //화면
                  BlockBreakGame.this.remove(this);
               }else {
                  setBackground(colors[life]);   
               }
            }
            
            //벽돌들 --> 여기서 삭제시 에러발생
            //bbs.remove(this);
            
            String dir = colBBs.get(this);
            if(dir==null) {
               cy*=-1;
               cx*=-1;
            }else if(dir.equals("x"))
               cy*=-1;
            else if(dir.equals("y")) {
               cx*=-1;
            }
            
            colBBs.remove(this);
            
            
            //x 축만 부딛힘
         }else if( getX()+getWidth() > ball.getX()  && 
               getX() < ball.getX() + ball.getWidth()) {
            
            colBBs.put(this, "x");
            
            //y 축만 부딛힘
         }else if(getY()+getHeight()  > ball.getY()  && 
               getY() < ball.getY() + ball.getHeight()) {
            colBBs.put(this, "y");
         }else {
            colBBs.remove(this);
         }
         
         
         return res;
      }
      
      
   }
   
   
   @Override
   public void mouseDragged(MouseEvent e) {
      // TODO Auto-generated method stub
//      if(bb!=null) {
//         remove(bb);
//         repaint();//다시 그리기
//         bb = null;
//      }
      //add()되어 있는 Component 갯수 파악
      System.out.println("드래그:"+getContentPane().getComponentCount());
   }

   @Override
   public void mouseMoved(MouseEvent e) {
      // TODO Auto-generated method stub
      me.setLocation(e.getX()-100, 700);
      
      
      
   }
   
   public BlockBreakGame() {
      setBounds(100, 100, 1000, 800);
      setLayout(null);
      me = new JLabel();
      me.setOpaque(true);
      me.setBackground(new Color(255,255,0));
      me.setBounds(500, 700, 200, 20);
      add(me);
      
      ball = new JLabel();
      ball.setOpaque(true);
      ball.setBackground(new Color(255,0,0));
      ball.setBounds(500, 400, 20, 20);
      add(ball);
      
      
      limit = 0;
      
      for (int j = 0; j < 5; j++) {
      
         for (int i = 0; i < 8; i++) {
            int lf = rd.nextInt(colors.length-1)+1;
            Block bb = new Block(i,j,lf);
            if(lf==colors.length-1)
               limit++;
         }
      }

      //add()되어 있는 Component 갯수 파악
      //System.out.println("생성자:"+getContentPane().getComponentCount());
      
      
      addMouseMotionListener(this);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      new Timer().start();
   }
   
   int speed = 3;
   
   int cx = speed, cy = speed;
   class Timer extends Thread{
      @Override
      public void run() {
         
         
         while(true) {
            
            try {
               
               
               //게임종료
               if(ball.getY()>=getHeight()) {
                  System.out.println("게임종료 : 실패");
                  break;
               }
               
               if(bbs.size()<=limit) {
                  System.out.println("게임종료 : 성공");
                  break;
               }
               
//               if(bb!=null) {
//               //벽돌 충돌
//                  if(bb.collision())
//                     bb = null;
//               }
               
               //arrayList를 for 문을 돌리는 와중에 중간에 원소제거시 에러발생
               //for (Block bb : bbs) {
               //   bb.collision();
                //}
               
               
               
               Iterator<Block> it = bbs.iterator();
               
               while(it.hasNext()) {
                  Block bb = it.next();
                  int res = bb.collision();
                  if(res==2) {
                     it.remove();
                     repaint();
                  }else if(res!=0) {	//부딪혔다면 벽돌 리스트 확인 종료--> 다시 쓰레드 반복
                     break;				//연속 충돌되어 방향이 상쇄되는 것을 방지
                  }
                  
               }
               
               
               
               //나 충돌
               if(me.getX()+me.getWidth() > ball.getX()  && 
                        me.getX() < ball.getX() + ball.getWidth() &&
                        me.getY()+me.getHeight()  > ball.getY() + ball.getHeight()  && 
                        me.getY() < ball.getY() + ball.getHeight()) {
                  
                  cy=-speed;
               }
               
               
               //벽 충돌
               if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                  cx*=-1;
               }
               if(ball.getY()<0) {
                  cy*=-1;
               }   
               
               ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               
               sleep(10);
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }
         
         
         
         //ball 지우기
         remove(ball);
         repaint();//다시 그리기
         ball = null;
      }
   }
   

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new BlockBreakGame();
   }

}