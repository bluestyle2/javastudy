package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import io_p.BufferedExamMain.Exam;

class Objinfo {
	   
	   static class Exam{
	      
	      String name;
	      
	      ArrayList<Integer>jum = new ArrayList();
	      
	      int tot, avg;

	      public Exam(String str) {
	         super();
	         
	         String [] arr = str.split(",");
	         
	         this.name = arr[0];
	         
	         for (int i = 1; i < arr.length; i++) {
	            jum.add(Integer.parseInt(arr[i]));
	         }
	         
	         calc();
	      }
	      
	      void calc() {
	         tot = 0;
	         for (Integer i : jum) {
	            tot += i;
	         }
	         avg = tot/jum.size();
	      }

	      @Override
	      public String toString() {
	         
	         String res =name + "," ;
	         
	         for (Integer i : jum) {
	            res += i + "," ;
	         }
	         
	         res += tot + "," + avg+"\n";
	         
	         return res; 
	      }
	   }
}

public class ObjectExamMe {

	public static void main(String[] args) throws Exception {
		
		 FileOutputStream fos = new FileOutputStream("fff/Objexam.csv");
	      ObjectOutputStream oos = new ObjectOutputStream(fos);
	      FileInputStream fis = new FileInputStream("fff/Objexam.csv");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      
	      ois.readObject();
	      oos.writeObject("이름,국어,영어,수학,총점,평균\n");
	      String line;
	      
	      while((line=ois.readObject())!=null) {
	         
	         
	         oos.writeObject(new Exam(line).toString());
	      }
	      
	      fos.close();
	      oos.close();
	      fis.close();
	      ois.close();
	}

}
