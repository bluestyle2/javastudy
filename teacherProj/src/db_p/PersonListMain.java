package db_p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonListMain {

	public static void main(String[] args) {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					
					"jdbc:mysql://localhost:3306/green_db", 
					"green_mem", 
					"123456"
					);
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from person");
			
			while(rs.next()) {
				
				String str = rs.getString("pid")+"\t";
				str+=rs.getString("pname")+"\t";
				str+=rs.getString("age")+"\t";
				str+=rs.getString("reg_date");
				
				System.out.println(str);
			}
			
			rs.close();
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
