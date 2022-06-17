<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>현재 페이지는 첫번째 페이지입니다.</h3>
	<jsp:include page="action_include_process.jsp">
		<jsp:param value="admin" name="id"/>
		<jsp:param value="1234" name="password"/>
		<jsp:param value="<%= new java.util.Date() %>" name="date"/>
	</jsp:include>
	<br>----------------------------------
</body>
</html>