package di_p.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stud extends Member {

	String kind;
	int [] jum;
	int tot,avg;
	
	String [] title = {"국어","영어","수학"};
	
	List<Integer>jum2;
	Set<Integer>jum3;
	Map<String,Integer>jum4;
	
	
	public int getTot() {
	
		return tot;
	}

	public void setTot(int tot) {
		
		this.tot = tot;
	}

	public int getAvg() {
		
		return avg;
	}

	public void setAvg(int avg) {
		
		this.avg = avg;
	}

	public int[] getJum() {
		return jum;
	}

	public void setJum(int[] jum) {
		this.jum = jum;
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < jum.length; i++) {
			map.put(title[i], jum[i]);
		}
		
		setJum4(map);
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	
	
	public List<Integer> getJum2() {
		return jum2;
	}

	public void setJum2(List<Integer> jum2) {
		this.jum2 = jum2;
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < jum2.size(); i++) {
			map.put(title[i], jum2.get(i));
		}
		
		setJum4(map);
	}

	public Set<Integer> getJum3() {
		return jum3;
	}

	public void setJum3(Set<Integer> jum3) {
		this.jum3 = jum3;
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		int cnt = 0;
	for (Integer i : jum3) {
		 map.put(title[cnt], i);
		 cnt++;
	}
		
		setJum4(map);
	}

	public Map<String, Integer> getJum4() {
		return jum4;
	}

	public void setJum4(Map<String, Integer> jum4) {
		this.jum4 = jum4;
		
		tot = 0;
		for(Map.Entry<String, Integer> me : jum4.entrySet()) {
			tot += me.getValue();
		}
		avg = tot/jum4.size();
	}

	@Override
	public String toString() {
		return "Stud [name=" + name + ", jum4=" + jum4 + ", tot=" + tot + ", avg=" + avg + "]\n";
	}

	

	
}

class Baby extends Member {

	String toy;

	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	@Override
	public String toString() {
		return "Baby [toy=" + toy + ", name=" + name + ", age=" + age + ", marriage=" + marriage + "]";
	}
	
}
