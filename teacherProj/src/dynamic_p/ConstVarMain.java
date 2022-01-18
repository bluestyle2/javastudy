package dynamic_p;

class ConPar{
   
   int d = 40;
   int a = setA();
   int b = setB();
   
   
   
   int setB() {
      System.out.println("setB()");
      return d;
   }
   
   int c = 30;
   
   
   int setA() {
      System.out.println("setA():"+c);
      return c;
   }
   
   public ConPar() {
      System.out.println("부모 생성자 실행");
   }

   @Override
   public String toString() {
      return "ConPar [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
   }
}

public class ConstVarMain {

   public static void main(String[] args) {
      ConPar pp = new ConPar();
      System.out.println(pp);
      int cc = pp.setA();
      System.out.println(cc);
   }

}