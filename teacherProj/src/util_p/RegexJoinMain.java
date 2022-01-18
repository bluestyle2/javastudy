package util_p;

import java.util.Scanner;
import java.util.regex.Pattern;

/*
////회원 가입 유효성 검사를 실시하세요
1. 아이디 : 영문 숫자 조합
2. 비번 , 비번확인 
3. 이메일  -  아이디:영문,숫자   @  도메인 : 영문 점
4. 전화번호 - 숫자 :  ###-####-####,   ##(#)-###-####
5. 이름 (한글만 가능)
6. 주민번호 
7. 사진 첨부-->영문,숫자.이미지 확장자
   이미지(jpg, jpeg, bmp, png, gif)  --  대소문자 구분없음
8. 우편번호 검색 - 구단위 (초성검색)

예외처리로 처리할 것
*/
class RegexMem{
   String [] title =  "id,pw,email,tel,name,jumin,img,zipcode".split(",");
   String [] data = new String [title.length];

   @Override
   public String toString() {
      String ttt = "";
      
      for (int i = 0; i < data.length; i++) {
         ttt+=title[i]+" : "+data[i]+"\n";
         
      }
      
      return ttt;   
   }
   
   void dataSet(String tt, String dd) {
      
      int pp = dataPos(tt);
      if(pp>=0) {
         data[pp] = dd;
      }
   }
   
   int dataPos(String tt) {
      
      for (int i = 0; i < title.length; i++) {
         if(title[i].equals(tt))
            return i;
      }
      
      return -1;
   }
   
   String dataGet(String tt) {
      
      int pos = dataPos(tt);
      
      if(pos<0)
         return null;
      
      return data[pos];
   }
}

class RegexMM{
   RegexMem mem;
   String title, msg;
   boolean bs;
   String [] pp;
   
   RegexMM(RegexMem mem, String title, String msg, String ... pp) throws Exception {
      this(mem, title, msg, false, pp);
   }
   
   RegexMM(RegexMem mem, String title, String msg, boolean bs, String ... pp) throws Exception {
      this.mem = mem;
      this.title = title;
      this.msg = msg;
      this.pp = pp;
      this.bs = bs;
      chk();
   }

   Scanner sc = new Scanner(System.in);
   
   void chk() throws Exception {
      System.out.print(title+":");
      String data = sc.nextLine();
      
      if(bs) {  //소문자로 변환
         data = data.toLowerCase();
      }
      
      for (String tt : pp) {
         if(!Pattern.matches(tt, data)) {
            throw new Exception(msg);
         }
      }
      
      mem.dataSet(title, data);
      //mem.data[0] = data;
      
      if(title.equals("pw확인") && !data.equals(mem.dataGet("pw"))) {
         throw new Exception(msg);
      }
      
   }
   
   RegexMM(RegexMem mem, String title,String msg, int ttStart, int ttEnd, int start, int end) throws Exception {
      
      this.mem = mem;
      this.title = title;
      this.msg = msg;
      numChk(ttStart, ttEnd, start, end);
   }
   
   void numChk(int ttStart, int ttEnd,         int start, int end) throws Exception {
         // subString 시작 , subString 끝
      String aaa = mem.dataGet(title).substring(ttStart,ttEnd);
      int no = Integer.parseInt(aaa);
      //System.out.println(aaa);
      
      if(no<start || no > end) {
         throw new Exception(msg);
      }   
   }   
}


class ZipcodeSel{
   
   RegexMem mem;
   
   String[] postcode = { "서울 중구", "서울 종로구", "서울 동대문구", 
         "서울 성동구", "서울 서대문구", "서울 용산구", "서울 영동포구",
         "서울 마포구",   "서울 성북구", "부산 중구", "부산 서구", "부산 영도구",
         "부산 동구", "부산 부산진구", "부산 동래구", "대구 중구", "대구 동구",
         "대구 서구","대구 남구", "대구 북구", "인천 중구", "인천 동구", 
         "미추홀구", "인천 부평구", "서울 도봉구", "서울 관악구", "광주 동구",
         "광주 서구","서울 강남구", "부산 남구", "서울 강서구", "대전 동구",
         "대전 중구", "부산 북구", "서울 은평구", "서울 강동구", "서울 구로구",
         "서울 동작구",   "부산 해운대구", "대구 수성구", "광주 북구", 
         "부산 사하구", "울산 중구", "울산 남구", "광주 광산구", "서울 송파구",
         "서울 중랑구",   "서울 노원구", "서울 서초구", "서울 양천구", 
         "부산 금정구", "대구 달서구", "인천 서구", "인천 남동구", "대전 서구",
         "울산 동구", "수원 권선구","수원 장안구", "부산 강서구", 
         "대전 유성구", "대전 대덕구", "성남 수정구", "성남 중원구", 
         "전주 덕진구", "전주 완산구", "성남 분당구","안양 만안구",
         "안양 동안구", "수원 팔달구", "청주 상당구", "청주 흥덕구",
         "포항 북구", "포항 남구", "서울 광진구", "서울 강북구",
         "서울 금천구", "부산 연제구", "부산 수영구", "부산 사상구",
         "인천 연수구", "인천 계양구", "광주 남구", "고양 덕양구", "울산 북구",
         "안산 상록구", "안산 단원구", "수원 영통구", "고양 일산서구",
         "용인 처인구", "용인 기흥구", "용인 수지구", "천안 동남구", "천안 서북구",
         "창원 의창구", "창원 성산구", "창원 마산회원구", "창원 진해구",
         "청주 청원구", "청주 서원구" };
   
