package basic_p;

import java.util.Arrays;

/*
 * 커피를 주문하세요
    아메리카노:2000
    아시아노:2300
    아프리카노:2700
 
    주문서1 : 아메리카노, 아메리카노,아시아노
    주문서2 : 아시아노,아프리카노
    주문서3 : 아프리카노,아프리카노,아메리카노
 
    출력
    주문서1 : 아메리카노, 아메리카노,아시아노 :?
    주문서2 :아시아노,아프리카노:?
    주문서3 : 아프리카노,아프리카노,아메리카노:?
    total----------------------
       종류      갯수  금액
     아메리카노 ?  ?
     아시아노    ?  ?
     아프리카노  ?  ?
 * 
 */


enum CoffeeShopData{
   아메리카노(2000),  아시아노(2300),    아프리카노(2700);
   
   final int price;
   
   int cnt = 0;

   private CoffeeShopData(int price) {
      this.price = price;
   }
   
   int tot() {
      return price*cnt;
   }
   
   void info() {
      System.out.println(this+"\t"+price+"\t"+cnt+"\t"+tot());
   }
}



public class EnumCoffeeMain {
   
   static void order(String ... menu) {
      String ttt = Arrays.toString(menu);
      int tot = 0;
      for (String mm : menu) {
         CoffeeShopData data = CoffeeShopData.valueOf(mm);
         tot += data.price;
         data.cnt++;
      }
      
      System.out.println("주문:"+ttt+":"+tot);
   }

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      order("아메리카노", "아메리카노","아시아노");
      order("아시아노","아프리카노");
      order("아프리카노","아프리카노","아메리카노");
      
      System.out.println("종류\t가격\t갯수\t금액");
      
      int tot = 0;
      for (CoffeeShopData data : CoffeeShopData.values()) {
         data.info();
         tot += data.tot();
      }
      System.out.println("total:"+tot);
   }

}