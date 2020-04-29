package info.vinod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class deletedata {

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
				 String sqlDelete = "delete from login where username = 'rupali'";
		         System.out.println("The SQL statement is: " + sqlDelete + "\n");  // Echo for debugging
		         int countDeleted = st.executeUpdate(sqlDelete);
		         System.out.println(countDeleted + " records deleted.\n");
		         String sql = "select * from login";
					System.out.println(sql);
					 ResultSet rset = st.executeQuery(sql);
					System.out.println(" records selected.\n");
					int rowCount = 0;
					   while(rset.next()) {   // Move the cursor to the next row, return false if no more row
					      String username = rset.getString("username");
					      String password = rset.getString("password");
					  
					      System.out.println(username+","+ password);
					      ++rowCount;
					   }
				   
				   System.out.println("Total number of records = " + rowCount);
			} catch (SQLException s) {
				System.out.println("SQL statement is not executed! Error is: " + s.getMessage());
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
	
	}
}


	
