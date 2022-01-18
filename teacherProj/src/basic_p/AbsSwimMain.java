package basic_p;

/*
수영 선수를 구현 하세요

부모 : 수영선수
     필드 : 이름, 종목(자유영, 접영, 평영, 배영)
    메소드 : 수영해요(거리) - 추상화
    
자식 :  자유형  :: 자유형 이름 거리 수영해요 
         접영 :: 접영 이름 몇초 수영해요
         평영:: 평영 이름 잠영 몇m, 평형 몇m 수영해요
         배영:: 배영 이름 거리 오리발 수영해요

* */



abstract class AbsSwim{
   String name, type;

   abstract void swimming(int dist);
}

class AbsFree extends AbsSwim{
   AbsFree(String name){
      this.name = name;
      type = "자유형";
   }
   
   void swimming(int dist) {
      
      System.out.println(type+" "+name+" "+dist +" 수영해요");
   }
}

class AbsBreastStroke extends AbsSwim{
   AbsBreastStroke(String name){
      this.name = name;
      type = "평영";
   }
   
   void swimming(int dist) {
      
      int under = (int)(dist * 0.3);
      int up = (int)(dist * 0.7);
      System.out.println(type+" "+name+" 잠영 :"+ under +", 평형 :"+ up  +" 수영해요");
      
   }
}

class AbsButterfly extends AbsSwim{
   
   double speed; //
   
   AbsButterfly(String name, double speed){
      this.name = name;
      this.speed = speed;
      type = "접영";
   }
   
   void swimming(int dist) {
      
      System.out.println(type+" "+name+" "+dist/speed +"초 수영해요");
   }
}

class AbsBackstroke extends AbsSwim{
   AbsBackstroke(String name){
      this.name = name;
      type = "배영";
   }
   
   void swimming(int dist) {
      
      System.out.println(type+" "+name+" "+dist +" 오리발 수영해요");
   }
}

public class AbsSwimMain {

   public static void main(String[] args) {
      AbsSwim [] players = {
            new AbsFree("박태환"),
            new AbsBreastStroke("비욘디"),
            new AbsButterfly("펠프스",0.89),
            new AbsBackstroke("김연아"),
            new AbsFree("강성범"),
            new AbsBreastStroke("길솔인"),
            new AbsButterfly("도성진",1.20),
            new AbsBackstroke("박예지")
      };
      
      
      for (AbsSwim sp : players) {
         sp.swimming(100);
      }

   }

}