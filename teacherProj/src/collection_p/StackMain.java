package collection_p;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {

   public static void main(String[] args) {
      Stack st = new Stack();
      Queue qq = new LinkedList();
      
      /*
      st.add(1);
      st.add(2);
      st.add(3);
      
      qq.add(1);
      qq.add(2);
      qq.add(3);
      */
      st.push(1);
      st.push(2);
      st.push(3);
      
      qq.offer(1);
      qq.offer(2);
      qq.offer(3);
      
      
      System.out.println("st:"+st);
      System.out.println("qq:"+qq);

      for (int i = 0; i < st.size(); i++) {
         System.out.println(i+":"+st.get(i));
      }
      /*
      for (int i = 0; i < qq.size(); i++) {
         System.out.println(i+":"+qq.get(i));
      }
      */
      
      System.out.println("st:"+st);
      System.out.println("qq:"+qq);
      
      Object obj;
      obj = st.pop();
      System.out.println("pop:"+obj);
      
      obj = qq.poll();
      System.out.println("poll:"+obj);
      System.out.println("st:"+st+","+st.empty());
      System.out.println("qq:"+qq+","+qq.isEmpty());
      
      while(!st.empty()) {
         System.out.println(st.pop());
      }
      
      System.out.println("---------------");
      
      while(!qq.isEmpty()) {
         System.out.println(qq.poll());
      }

      System.out.println("st:"+st);
      System.out.println("qq:"+qq);
      
   }

}