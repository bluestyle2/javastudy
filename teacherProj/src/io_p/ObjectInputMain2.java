package io_p;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputMain2 {

   public static void main(String[] args) throws Exception {
      FileInputStream fis = new FileInputStream("fff/ppp.xcv");
      ObjectInputStream ois = new ObjectInputStream(fis);
      
      //for (int i = 0; i < 5; i++) {
      
      while( fis.available()>0) {
         System.out.println(ois.readObject());
      }
      
      ois.close();
      fis.close();

   }

}



/*
 * 
 * 
 * 이전 설계도 = 변경 전 클래스
이전 설계도로 만든 자동차 = 변경 전 클래스로 만든 객체
직렬화시켜서 보낸 객체 = 분해해서 보낸 자동차
바뀐 설계도 = 변경 후 클래스
이전 설계도는 재조립 시점에는 존재하지 않음


output -> object로 저장
object -> input으로 read

output(변경했는데 저장 안함) -> object(전 구조)
object -> input으로 read하려는데 (new ObjAAA)에서 다른 틀로 확인이 되서 오류


 * 
 * 
 * 
 * 
 * 
 */
 