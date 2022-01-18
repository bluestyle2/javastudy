package db_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PersonDTO {
   String pid, pname;
   int age;
   Date reg_date;
   
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   
   public PersonDTO() {
      // TODO Auto-generated constructor stub
   }

   public String getPid() {
      return pid;
   }

   public void setPid(String pid) {
      this.pid = pid;
   }

   public String getPname() {
      return pname;
   }

   public void setPname(String pname) {
      this.pname = pname;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public Date getReg_date() {
      return reg_date;
   }

   public void setReg_date(Date reg_date) {
      this.reg_date = reg_date;
   }
   
   public String getReg_dateStr() {
      return  sdf.format(reg_date);
   }

   
   

   public PersonDTO(String pid, String pname, int age, String reg_date) {
      super();
      this.pid = pid;
      this.pname = pname;
      this.age = age;
      try {
         this.reg_date = sdf.parse(reg_date);
      } catch (ParseException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   @Override
   public String toString() {
      return pid + "\t" + pname + "\t" + age + "\t" + sdf.format(reg_date);
   }
   
   
}