package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	static String DriverURL = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://localhost:3306/lms";
	static String DB_USER = "root";
	static String DB_PASSWORD = "gaganeswar145";

	public static Connection createConnection() throws SQLException, ClassNotFoundException {
		Class.forName(DriverURL);
		Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		return conn;
	}
}