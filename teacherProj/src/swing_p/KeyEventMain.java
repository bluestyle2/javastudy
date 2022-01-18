package swing_p;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;



public class KeyEventMain extends JFrame implements KeyListener{
   
   JLabel me = new JLabel("나다");
   //Enemy com;
   Random rd = new Random();

   
   class Enemy extends JLabel{

      
      HashMap<Enemy, String> colls = new HashMap();
      //int cx = (rd.nextInt(2)+1)*(-1+2*(rd.nextInt(2))), cy = (rd.nextInt(2)+1)*(-1+2*(rd.nextInt(2)));
      int [] speedArr = {-2,-1,1,2};
      
      int cx = speedArr[rd.nextInt(speedArr.length)], cy = speedArr[rd.nextInt(speedArr.length)];
      
      
      public Enemy() {
         
         //System.out.println(cx+","+cy);
         setBackground(new Color(rd.nextInt(150)+50,rd.nextInt(150)+50,rd.nextInt(150)+50));
         setBounds(rd.nextInt(600)+300, 
                 rd.nextInt(500)+100, 
                 rd.nextInt(50)+50,
                 rd.nextInt(50)+50);
         setOpaque(true);
         
      }
      

      
      void move() {
         //System.out.println(getX()+","+getY());
         
         
         //적들끼리 충돌 체크
            for (Enemy enemy : enemys) {
               
               
               if(enemy!=this) { //적들 중 나를 제외하고  
                  
                  //x, y 모두 부딪히면
                  if(enemy.getX()+enemy.getWidth() > getX()  && 
                        enemy.getX() < getX() + getWidth() &&
                        enemy.getY()+enemy.getHeight()  > getY()  && 
                        enemy.getY() < getY() + getHeight()) {
               
                     String str = colls.get(enemy);
                     if(str==null) {  //미리부딛힌 적이 없다면

                        cy*=-1;
                        cx*=-1;
                     }else {
                        if(str.equals("x")) {  //먼저 x축만 미리 충돌되고 있었다면
                           
                           cy*=-1; //y축 변환  (내것만 바꾸면 된)
                        }else {
                           ////먼저 y축만 미리 충돌되고 있었다면
                           cx*=-1;  //x 축변환
                        }
                        
                        colls.remove(enemy); //기존 충돌 값 제거
                     }
                     break;
         
                  }else if(enemy.getX()+enemy.getWidth() > getX() && 
                           enemy.getX() < getX() + getWidth()) {
                                                   //먼저 x축만 미리 충돌되고 있었다면
                        
                        colls.put(enemy, "x"); //x 축 지정
                        
                  }else if(enemy.getY()+enemy.getHeight()  > getY()  && 
                           enemy.getY() < getY() + getHeight()) {
                                                    //먼저 y축만 미리 충돌되고 있었다면
                     
                        colls.put(enemy, "y");//y 축 지정
                        
                  }else { //충돌되지 않았다면
                     
                        colls.put(enemy, null); //충돌값 없음
                  }
                  
                  
               }
            }
            
            if(getX()>=KeyEventMain.this.getWidth()-getWidth()-10 || getX() < 0) {
               cx*=-1;
            }
            
            if(getY()>=KeyEventMain.this.getHeight()-getHeight()-40 || getY() < 0) {
               cy*=-1;
            }
            
         
         setLocation(getX()+cx, getY()+cy);
      }
      
      boolean collision() {
         return me.getX()+me.getWidth() > getX()  && 
                  me.getX() < getX() + getWidth() &&
                  me.getY()+me.getHeight()  > getY()  && 
                  me.getY() < getY() + getHeight();
      }
      
   }
   
   ArrayList<Enemy> enemys= new ArrayList<KeyEventMain.Enemy>();
   
   
   
   void enemyMake() {  // 적 생성시 부딛히지 않게 생성
      
      Enemy nn = null;
      
      while(nn==null) {// 적이 제대로 생성될때까지 돌리기
         nn = new Enemy();  //적 생성
         
         for (Enemy enemy : enemys) {//적들을 돌려서 생성위치와 부딛히는 지 확인
         //x, y 모두 부딪히면
         if(enemy.getX()+enemy.getWidth() >= nn.getX()  && 
            enemy.getX() <= nn.getX() + nn.getWidth() &&
            enemy.getY()+enemy.getHeight()  >= nn.getY()  && 
            enemy.getY() <= nn.getY() + nn.getHeight()) {  //부딛히게 생성되면 삭제
            
            nn = null; //생성된 적삭제
            break;
            }
         }
      
      }
      
      add(nn);
      enemys.add(nn);
      
   }
   
   
   //int x = 600, y = 400;
   
   public KeyEventMain() {
      setBounds(100,100,1200,900);
      setLayout(null);
      setResizable(false); //창크기 고정
      //setExtendedState(MAXIMIZED_BOTH);//전체화면
      
      me.setBackground(new Color(255,200,200));
      me.setBounds(-300, 0, 100, 100);
      me.setOpaque(true);
      add(me);
      
      //com = new Enemy(); 
      
      
//      for (int i = 0; i < 10; i++) {
//         enemys.add(new Enemy());
//      }
      
      ///적들 생성
      while(enemys.size()<10) {
         
         enemyMake();
         
      }

      addKeyListener(this);
      
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      new Timer().start();
   }
   
   class Timer extends Thread{
      
      @Override
      public void run() {
         
         
         
         while(true) {
            
            try {
               sleep(10);
               
               for (Enemy com : enemys) {
                  com.move();
               }
               
               //com.move();
               
               if(isGameOver()) {  //게임종료
                  
                  //JFrame의 키리스너 제거
                  //removeKeyListener(KeyEventMain.this);
                  break;
               }
               
            } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
         }
         
         System.out.println("게임오버");
         
      }
      
   }
   
   
   boolean isGameOver() {
      
      boolean res = false;
      
      for (Enemy com : enemys) {
         if(com.collision()) {
            res = true;
            break;
         }
      }
      
      return res;
               
            
      
   }
   
   
   
   
   public static void main(String[] args) {
      new KeyEventMain();
   }



   /* KeyListener 의 추상메소드 */

   @Override
   public void keyTyped(KeyEvent e) {
      // 키를 놨을때 (Unicode 만 )--> 한글인지
      
   }

   @Override
   public void keyPressed(KeyEvent e) {
      // 키를 누를때
      
      int x = me.getX(), y = me.getY();  //자신의 좌표를 가져옴
      
      int key = e.getKeyCode();
      
      //System.out.println("keyPressed :"+key);
      switch(key) {
         case KeyEvent.VK_UP:
            //System.out.println("위로");
            
            y-=10;
            break;
         case KeyEvent.VK_DOWN:
            //System.out.println("아래로");
            y+=10;
            break;
         case KeyEvent.VK_LEFT:
            //System.out.println("왼쪽");
            x-=10;
            break;
         case KeyEvent.VK_RIGHT:
            //System.out.println("오른쪽");
            x+=10;
            break;
      }
      
      if(x<0) x = 0;
      if(x>getWidth()-me.getWidth()-10) x = getWidth()-me.getWidth()-10;
      
      if(y<0) y = 0;
      if(y>getHeight()-me.getHeight()-40) y = getHeight()-me.getHeight()-40;
      
      me.setLocation(x, y);
            
   }


   @Override
   public void keyReleased(KeyEvent e) {
      // 키를 놨을때
      
   }

}
