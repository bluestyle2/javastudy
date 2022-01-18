package collection_p;

import java.util.TreeMap;
import java.util.Map;
public class TreeMapBaseBallMe {

	public static void main(String[] args) {
		
		
	      String [] hits = {"h3","a5","a7","h9","h1","h3","a5","a6","h2","a3","a5","h9","h3","a7","h9"};
	      
	      TreeMap teams = new TreeMap();
	      
	      for (String string : hits) {
	         //System.out.println(string);
	         TreeMap<Character, Integer> tt;
	         
	         
	         char ch = string.charAt(0);
	         char no = string.charAt(1);
	         
	         //System.out.println(ch+":"+teams.containsKey(ch));
	         
	         if(teams.containsKey(ch)) {
	            tt = (TreeMap)teams.get(ch);
	         }else {
	         
	            tt = new TreeMap<Character, Integer>();
	            teams.put(ch, tt);
	         }
	         
	         int cnt = 1;
	         
	         if(tt.containsKey(no)) {
	            cnt += tt.get(no);
	         }
	         
	         tt.put(no, cnt);
	         
	      }
	      
	      //System.out.println(teams);
	      
	      for (Object team : teams.entrySet()) {
	         Map.Entry me = (Map.Entry)team;
	         System.out.println(me.getKey()+">>>>");
	         
	         for (Object player: ((TreeMap)me.getValue()).entrySet()) {
	            System.out.println(player);
	         }
	         
	      }

	   }

	}
