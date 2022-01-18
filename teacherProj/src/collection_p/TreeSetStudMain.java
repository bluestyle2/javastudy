package collection_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class TreeStud implements Comparable{
   
   String name;
   
   int ban, tot, avg;
   int [] jum;
   public TreeStud(int ban, String name, int ... jum) {
      
      this.ban = ban;
      this.name = name;
      this.jum = jum;
      
      calc();
   }
   
   void calc() {
      tot = 0;
      for (int i : jum) {
         tot+=i;
      }
      avg = tot/jum.length;
   }

   @Override
   public String toString() {
      return ban + "\t" + name + "\t" + Arrays.toString(jum) + "\t" + tot + "\t"
            + avg ;
   }

   @Override
   public int compareTo(Object o) {
      // TODO Auto-generated method stub
      //return -1;
      
      TreeStud you = (TreeStud)o;
      
      int res = ban - you.ban;
      
      if(res==0) {
         res = you.avg-avg;
      }
      
      if(res==0) {
         res = name.compareTo(you.name);
      }
      return res;
      
   }   
}

//  정렬기준  :   반(오름) > 평균(내림) > 이름(오름)
class StudCom implements Comparator{

   @Override
   public int compare(Object o1, Object o2) {

      TreeStud me = (TreeStud)o1;
      TreeStud you = (TreeStud)o2;
      
      int res = me.ban - you.ban;
      
      if(res==0) {
         res = you.avg-me.avg;
      }
      
      if(res==0) {
         res = me.name.compareTo(you.name);
      }
      return res;
   }
   
}

public class TreeSetStudMain {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      //TreeSet studs = new TreeSet(new StudCom());
      TreeSet studs = new TreeSet();
      studs.add(new TreeStud(1,"현빈",77,78,71));
      studs.add(new TreeStud(2,"원빈",57,58,51));
      studs.add(new TreeStud(1,"김우빈",37,38,31));
      studs.add(new TreeStud(1,"장희빈",87,88,81));
      studs.add(new TreeStud(2,"젤리빈",97,98,91));
      studs.add(new TreeStud(2,"커피빈",77,78,71));
      studs.add(new TreeStud(3,"미스터빈",87,88,81));
      studs.add(new TreeStud(3,"골빈",57,58,51));
      studs.add(new TreeStud(2,"자바빈",87,88,81));
      studs.add(new TreeStud(3,"뱃속이빈",97,98,91));
      studs.add(new TreeStud(1,"빈빈",77,88,91));
      studs.add(new TreeStud(2,"마음이빈",97,88,71));
      
      Iterator it = studs.iterator();
      
      while(it.hasNext()) {
         System.out.println(it.next());
      }
      
      
   }

}