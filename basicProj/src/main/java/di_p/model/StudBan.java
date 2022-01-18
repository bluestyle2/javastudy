package di_p.model;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class StudBan {
	int ban;
	List<Stud> studs;
	
	LinkedHashMap<String, Stud> res = null;
	
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public List<Stud> getStuds() {
		return studs;
	}
	public void setStuds(List<Stud> studs) {
		this.studs = studs;
		
		res = new LinkedHashMap<>();
		Stud ttt = new Stud();
		ttt.name = "총합";
		ttt.setJum(new int[3]);
		
		Stud avg = new Stud();
		avg.name = "평균";
		avg.setJum(new int[3]);
		
		for (Stud st : studs) {
			for (String title : st.title) {
				
				ttt.jum4.put(title, st.jum4.get(title)+ttt.jum4.get(title));
				
			}
			
			/*
			 * if(res.containsKey("최소")) { res.put("최소", st); } if(!res.containsKey("최대")) {
			 * res.put("최대", st); } if(res.get("최소").avg > st.avg) { res.put("최소", st); }
			 * if(res.get("최대").avg < st.avg) { res.put("최대", st); 12-13-16:45}
			 */
		}
		

		for (String title : ttt.title) {
						
			avg.jum4.put(title, ttt.jum4.get(title)/studs.size());
			
		}
		System.out.println(ttt);
		res.put("평균", avg);
	}
	
	
	@Override
	public String toString() {
		String res = "[" + ban + " 반]\n";
		
		for (Stud stud : studs) {
			res+= stud.toString()+"\n";
		}
		
		
		for (Map.Entry<String, Stud> me : this.res.entrySet()) {
			res+= me.toString()+"\n";
		}
		
		return  res;
	}
	
	
}
