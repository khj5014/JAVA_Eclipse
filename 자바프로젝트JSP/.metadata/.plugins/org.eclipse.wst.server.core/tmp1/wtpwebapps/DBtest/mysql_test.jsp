<%@ page language="java" contentType="text/html;charset=utf-8"%>
<%@ page import="java.sql.*"%>
<HTML> <BODY>
<!DOCTYPE html PUBLIC "-//w3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%
		String dbURL = "jdbc:mysql://192.168.1.3/db174257";
		String userID = "dbuser174257"; String userPW= "ce1234";
		Connection conn; Statement stmt;
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(dbURL, userID, userPW);
		stmt = conn.createStatement();
		conn.close();
		out.println("MySQL Connection Success!");
		}	
		catch(Exception e){
		out.println(e);
		}
%>
		<table border="1">
		<tr> <th>id</th> <th>이름</th> <th>관리사원번호</th> </tr>
	
<%		
		try {
		conn = DriverManager.getConnection(dbURL, userID, userPW);
		System.out.println("Connection Success");
		stmt = conn.createStatement();
		String sql = "SELECT * FROM department";
		ResultSet rs = stmt.executeQuery( sql );
		while (rs.next() ) {
%>
		<tr>
		<td> <%=rs.getInt("dnum")%> </td>
		<td> <%=rs.getString("name")%> </td>
		<td> <%=rs.getInt("mgrssn")%> </td>
		</tr>
<% 
		}
%>
		
		</table>
<%
		stmt.close();
		conn.close();
		} catch ( SQLException e ) {
		System.err.println("DB Error" + e.getMessage());
		return;
		}
%>
</body>
</html>