package collection_p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



/*
//MapExamMain --> Generic 으로 변환해 주세요

*/


class MapStud implements Comparable<MapStud>{
   
   String ban, name;
   ArrayList<Integer> jum;
   int tot, avg;
   MapStud(String ban, String name, int ... jum) {
      
      this.ban = ban;
      this.name = name;
      this.jum = new ArrayList();
      
      for (int i : jum) {
         this.jum.add(i);
      }
      
      calc();
   }
   
   void calc() {
      tot = 0;
      for (Object object : jum) {
         tot += (int)object;
      }
      avg = tot/jum.size();
   }

   @Override
   public int compareTo(MapStud you) {
      
      int res = you.avg - avg;
      
      if(res == 0){
         res = name.compareTo(you.name);
      }
         
      return res;
   }

   @Override
   public String toString() {
      return ban + "\t" + name + "\t" + jum + "\t" + tot + "\t" + avg;
   }
   
   
   
}



public class MapExamMain {
/*
   //Map -> <반,    Map>
                 |
                 v     
                 <합격/불합격,TreeSet>
                           |
                          v
                     MapStud, MapStud, MapStud
                     
                      
    //Map -> <new BanTitle(반,합격),TreeSet>
             <new BanTitle(반,불합격),TreeSet>
                                    |
                                   v
                        MapStud, MapStud, MapStud       
            
            
   //Map -> <반,    Map>
                 |
                 v     
                 <합격/불합격,MyTreeSet>
                           |
                          v
                     MapStud, MapStud, MapStud
                 
*/   
   public static void main(String[] args) {
      HashMap<String, HashMap<String, TreeSet<MapStud>>> map = new HashMap();
      
      MapStud [] arr = { 
         new MapStud("개나리", "장동건", 77,78,71),
         new MapStud("소나리", "장서건", 67,68,61),
         new MapStud("개나리", "장왼건", 97,98,91),
         new MapStud("닭나리", "장남건", 95,98,91),
         new MapStud("닭나리", "장북건", 57,58,95),
         new MapStud("소나리", "장오건", 57,58,51),
         new MapStud("개나리", "장위건", 87,78,61),
         new MapStud("소나리", "장아건", 97,88,71),
         new MapStud("소나리", "장중건", 57,68,71),
         new MapStud("닭나리", "장가건", 78,88,18),
         new MapStud("소나리", "장금건", 79,89,19),
         new MapStud("닭나리", "장은건", 76,68,61),
         new MapStud("소나리", "장철건", 67,58,51),
         new MapStud("닭나리", "장구건", 97,78,71),
         new MapStud("개나리", "장팔건", 97,88,61)
      };
      
      for (MapStud ms : arr) {
         //System.out.println(ms.ban+":"+map.containsKey(ms.ban));
         
         HashMap<String, TreeSet<MapStud>> banMap;
         TreeSet<MapStud> success, fail;
         
         
         if(map.containsKey(ms.ban)) {
            banMap = map.get(ms.ban);
            
            success = banMap.get("합격");
            fail = banMap.get("불합격");
         }else {
            
            banMap = new HashMap();
            
            
            success = new TreeSet();
            fail = new TreeSet();
            
            banMap.put("합격",success);
            banMap.put("불합격",fail);
            
            map.put(ms.ban,banMap);

         }
         
         if(ms.avg>=80) {
            success.add(ms);   
         }else {
            fail.add(ms);
         }
            
      }

      
      //Set<Map.Entry<String, HashMap<String, TreeSet<MapStud>>>> ss =  map.entrySet();
      //for (Object ooo : ss) {
      for (Map.Entry<String, HashMap<String, TreeSet<MapStud>>> big  : map.entrySet()) {
      //for (Map.Entry<String, HashMap<String, TreeSet<MapStud>>> big  : ss) {
         //Map.Entry big = (Map.Entry)ooo;
         
         //Map.Entry<String, HashMap<String, TreeSet<MapStud>>> big = (Map.Entry)ooo;
         
         //String ban = (String)big.getKey();
         
         System.out.println(big.getKey()+">>>>>");
         //System.out.println(ban+">>>>>");
         
         //HashMap<String, TreeSet<MapStud>> bm = (HashMap)big.getValue();
         
         
         //Set<Map.Entry<String, TreeSet<MapStud>>> bmss =  bm.entrySet();
         for (Map.Entry<String, TreeSet<MapStud>> mm : big.getValue().entrySet()) {
         //for (Map.Entry<String, TreeSet<MapStud>> mm : bm.entrySet()) {
         //for (Map.Entry<String, TreeSet<MapStud>> mm : bmss) {
         //for (Object bmooo : bmss) {
         
            //Map.Entry<String, TreeSet<MapStud>> mm = (Map.Entry)bmooo;
            
            //String sf = (String)mm.getKey();
            
            System.out.println("  ["+mm.getKey()+"]");
            
                  
            MapStud tot = new MapStud("", "합계", 0,0,0);
            MapStud max = new MapStud("", "최대", 0,0,0);
            MapStud min = new MapStud("", "최소", 100,100,100);
   
            //TreeSet<MapStud> vvSet = (TreeSet)mm.getValue();
            //for (MapStud st : vvSet) {
            for (MapStud st : mm.getValue()) {
               
               System.out.println(st);
               
               //과목
               for (int i = 0; i < tot.jum.size(); i++) {
                  
                  int tot_i = tot.jum.get(i);
                  int max_i = max.jum.get(i);
                  int min_i = min.jum.get(i);
                  
                  int st_i = st.jum.get(i);
                  
                  //합계
                  tot.jum.set(i, tot_i + st_i);
                  
                  //최대
                  if(max_i <  st_i) {
                     max.jum.set(i, st_i);
                  }
                  
                  //최소
                  if(min_i >  st_i) {
                     min.jum.set(i, st_i);
                  }
      
               }
               tot.tot+= st.tot;
               tot.avg+= st.avg;
               
               if(max.tot < st.tot) {
                  max.tot = st.tot;
                  max.avg = st.avg;
               }
               if(min.tot > st.tot) {
                  min.tot = st.tot;
                  min.avg = st.avg;
               }
            }
   
            MapStud avg;
            
            if(mm.getValue().size()!=0) {
               avg = new MapStud("", "평균", 
                  tot.jum.get(0)/mm.getValue().size(),
                  tot.jum.get(1)/mm.getValue().size(),
                  tot.jum.get(2)/mm.getValue().size()
                  );
            }else {
               avg = new MapStud("", "평균",0,0,0);
            }
            
            System.out.println("\t결과 ->");         
            System.out.println(tot);
            System.out.println(avg);
            System.out.println(max);
            System.out.println(min);
         }
      
      }
   }

}