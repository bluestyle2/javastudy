package basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JuiceDAO {
	Connection con;	
	PreparedStatement ptmt;
	ResultSet rs;	
	String sql;
	
public JuiceDAO() {
		
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/hhhaaa");
			con = ds.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 public void close() {
         if(rs!=null) try {rs.close();} catch (SQLException e) {}
         if(ptmt!=null) try {ptmt.close();} catch (SQLException e) {}
         if(con!=null) try {con.close();} catch (SQLException e) {}
   }
	 public ArrayList<JuiceDTO> list(String gg){
		 ArrayList<JuiceDTO> res = new ArrayList<JuiceDTO>();
		 

		 sql = "select * from juice where product = ? ";
		 try {
			 ptmt = con.prepareStatement(sql);
			 
			
			 
			 ptmt.setString(1, gg);
			 rs = ptmt.executeQuery();
			 
			 while(rs.next()) {
				 JuiceDTO pp = new JuiceDTO();
				 pp.setId(rs.getString("id"));
				 pp.setName(rs.getString("name"));
				 pp.setProduct(rs.getString("product"));
				 
				 pp.setPrice(rs.getString("price"));
				
				 
				 res.add(pp);
			 }			 
			
		 } catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 close();
		 } 
		 
		 return res;
	 }
}
