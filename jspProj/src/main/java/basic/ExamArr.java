package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.servlet.http.HttpServletRequest;

public class ExamArr {
	
	TreeMap<Integer, TreeSet<Stud>>map;
	
	public ExamArr(HttpServletRequest req) {
		
		map = new TreeMap<Integer, TreeSet<Stud>>();
		
		String [] pname = req.getParameterValues("pname");
		
		for (int i = 0; i < pname.length; i++) {
			
			if(pname[i]!=null && !pname[i].trim().equals("")) {	//pname이 있는지 없는지 알아내는 if문
				
				int ban = Integer.parseInt(req.getParameterValues("ban")[i]);
				
				if(!map.containsKey(ban)) {
					map.put(ban,  new TreeSet<Stud>());
				}
				
				map.get(ban).add(new Stud(
						ban,
						pname[i],
						req.getParameterValues("kor")[i],
						req.getParameterValues("eng")[i],
						req.getParameterValues("mat")[i]						
						));
			}
		}
		rankCalc();
	}
	
	void rankCalc() {
		for (TreeSet<Stud>set : map.values()) {
			for(Stud st : set) {
				st.rankCalc(set);
			}
		}
	}
}
