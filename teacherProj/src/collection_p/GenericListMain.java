package collection_p;

import java.util.ArrayList;

class TV{}
class Grand{}
class Phone extends Grand{}
class HandPhone extends Phone{}

public class GenericListMain {
   
   static void methArr(ArrayList list) {}
   static void methPh(ArrayList<Phone> list) {  //Phone 만 가능
      for (Phone phone : list) {//Object로 받고 난후 casting 하지 않아도 된다. 
         
      }
   }  
   
   static void methHP(ArrayList<HandPhone> list) {  //HandPhone 만 가능
      for (HandPhone handPhone : list) {
         
      }
   }  
   
   static void methEx(ArrayList<? extends Phone> list) {}  //Phone의 자식 가능(부모 불가)
   static void methSu(ArrayList<? super Phone> list) {}  //Phone의 부모 가능(자식 불가)

   public static void main(String[] args) {


         ArrayList arr = new ArrayList();
         ArrayList<Grand> arrGG = new ArrayList();
         ArrayList<Phone> arrPh = new ArrayList();  //자식 가능
         ArrayList<HandPhone> arrHP = new ArrayList();//부모 불가
         ArrayList<TV> arrTV = new ArrayList();
         
         arr.add(new TV());
         arr.add(new Phone());
         arr.add(new HandPhone());
         arr.add("장수풍뎅이");
         
         //arrPh.add(new TV());
         arrPh.add(new Phone());
         arrPh.add(new HandPhone());  //자식 생성자 가능
         //arrPh.add("장수풍뎅이");
         
         //arrHP.add(new TV());
         //arrHP.add(new Phone());
         arrHP.add(new HandPhone());
         //arrHP.add("장수풍뎅이");
         
         arrTV.add(new TV());
//         arrTV.add(new Phone());
//         arrTV.add(new HandPhone());
//         arrTV.add("장수풍뎅이");
         
         methArr(arr);
         methArr(arrPh);
         methArr(arrHP);
         methArr(arrTV);
         
         //methPh(arr);   Generic 형태의 list 매개변수인 경우 가장 부모인 Object로 설정되어 
                     // 가능한 것처럼 보이나 메소드 내부에서 casting 발생시 에러 발생
         methPh(arrPh);
         //methPh(arrHP);
         //methPh(arrTV);
         
         //methHP(arr);
         //methHP(arrPh);
         methHP(arrHP);
         //methHP(arrTV);
         
         //methEx(arrGG);  부모 불가 :  ? extends Phone
         methEx(arrPh);
         methEx(arrHP); // 자식 가능 :  ? extends Phone
         
         methSu(arrGG); // 부모 가능 :  ? super Phone
         methSu(arrPh);
         //methSu(arrHP); 자식 불가 : ? super Phone 
   }

}