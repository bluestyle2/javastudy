  
package dynamic_p;

///기능
////mp3 - 듣기, 멈추기
/// 카메라 - 찍기, 보기
/// 전화   - 듣기, 말하기
/// 핸드폰 - mp3, 카메라, 전화
/// 구현
///  어른폰 을 만들어 주세요

interface MP3{
   void listen(String content);
   void stop();
}

interface Camera{
   void capture(String target);
   void view(int i);
}
interface Phone{
   void listen(String content);
   void speak(String content);
}

class Usim{
   
   public Usim(String name) {
      
      this.name = name;
   }
   String name;
   String  picture = "";
   String  call = "";
   @Override
   public String toString() {
      return "Usim [name=" + name + ", picture=" + picture + ", call=" + call + "]";
   }
}


class AdultPhone implements MP3, Camera, Phone{
   
   Usim me, tot;

   public AdultPhone(String me, Usim tot) {
      this.me = new Usim(me);
      this.tot = tot;
   }

   @Override
   public void speak(String content) {
      System.out.println(me.name+" "+content+"에게 전화 걸어요");
      me.call+=content+",";
      tot.call+=me.name+":"+content+",";
   }

   @Override
   public void capture(String target) {
      System.out.println(me.name+" "+target+" 사진 찍어요");
      me.picture+=target+",";
      tot.picture+=me.name+":"+target+",";
      
   }

   @Override
   public void view(int i) { //split이란 문자열을 배열로 짜게하는것
      System.out.println(me.name+" "+me.picture.split(",")[i]+" 사진 열어요");
   }

   @Override
   public void listen(String content) {
      System.out.println(me.name+" "+content+" 들어요");
   }

   @Override
   public void stop() {
      System.out.println(me.name+" 멈춰요");
   }
   
}

public class HandPhoneMain {

   public static void main(String[] args) {
      
      Usim tot = new Usim("총합");
      AdultPhone [] ph = {
            new AdultPhone("은하수", tot),
            new AdultPhone("어른폰", tot),
            new AdultPhone("엘쥐", tot)
      };
      
      MP3 mm = ph[0]; 
      Camera cc = ph[1];
      Phone pp = ph[2];

      mm.listen("멸공의 횃불");
      cc.capture("벗꽃");
      pp.speak("이언");
      cc.capture("눈");
      cc.capture("물놀이");
      System.out.println("<>");
      cc.view(0);
      cc = ph[0];
      cc.capture("상어");
      cc.capture("공룡");
      cc.capture("장수풍뎅이");
      cc.capture("사슴벌레");
      mm = ph[2];
      mm.stop();
      System.out.println("<>");
      cc.view(3);
      for (AdultPhone ap : ph) {
         System.out.println(ap.me);
      }
      System.out.println(tot);
   }

}