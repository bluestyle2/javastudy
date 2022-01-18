package davinciProj;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;


public class PlayGame extends JFrame implements KeyListener {
	

	private static final long serialVersionUID = 1L;
	Random rd = new Random();
	JLabel character;
	JLabel background, background2;
	JPanel p1;
	JLabel blackImg;
	
	String id;
	int dino;	
	ImageIcon img;       //배경
	ImageIcon img1;      //달리기1
	ImageIcon img2;		 //달리기2
	ImageIcon img3;      //서있기
	ImageIcon img4;      //1단 점프
	ImageIcon img5;      //하강
	ImageIcon img6;      //2단점프
	ImageIcon img7;      //숙이기
	ImageIcon img8;      //젤리
	ImageIcon img9;      //게임오버
	ImageIcon img10;     //장애물 충돌
    ImageIcon img11;    //hp회복 젤리
    ImageIcon img12;    //무적 젤리
    ImageIcon img13;    //블랙아웃 효과

	
	JLabel tacles1, tacles2, tacles3;
	
	ImageIcon ground_obstacle_1;  //1칸짜리 장애물(땅)
    ImageIcon ground_obstacle_2;  //1칸짜리 장애물(땅)
    ImageIcon ground_obstacle_3;  //1칸짜리 장애물(땅)
    ImageIcon ground_obstacle_4;   //3칸짜리 장애물(땅)
    ImageIcon ground_obstacle_5;   //3칸짜리 장애물(땅)
    ImageIcon air_obstacle_2;   //3칸짜리 장애물(공중)
    ImageIcon air_obstacle_3;   //3칸짜리 장애물(공중)
    
    boolean powertime = false;   //파워업 변수
    boolean blackout = false; //블랙아웃 변수
    
    ArrayList<ImageIcon> obstacleArr = new  ArrayList<ImageIcon>();

	
	JLabel jellyhp1,jellypow1,jellyBlack;    //젤리: hp, 무적, 블랙아웃

		//점수 젤리 위치
	int [] jellyPosY = {110, 160, 210, 260, 310, 360, 410, 460, 510, 560, 610};
	int [] jellyPosX = {4020,4070,4120,4170,4220,4270,4320,4370,4420
						,4620,4670,4720,4770};
	    //hp 젤리 위치
    int [] jellyhpPosY = {260,310,360,580};
    int [] jellyhpPosX = {4790,5050,5590};
         //무적 젤리 위치
    int [] jellypowPosY = {160,210,510,610};   
    int [] jellypowPosX = {4800,5100,5600};
             //블랙아웃 젤리 위치
    int [] jellyBlackoutPosY = {100, 200, 300};
    int [] jellyBlackoutPosX = {4300, 4500, 4600};

	       //장애물 y축 위치
	int [] obstacleY = {100,100,100,100,100,100,100}; 
	int groundY = 580;
		
	JLabel score;
	JProgressBar bar;
	
	int hp = 50;
	


