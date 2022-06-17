<%@page import="com.dto.Product"%>
<%@page import="com.dto.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 비우기</title>
</head>
<body>
	<%
	String id = request.getParameter("cartId");
	if (id == null || id.trim().equals("")) {
		response.sendRedirect("cart_list.jsp");
		return;
	}

	session.invalidate();
	
	response.sendRedirect("cart_list.jsp");
	%>
</body>
</html>