package io_p;

import java.io.Serializable;

public class ObjAAA implements Serializable {
   
   int a = 10;
   String b = "아기상어";
   boolean c = true;
   
   Object data;
   
   public ObjAAA() {
      // TODO Auto-generated constructor stub
   }

   public ObjAAA(int a, String b, boolean c) {
      super();
      this.a = a;
      this.b = b;
      this.c = c;
   }

   @Override
   public String toString() {
      return "ObjAAA [a=" + a + ", b=" + b + ", c=" + c + "]";
   }
}