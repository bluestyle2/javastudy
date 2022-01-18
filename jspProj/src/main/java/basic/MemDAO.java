package basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemDAO{
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	
	String sql;

	
	String url = "jdbc:mysql://localhost:3306/green_db";
	String username = "green_mem"; 
	String pw = "123456";
	
	public MemDAO() {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, pw);
			stmt = con.createStatement();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
	
	
	//회원가입 시 사용하는 메소드: 회원의 모든 정보를 DB에 입력
	public int signUp(MemDTO dto) {
		
		

		switch(dto.getKind()){
			case "adult":
				
				sql = "insert into mem_info "
						+"(mid, mname, mpw, tel, kind, company) "
						+" values ('"
						+dto.getMid()+"', '"
						+dto.getMname()+"', '"
						+dto.getMpw()+"', '"
						+dto.getTel()+"', '"
						+dto.getKind()+"', '"
						+dto.getCompany()+"')";
				
				break;
			case "foreigner":
				sql = "insert into mem_info "
						+"(mid, mname, mpw, tel, kind, nationality) "
						+" values ('"
						+dto.getMid()+"', '"
						+dto.getMname()+"', '"
						+dto.getMpw()+"', '"
						+dto.getTel()+"', '"
						+dto.getKind()+"', '"
						+dto.getNationality()+"')";
				
				
				break;
			case "juvenile":
				sql = "insert into mem_info "
						+"(mid, mname, mpw, tel, kind, jumin, school) "
						+" values ('"
						+dto.getMid()+"', '"
						+dto.getMname()+"', '"
						+dto.getMpw()+"', '"
						+dto.getTel()+"', '"
						+dto.getKind()+"', '"
						+dto.getJumin()+"', '"
						+dto.getSchool()+"')";
				
				break;
		
		}
		
		
		
		int res = 0;
		
		
			System.out.println(sql);
			try {
				res = stmt.executeUpdate(sql);
			//executeQuery랑 executeUpdate랑 다름?
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				close();
			}
			return res;
	}
	
	//로그인 시 사용하는 메소드: 회원의 모든 정보를 로그인 시 DB에서 받아옴	
	public MemDTO signIn(MemDTO dto) {
		MemDTO res = null;
		
		sql = "select * from mem_info  where mid='"+dto.mid+"' and mpw = '"+dto.mpw+"'";
		try {
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				res = new MemDTO();
				res.setMid(rs.getString("mid"));
				res.setMname(rs.getString("mname"));
				res.setKind(rs.getString("kind"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}		
		return res;
	}
	
	
	public boolean idChk(String id) {
		
		sql = "select * from mem_info  where mid='"+id+"'";
		try {
			rs = stmt.executeQuery(sql);
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}		
		return false;
	}
	
	public boolean chk(String id, String col) {
		
		sql = "select * from mem_info  where "+col+" = '"+id+"'";
		try {
			rs = stmt.executeQuery(sql);
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}		
		return false;
	}
	
	public boolean telChk(String tel) {	
		
		sql = "select * from mem_info  where tel='"+tel+"'";
		try {
			rs = stmt.executeQuery(sql);
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}		
		return false;
	}
	public boolean pwChk(String pw) {	
		
		sql = "select * from mem_info  where mpw='"+pw+"'";
		try {
			rs = stmt.executeQuery(sql);
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}		
		return false;
	}
	
	
	public ArrayList<MemDTO> list(){
		
		ArrayList<MemDTO> res = new ArrayList<MemDTO>();

		sql = "select * from mem_info";
		
		try {
			rs = stmt.executeQuery(sql);		
			while(rs.next()) {
				MemDTO dto = new MemDTO();
				dto.setMid(rs.getString("mname"));
				dto.setMid(rs.getString("mid"));
				dto.setMid(rs.getString("mpw"));
				
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
	
	public void close() {
		
		if(rs!=null) try {rs.close();} catch (SQLException e) {}
		if(stmt!=null) try {stmt.close();} catch (SQLException e) {}
		if(con!=null) try {con.close();} catch (SQLException e) {}
	
	}
	

}