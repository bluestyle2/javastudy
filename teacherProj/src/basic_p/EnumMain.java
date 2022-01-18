package basic_p;

enum Food{
   KIMBAB("김밥",true), DJZZIGAE, RAMEN("라면",3500), SUNDAE;
   
   //멤버변수
   String ko;
   int price = 1234;
   boolean bb = true;
   
   
   Food(){
      System.out.println("Food 기본생성자");
   }
   
   Food(String ko, int price){
      System.out.println("사용자 정의 생성자1");
      this.ko = ko;
      this.price = price;
   }
   
   Food(String ko,  boolean bb){
      System.out.println("사용자 정의 생성자2");
      this.ko = ko;
      this.bb = bb;
   }
   
   //메소드
   void ppp() {
      System.out.println("ppp 실행:"+this+","+ordinal()+","+ko+","+price+","+bb);
   }
   
}


public class EnumMain {

   public static void main(String[] args) {
      Food ff;
      
      ff = Food.RAMEN;
      
      System.out.println(ff);
      
      System.out.println(Food.values());
      
      Food [] arr = Food.values();
      
      for (Food food : arr) {
         System.out.println(food);
      }
      
      int i = ff.ordinal();
      System.out.println(i);
      
      String str = "DJZZIGAE";
      
      ff = Food.valueOf(str);
      System.out.println(ff);
      System.out.println(ff.ordinal());
      
      ff.price = 6000;
      ff.ko = "된장찌개";
      
      System.out.println(ff+":"+ff.ordinal()+","+ff.ko+","+ff.price+","+ff.bb);
      
      
      Food qq = Food.DJZZIGAE;
      
      System.out.println(qq+":"+qq.ordinal()+","+qq.ko+","+qq.price+","+qq.bb);
      
      System.out.println("-----------------------------------");
      
      for (Food food : arr) {
         System.out.println(food+":"+food.ordinal()+","+food.ko+","+food.price+","+food.bb);
      }
      
      System.out.println("-----------------------------------");
      
      for (Food food : arr) {
         food.ppp();
      }
   }

}