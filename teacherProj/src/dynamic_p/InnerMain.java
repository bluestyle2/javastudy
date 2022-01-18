package dynamic_p;

class ClaAnno{
   
   int a = 123, b = 456;
   
   void meth_1() {
      System.out.println("ClaAnno meth_1() 실행:"+a+","+b);
   }
   
   void meth_2() {
      System.out.println("ClaAnno meth_2() 실행");
   }
}

class ClaOuter{
   
   int a = 10, b = 20;
   static int sa = 10, sb = 20;
   
   Inn_1 im_1 = new Inn_1();  //멤버변수로 이너인스턴스 선언, 생성
   Snn_2 sm_1 = new Snn_2();
   //LocIn loc_1 = new LocIn();  //지역 내부 클래스 멤버로 선언 불가!!!  
   
   void meth_1() {
      System.out.println("Outer meth_1() 실행");
   }
   
   void meth_2() {
      System.out.println("Outer meth_2() 실행");
   }
   
   void meth_3() {
      System.out.println("Outer meth_3() 시작-----------");
      
      Inn_1 ci_1 = new Inn_1(); //지역변수로 이너인스턴스 선언, 생성
      Snn_2 si_1 = new Snn_2();
      
      class LocIn{  //지역 내부 클래스  -- 정의된 메소드 내부에서만 사용 가능!!!
         int aa = 9999;
         int b = 8888;
         void meth_11() {
            System.out.println("LocIn meth_11() 실행");
         }
         void meth_2() {
            System.out.println("LocIn meth_2() 실행");
         }
         
         void meth_tot() {
            System.out.println("LocIn meth_tot() 시작-----------");
            System.out.println("outer"+a+","+b+","+aa+","+ClaOuter.this.b);
            meth_1();
            meth_2();
            meth_11();
            a++;
            b++;
            aa++;
            System.out.println("LocIn meth_tot() 끝-----------");
         }
      }
      
      LocIn loc = new LocIn(); 
      
      
      System.out.println("Outer meth_3() 끝-----------");
   }
   
   static void meth_s1() {
      System.out.println("Outer static meth_s1() 실행");
   }
   
   static void meth_s2() {
      System.out.println("Outer static meth_s2() 실행");
   }
   
   
   class Inn_1{  //내부 클래스
      int aa = 1111;
      int b = 2222;
      void meth_11() {
         System.out.println("Inn_1 meth_11() 실행");
      }
      void meth_2() {
         System.out.println("Inn_1 meth_2() 실행");
      }
      
      void meth_tot() {
         System.out.println("Inn_1 meth_tot() 시작-----------");
         System.out.println("outer"+a+","+b+","+aa+","+ClaOuter.this.b);
         meth_1();
         meth_2();
         meth_11();
         a++;
         b++;
         aa++;
         System.out.println("Inn_1 meth_tot() 끝-----------");
      }
   }
   
   
   static class Snn_2{  //outer 가 static 멤버 요소만 접근 가능
      int cc = 3030;
      int sb = 2020;
      static int dd = 4040;
      void meth_11() {
         System.out.println("Snn_2 meth_11() 실행");
      }
      void meth_s2() {
         System.out.println("Snn_2 meth_s2() 실행");
      }
      
      void meth_tot() {
         System.out.println("Snn_2 meth_tot() 시작-----------");
         //System.out.println("outer"+a+","+b+","+cc+","+ClaOuter.this.b);
         System.out.println("outer:"+sa+","+sb+","+cc+","+ClaOuter.sb); 
         //meth_1();
         meth_s1();
         meth_s2();
         meth_11();
         //a++;
         sa++;
         sb++;
         cc++;
         System.out.println("Snn_2 meth_tot() 끝-----------");
      }
   }
   
   
   
   
   
}

public class InnerMain {

   public static void main(String[] args) {
      ClaOuter oo = new ClaOuter();
      System.out.println("oo:"+oo.a+","+oo.b);
      oo.meth_1();
      oo.meth_2();
      
      ClaOuter.Inn_1 ci_1 = oo.new Inn_1();
      ClaOuter.Inn_1 ci_2 = oo.new Inn_1();
      //ClaOuter.Inn_1 ci_3 = new ClaOuter.Inn_1();
      ClaOuter.Inn_1 ci_3 = new ClaOuter().new Inn_1();
      /*System.out.println(ci_1.a+","+ci_1.b);
      ci_1.meth_1();
      ci_1.meth_2();*/
      
      System.out.println("ci_1:"+ci_1.aa);
      ci_1.meth_11();
      ci_1.meth_tot();
      ci_1.meth_tot();
      ci_1.meth_tot();
      System.out.println("ci_2:"+ci_2.aa);
      ci_2.meth_11();
      ci_2.meth_tot();
      ci_2.meth_tot();
      ci_2.meth_tot();
      
      ClaOuter.Snn_2 si_1 = new ClaOuter.Snn_2();
      
      System.out.println(ClaOuter.Snn_2.dd);
      //System.out.println(ClaOuter.Snn_2.sb);
      System.out.println("si_1:"+si_1.cc);
      si_1.meth_11();
      si_1.meth_tot();
      //ClaOuter.LocIn loc_1 = oo.LocIn();  외부에서 선언 생성 불가!!!! 
      
      
      ClaAnno ano1 = new ClaAnno();
      ClaAnno ano2 = new ClaAnno() {
         
         int c = 999;
         
         void meth_1() {
            System.out.println("생성시 재정의 meth_1() 실행:"+a+","+c);
         }
      };
      
      ano1.meth_1();
      ano1.meth_2();
      
      ano2.meth_1();
      ano2.meth_2();
      
   }

}