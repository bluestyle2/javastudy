package homework_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Study19 extends JFrame implements MouseMotionListener {

   JLabel me,ball,wall1,wall2,wall3,wall4,wall5,wall6,wall7,wall8;
   int w = 50;
   int h = 50;
 //  JLabel walls = new JLabel();
  
//   class walls extends JLabel{
//	   
//	   
//	   public walls() {
//		   
//		   System.out.println("벽들생성");
//		   \
//		   for (int i = 0; i > 10; i++,w+=50) {
//			
//		   JLabel wall = new JLabel();
//		   setBackground(new Color(255,0,255));		 
//		   setOpaque(true);
//		   setBounds(w,h,100,40);
//		   add(wall);
//		   
//		   }   
//		   
//	   }
//   }
   
   @Override
   public void mouseDragged(MouseEvent e) {
      // TODO Auto-generated method stub

   }

   @Override
   public void mouseMoved(MouseEvent e) {
      // TODO Auto-generated method stub
      me.setLocation(e.getX()-100, 500);
   }
   
   public Study19() {
      setBounds(100, 100, 1000, 600);
      setLayout(null);
      me = new JLabel();
      me.setOpaque(true);
      me.setBackground(new Color(255,255,0));
      me.setBounds(500, 500, 200, 20);
      add(me);
      
      ball = new JLabel();
      ball.setOpaque(true);
      ball.setBackground(new Color(255,0,0));
      ball.setBounds(500, 100, 20, 20);
      add(ball);
      
      wall1 = new JLabel();
      wall1.setOpaque(true);
      wall1.setBackground(new Color(0,0,255));
      wall1.setBounds(20, 20, 100, 30);
     add(wall1);
     
     wall2 = new JLabel();
     wall2.setOpaque(true);
     wall2.setBackground(new Color(0,0,255));
      wall2.setBounds(130, 20, 100, 30);
     add(wall2);
     
     wall3 = new JLabel();
     wall3.setOpaque(true);
     wall3.setBackground(new Color(0,0,255));
     wall3.setBounds(240, 20, 100, 30);
     add(wall3);
     
     wall4 = new JLabel();
     wall4.setOpaque(true);
     wall4.setBackground(new Color(0,0,255));
     wall4.setBounds(350, 20, 100, 30);
     add(wall4);
     
     wall5 = new JLabel();
     wall5.setOpaque(true);
     wall5.setBackground(new Color(0,0,255));
     wall5.setBounds(460, 20, 100, 30);
     add(wall5);
     
     wall6 = new JLabel();
     wall6.setOpaque(true);
     wall6.setBackground(new Color(0,0,255));
     wall6.setBounds(570, 20, 100, 30);
     add(wall6);
     
     wall7 = new JLabel();
     wall7.setOpaque(true);
     wall7.setBackground(new Color(0,0,255));
     wall7.setBounds(680, 20, 100, 30);
     add(wall7);
     
     wall8 = new JLabel();
     wall8.setOpaque(true);
     wall8.setBackground(new Color(0,0,255));
     wall8.setBounds(790, 20, 100, 30);
     add(wall8);
     
    
      
      addMouseMotionListener(this);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      new Timer().start();
      
   }
   
   
   class Timer extends Thread{
      @Override
      public void run() {
         
         int cx = 2, cy = 2;
         while(true) {
            
            try {
               
               if(ball.getY()>=getHeight()) {
                  break;
               }
               
               if(me.getX()+me.getWidth() > ball.getX()  && 
                        me.getX() < ball.getX() + ball.getWidth() &&
                        me.getY()+me.getHeight()  > ball.getY()  && 
                        me.getY() < ball.getY() + ball.getHeight()) {
                  
                  cy*=-1;
               }
               
               if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                  cx*=-1;
               }
               if(ball.getY()<0) {
                  cy*=-1;
               }   
               
               ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               sleep(10);
               //
               if(ball.getY()>=getHeight()) {
                   break;
                }
                
                if(wall1.getX()+wall1.getWidth() > ball.getX()  && 
                         wall1.getX() < ball.getX() + ball.getWidth() &&
                         wall1.getY()+wall1.getHeight()  > ball.getY()  && 
                         wall1.getY() < ball.getY() + ball.getHeight()) {
                   
                   cy*=-1;
                   remove(wall1);
                   repaint();
                   wall1.setLocation(1000,0);
                }
                
                if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                   cx*=-1;
                }
                if(ball.getY()<0) {
                   cy*=-1;
                }   
                
                ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               
               sleep(10);
               //
               if(ball.getY()>=getHeight()) {
                   break;
                }
                
                if(wall2.getX()+wall2.getWidth() > ball.getX()  && 
                         wall2.getX() < ball.getX() + ball.getWidth() &&
                         wall2.getY()+wall2.getHeight()  > ball.getY()  && 
                         wall2.getY() < ball.getY() + ball.getHeight()) {
                   
                   cy*=-1;
                   remove(wall2);
                   repaint();
                   wall2.setLocation(1000,0);
                }
                
                if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                   cx*=-1;
                }
                if(ball.getY()<0) {
                   cy*=-1;
                }   
                
                ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               
               sleep(10);
               //
               if(ball.getY()>=getHeight()) {
                   break;
                }
                
                if(wall3.getX()+wall3.getWidth() > ball.getX()  && 
                         wall3.getX() < ball.getX() + ball.getWidth() &&
                         wall3.getY()+wall3.getHeight()  > ball.getY()  && 
                         wall3.getY() < ball.getY() + ball.getHeight()) {
                   
                   cy*=-1;
                   remove(wall3);
                   repaint();
                   wall3.setLocation(1000,0);
                }
                
                if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                   cx*=-1;
                }
                if(ball.getY()<0) {
                   cy*=-1;
                }   
                
                ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               
               sleep(10);
               //
               if(ball.getY()>=getHeight()) {
                   break;
                }
                
                if(wall4.getX()+wall4.getWidth() > ball.getX()  && 
                         wall4.getX() < ball.getX() + ball.getWidth() &&
                         wall4.getY()+wall4.getHeight()  > ball.getY()  && 
                         wall4.getY() < ball.getY() + ball.getHeight()) {
                   
                   cy*=-1;
                   remove(wall4);
                   repaint();
                   wall4.setLocation(1000,0);
                }
                
                if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                   cx*=-1;
                }
                if(ball.getY()<0) {
                   cy*=-1;
                }   
                
                ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               
               sleep(10);
               //
               if(ball.getY()>=getHeight()) {
                   break;
                }
                
                if(wall5.getX()+wall5.getWidth() > ball.getX()  && 
                         wall5.getX() < ball.getX() + ball.getWidth() &&
                         wall5.getY()+wall5.getHeight()  > ball.getY()  && 
                         wall5.getY() < ball.getY() + ball.getHeight()) {
                   
                   cy*=-1;
                   remove(wall5);
                   repaint();
                   wall5.setLocation(1000,0);
                   
                }
                
                if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                   cx*=-1;
                }
                if(ball.getY()<0) {
                   cy*=-1;
                }   
                
                ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               
               sleep(10);
               //
               if(ball.getY()>=getHeight()) {
            	   
                   break;
                }
                
                if(wall6.getX()+wall6.getWidth() > ball.getX()  && 
                         wall6.getX() < ball.getX() + ball.getWidth() &&
                         wall6.getY()+wall6.getHeight()  > ball.getY()  && 
                         wall6.getY() < ball.getY() + ball.getHeight()) {
                   
                   cy*=-1;
                   
                   remove(wall6);
                   repaint();
                   wall6.setLocation(1000,0);
                   
                 }
                
                if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                   cx*=-1;
                   
                }
                if(ball.getY()<0) {
                   cy*=-1;
                   
                       
                       
                }   
                
                ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               
               sleep(10);
               //
               if(ball.getY()>=getHeight()) {
                   break;
                }
                
                if(wall7.getX()+wall7.getWidth() > ball.getX()  && 
                         wall7.getX() < ball.getX() + ball.getWidth() &&
                         wall7.getY()+wall7.getHeight()  > ball.getY()  && 
                         wall7.getY() < ball.getY() + ball.getHeight()) {
                   
                   cy*=-1;
                   remove(wall7);
                   repaint();
                   wall7.setLocation(1000,0);
                }
                
                if(ball.getX()>=getWidth()-30 || ball.getX()<0) {
                   cx*=-1;
                }
                if(ball.getY()<0) {
                   cy*=-1;
                }   
                
                ball.setLocation(ball.getX()+cx, ball.getY()+cy);
               
               sleep(10);
               //
               if(ball.getY()>=getHeight()) {
                   break;
                }
                
                if(wall8.getX()+wall8.getWidth() > ball.getX()  && 
                         wall8.getX() < ball.getX() + ball.getWidth() &&
                         wall8.getY()+wall8.getHeight()  > ball.getY()  && 
                         wall8.getY() < ball.getY() + ball.getHeight()) {
                   
                   cy*=-1;
                   remove(wall8);
                   repaint();
                   wall8.setLocation(1000,0);
                }
                
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
         
         System.out.println("게임종료");
         
      }
   }
   

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new Study19();
   }

}