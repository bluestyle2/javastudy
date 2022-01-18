package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ExamDAO {

	Connection con;
	Statement stmt;
	ResultSet rs;
	
	String sql;
	
	
	public ExamDAO() {
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

	public ArrayList<ExamDTO> List(){
		ArrayList<ExamDTO> res = new ArrayList<ExamDTO>();
		
		sql = "select * from exam";
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ExamDTO dto = new ExamDTO();
				dto.setTitle(rs.getString("title"));
				dto.setSid(rs.getString("sid"));
				dto.setKor(rs.getInt("kor"));
				dto.setEng(rs.getInt("eng"));
				dto.setMat(rs.getInt("mat"));
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
	
	public ArrayList<ExamDTO> List2(){
		ArrayList<ExamDTO> res = new ArrayList<ExamDTO>();
		
		sql = "select *, kor+eng+mat from exam";
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				ExamDTO dto = new ExamDTO();
				dto.setTitle( rs.getString("title"));
				dto.setSid( rs.getString("sid"));
				dto.setKor( rs.getInt("kor"));
				dto.setEng( rs.getInt("eng"));
				dto.setMat( rs.getInt("mat"));
				
				System.out.println( rs.getString("title")+":"+rs.getInt("kor+eng+mat"));
				
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
	
	public ExamDTO detail(String id){
		ExamDTO res = null;
		
		sql = "select * from exam where sid = '"+id+"' ";
		System.out.println(sql);
		try {
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				res= new ExamDTO();
				res.setTitle(rs.getString("title"));
				res.setSid(rs.getString("sid"));
				res.setKor(rs.getInt("kor"));
				res.setEng(rs.getInt("eng"));
				res.setMat(rs.getInt("mat"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}
		
		
		return res;
	}
	
	public int insert(ExamDTO dto){
		int res = 0;
						
		sql = "insert into exam"
				+ "(title, sid, kor, eng, mat)"
				+ "values"
				+ "('"
				+dto.getTitle()+"','"
				+dto.getSid()+"',"
				+dto.getKor()+ ","
				+dto.getEng()+","
				+dto.getMat()+")";	
		
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
	
	public int modify(ExamDTO dto){
		int res = 0;
		
		sql = "update exam set title = '"+dto.getTitle()+"' , kor = "+dto.getKor()+", eng = "
				+dto.getEng()+", mat = "
				+dto.getMat()+"  where sid = '"
				+dto.getSid()+"' ";
		
	//	sql = "insert into exam"
	//			+ "(title, sid, kor, eng, mat)"
		//		+ "values"
			//	+ "('"
				//+dto.getTitle()+"','"
				//+dto.getSid()+"',"
			//	+dto.getKor()+ ","
			//	+dto.getEng()+","
			//	+dto.getMat()+")";	
		
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
	
	public int delete(String id){
		int res = 0;
		
		sql = "delete from exam where sid = '"+id+"' ";
		
	//	System.out.println(sql);
		
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
		if(rs!=null) try {rs.close(); } catch (SQLException e) {}
		if(stmt!=null) try {stmt.close(); } catch (SQLException e) {}
		if(con!=null) try {con.close(); } catch (SQLException e) {}
	}
	
}
