package basic;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import javax.naming.Context;
import javax.naming.InitialContext;

import javax.sql.DataSource;



public class PersonDAO {
	
	Connection con;	//db와 연결시켜주는것
	PreparedStatement ptmt;	//sql구문을 실행시켜주는것
	ResultSet rs;	
	String sql;
	/*
	public PersonDAO() {
		String url = "jdbc:mysql://localhost:3306/green_db";
		String username = "green_mem"; 
		String pw = "123456";
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, pw);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	*/
	
	public PersonDAO() {
		
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
	 
	 public ArrayList<Person> list(String fr){
		 ArrayList<Person> res = new ArrayList<Person>();
		 
		 //sql = "select * from person where friend = '"+fr+"'";
		 sql = "select * from person where friend = ? ";
		 try {
			 ptmt = con.prepareStatement(sql);
			 
			 System.out.println(sql);
			 
			 ptmt.setString(1, fr);
			 rs = ptmt.executeQuery();
			 
			 while(rs.next()) {
				 Person pp = new Person();
				 pp.setPid(rs.getString("pid"));
				 pp.setPname(rs.getString("pname"));
				 pp.setFriend(rs.getString("Friend"));
				 
				 pp.setAge(rs.getInt("age"));
				 pp.setReg_date(rs.getTimestamp("reg_date"));
				 
				 res.add(pp);
			 }			 
			
		 } catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 close();
		 } 
		 
		 return res;
	 }
	 
	 public ArrayList<Person> list(){
		 ArrayList<Person> res = new ArrayList<Person>();
		 
		
		 sql = "select * from person";
		 try {
			 ptmt = con.prepareStatement(sql);
			 
			 System.out.println(sql);
			 
		
			 rs = ptmt.executeQuery();
			 
			 while(rs.next()) {
				 Person pp = new Person();
				 pp.setPid(rs.getString("pid"));
				 pp.setPname(rs.getString("pname"));
				 pp.setFriend(rs.getString("friend"));
				 
				 pp.setAge(rs.getInt("age"));
				 //pp.setReg_date(rs.getDate("Reg_date"));
				 pp.setReg_date(rs.getTimestamp("reg_date"));
				 res.add(pp);
			 }			 
			
		 } catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 close();
		 } 
		 
		 return res;
	 }
	 
	 public void insert(Person pp){
		 
		 sql = "insert into person (pid, pname, age, reg_date, friend) values (?, ?, ?, now(), ?) ";
		 try {
			 ptmt = con.prepareStatement(sql);
	
			 ptmt.setString(1, pp.pid);
			 ptmt.setString(2, pp.pname);
			 ptmt.setInt(3, pp.age);
			 ptmt.setString(4, pp.friend);			
			 ptmt.executeUpdate();
			 
		 } catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 close();
		 } 
		 
		
	 }
	 
	 public Person detail(String id){
		 
		 Person res = null;
		 
		 sql = "select * from person where pid = ? ";
		 try {
			 ptmt = con.prepareStatement(sql);
			 			 
			 ptmt.setString(1, id);
			 rs = ptmt.executeQuery();
			 
			 if(rs.next()) {
				 res = new Person();
				 res.setPid(rs.getString("pid"));
				 res.setPname(rs.getString("pname"));
				 res.setFriend(rs.getString("friend"));				 
				 res.setAge(rs.getInt("age"));
				 res.setReg_date(rs.getDate("reg_date"));				
			 }
			 			
		 } catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 close();
		 } 
		 
		 return res;
	 }
	 
 public void delete(String id){
		 
		
		 
		 sql = "delete from person where pid = ? ";
		 try {
			 ptmt = con.prepareStatement(sql);
			 
			 
			 ptmt.setString(1, id);
			 ptmt.executeUpdate();
			 		
			 			
		 } catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			 close();
		 } 
		 
		
	 }
	 

	 /// 가입, 상세(pid), 수정(pid), 삭제(pid)
	 //pid, pname friend, age, reg_date

 public void modify(Person pp){
		
		
		sql = "update person set pname = ?, age = ?, reg_date = ?, friend = ?, where pid = ?";			

		try {
			   ptmt = con.prepareStatement(sql);
			   
			   ptmt.setString(1, pp.pname);
			   ptmt.setInt(2, pp.age);
			   ptmt.setString(3, pp.getReg_dateStr());	//수정x
			   ptmt.setString(4, pp.friend);				   
	           ptmt.setString(5, pp.pid);
	           
	            ptmt.executeUpdate();
			
		
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			close();
		}		
		
	
	}
	

}
	 

