package net_p;

import java.io.Serializable;

public class TCPData implements Serializable{
   
   private static final long serialVersionUID = 1234L;
   
   String src, dst = null, kind;
   
   Object data;
   
   public TCPData() {
      // TODO Auto-generated constructor stub
   }

   public TCPData(String src, String dst, String kind, Object data) {
      super();
      this.src = src;
      this.dst = dst;
      this.kind = kind;
      this.data = data;
   }

   @Override
   public String toString() {
      return "TCPData [src=" + src + ", dst=" + dst + ", kind=" + kind + ", data=" + data + "]";
   }

   
}