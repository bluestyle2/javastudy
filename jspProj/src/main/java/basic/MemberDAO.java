package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberDAO {
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	String sql;

	
	String url = "jdbc:mysql://localhost:3306/green_db";
	String username = "green_mem"; 
	String pw = "123456";
	
	public MemberDAO() {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, pw);
			stmt = con.createStatement();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}		public void close() {
		
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
	
	}
		
	public boolean loginChk(String id, String pw) {
			sql = "select * from mem_info where mid = "+id+" and mpw = "+pw;
				
				System.out.println(sql);
				try {
					rs = stmt.executeQuery(sql);
					return rs.next();
				//executeQuery랑 executeUpdate랑 다름?
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					close();
				}
				return false;
		}
	
	   public MemberDTO reaLogin(String id, String pw){ 
		   MemberDTO res = null;
	         //java단 수정시 서버 재기동 필수!
		   
		   sql = "select * from mem_info where mid = '" + id + "'AND mpw ='" + pw + "' ";

	         try {
	            rs = stmt.executeQuery(sql);
	            
	            if(rs.next()) {
	            	res = new MemberDTO();
	            	res.setId(rs.getString("mid"));
	            	res.setPw(rs.getString("mpw"));
	            	res.setName(rs.getString("mname"));

	               
	            }
	            
	         } catch (Exception e) {

	            e.printStackTrace();
	            
	         }finally {
	            close();
	         }

	        return res;
	   }

}
