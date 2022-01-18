package homework_p;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


class Stud implements Comparable{
   
   String name;
   
   int ban, tot, avg;
   int [] jum;
   public Stud(String name, int ... jum) {
            
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

   
   public String toString() {
      return name + "\t" + Arrays.toString(jum) + "\t"+ "총점 : " + tot + "\t"
          +"평균 : "  + avg ;
   }

   

      
   }   
}



public class Study15 {

   public static void main(String[] args) {
     
      HashMap ban = new HashMap();
      
      ban.put("개나리반1", new Stud("현빈",77,78,71));
      ban.put("개나리반2", new Stud("원빈",57,58,51));
      ban.put("개나리반3", new Stud("김우빈",37,38,31));
      ban.put("개나리반4", new Stud("장희빈",87,88,91));
      ban.put("닭나리반1", new Stud("젤리빈",97,98,91));
      ban.put("닭나리반2", new Stud("커피빈",77,78,71));
      ban.put("닭나리반3", new Stud("미스터빈",77,58,61));
      ban.put("닭나리반4", new Stud("골빈",47,98,61));
      ban.put("소나리반1", new Stud("자바빈",97,58,61));
      ban.put("소나리반2", new Stud("뱃속이빈",77,68,61));
      ban.put("소나리반3", new Stud("빈빈",87,88,81));
      ban.put("소나리반4", new Stud("마음이빈빈",67,98,71));
      
      Set kk = ban.keySet();
      
     
      
      for( Object oo:ban.entrySet()) {
         Map.Entry show = (Map.Entry)oo;
         
         System.out.println(show.getKey()+","+show.getValue());
      }
      
      
   }
}

/*
//map을 이용하여 반 성적을 출력하세요


//1차 : 

개나리반
성명, 국어, 영어, 수학, 총점, 평균

닭나리반
성명, 국어, 영어, 수학, 총점, 평균

소나리반
성명, 국어, 영어, 수학, 총점, 평균


//2차 : 

개나리반
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소

닭나리반
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소

소나리반
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소



시험 컷트라인 : 평균 80점 이상
//3차 : 

개나리반

합격
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소
불합격
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소

닭나리반
합격
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소
불합격
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소

소나리반
합격
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소
불합격
성명, 국어, 영어, 수학, 총점, 평균
합계
평균
최대
최소


*/