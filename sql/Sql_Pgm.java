package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Sql_Pgm {

	static Connection con;
	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/sys", "root", "AMAHESH1432@");

			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from rajesh");

			while (rs.next())

				System.out.println(rs.getString(1) + "  " + rs.getInt(2));
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}