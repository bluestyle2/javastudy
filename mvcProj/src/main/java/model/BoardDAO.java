package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

	Connection con;
	PreparedStatement ptmt;
	ResultSet rs;
	String sql;
	
	public BoardDAO() {
		
		try {
			DataSource ds = (DataSource)(new InitialContext().lookup("java:comp/env/hhhaaa"));
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
	
	public int total() {
	
		
		sql = "select count(*) from board ";
		
		try {
			ptmt = con.prepareStatement(sql);
		
			rs = ptmt.executeQuery();
			
			rs.next();
				
			return rs.getInt(1);
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
		return 0;
	}
	
	public ArrayList<BoardDTO> list(int first, int limit){
		ArrayList<BoardDTO> res = new ArrayList<BoardDTO>();
		
		sql = "select * from board order by gid desc, seq limit ? , ? ";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, first);
			ptmt.setInt(2, limit);
			rs = ptmt.executeQuery();
			
			while(rs.next()) {
				
				BoardDTO dto = new BoardDTO();
				dto.setId(rs.getInt("id"));
				dto.setGid(rs.getInt("gid"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setLev(rs.getInt("lev"));
				dto.setSeq(rs.getInt("seq"));
				dto.setTitle(rs.getString("title"));
				dto.setPname(rs.getString("pname"));
				dto.setReg_date(rs.getTimestamp("reg_date"));
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
	
	
	
	
	
	public BoardDTO detail(int id){
		BoardDTO dto = null;
		
		sql = "select * from board where id = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				
				dto = new BoardDTO();
				
				dto.setId(rs.getInt("id"));
				dto.setGid(rs.getInt("gid"));
				dto.setCnt(rs.getInt("cnt"));
				dto.setLev(rs.getInt("lev"));
				dto.setSeq(rs.getInt("seq"));
				dto.setTitle(rs.getString("title"));
				dto.setPname(rs.getString("pname"));
				dto.setReg_date(rs.getTimestamp("reg_date"));				
				dto.setContent(rs.getString("content"));
				dto.setUpfile(rs.getString("upfile"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
		return dto;
	}
	
	public void addCount(int id){
				
		sql = "update board set cnt = cnt + 1 where id = ?";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			ptmt.executeUpdate();		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
	
	}
	
	public int insert(BoardDTO dto){
		//System.out.println(dto);
		sql = "insert into board (title, pname, pw, content, upfile, cnt, lev, seq, reg_date) "
				+ "values (?,?,?,?,?,0,0,0, sysdate() )";
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.getTitle());
			ptmt.setString(2, dto.getPname());
			ptmt.setString(3, dto.getPw());
			ptmt.setString(4, dto.getContent());
			ptmt.setString(5, dto.getUpfile());
			ptmt.executeUpdate();		
			
			
			sql = "select max(id) from board";	//데이터를 입력하고난다음에 id의 큰 번호를 가져온다
			ptmt = con.prepareStatement(sql);
			rs = ptmt.executeQuery();
			rs.next();
			int id = rs.getInt(1);	//sql의 1번째 컬럼 = id?
			System.out.println(id);
			
			
			sql = "update board set gid = id where id = ?";	//얻은 id를 gid와 같은것으로 바꿔치기해준다
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, id);
			ptmt.executeUpdate();	
			
			return id;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
		return 0;
	}
	
	public int delete(BoardDTO dto){
		
		sql = "delete from board where id = ? and pw = ?"; //나는 보드에서 지울거야 아이디가 뭐이면서 패스워드가 뭐인애
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getPw());
			
			return ptmt.executeUpdate();	//삭제한개 몇개인지를 리턴 즉 1를 리턴하면 삭제가된거고 0을 리턴하면 삭제가안된것
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
		return 0;	//삭제가안됐다 = 패스워드가 안맞았다
	
	}
	
	public BoardDTO idPwChk(BoardDTO dto){
		BoardDTO res = null;
		sql = "select * from board where id = ? and pw = ?"; //나는 보드에서 지울거야 아이디가 뭐이면서 패스워드가 뭐인애
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getPw());
			
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				
				res = new BoardDTO();
				
				res.setId(rs.getInt("id"));
				res.setGid(rs.getInt("gid"));
				res.setCnt(rs.getInt("cnt"));
				res.setLev(rs.getInt("lev"));
				res.setSeq(rs.getInt("seq"));
				res.setTitle(rs.getString("title"));
				res.setPname(rs.getString("pname"));
				res.setReg_date(rs.getTimestamp("reg_date"));				
				res.setContent(rs.getString("content"));
				res.setUpfile(rs.getString("upfile"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
		return res;
	
	}
	
	public int modify(BoardDTO dto){
		
		sql = "update board set title = ?, pname = ?, upfile = ?, content = ? where id = ? and pw = ?"; //나는 보드에서 지울거야 아이디가 뭐이면서 패스워드가 뭐인애
		
		try {
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dto.getTitle());
			ptmt.setString(2, dto.getPname());
			ptmt.setString(3, dto.getUpfile());
			ptmt.setString(4, dto.getContent());
			ptmt.setInt(5, dto.getId());
			ptmt.setString(6, dto.getPw());
			
			return ptmt.executeUpdate();	//삭제한개 몇개인지를 리턴 즉 1를 리턴하면 삭제가된거고 0을 리턴하면 삭제가안된것
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
		return 0;	//삭제가안됐다 = 패스워드가 안맞았다
	
	}
	
	public int fileDelete(BoardDTO dto){
		
		sql = "update board set upfile = null where id = ? and pw = ?"; //나는 보드에서 지울거야 아이디가 뭐이면서 패스워드가 뭐인애
		
		try {
			ptmt = con.prepareStatement(sql);

			ptmt.setInt(1, dto.getId());
			ptmt.setString(2, dto.getPw());
			
			return ptmt.executeUpdate();	//삭제한개 몇개인지를 리턴 즉 1를 리턴하면 삭제가된거고 0을 리턴하면 삭제가안된것
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
		return 0;	//삭제가안됐다 = 패스워드가 안맞았다
	
	}
	
	public int reply(BoardDTO dto){
		//System.out.println(dto);
		
		
		try {
			
			sql = "update board set seq = seq + 1 where gid = ? and seq > ?";
			ptmt = con.prepareStatement(sql);
			
			ptmt.setInt(1, dto.getGid());
			ptmt.setInt(2, dto.getSeq());			
			ptmt.executeUpdate();
			
			 sql = "insert into board (title, pname, pw, content, cnt, lev, seq, gid, reg_date) "
					+ "values (?,?,?,?, 0,?,?,?, sysdate() )";
					
			 ptmt = con.prepareStatement(sql);	
			 ptmt.setString(1, dto.getTitle());
			 ptmt.setString(2, dto.getPname());
			 ptmt.setString(3, dto.getPw());
			 ptmt.setString(4, dto.getContent());
			 ptmt.setInt(5, dto.getLev()+1);				  
			 ptmt.setInt(6, dto.getSeq()+1);
			 ptmt.setInt(7, dto.getGid());						
			 ptmt.executeUpdate();
			  
			  
			  sql = "select max(id) from board";
			  ptmt = con.prepareStatement(sql); 
			  rs = ptmt.executeQuery(); 
			  rs.next(); 
			  int id = rs.getInt(1); 
			  System.out.println(id);
			  
			 return id;
			 
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			close();
		}
		
		return 0;
	}
}
