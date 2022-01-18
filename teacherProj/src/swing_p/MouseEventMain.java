package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventMain extends JFrame implements MouseMotionListener,MouseListener {

	JLabel me;
	
	public MouseEventMain() {
		setBounds(100,100,1000,600);
		setLayout(null);
		me = new JLabel();
		me.setOpaque(true);
		me.setBackground(new Color(255,255,0));
		me.setBounds(500, 300, 100, 100);
		add(me);
		
		addMouseMotionListener(this);
		addMouseListener(this);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MouseEventMain();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	//	System.out.println("Drag:"+e.getX()+","+e.getY());
	//	me.setLocation(e.getX()-50, e.getY()-80);
	//	me.setLocation(e.getX()-me.getWidth()/2, e.getY()-me.getHeight()/2);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		
	}
	
	int lastX;

	@Override
	public void mouseClicked(MouseEvent e) {
	//	System.out.println("mouseClicked:"+e.getX()+","+e.getY());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	//	System.out.println("mousePressed:"+e.getX()+","+e.getY());
		lastX = e.getX();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	//	System.out.println("mouseReleased:"+e.getX()+","+e.getY());
	//	System.out.println(e.getX()+":"+lastX);
		if(e.getX()>lastX) {
			System.out.println("<-");
		}else{
			System.out.println("->");
			
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	//	System.out.println("mouseEntered:"+e.getX()+","+e.getY());
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
	//	System.out.println("mouseExited:"+e.getX()+","+e.getY());
		
	}

}
