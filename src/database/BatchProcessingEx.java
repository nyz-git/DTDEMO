package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class BatchProcessingEx {
	public static void main(String args[]) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Dri");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sundaybatch", "root", "root");

		Statement stmt = con.createStatement();

		stmt.addBatch("insert into student values(13,'qewe')"); //adding queries inside batch
		stmt.addBatch("insert into student values(19,'dada')");

		stmt.executeBatch();// executing the batch

		con.close();
	}
}