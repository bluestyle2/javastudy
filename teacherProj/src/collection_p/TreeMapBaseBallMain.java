package collection_p;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBaseBallMain {

   public static void main(String[] args) {


      int [] arr = {2,4,6,7,1,2,4,6,1,6,7,1,8};
      
      TreeMap map = new TreeMap();
      
      for (int i : arr) {
         //System.out.println(i);
         
         int cnt = 1;
         
         if(map.containsKey(i)) {
            cnt += (int)map.get(i);
         }
         map.put(i,cnt);
      }
      
      for (Object oo : map.entrySet()) {
         
         System.out.println(oo);
      }
      
      
      String [] hits = {"h3","a5","a7","h9","h1","h3","a5","a6","h2","a3","a5","h9","h3","a7","h9"};
      
      /*
         teams --> < char, TreeMap>
                             |
                             v
                         <char, int>
                         
         teams --> < Character ch, TreeMap tt>
                                     |
                                     v
                              <Character no, Integer cnt>
       * 
       * */
      
      TreeMap<Character, TreeMap<Character, Integer> > teams = new TreeMap();
      
      for (String string : hits) {
         //System.out.println(string);
         TreeMap<Character, Integer> tt;
         
         
         char ch = string.charAt(0);
         char no = string.charAt(1);
         
         //System.out.println(ch+":"+teams.containsKey(ch));
         
         if(teams.containsKey(ch)) {
            tt = teams.get(ch);
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
      
      for (Map.Entry<Character, TreeMap<Character, Integer> > me : teams.entrySet()) {
         
         System.out.println(me.getKey()+">>>>");
         
         for (Map.Entry<Character, Integer> player: me.getValue().entrySet()) {
            System.out.println(player);
         }
         
      }

   }

}