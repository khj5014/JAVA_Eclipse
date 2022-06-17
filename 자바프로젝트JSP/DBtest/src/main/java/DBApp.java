import java.sql.*;

public class DBApp {
public static void main(String [] args) {
		
		Connection conn;
		Statement stmt;
		ResultSet rs;
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
		sql = "SELECT * FROM employee";
		rs = stmt.executeQuery( sql );
		
		while (rs.next() ) {
		int ssn = rs.getInt(1) ; // number
		String name = rs.getString("name");
		String sex = rs.getString("sex");
		String addr= rs.getString("addr");
		System.out.printf("%d %s %s %s\n", ssn, name, sex, addr);
		}
		
		stmt.close();
		conn.close();
		} catch ( SQLException e ) {
		System.err.println("DB Error" + e.getMessage());
		return;
		}
	}
}
