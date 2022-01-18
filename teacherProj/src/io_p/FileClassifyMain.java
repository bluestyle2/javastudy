package io_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

//지정한 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오
/// 하위 폴더까지 검색하세요
/// 같은 파일명인 경우 중복 처리 하세요
//이미지 : bmp, jpg, gif, png 
//음악 : mp3, wma, wav
//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
//가사 :txt
//기타 : 위의 분류 이외
//확장자의 대소문자 구분하지 않음


public class FileClassifyMain {

   String dstName = "zxcv";
   
   HashMap<String, String>map = new HashMap<String, String>();
   
   void fileClassify(File dir) {
      System.out.println("[[[[현재 디렉토리]]]]:"+dir.getPath());
      
      File [] arr = dir.listFiles();
      
      for (File ff : arr) {
         if(ff.isDirectory()) {
            fileClassify(ff);
         }else {
            try {
               copyFile(ff);
            } catch (Exception e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }   
         }
      }
   }
   
   void copyFile(File ff) throws Exception {
      System.out.println("파일복사:"+ff.getPath());
      int pos = ff.getName().lastIndexOf(".");
      String fileName = ff.getName();
      String fName = fileName.substring(0,pos);
      String exp = fileName.toLowerCase().substring(pos);
      
      //System.out.println(fName+"->"+exp);
      String dirName = "etc";
      for (Map.Entry<String, String>me : map.entrySet()) {
         if(Pattern.matches(me.getKey(), exp)) {
            dirName = me.getValue();
            break;
         }
      }
      dirName = dstName+"/"+dirName+"/";
      System.out.println(fileName+"->"+dirName);
      
      File dst = new File(dirName);
      
      if(!dst.exists())
         dst.mkdirs();
      
      dst = new File(dirName+fileName);
      
      int cnt = 1;
      while(dst.exists()) {
         
         fileName = fName+"_"+cnt+exp;
         dst = new File(dirName+fileName);
         
         cnt++;
      }
      
      
      
      FileInputStream fis = new FileInputStream(ff);
      FileOutputStream fos = new FileOutputStream(dst);
      
      byte [] buf = new byte[1024];
      
      while(fis.available()>0) {
         int len = fis.read(buf);
         fos.write(buf, 0, len);
      }
      
      fos.close();
      fis.close();
      
      
   }
   
   public FileClassifyMain() {
      
      map.put(".(bmp|jpg|gif|png)","img");
      map.put(".(mp3|wma|wav)","music");
      map.put(".(doc|hwp|ppt|xls|pptx|xlsx|docx)","oa");
      map.put(".txt","lyrics");
      
      fileClassify(new File("asdf"));
      
      
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new FileClassifyMain();
   }

}