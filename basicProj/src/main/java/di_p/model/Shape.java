package di_p.model;

public class Shape {
	String name;
	double boader, dulre;
	int w,s,h;
	
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public Shape(int w) {
		super();		
		this.name = "원";
		this.w = w;
		this.boader= w*w*3.14;
		this.dulre= w*2*3.14;
	}

	public Shape(int w,int s) {
		super();		
		this.name = "직사각형";
		this.w = w;
		this.s = s;
		this.boader= w*s;
		this.dulre= w+s*2;
	}
	public Shape(int w,int s,int h) {
		super();		
		this.name = "직삼각형";		
		this.boader=s*h/2;
		this.dulre= w+s+h;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBoader() {
		return boader;
	}
	public void setBoader(double boader) {
		this.boader = boader;
	}
	public double getDulre() {
		return dulre;
	}
	public void setDulre(double dulre) {
		this.dulre = dulre;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	@Override
	public String toString() {
		return "Shape [name=" + name + ", boader=" + boader + ", dulre=" + dulre +"]";
	}
	
	
}
