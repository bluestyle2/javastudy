package lang_p;

import java.util.Arrays;

public class WrapperMain {

   public static void main(String[] args) {
      
      
      String str = "1234";
      
      //int i = (int)str;
      

      int i = Integer.parseInt(str);
      
      System.out.println(i+100);
      
      byte bb = Byte.parseByte("123");
      System.out.println(bb);
      
      System.out.println(Short.parseShort("123")+100);
      System.out.println(Long.parseLong("1234567890")+100);
      
      System.out.println(Float.parseFloat("123.456")+100);
      System.out.println(Double.parseDouble("123.456")+100);
      
      System.out.println(!Boolean.parseBoolean("false"));
      
      str = Integer.toBinaryString(10);
      System.out.println(str);
      str = Integer.toOctalString(10);
      System.out.println(str);
      str = Integer.toHexString(10);
      System.out.println(str);
      
      
      String jumin = "090320-3234567";
      //              01234567
      int pp = Integer.parseInt(jumin.substring(7, 8));
      System.out.println("pp:"+pp);
      int gen = pp%2;
      int loc = pp/5;
      System.out.println("gen:"+gen);
      System.out.println("loc:"+loc);
      System.out.println("성별:"+"여남".charAt(pp%2));
      System.out.println("국적:"+"내외".charAt(pp/5)+"국인");
      
      String title = "년월일";
      String birth = "";
      int [] arr = new int[title.length()];
      for (int j = 0; j <title.length(); j++) {
         arr[j] = Integer.parseInt(jumin.substring(j*2,j*2+2));
         birth += jumin.substring(j*2,j*2+2)+title.charAt(j);
         //System.out.println(jumin.substring(j*2,j*2+2));
         //System.out.println(title.charAt(j));
      }
      int year = (pp-1)   %4   /2   +19;
      birth = year+birth;
      arr[0] += year*100;
      System.out.println(birth);
      System.out.println(Arrays.toString(arr));
      
      int now = 2021;
      System.out.println(now-arr[0]+1);
      
      
/*      -1   %4   /2   +19      
19   1   0   0   0   19
19   2   1   1   0
-------------------------------
20   3   2   2   1   20
20   4   3   3   1
--------------------------------------------
19   5   4   0
19   6   5   1
20   7   6   2
20   8   7   3
 * */      
      
      
      
      
      
   }

}