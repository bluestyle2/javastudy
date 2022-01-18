package collection_p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

   public static void main(String[] args) {
      
      /// Ceate, Read, Update, Delete
      
      //create
      List arr1 = new ArrayList();
      System.out.println(arr1);
      arr1.add(10);
      arr1.add(20);
      arr1.add(50);
      arr1.add(10);
      arr1.add(60);
      arr1.add(30);
      System.out.println(arr1);
      
      arr1.add(2,3000);
      System.out.println(arr1);
      
      //read
      System.out.println(arr1.get(0));
      System.out.println(arr1.get(3));
      System.out.println(arr1.size());
 
      System.out.println(arr1.contains(100));
      System.out.println(arr1.contains(60));
      System.out.println("여기");
      System.out.println(arr1.indexOf(60));
      System.out.println(arr1.indexOf(100));
      System.out.println(arr1.indexOf(10));
      System.out.println(arr1.lastIndexOf(10));
      System.out.println("여기");
      List arr2 = arr1.subList(2, 5);
      System.out.println(arr2);
      ArrayList arr3 = new ArrayList();
      arr3.add(20);
      arr3.add(50);
      arr3.add(60);
      System.out.println(arr3);
      System.out.println(arr1.containsAll(arr3));
      arr3.add(700);
      System.out.println(arr3);
      System.out.println(arr1.containsAll(arr3));
      arr1.addAll(arr3);
      System.out.println(arr1);
      
      //update
      arr1.set(1,2020);
      System.out.println(arr1);
      Collections.reverse(arr1);
      System.out.println(arr1);
      Collections.swap(arr1, 3, 8);
      System.out.println(arr1);
      Collections.shuffle(arr1);
      System.out.println(arr1);
      //arr1.add("유아름영어짱");
      Collections.sort(arr1);
      System.out.println(arr1);
     
      
      //delete
      arr1.remove(3);
      System.out.println(arr1);
      arr1.remove((Object)700);
      System.out.println(arr1);
      System.out.println(arr3);
      arr1.removeAll(arr3);
      System.out.println(arr1);
      ArrayList arr4 = new ArrayList();
      arr4.add(10);
      arr4.add(30);
      arr4.add(2020);
      arr4.add(4040);
      System.out.println(arr4);
      arr1.retainAll(arr4);
      System.out.println(arr1);
      System.out.println(arr1.isEmpty());
      arr1.clear();
      System.out.println(arr1);
      System.out.println(arr1.isEmpty());
   }

}
