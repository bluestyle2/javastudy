package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

class ObjExam implements Serializable{
   private static final long serialVersionUID = 5678;
   
   String name, grade;
   
   private int [] jum;
   
   int tot, avg;
   
   

   public ObjExam(String name, int... jum) {
      super();
      this.name = name;
      this.jum = jum;
   }
   
   void calc() {
      tot = 0;
      for (int i : jum) {
         tot+=i;
      }
      avg = tot/jum.length;
      
      grade =""+ "가가가가가가양미우수수".charAt(avg/10);
   }

   @Override
   public String toString() {
      calc();
      return  name + "\t" + grade + "\t" + Arrays.toString(jum) + "\t" + tot
            + "\t" + avg;
   }
   
   
   
}

public class ObjectExamMain {

   public static void main(String[] args) throws Exception {
      FileOutputStream fos = new FileOutputStream("fff/qqq.asd");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      
      oos.writeObject(new ObjExam("현빈", 87,89,83));
      oos.writeObject(new ObjExam("원빈", 67,69,63));
      oos.writeObject(new ObjExam("젤리빈", 97,99,93));
      oos.writeObject(new ObjExam("커피빈", 57,59,53));
      oos.writeObject(new ObjExam("장희빈", 77,79,73));
      
      oos.close();
      fos.close();

   }

}