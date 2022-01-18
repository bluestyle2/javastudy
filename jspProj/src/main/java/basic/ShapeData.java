package basic;

import java.util.Arrays;

public class ShapeData {
	
	int [] line;
	
	int area, border;
	
	String name;
	
	
	public int[] getLine() {
		return line;
	}
	public void setLine(int[] line) {
		System.out.println("setLine() 실행:"+Arrays.toString(line));
		this.line=line;
		name = "원,직사각형,직각삼각형".split(",")[line.length-1];
		
		switch(line.length) {	//line의 갯수에따라 달라짐
			case 1:
				double pi = 3.141592;
				area = (int)(line[0]*line[0]*pi);
				border = (int)(line[0]*2*Math.PI);
				break;
			case 2:
				area = line[0]*line[1];
				border = (line[0]+line[1])*2;
				break;
			case 3:
				area = line[0]*line[1] / 2;
				border = line[0]+line[1]+line[2];
				break;
		}
	}
	
	public String getName() {

		return name;
	}
	
	public int getArea() {
		
		return area;
	}

	public int getBorder() {

		return border;
	}
}