   ZipcodeSel(RegexMem mem) throws Exception {
      this.mem = mem;
      gogo();
   }
   
   void gogo() throws Exception {
      
      Scanner sc = new Scanner(System.in);

      String pp1 = "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎㅃㅉㄸㄲㅆ";
      String pp2 = "가나다라마바사아자차카타파하빠짜따까싸";
      String pp3 = "깋닣딯맇밓빟싷잏짛칳킿팋핗힣삫찧띻낗앃";
      
      while(true) {
      
         try {
            new RegexMM(mem, "zipcode","zipcode에러","[가-힣ㄱ-ㅎ]+");
            
            String pp = ".*";
            for (char ch : mem.dataGet("zipcode").toCharArray()) {
            
               int pos = pp1.indexOf(ch);
               
               if(pos>=0) {
                  pp += "["+pp2.charAt(pos)+"-"+pp3.charAt(pos)+"]";
               }else {
                  pp+=ch;
               }
            }
            pp+= ".*";
            
            //System.out.println(pp);
            //ㅁ추ㅎ  -->  .*[마-밓]추[하-힣].*
            
            String postStr = "";
            
            for (String string : postcode) {
               if(Pattern.matches(pp, string)) {
                  postStr+=","+string;
               }
            }
            
            String [] postArr = postStr.split(",");
            //System.out.println(postArr.length);
            if(postArr.length==1) {
               throw new Exception("조건에 맞는 지역이 없습니다.");
            }
            
            
            for (int i = 1; i < postArr.length; i++) {
               System.out.println(i+":"+postArr[i]);
            }
            System.out.print("지역선택:");
            int sel = sc.nextInt();
            mem.dataSet("zipcode", postArr[sel]);
            
            break;
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
         
      }
      
      
   }
   
}



public class RegexJoinMain {

   public static void main(String[] args) {
      
      
      RegexMem mem;
      while(true) {
         mem = new RegexMem();
         try {
            new RegexMM(mem, "id","id에러","[a-zA-Z0-9]*",".*[a-zA-Z].*",".*[0-9].*");
            new RegexMM(mem, "pw","pw에러","[^ ]{5,}");
            new RegexMM(mem, "pw확인","pw확인에러","[^ ]{5,}");   
            new RegexMM(mem, "email","email에러","[a-zA-Z0-9]{4,}@[a-zA-Z]{3,}[.](([a-zA-Z]{2,})|([a-zA-Z]{2}.[a-zA-Z]{2}))");
            new RegexMM(mem, "tel","tel에러","((\\d{2,3}-\\d{3})|(\\d{3}-\\d{4}))-\\d{4}");
            new RegexMM(mem, "name","name에러","[가-힣]{2,5}");
            new RegexMM(mem, "jumin","jumin에러","\\d{2}((0[1-9])|(1[0-2]))(([0-2][0-9])|(3[0-1]))-\\d{7}");
            new RegexMM(mem, "jumin","jumin에러","\\d{6}-\\d{7}");
            new RegexMM(mem, "jumin","jumin에러",2,4,1,12);//월범위            
            new RegexMM(mem, "jumin","jumin에러",4,6,1,31);//일범위
            new RegexMM(mem, "jumin","jumin에러",7,8,1,8);//두번째첫째자리
            new RegexMM(mem, "img","사진에러", true,"[a-zA-Z0-9]+[.](jpg|jpeg|bmp|png|gif)");
            new ZipcodeSel(mem);
            
            break;
         } catch (Exception e) {
            System.out.println(e.getMessage());
         }
      }
      System.out.println("회원가입성공---");
      System.out.println(mem);
   }

}