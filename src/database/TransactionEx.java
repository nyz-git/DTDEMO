package database;

import java.sql.*;

class TransactionEx {
	public static void main(String args[]) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sundaybatch", "root", "root");

		con.setAutoCommit(false);

		Statement stmt = con.createStatement();

		String s1 = "insert into student values(900,'dsdsad')";
		stmt.executeUpdate(s1);

		stmt.executeUpdate("insert into student values(800,'dadssdsda')");

		System.out.println("Values inserted");

		ResultSet rs = stmt.executeQuery("select * from student");

		System.out.println("Before Rollback");
		// Printing values from Database
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));
		}

		con.rollback();

		System.out.println("After Rollback");
		ResultSet rs1 = stmt.executeQuery("select * from student");

		// Printing values from Database
		while (rs1.next()) {
			System.out.println(rs1.getInt(1) + "  " + rs1.getString(2));
		}
		con.close();
	}
}