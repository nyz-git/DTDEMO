package database;

import java.sql.*;
import java.util.Scanner;
import java.io.*;

class InsertIntoDatabaseEx {
	public static void main(String args[]) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sundaybatch", "root", "root");

			PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");

			Scanner sc = new Scanner(System.in);

			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String name = sc.next();

			ps.setInt(1, id);
			ps.setString(2, name);

			ps.executeUpdate();

			System.out.println("record successfully entered");

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}