	public PlayGame(String id, int dino) {   
		super("달려라!! 고대파충류!!");
		
		
		setBounds(50, 10, 1000, 800);
		setLayout(null);
		
				
		this.id = id;
		this.dino = dino;
		img1 = new ImageIcon("gameimg/char"+ dino +"walk1.png");     //달리기1
		img2 = new ImageIcon("gameimg/char" + dino + "walk2.png");	 //달리기2
		img3 = new ImageIcon("gameimg/char"+dino+"stand.png");       //서있기
		img4 = new ImageIcon("gameimg/char"+dino+"jump.png");        //1단
		img5 = new ImageIcon("gameimg/char"+dino+"fall.png");        //하강
		img6 = new ImageIcon("gameimg/char"+dino+"jumpjump.png");    //2단
		img7 = new ImageIcon("gameimg/char"+dino+"lay.png");         //숙이기
		img8 = new ImageIcon("gameimg/jelly4.png");                 //젤리
		img9 = new ImageIcon("gameimg/char"+dino+"gameover.png");     //게임오버
		img10 = new ImageIcon();                                       //충돌
		img11 = new ImageIcon("gameimg/jelly3.png"); 
		img12 = new ImageIcon("gameimg/jelly2.png"); 
	    img13 = new ImageIcon("gameimg/jelly6.png");      //블렉아웃 젤리
		
																		//장애물 이미지
		obstacleArr.add(ground_obstacle_1 = new ImageIcon("gameimg/ground_obstacle_1.png"));
		obstacleArr.add(ground_obstacle_2 = new ImageIcon("gameimg/ground_obstacle_2.png"));
		obstacleArr.add(ground_obstacle_3 = new ImageIcon("gameimg/ground_obstacle_3.png"));
		obstacleArr.add(ground_obstacle_4 = new ImageIcon("gameimg/ground_obstacle_4.png"));
		obstacleArr.add(ground_obstacle_5 = new ImageIcon("gameimg/ground_obstacle_5.png"));
		obstacleArr.add(air_obstacle_2 = new ImageIcon("gameimg/air_obstacle_2.png"));
		obstacleArr.add(air_obstacle_3 = new ImageIcon("gameimg/air_obstacle_3.png"));
		
		System.out.println(dino);
						
		
		p1 = new JPanel();		
		p1.setBounds(-3000, 0, 8000, 800);
		p1.setLayout(null);
		add(p1);	
		
		character = new JLabel(img1);		
		character.setBackground(new Color(255,255,255));
		character.setOpaque(false);
		character.setBounds(3150, 500, 150, 140);		
		p1.add(character);
		
		bar = new JProgressBar(0,hp*10);
		bar.setBounds(3010, 10, 300, 50);
		bar.setForeground(new Color(255,0,0));
		bar.setValue(hp*10);
		bar.setBorder(null);
		bar.setBackground(new Color(255,255,255,180));
		p1.add(bar);
		
		
		score = new JLabel("나의 젤리: "+jellyCnt);
		score.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		score.setHorizontalAlignment(JLabel.CENTER);
		score.setBounds(3800, 10, 160, 50);
		score.setForeground(Color.BLUE);
		score.setBackground(new Color(255,255,255,180));
		score.setOpaque(true);
		p1.add(score);
		
		
		blackImg = new JLabel();
		blackImg.setBounds(3000, 0, 1000, 640);
		blackImg.setBackground(new Color(0,0,0));
		blackImg.setOpaque(false);
		p1.add(blackImg);

		
		
		//지상 장애물
		tacles1 = new JLabel(obstacleArr.get(rd.nextInt(3)));
		tacles1.setBounds(4400, groundY, 60, 60);
		tacles1.setBorder(null);
		p1.add(tacles1);
		
		//공중
		tacles2 = new JLabel(obstacleArr.get(rd.nextInt(2)+5));
		tacles2.setBounds(4500, obstacleY[rd.nextInt(5)], 80, 150);
		tacles2.setBorder(null);
		p1.add(tacles2);
		
		//지상 장애물
		tacles3 = new JLabel(obstacleArr.get(rd.nextInt(2)+3));
		tacles3.setBounds(4900, groundY-90, 80, 150);
		tacles3.setBorder(null);
		p1.add(tacles3);
								

		
		for(int i = 1; i < 106 ; i++) {
			jelly.add(new JLabel(img8));	
			
		}			
		
		
		int i = 0;
		int k = 0;
		
		for(JLabel j : jelly) {				
		
			j.setBounds(jellyPosX[i], jellyPosY[k], 35, 35);
			p1.add(j);
			i++;
			
			if(i==(jellyPosX.length-1)) {
				k+=1;
				i=0;
			}
			if(k==(jellyPosY.length-1)) {
				break;
			}
			
		}
		
	      jellyhp.add(jellyhp1 = new JLabel(img11));
	      powerup.add(jellypow1 = new JLabel(img12));

	      for(JLabel jhp : jellyhp) {
	          jhp.setBounds(jellyhpPosX[rd.nextInt(3)], jellyhpPosY[rd.nextInt(4)], 35, 35);
	          p1.add(jhp);
	       }
	       
	       for(JLabel jpow : powerup) {
	          jpow.setBounds(jellypowPosX[rd.nextInt(3)], jellypowPosY[rd.nextInt(4)], 35, 35);
	          p1.add(jpow);
	       }
	       
	       

	       jellyBlk.add(jellyBlack = new JLabel(img13));

	       for(JLabel jblk : jellyBlk) {
	           jblk.setBounds(jellyBlackoutPosX[rd.nextInt(jellyBlackoutPosX.length)], jellyBlackoutPosY[rd.nextInt(jellyBlackoutPosY.length)], 35, 35);
	           p1.add(jblk);
	        }


				
		String [] imgs = {                        
				"gameimg/backgroundimg (1).png",
				"gameimg/backgroundimg (2).png",
				"gameimg/backgroundimg (3).png",
				"gameimg/backgroundimg (4).png",
				"gameimg/backgroundimg (5).png",
				"gameimg/backgroundimg (6).png"

		};		
		
		
		img = new ImageIcon(imgs[rd.nextInt(6)]);
		background = new JLabel(img);	
		background.setBounds(3000, 0, 1000, 800);
		p1.add(background);
		
		background2 = new JLabel(img);
		background2.setBounds(4000, 0, 1000, 800);	
		p1.add(background2);
		
		addKeyListener(this);		
		setVisible(true);
		backgoundMove();
		charMove();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	@Override
	public void keyTyped(KeyEvent e) {	
		
	}
	
	public void keyPressed(KeyEvent e) {

		int key = e.getKeyCode();

		switch(key) {
		
	         case KeyEvent.VK_UP:	      
	        	 
	             try {
	                 AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/103_바운스3.wav"));
	                          	                 
	                 Clip clip = AudioSystem.getClip();
	                 clip.stop();
	                 clip.open(ais);
	                 
	                 clip.start();         
	                 
	              } catch (Exception e2) {
	                 
	              }  
	        	 
	        	 if(character.getIcon().equals(img6)) {
	        		 break;
	        	 }
	        	 
	        	 if(character.getY()+character.getHeight()>=640 
	        	 	&& !character.getIcon().equals(img5) 
	        	 	&& !character.getIcon().equals(img9)) {
	        		 
	        		 if(dino==1) {
	        			 character.setSize(130, 180);
	        		 }else if(dino==2 || dino==3){
	        			 character.setSize(150,120);
	        		 }
	        		 
	        	 	 character.setIcon(img4);	        		 
	        		 jumpMove();
	        		 
	        	 }else if(character.getY()<500 
	        			 && character.getIcon().equals(img4)	
	        			 && !character.getIcon().equals(img5)	        			
	        			 && !character.getIcon().equals(img9)) {
	        		 
	        		 if(dino==1) {
	        			 character.setSize(130, 180);
	        		 }else if(dino==2 || dino==3){
	        			 character.setSize(150,120);
	        		 }
	        	 	 character.setIcon(img6);	        		 
	        		 jumpMove2();
	        	 }
	        	 break;
	        	 
	         case KeyEvent.VK_DOWN:
	        	 
     
			   	try {
	                 AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/086_팝.wav"));
	                 
	                 Clip clip = AudioSystem.getClip();
	                 clip.stop();
	                 clip.open(ais);
	                 
	                 clip.start();         
	                 
	              } catch (Exception e2) {
                 
	              }  
	        	 
	        	 if(character.getIcon().equals(img6)) {
	        		 break;
	        	 }else if(character.getIcon().equals(img4)) {
	        		 break;
	        	 }else if(character.getIcon().equals(img5)) {
	        		 break;
	        	 }else if(character.getIcon().equals(img9)) {
	        		 break;
	        	 }else if(character.getY()+character.getHeight()>=640 
	        	 	&& (character.getIcon().equals(img1)
	        	 			||character.getIcon().equals(img2))) {
	        		 
		        	 if(dino==1) {
		        		 character.setBounds(3150, 500, 150,140);
		        	 }else if(dino==2 || dino==3){
		        		 character.setBounds(3150, 520, 150,120);
		        	 }
		        	 character.setIcon(img7);
		        	 break;		        		 
		        	 
	        	 	        		 
	        	 }else {
	        		 break;
	        	 }
			}
		}

	public void keyReleased(KeyEvent e) {	
			if(e.getKeyCode()==(40) 
				&& character.getY()+character.getHeight()>=640
				&& !character.getIcon().equals(img9)) {
				
					character.setBounds(3150, 500, 150,140);
					character.setIcon(img1);
					charMove();
				
			}else {
				return;
			}
		 }
	void backgoundMove(){		                                //배경이동
		
	    new Thread(new Runnable() {

			public void run() {
				int x = background.getX(), x2 = background2.getX();
				int y = background.getY(), y2 = background2.getY(); 
				int bx = 10;	
				
				while(true) {
	
					try {		
						
						Thread.sleep(50);
						
						if(background.getX()<=2000) {
							x = 4000;			
							background.setLocation(x, y);
						}
						
						if(background2.getX()<=2000) {
							x2 = 4000;	
							background2.setLocation(x, y);
						}
						
						if(character.getY()+character.getHeight()>=650) {
							if(character.getIcon().equals(img1) ||character.getIcon().equals(img2)){
										character.setLocation(3150, 500);										
							}
						}
						
						
						
						
						hit();		
		                hpjellyhit();
		                powhit();
		                
		                jellyMove();	
		                jellyhpMove();
		                jellypowerMove();
		                hpLeft();
		                
		                jellyBlackoutMove();
		                
						gogogo();						
						obsHit();
						


						if(bar.getValue()==0) {    //게임종료
				             try {
				                 AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/107_왕왕왕와~~~~~.wav"));
				                          	                 
				                 Clip clip = AudioSystem.getClip();
				                 clip.stop();
				                 clip.open(ais);
				                 
				                 clip.start();         
				                 
				              } catch (Exception e2) {
				                 
				              } 
							character.setLocation(3150, 500);
							character.setIcon(img9);	
							new GameResult(id, jellyCnt, dino);
							dispose();
							break;
						}
						
						background2.setLocation(x2-=bx, y2);
						background.setLocation(x-=bx, y);
						
						
						
					} catch (Exception e) {
	
						e.printStackTrace();
					}
	
					}
				}
			}).start();
		}
	
	
	void charMove(){			                               //달리기
		
		new Thread(new Runnable() {
			public void run() { //캐릭터 이동 시작	
				
				while(true) {
				   try {	
						Thread.sleep(100);	
						
						character.setBounds(3150, 500, 150,140);
												
						if(character.getIcon().equals(img1)) {
							character.setIcon(img2);
							
						}else if(character.getIcon().equals(img2)) {
							character.setIcon(img1);			
						}else {
							break;
						}						
										
						
						}catch (Exception e) {
						
							e.printStackTrace();
						}							
					}
				}
		}).start();
	}
	

	
	void jumpMove(){			                             //1단 점프
		
		new Thread(new Runnable() {
			public void run() { //캐릭터 이동 시작	
				int x = character.getX();
				int cy = 10;
				
				
				   try {	
					   while(!character.getIcon().equals(img5)) {

							Thread.sleep(10);					
			        		 if(dino==1) {
			        			 character.setSize(130, 180);
			        		 }else if(dino==2 || dino==3){
			        			 character.setSize(150,120);
			        		 }
							character.setLocation(x, character.getY()-cy);
		
							if(character.getIcon()!=img4) {
								break;
							}
							
							if(character.getY()<=250) {	
								character.setIcon(img5);
								Thread.sleep(50);
								fallMove();								
								break;								
														
							}
							
						}

					}catch (Exception e) {
					
						e.printStackTrace();
					}										
				}
			}).start();
		}
	
	void jumpMove2(){			                             //2단 점프
		
		new Thread(new Runnable() {
			
			public void run() { //캐릭터 이동 시작	
				int cy = 10;
				
				
				   try {	
					   while(!character.getIcon().equals(img5)) {
							Thread.sleep(10);					
							
							character.setLocation(character.getX(), character.getY()-cy);
		
							if(character.getY()<=80) {
								character.setIcon(img5);
								Thread.sleep(50);
								fallMove();								
								break;						
															
							}						
						}

					}catch (Exception e) {
					
						e.printStackTrace();
					}										
				}
			}).start();
		}
	

	
	void fallMove(){			                              //하강
		
		new Thread(new Runnable() {
			public void run() { //캐릭터 이동 시작	
				int x = character.getX();
				int cy = 10;
				
				
				   try {	
					   while(true) {
							
							Thread.sleep(10);			
												
							character.setLocation(x, character.getY()+ cy);
							
							if(!character.getIcon().equals(img5)) {
								break;
							}
			
							if(character.getY()+character.getHeight()>=640) {
								if(dino==1) {
									character.setBounds(3150, 500, 150,140);
								}else {
									character.setBounds(3150, 500, 150,140);
								}	
								character.setIcon(img1);
								charMove();							
								break;
							}
					   }
					   
					}catch (Exception e) {
					
						e.printStackTrace();
					}											   
				}
			}).start();
		}
	
	 void powertime(){                               //무적 효과 
         
	      new Thread(new Runnable() {
	         public void run()  {
	                  try {   
	                     
	                     powertime = true;
	                     System.out.println("파워업시작");
	                     Thread.sleep(3000);               
	                        

	                  }catch (Exception e) {
	                  
	                     e.printStackTrace();
	                  }
	                  powertime = false;  
	                  pu = true;
	                
	                  System.out.println("파워업종료");
	                          
	         }
	      }).start();
	   }
		
	 void blackTime() {
	       new Thread(new Runnable() {
	           public void run()  {
	        	   
	                    try {
	                    	  try {
	         	                 AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/091_카툰 웃음.wav"));
	         	                          
	         	                 System.out.println("클릭");
	         	                 
	         	                 Clip clip = AudioSystem.getClip();
	         	                 clip.stop();
	         	                 clip.open(ais);
	         	                 
	         	                 clip.start();         
	         	                 
	         	              } catch (Exception e2) {
	         	                 
	         	              }  
	                       blackout = true;
	                       blackImg.setOpaque(true);  
	                       Thread.sleep(3000);               
	                            
	                       blackImg.setOpaque(false); 

	                   }catch (Exception e) {
	                      
	                       e.printStackTrace();
	                   }
	                       blackout = false;  
	                       System.out.println("블랙아웃 종료");	                              
	             }
	          }).start();
	   }

	 
	int jellyCnt = 0;		
	
	ArrayList<JLabel> jelly = new ArrayList<JLabel>();
	
	void jellyMove() {                                           //젤리 이동+
			for(JLabel j :jelly) {
			j.setLocation(j.getX()-20, j.getY());	
			
			if(j.getX()+ j.getWidth() < 3000) {					
				j.setLocation(4000, j.getY());

				if(j.getIcon()==null) {
					score.setText("나의 젤리: "+ Integer.toString(jellyCnt));
					jellyCnt+=1;
					j.setIcon(img8);		

				}				

			}							
		}
			hit();
		
	}		
	
	 ArrayList<JLabel> jellyhp = new ArrayList<JLabel>();     //hp아이템 이동
	   
	   void jellyhpMove() {  //젤리 이동+
	         for(JLabel jhp :jellyhp) {
	         jhp.setLocation(jhp.getX()-15, jhp.getY());   
	         
	         if(jhp.getX()+ jhp.getWidth() < 3000) {               
	            jhp.setLocation(4000, jellyhpPosY[rd.nextInt(4)]);

	            if(jhp.getIcon()==null) {
	               
	               jhp.setIcon(img11);               
	               
	               
	                              
	            }               
	         }                     
	      }
	         hpjellyhit();	      
	   }
	   
	ArrayList<JLabel> powerup = new ArrayList<JLabel>();      //무적 아이템 이동
	   
	   void jellypowerMove() {  //젤리 이동+
	         for(JLabel jpow : powerup) {
	         jpow.setLocation(jpow.getX()-15, jpow.getY());   
	         
	         if(jpow.getX()+ jpow.getWidth() < 3000) {               
	            jpow.setLocation(5000, jellyhpPosY[rd.nextInt(4)]);

	            if(jpow.getIcon()==null) {
	               
	               jpow.setIcon(img12);               
	               
	               
	                              
	            }               
	         }                     
	      }
	         powhit();
	         
	      
	}
	   
	ArrayList<JLabel> jellyBlk = new ArrayList<JLabel>(); // blackout effect
	   
	void jellyBlackoutMove() { // jelly move
	   for(JLabel jblk : jellyBlk) {
	      jblk.setLocation(jblk.getX()-15, jblk.getY());
	      if(jblk.getX() + jblk.getWidth() <3000) {
	         jblk.setLocation(4000, jellyBlackoutPosY[rd.nextInt(jellyBlackoutPosY.length)]);
	            
	         if(jblk.getIcon() == null) {
	            jblk.setIcon(img13);
	         }
	      }
	   }
       if(blackout == false) {
    	   blackhit();
       }  	   
	}

	   
	
	void hit(){                                              //젤리(점수) 먹기
		
		for(JLabel j : jelly) {			

		   if( (character.getX())+ character.getWidth() > j.getX() &&
				 (character.getX()) < j.getX() + j.getWidth() &&
				  character.getY()+character.getHeight() > j.getY() &&
				  character.getY() < j.getY() + j.getHeight()) {
			   
			   	j.setIcon(null);

			   			    	
		   }			   
		}
	}
	
	
	 void hpjellyhit(){                                         //회복 젤리 먹기
	      
	      for(JLabel jhp : jellyhp) {         

	         if( (character.getX())+ character.getWidth() > jhp.getX() &&
	             (character.getX()) < jhp.getX() + jhp.getWidth() &&
	              character.getY()+character.getHeight() > jhp.getY() &&
	              character.getY() < jhp.getY() + jhp.getHeight()) {
	            
	        	 
	               jhp.setIcon(null);   
	               bar.setValue(bar.getValue()+5);

	               if(soundTime==false) {
	            	   soundTime=true;
	            	   hpSoundTime();
	               }
	         }            
	      }
	   }
	 
	 boolean soundTime = false;
	 void hpSoundTime(){                               //무적 효과 
         
	      new Thread(new Runnable() {
	         public void run()  {
				   	try {
		                 AudioInputStream ais = AudioSystem.getAudioInputStream(new File("gameimg/061_뾰로로롱 (하프).wav"));
		                 
		                 Clip clip = AudioSystem.getClip();
		                 clip.stop();
		                 clip.open(ais);
		                 
		                 clip.start();         
		                 
		                 
		                 Thread.sleep(3000);   
		                 
		              } catch (Exception e2) {
	                 
		              }  
				   	soundTime=false;
	         }
	      }).start();
	   }

	 
	

	boolean pu=true;
	void powhit(){                                               //무적 젤리 먹기
	   
	   for(JLabel jpow : powerup) {         

	      if( (character.getX())+ character.getWidth() > jpow.getX() &&
	          (character.getX()) < jpow.getX() + jpow.getWidth() &&
	           character.getY()+character.getHeight() > jpow.getY() &&
	           character.getY() < jpow.getY() + jpow.getHeight()) {
	         
	            jpow.setIcon(null);	            

	           
	            if(pu==true) {
	            	powertime();
	            	pu=false;
	            }else {
	            	return;
	            }
	      }
	    
	   }
	}
	
	void blackhit(){
	      
	      for(JLabel jblk : jellyBlk) {         

	         if( (character.getX())+ character.getWidth() > jblk.getX() &&
	             (character.getX()) < jblk.getX() + jblk.getWidth() &&
	              character.getY()+character.getHeight() > jblk.getY() &&
	              character.getY() < jblk.getY() + jblk.getHeight()) {
	            
	               jblk.setIcon(null);   
	               blackTime();
	         }
	      }
	   }


	
	void hpLeft() {                                               //hp체력 바
		
		bar.setValue(bar.getValue()-1);
		hit();
		
	}
	
	void gogogo() {	                                           //장애물 이동
		
		tacles1.setLocation(tacles1.getX()-25, tacles1.getY());
		tacles2.setLocation(tacles2.getX()-30, tacles2.getY());
		tacles3.setLocation(tacles3.getX()-25, tacles3.getY());
		
			if(tacles1.getX()+ tacles1.getWidth() < 3000) {						
				tacles1.setLocation(4000, groundY);
				tacles1.setIcon(obstacleArr.get(rd.nextInt(3)));
			}
		
			if(tacles2.getX()+ tacles2.getWidth() < 3000) {	
				tacles2.setLocation(4000, obstacleY[rd.nextInt(5)]);
				tacles2.setIcon(obstacleArr.get(rd.nextInt(2)+5));
			}
			
			if(tacles3.getX()+ tacles3.getWidth() < 3000) {	
				tacles3.setLocation(4000, groundY-90);
				tacles3.setIcon(obstacleArr.get(rd.nextInt(2)+3));
			}
	}
	
	
	
    ArrayList<JLabel> tacles = new  ArrayList<JLabel>();

    
	void obsHit() {                                            //장애물 충돌
		 
		
		   if( (character.getX())+ character.getWidth() > tacles1.getX() &&
				 (character.getX()) < tacles1.getX() + tacles1.getWidth() &&
				  character.getY()+character.getHeight() > tacles1.getY() &&
				  character.getY() < tacles1.getY() + tacles1.getHeight()) {				   

			   	try {				   		
			   		  if(character.getY()+character.getHeight()>=640
			   				&& powertime==false) {
			   			  
					   		character.setIcon(img10);
					   		bar.setValue(bar.getValue()-3); 	   	
							Thread.sleep(50);		
							
							character.setIcon(img1);						
							charMove();
			   		  
			   		  }else if(character.getY()+character.getHeight()<640
			   				  	&& powertime==false){
			   			  
					   		character.setIcon(img10);
					   		bar.setValue(bar.getValue()-3); 	   	
							Thread.sleep(50);		
							
							character.setIcon(img5);						
							fallMove();
			   		  
			   		  
			   		  }else if(character.getY()+character.getHeight()<640 && powertime == true){
	                       
			   			tacles1.setIcon(img10);	                      
	                       
			   		  }else if(character.getY()+character.getHeight()>=640 && powertime == true) {
	                  
			   			tacles1.setIcon(img10);	            	                     
			   		  }
					
				} catch (Exception e) {
		
					e.printStackTrace();
				}
		   
		   }else if( (character.getX())+ character.getWidth() > tacles2.getX() &&
				 (character.getX()) < tacles2.getX() + tacles2.getWidth() &&
				  character.getY()+character.getHeight() > tacles2.getY() &&
				  character.getY() < tacles2.getY() + tacles2.getHeight()) {				   

			   	try {				
			   			
			   			if(powertime == false) { 
			   				character.setIcon(img10);
			   			
			   		   		
					   		bar.setValue(bar.getValue()-3); 	   	
							Thread.sleep(100);		
							
							character.setIcon(img5);						
							fallMove();
			   			
			   			}else if(powertime == true) {
			   			   tacles2.setIcon(img10);
			   			}
					
				} catch (Exception e) {
		
					e.printStackTrace();
				}
		   }else if( (character.getX())+ character.getWidth() > tacles3.getX() &&
					 (character.getX()) < tacles3.getX() + tacles3.getWidth() &&
					  character.getY()+character.getHeight() > tacles3.getY() &&
					  character.getY() < tacles3.getY() + tacles3.getHeight()) {				   

				   	try {				   		
				   		  if(character.getY()+character.getHeight()>=640
				   				&& powertime == false) {
				   			  
						   		character.setIcon(img10);
						   		bar.setValue(bar.getValue()-3); 	   	
								Thread.sleep(100);		
								
								character.setIcon(img1);						
								charMove();
				   		  
				   		  }else if(character.getY()+character.getHeight()<640
				   				&& powertime == false){
				   			  
						   		character.setIcon(img10);
						   		bar.setValue(bar.getValue()-3); 	   	
								Thread.sleep(100);		
								
								character.setIcon(img5);						
								fallMove();
								
				   		  }else if(character.getY()+character.getHeight()<640 && powertime == true){
		                         	                          
	                          tacles3.setIcon(img10);	                   
	                          
	                           
				   		  }else if(character.getY()+character.getHeight()>=640 && powertime == true) {
	                      
	                       	  tacles3.setIcon(img10);
	                	                     
				   		  }

						
					} catch (Exception e) {
			
						e.printStackTrace();
					}
				   	
			}else {
				   
		   }
		}
	}		