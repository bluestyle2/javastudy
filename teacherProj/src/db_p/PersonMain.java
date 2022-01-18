package db_p;

public class PersonMain {

   public static void main(String[] args) {
      System.out.println("목록--------------");
      for (PersonDTO dto : new PersonDAO().list()) {
         System.out.println(dto);
      }
      
      System.out.println("상세 : "+new PersonDAO().detail("bbb"));
      
      PersonDTO dto = new PersonDTO("ccc", "커피빈", 26, "2000-08-09");
      
      if(new PersonDAO().detail(dto.getPid())==null) {
         System.out.println("추가 : "+new PersonDAO().insert(dto));
      }else {
         System.out.println("이미 사용중인 ID 입니다.");
      }
      
      System.out.println("변경 : "+new PersonDAO().modify(new PersonDTO("ccc", "원빈", 59, "2001-01-03") ));
      System.out.println("변경 : "+new PersonDAO().modify(new PersonDTO("ppp", "원빈", 59, "2001-01-03") ));
      
      System.out.println("삭제 : "+new PersonDAO().delete("aaa"));
   }

}