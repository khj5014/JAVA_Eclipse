import java.sql.*;

public class DBApp2 {
public static void main(String [] args) {
		
		Connection conn;
		Statement stmt;
		String sql;
		String jdbcUrl="jdbc:mysql://192.168.1.3/db174257";
		String userID="dbuser174257";
		String userPW="ce1234";
	
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch ( ClassNotFoundException e ) {
		System.err.println("Driver Error" + e.getMessage());
		return;
		}
		System.out.println("JDBC Driver is found. OK.");
	
	
		try {
		conn = DriverManager.getConnection(jdbcUrl, userID, userPW);
		System.out.println("Connection Success");
		stmt = conn.createStatement();
		sql = "INSERT INTO department VALUES ( 126, '°æ¸®ºÎ', 1004 )";
		int x = stmt.executeUpdate(sql);
		System.out.printf("%d updated.\n", x);

		
		stmt.close();
		conn.close();
		} catch ( SQLException e ) {
		System.err.println("DB Error" + e.getMessage());
		return;
		}
	}
}
