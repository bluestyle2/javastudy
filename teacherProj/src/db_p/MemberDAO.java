package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
   
   Connection con;
   Statement stmt;
   ResultSet rs;
   String sql;
   
   public MemberDAO() {
      String url = "jdbc:mysql://localhost:3306/green_db";
      String username = "green_mem";
      String password = "123456";
      
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(url, username, password);
         stmt = con.createStatement();
         
      } catch (Exception e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }
   
   public void close() {
      if(rs!=null) try {rs.close();} catch (SQLException e) {}
      if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
      if(con!=null) try {con.close();} catch (SQLException e) {}
      
   }
   
   ArrayList<MemberDTO> list(){
      sql = "select * from member";
      ArrayList<MemberDTO> res = new ArrayList<MemberDTO>();
      
      try {
         rs = stmt.executeQuery(sql);
         while(rs.next()) {
            MemberDTO dto = new MemberDTO();
            
            dto.setMid(rs.getString("mid"));
            dto.setMname(rs.getString("mname"));
            dto.setTel(rs.getString("tel"));
            dto.setHobby(rs.getString("hobby"));
            
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
   
   int insert(ArrayList<MemberDTO> arr) {
      
      int res = 0;
      
      try {
         
         for (MemberDTO dto : arr) {
            sql = "insert into member (mid, mname, tel, hobby) values ('"
                  +dto.getMid()+"','"
                  +dto.getMname()+"','"
                  +dto.getTel()+"','"
                  +dto.getHobby()+"')";
            
            System.out.println(sql);
            
            res+= stmt.executeUpdate(sql);
         }
      } catch (Exception e) {
         // TODO: handle exception
      }finally {
         
         close();
      }
         
      return res;
   }
   
   
   
   
   int insert2(ArrayList<MemberDTO> arr) {
      
      int res = 0;
      
      try {
         
         con.setAutoCommit(false);   //// 자동 저장 해제
         
         for (MemberDTO dto : arr) {
            sql = "insert into member (mid, mname, tel, hobby) values ('"
                  +dto.getMid()+"','"
                  +dto.getMname()+"','"
                  +dto.getTel()+"','"
                  +dto.getHobby()+"')";
            
            System.out.println(sql);
            
            res+= stmt.executeUpdate(sql);
         }
         
         con.commit();  //모든 구문이 정상처리 되었을때 저장
      } catch (Exception e) {
         
         try {
            con.rollback();  //실행 중 에러발생시 rollback
            
         } catch (SQLException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
         }
         
      }finally {
         
         close();
      }
         
      return res;
   }
   
   
   
}