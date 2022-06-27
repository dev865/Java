package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {
	private static DatabaseConnector dbc = new DatabaseConnector();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost/javadb";
	
	private DatabaseConnector() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, "javauser", "mysql");
		} catch (SQLException e) {
			System.out.println("연결 정보가 정확하지 않습니");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다");
			e.printStackTrace();
		}
	}
	public static DatabaseConnector getInstance() {
		return dbc;
	}
	public Connection getConnection() {
		return conn;
	}
}
