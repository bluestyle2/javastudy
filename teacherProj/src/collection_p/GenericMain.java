package collection_p;

class GenAAA{
   
   int a;
   String b;
   public GenAAA(int a, String b) {
      this.a = a;
      this.b = b;
   }
   @Override
   public String toString() {
      return "GenAAA [a=" + a + ", b=" + b + "]";
   }
   
   public int getA() {
      return a;
   }
   public void setA(int a) {
      this.a = a;
   }
   public String getB() {
      return b;
   }
   public void setB(String b) {
      this.b = b;
   }
   
}

//Generic 타입 추상화
// 클래스명<타입1, 타입2...> 클래스 선언시 타입지정 설정
//                       타입은 Object 형태이어야만 함
//                   타입 --> 기본 자료형 불가
class GenBBB<T1,T2>{  //T1, T2 타입(자료형)의 추상화
                 //선언시 미지정이면 Object로 자동 설정
   T1 a;
   T2 b;
   public GenBBB(T1 a, T2 b) {
   
      this.a = a;
      this.b = b;
   }
   
   @Override
   public String toString() {
      return "GenBBB [a=" + a + ", b=" + b + "]";
   }
   
   public T1 getA() {
      return a;
   }
   public void setA(T1 a) {
      this.a = a;
   }
   public T2 getB() {
      return b;
   }
   public void setB(T2 b) {
      this.b = b;
   }
}


public class GenericMain {

   public static void main(String[] args) {
      GenAAA ga = new GenAAA(10, "아기상어");
      GenBBB gb1 = new GenBBB(20,"엄마상어");
      //Generic <T1, T2> --> //선언시 미지정이면 Object로 자동 설정
      //GenBBB<int, String> gb2 = new GenBBB<int, String>(30,"아빠상어");
      //      int --> 기본 자료형이어서 Generic 타입으로 사용 불가
      GenBBB<Integer, String> gb3 = new GenBBB<Integer, String>(30,"아빠상어");
      //GenBBB<Boolean, Double> gb4 = new GenBBB<Boolean, Double>(40,"할머니상어");
      //선언시 Generic으로 설정된 타입과 생성자에 입력된 매개변수 타입 불일치로 생성불가
      GenBBB<Boolean, Double> gb5 = new GenBBB<Boolean, Double>(true, 123.456);
      
      System.out.println("ga:"+ga);
      
      
      System.out.println(ga.a - 4);
      System.out.println(ga.b.charAt(3));
      
      System.out.println("gb1:"+gb1);
      //System.out.println(gb1.a - 4);  gb1.a --> Object로 인지되어 빼기연산 불가
      //System.out.println(gb1.b.charAt(3));  gb1.a --> Object로 인지되어 String 메소드 사용 불가
      gb1.setA(2000);
      System.out.println("gb1.a:"+gb1.a);
      gb1.setA(true);
      System.out.println("gb1.a:"+gb1.a);
      
      System.out.println("gb3:"+gb3);
      System.out.println(gb3.a - 4);  //a 가 Integer로 설정되어 빼기연산 가능
      System.out.println(gb3.b.charAt(3)); //b가 String으로 설정되어 String 메소드 사용 가능
      gb3.setA(3000);
      System.out.println("gb3.a:"+gb3.a);
      //gb3.a= true;
      //gb3.setA(true);   //a 가 Integer로 설정되어 boolean 과 같은 다른 타입 대입불가
      //System.out.println("gb3.a:"+gb3.a);
      
      System.out.println("gb5:"+gb5);
      //System.out.println(gb5.a - 4);  
      System.out.println(!gb5.a);  //Boolean
      System.out.println(gb5.b-100); //Double
      
      
   }

}