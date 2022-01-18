package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudyjoinDAO {  
   
   Connection con;
   Statement stmt;
   ResultSet rs;
   
   String sql;
   
   public StudyjoinDAO() {
         String url = "jdbc:mysql://localhost:3306/study_db";
         String username = "studyojh";
         String pw ="123456";

      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(url, username, pw);
         stmt = con.createStatement();
         
      } catch (Exception e) {
      
      }
   
   }
   
   
   public int insert(StudyjoinDTO dto){ 
      int res = 0;
        
      sql = "insert into stjinfo"
         + "(id, pw, name, birth, tel, tel, say1, say2, say3) "
         + "values ('"
         +dto.getId()+"', '"
         +dto.getPw()+"', '"
         +dto.getName()+"', '"
         +dto.getBirth()+ "', '"
         +dto.getTel()+ "', "
         +dto.getSay1()+ ", "
         +dto.getSay2()+ ", "
         +dto.getSay3()+" )";                  
            
       try {
          res = stmt.executeUpdate(sql);
        
       } catch (Exception e) {
   
          e.printStackTrace();
       }finally {
          close();
       }
   
       return res;
   }      
   
   public StudyjoinDTO detail(String id, String pw){ 
	   StudyjoinDTO res = null;
         
      sql = "select * from stjinfo where id = '" + id + "'AND pw ='" + pw + "' ";

         try {
            rs = stmt.executeQuery(sql);
            
            if(rs.next()) {
               res = new StudyjoinDTO();
               res.setName( rs.getString("name") );
               res.setId( rs.getString("id") );
               res.setPw( rs.getString("pw") );
               res.setBirth( rs.getString("birth") );
               res.setTel(rs.getString("tel"));
               res.setSay1( rs.getString("say1") );
               res.setSay2( rs.getString("say2") );
               res.setSay3( rs.getString("say3") );
               
            }
            
         } catch (Exception e) {

            e.printStackTrace();
            
         }finally {
            close();
         }

        return res;
   }
   
      public void close() {
          if(rs!=null) try {rs.close();} catch (Exception e) {}
          if(stmt!=null) try {stmt.close();} catch (Exception e) {}
          if(con!=null) try {con.close();} catch (Exception e) {}
    }

}