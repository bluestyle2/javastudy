package basic;

import java.util.ArrayList;
import java.util.TreeSet;


public class Stud implements Comparable<Stud>{
	String name, grade, pid, pw;
	ArrayList<Integer> jum;
	
	int ban,tot, avg, rank;

	public boolean loginChk(String pid, String pw) {
		
		return this.pid.equals(pid) && this.pw.equals(pw);
	}
public boolean loginChk2(Object pid, Object pw) {
		
		return this.pid.equals(pid) && this.pw.equals(pw);
	}
	public String getPid() {
		return pid;
	}


	public void setPid(String pid) {
		this.pid = pid;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Stud(String pid, String pw, String name) {
		super();
		this.name = name;
		this.pid = pid;
		this.pw = pw;
	}


	public Stud(String name, String ... jum) {
		super();
		this.name = name;
		this.jum = new ArrayList<Integer>();	
		
		for(String str : jum) {
			//System.out.println(str);
			this.jum.add(Integer.parseInt(str));
		}
		
		calc();
	}
	
	
	public Stud(int ban, String name, String ... jum) {
		super();
		this.ban = ban;
		this.name = name;
		this.jum = new ArrayList<Integer>();	
		
		for(String str : jum) {
			//System.out.println(str);
			int jj = 0;
			if(str!=null && !str.trim().equals("")) {
				jj = Integer.parseInt(str);
			}
			this.jum.add(jj);
		}
		
		calc();
	}
	void calc() {
		tot = 0;
		for (Integer i : jum) {
			tot += i;
		}
		
		avg = tot/jum.size();
		
		grade = "가가가가가가양미우수수".charAt(avg/10)+"";
	}
	
	void rankCalc(TreeSet<Stud> set) {
		
		rank = 1;
		for (Stud you : set) {
			if(you.avg>avg) {
				rank++;
			}
		}
		
	}

	public String getName() {
		return name;
	}

	public Integer getJum(int no) {
		return jum.get(no);
	}

	public int getTot() {
		return tot;
	}

	public int getAvg() {
		return avg;
	}


	public String getGrade() {
		return grade;
	}


	public int getBan() {
		return ban;
	}
	
	public String tr() {
		
		String res = "<tr>";
		res += "<td>"+ban+"</td>";
		res += "<td>"+name+"</td>";
		
		for (Integer i : jum) {
			res += "<td>"+i+"</td>";
		}
		res += "<td>"+tot+"</td>";
		res += "<td>"+avg+"</td>";
		res += "<td>"+grade+"</td>";
		res += "<td>"+rank+"</td>";
		res += "</tr>";
		
		return res;
		
	}

	@Override
	public int compareTo(Stud o) {
		int res = o.avg - avg;
		
		if(res==0) {
			res = name.compareTo(o.name);
		}
		
		return 0;
	}
	
	
}
