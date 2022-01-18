package basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {

	String pid, pname, pw, pic, friend,whatcof;
	
	int age, pno, kor, eng, mat,cofnum,price ;
	
	double height;
	
	boolean marriage;
	
	Date reg_date;
	
	
	
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	
	public String getReg_dateStr() {
		
		if(reg_date==null)
			return "";
		
		return sdf.format(reg_date);
	}
	
	public void setReg_dateStr(String reg_dateStr) {
		try {
			if(reg_dateStr!=null && !reg_dateStr.trim().equals(""))
				
			this.reg_date = sdf.parse(reg_dateStr);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	//4시 19분
	//	public int getTot() {
//		return kor + eng + mat;
//		
//	}
//
//	public int getAvg() {
//		return getTot/3;
//		
//	}
	public Person() {
		// TODO Auto-generated constructor stub
	}

	
	public Person(String pid) {
		super();
		this.pid = pid;
	}
	
	
	
	
	public String getWhatcof() {
		return whatcof;
	}

	public void setWhatcof(String whatcof) {
		this.whatcof = whatcof;
	}

	public int getCofnum() {
		return cofnum;
	}

	public void setCofnum(int cofnum) {
		this.cofnum = cofnum;
	}

	public int getPrice() {
		switch(whatcof){
		case "아메리카노" : 
			price = cofnum*2200;
			break;
		case "아프리카노" :
			price = cofnum*2500;
			break;
		case "아시아노" :
			price = cofnum*2700;
			break;
		}
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getFriend() {
		return friend;
	}

	public void setFriend(String friend) {
		this.friend = friend;
	}

	public Date getReg_date() {
		return reg_date;
	}
	

	public void setReg_date(Date reg_date) {		
		this.reg_date = reg_date;
	}
	
	public int getTot() {
		return kor + eng + mat;
		
	}
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getAvg() {
		return getTot()/3;
	}
	
	public String getGrade() {
		return "가가가가가가양미우수수".charAt(getAvg()/10)+"";
	}
	
	
	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public boolean isMarriage() {
		return marriage;
	}

	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	public String getPname() {
					
		return pname;
		
	}

	public void setPname(String pname) {
		this.pname = pname;
	}



	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	
	
}
