package dynamic_p;

class TSPar{
   
   String a ="부모a", b = "부모b";
   
   void meth_1() {
      System.out.println("부모 meth_1() 실행");
   }
   void meth_2() {
      System.out.println("부모 meth_1() 실행");
   }
}

class TSChild extends TSPar{
   
   String c ="자식c", b = "자식b";
   
   void meth_3() {
      System.out.println("자식 meth_3() 실행");
   }
   void meth_2() {
      System.out.println("자식 meth_1() 실행");
   }
   
   void meth(int b) {
      System.out.println("자식 meth() 시작----:"+a+","+b+","+c);
      System.out.println("this:"+this.a+","+this.b+","+this.c);
      //System.out.println("super:"+super.a+","+super.b+","+super.c);
      System.out.println("super:"+super.a+","+super.b);
      System.out.println("자식 meth() 끝----");
   }
}

public class ThisSuperMain {

   public static void main(String[] args) {
      TSChild cc = new TSChild();
      System.out.println(cc.a+","+cc.b+","+cc.c);
      cc.meth_1();
      cc.meth_2();
      cc.meth_3();
      cc.meth(1234);

   }

}