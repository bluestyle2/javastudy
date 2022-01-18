package basic_p;

import java.util.Arrays;

public class ArrayCopyMain {

   public static void main(String[] args) {
      int [] arr1 = {11,22,33,44,55};
      int [] arr2 = arr1;                  //shallow Copy  주소대입
      int [] arr3 = {11,22,33,44,55};
      
      int [] arr4 = new int[arr1.length];      //deep Copy   주소 생성 후 
      for (int i = 0; i < arr4.length; i++) {  //같은원소위치에 값 대입
         arr4[i] = arr1[i];
      }
      int [] arr5 = arr1.clone();  	//clone() : arr4 처럼 deep Copy하는 메소드, 배열 및 열거데이터에서만 사용가능    
      
      System.out.println("arr1:"+arr1+"->"+Arrays.toString(arr1));
      System.out.println("arr2:"+arr2+"->"+Arrays.toString(arr2));
      System.out.println("arr3:"+arr3+"->"+Arrays.toString(arr3));
      System.out.println("arr4:"+arr4+"->"+Arrays.toString(arr4));
      System.out.println("arr5:"+arr5+"->"+Arrays.toString(arr5));
      
      arr1[2] = 3030;
      
      System.out.println("arr1:"+arr1+"->"+Arrays.toString(arr1));
      System.out.println("arr2:"+arr2+"->"+Arrays.toString(arr2));
      System.out.println("arr3:"+arr3+"->"+Arrays.toString(arr3));
      System.out.println("arr4:"+arr4+"->"+Arrays.toString(arr4));
      System.out.println("arr5:"+arr5+"->"+Arrays.toString(arr5));
   }

}