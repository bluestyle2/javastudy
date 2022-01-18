package basic_p;


class ArrRec{
   
   int w, h, area, border;

   public ArrRec(int w, int h) {
      
      this.w = w;
      this.h = h;
      calc();
   }
   
   void calc() {
      area = w* h;
      border = (w+h)*2;
   }

   @Override
   public String toString() {
      return "직사각형 : "+area + ", " + border;
   }   
}

public class InsArrMain {

   public static void main(String[] args) {
      ArrRec [] arr = {
            
            new ArrRec(5, 6),
            new ArrRec(4, 7),
            new ArrRec(8, 2),
            new ArrRec(13, 9)
      };
      
      for (ArrRec ar : arr) {
         System.out.println(ar);
      }

   }

}