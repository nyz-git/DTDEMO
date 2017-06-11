package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseEx {
	public static void main(String args[]) {
		try {
			// 1 Loading the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// 2 Create the connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advancejava", "root", "root");

			// 3 Create the statement object
			Statement stmt = con.createStatement();

			// 4 Execute query
			ResultSet rs = stmt.executeQuery("select * from student");
			
			//Printing values from Database
			while (rs.next())
				System.out.println(rs.getInt(1) + "  " + rs.getString(2));

			// 5 Close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
