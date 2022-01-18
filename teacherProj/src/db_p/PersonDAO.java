package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonDAO {
   
   Connection con;
   Statement stmt;
   ResultSet rs;
   
   String sql;
   
   
   public PersonDAO() {
      String url = "jdbc:mysql://localhost:3306/green_db"; 
      String username = "green_mem"; 
      String pw = "123456";
      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(url, username, pw);
         stmt = con.createStatement();
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   
   public ArrayList<PersonDTO> list(){
      ArrayList<PersonDTO> res = new ArrayList<PersonDTO>();
      
      sql = "select * from person";
      
      try {
         rs = stmt.executeQuery(sql);
         
         while(rs.next()) {
            PersonDTO dto = new PersonDTO();
            dto.setPname( rs.getString("Pname") );
            dto.setPid( rs.getString("pid") );
            dto.setAge( rs.getInt("age") );
            dto.setReg_date( rs.getDate("reg_date") );
            
            res.add(dto);
         }
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         close();
      }

      return res;
   }
   
   
   public PersonDTO detail(String id){
      PersonDTO res = null;
      
      sql = "select * from person where pid = '"+id+"' ";
      //System.out.println(sql);
      try {
         rs = stmt.executeQuery(sql);
         
         if(rs.next()) {
            res = new PersonDTO();
            res.setPname( rs.getString("pname") );
            res.setPid( rs.getString("pid") );
            res.setAge( rs.getInt("age") );
            res.setReg_date( rs.getDate("reg_date") );
            
         }
         
      } catch (SQLException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         close();
      }

      return res;
   }
   
   
   
   public int insert(PersonDTO dto){
      int res = 0;
      
      sql = "insert into person "
            + "(pname, pid, age, reg_date) "
            + "values ('"
            +dto.getPname()+"', '"
            +dto.getPid()+"', "
            +dto.getAge()+ ", '"
            +dto.getReg_dateStr()+"')";
      
      //System.out.println(sql);
      
      try {
         res = stmt.executeUpdate(sql);
      
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         close();
      }

      return res;
   }
   
   
   public int modify(PersonDTO dto){
      int res = 0;
      
      sql = "update person set Pname = '"
            +dto.getPname()+"' , age = "
            +dto.getAge()+", reg_date = '"
            +dto.getReg_dateStr()+"'  where pid = '"
            +dto.getPid()+"' ";
            
      System.out.println(sql);
      
      try {
         res = stmt.executeUpdate(sql);
      
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         close();
      }

      return res;
   }
   
   
   public int delete(String id){
      int res = 0;
      
      sql = "delete from person where pid = '"+id+"' ";
            
      System.out.println(sql);
      
      try {
         res = stmt.executeUpdate(sql);
      
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }finally {
         close();
      }

      return res;
   }
   
   
   
   
   
   public void close() {
      if(rs!=null) try {rs.close();} catch (SQLException e) {}
      if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
      if(con!=null) try {con.close();} catch (SQLException e) {}
   }
   

}