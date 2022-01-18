package lang_p;

//도형 클래스를 배열로 생성하여 같은 도형의 넓이와 둘레의 합계를 출력하세요

class ObjShape{
   
   String kind, name="";
  
   int area = 0, border = 0;
   

   public ObjShape(String kind) {
      
      this.kind = kind;
      this.name = "합계";
   }

   ObjShape(int r) {
      kind = "원";
      
      double pi = 3.141592;
      area = (int)(r*r*pi);
      border = (int)(r*2*pi);
   }
   
   ObjShape(int w, int h) {
      kind = "직사각형";
      
      area = w * h;
      border = (w+h)*2;
   }
   
   ObjShape(int w, int h, int l) {
      kind = "직각삼각형";
      
      area = w * h / 2;
      border = w+h+l;
   }

   @Override
   public String toString() {
      return kind + "\t" +name+"\t" + area + "\t" + border;
   }
   
   public boolean equals(Object oo) {
      
      ObjShape you = (ObjShape)oo;
      
      return kind.equals(you.kind);
   }
}

public class ObjShapeMain {

   public static void main(String[] args) {
      ObjShape [] arr = {
            new ObjShape(5),
            new ObjShape(5,6),
            new ObjShape(5,6,8),
            new ObjShape(10),
            new ObjShape(8,7),
            new ObjShape(9,7,13)
      };
      
      ObjShape [] res = {
            new ObjShape("직사각형"),
            new ObjShape("직각삼각형"),
            new ObjShape("원")
      };
      
      for (ObjShape sh : arr) {
         System.out.println(sh);
         
         for (ObjShape rr : res) {
            if(rr.equals(sh)) {
               rr.area += sh.area;
               rr.border += sh.border;
            }
         }
         
      }
      System.out.println("---------------------");
      for (ObjShape sh : res) {
         System.out.println(sh);
      }
      
   }

}