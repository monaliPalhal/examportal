package info.vinod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class insertdata {

	public static void main(String[] args) {
		
		
		
			System.out.println("Inserting values in Mysql database table!");
			Connection con = null;
			String url = "jdbc:mysql://localhost:3306/student";
			String driver = "com.mysql.jdbc.Driver";
			try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "project", "qwerty");
			try {
				Statement st = con.createStatement();
				String sql = "INSERT INTO login (username,password ) VALUES ( 'ujawala', 'zxcvbn')";
				System.out.println(sql);
				int val = st.executeUpdate(sql);
				System.out.println("1 row affected");
				System.out.println(val + " records affected.\n");
			} catch (SQLException s) {
				System.out.println("SQL statement is not executed! Error is: " + s.getMessage());
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	}
}
		

	