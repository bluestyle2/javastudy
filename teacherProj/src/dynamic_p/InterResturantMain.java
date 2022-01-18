package dynamic_p;

interface InCounter{
   
   void hello();
   void pay(int table, int money);
}

interface InHall{
   void carry(int table, String menu);
   void hello();
}

interface InKitchen{
   void dish(int cnt);
}

class ResData{

   public ResData(String name) {
      super();
      this.name = name;
   }
   String name;
   int hello, pay, carry, dish;
   @Override
   public String toString() {
      return name + ", hello=" + hello + ", pay=" + pay + ", carry=" + carry + ", dish=" + dish
            + "";
   }
   
}

class ReAlba implements InCounter, InHall, InKitchen{
   
   ResData tot,data;
   
   public ReAlba(ResData tot, String name) {
      data = new ResData(name);
      this.tot = tot;
   }
   

   @Override
   public void dish(int cnt) {
      System.out.println(data.name+" 설거지:"+cnt+" 해요");
      data.dish += cnt;
      tot.dish += cnt;
   }

   @Override
   public void carry(int table, String menu) {
      // TODO Auto-generated method stub
      System.out.println(data.name+" "+table+"번 테이블에 "+menu+" 서빙해요");
      data.carry++;
      tot.carry++;
   }

   @Override
   public void hello() {
      System.out.println(data.name+" 인사해요");
      data.hello++;
      tot.hello++;
   }

   @Override
   public void pay(int table, int money) {
      // TODO Auto-generated method stub
      System.out.println(data.name+" "+table+"번 테이블 "+money+" 계산 해요");
      data.pay+=money;
      tot.pay+=money;
   }
   
}


public class InterResturantMain {

   public static void main(String[] args) {
      
      ResData totData = new ResData("총합");
      
      ReAlba [] alba = {
            new ReAlba(totData,"정우성"),
            new ReAlba(totData,"정좌성"),
            new ReAlba(totData,"정남성"),
            new ReAlba(totData,"정중성")
      };
      
      InCounter cc = alba[0];
      InHall hh  = alba[1];
      InKitchen kk = alba[2];
      
      cc.hello();
      hh.carry(2, "된장찌개");
      hh  = alba[3];
      hh.carry(5, "떡만두국");
      kk.dish(8);
      cc  = alba[1];
      cc.pay(4, 8000);
      cc.hello();
      hh.carry(3, "김치찌개");
      hh  = alba[2];
      hh.carry(5, "떡만두국");
      kk =  alba[3];
      kk.dish(5);
      cc  = alba[0];
      cc.pay(3, 15000);
      
      
      for (ReAlba ra : alba) {
         System.out.println(ra.data);
      }
      System.out.println(totData);
   }

}