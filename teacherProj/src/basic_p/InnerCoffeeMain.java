package dynamic_p;

import java.util.Arrays;

//커피전문점을 구현하세요
// 총판 --- Outer     할리스
// 지점 --- Inner   강남점, 역삼점, 종로점
   //            주문
// 메뉴 -- 아메리카노, 까페라떼, 카푸치노

//---------------------------------------

/* 커피 전문점을 구현하세요

별다방, 커피콩

지역별로 커피전문점이 존재
별다방 - 역삼,종로,신촌
커피콩 - 역삼,구로,청량리

               별다방,   커피콩
아메리카노:      2000    2100
아시아노:         2300    2500
아프리카노:      2700    2200



각 지점이 커피를 주문받으세요(각 지점에서만 주문가능)
각 지점별 커피 판매내역과
전체 지점 커피 판매 내역을 출력하세요

별다방역삼 주문(아메리카노) -> 별다방 역삼 아메리카노 2000 주문             
커피콩청량리 주문(아시아노)
별다방종로 주문(아메리카노)
커피콩역삼 주문(아프리카노)
*/

class CoffeeData{
   
   String name;
   int price;
   int cnt;
   
   
   int tot() {
      return price*cnt;
   }
   
   CoffeeData(String str) {
      String [] arr = str.split("_");
      name = arr[0];
      price = Integer.parseInt(arr[1]);
   }
   
   

   CoffeeData(String name, int price) {
      
      this.name = name;
      this.price = price;
   }

   @Override
   public String toString() {
      return name + "\t price=" + price + "\t cnt=" + cnt+"\t  tot = "+ tot() ;
   }
   
   
}

class OuterBrand{
   String name;
   
   CoffeeData [] data;

   public OuterBrand(String name, String ... data) {
      
      this.name = name;
      
      this.data = new CoffeeData[data.length];
      
      for (int i = 0; i < data.length; i++) {
         this.data[i] = new CoffeeData(data[i]);
      }
      
   }

   
   void info() {
      System.out.println(name+">>>");
      int cnt = 0;
      int tot = 0;
      for (CoffeeData coffeeData : data) {
         System.out.println(coffeeData);
         cnt += coffeeData.cnt;
         tot += coffeeData.tot();
      }
      System.out.println("판매량:"+cnt+", 총매출액:"+tot);
   }
   
   class Shop{
      String name;
      
      CoffeeData [] data;

      Shop(String name) {
         
         this.name = name;
         
         
         //deep Copy
         data = new CoffeeData[OuterBrand.this.data.length];
         
         for (int i = 0; i < OuterBrand.this.data.length; i++) {
            
            CoffeeData buf = OuterBrand.this.data[i];
            data[i] = new CoffeeData(buf.name, buf.price);
         }
         
      }
      
      void info() {
         System.out.println(OuterBrand.this.name + " -> " + name+">>>");
         
         int cnt = 0;
         int tot = 0;
         for (CoffeeData coffeeData : data) {
            System.out.println(coffeeData);
            cnt += coffeeData.cnt;
            tot += coffeeData.tot();
         }
         System.out.println("판매량:"+cnt+", 총매출액:"+tot);
      }
      
      void order(String ... menu) {
         
         
         int tot = 0;
         for (String mm : menu) {
            
            for (int i = 0; i < data.length; i++) {
               CoffeeData dd = data[i];
            
               if(dd.name.equals(mm)) {
                  tot+=dd.price;
                  data[i].cnt++;
                  OuterBrand.this.data[i].cnt++;      
               }
            }
         }
         
         System.out.println(OuterBrand.this.name + " " + name+":"+Arrays.toString(menu)+"=>"+tot);
   
      }
   }
   
}



public class InnerCoffeeMain {

   public static void main(String[] args) {
      OuterBrand hollys = new OuterBrand("할리스", "아메리카노_2000", "아시아노_2300", "아프리카노_2700");
      OuterBrand coffeeBean = new OuterBrand("커피빈", "아메리카노_2100", "아시아노_2500", "아프리카노_2200");
      
      OuterBrand.Shop [] shops = {
            hollys.new Shop("강남"),
            coffeeBean.new Shop("강남"),
            hollys.new Shop("종로"),
            coffeeBean.new Shop("구로"),
            hollys.new Shop("신촌"),
            coffeeBean.new Shop("청량리")
      };
      
      shops[0].order("아메리카노","아시아노","아프리카노");
      shops[1].order("아메리카노","아메리카노","아프리카노","아프리카노");
      shops[3].order("아메리카노");
      shops[2].order("아시아노","아시아노","아시아노");
      shops[0].order("아메리카노","아메리카노","아메리카노","아메리카노");
      shops[2].order("아시아노");
      shops[1].order("아메리카노","아프리카노","아프리카노");
      shops[4].order("아메리카노","아시아노","아프리카노");
      shops[5].order("아프리카노","아프리카노","아프리카노");
      shops[0].order("아메리카노","아메리카노");
      shops[1].order("아메리카노");
      shops[1].order("아시아노","아시아노","아시아노","아시아노");
      shops[2].order("아메리카노","아메리카노","아프리카노");
      shops[4].order("아메리카노","아메리카노");
      shops[4].order("아프리카노","아프리카노");
      shops[3].order("아메리카노","아시아노","아프리카노");
      shops[3].order("아시아노");
      
      for (OuterBrand.Shop shop : shops) {
         shop.info();
      }
      
      hollys.info();
      coffeeBean.info();
   }

}