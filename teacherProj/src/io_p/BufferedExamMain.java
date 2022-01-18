/*
 * 이름,국,영,수 시험 결과를 파일에 저장하시오
 * 처리 내용 총점, 평균, 등급
 * 결과 파일에서 내용을 가져와 출력하시오
 * 
 * 학생 5명으로 처리 등수 별로 출력할것
 * 
 * 
 * 
 * 
 */

package io_p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class BufferedExamMain {
   
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

   public static void main(String[] args) throws Exception {
      FileReader fr = new FileReader("fff/exam2.csv");
      FileWriter fw = new FileWriter("fff/exam_res.csv");
      
      BufferedReader br = new BufferedReader(fr);
      BufferedWriter bw = new BufferedWriter(fw);
      
      br.readLine();
      bw.write("이름,국어,영어,수학,총점,평균\n");
      String line;
      
      while((line=br.readLine())!=null) {
         
         
         bw.write(new Exam(line).toString());
      }

      bw.close();
      br.close();
      fw.close();
      fr.close();

   }

}