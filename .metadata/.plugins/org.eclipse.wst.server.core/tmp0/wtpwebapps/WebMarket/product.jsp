<%@page import="java.text.NumberFormat"%>
<%@page import="com.dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>상품목록</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<jsp:useBean id="productDAO" class="com.dto.ProductRepository" scope="page"></jsp:useBean>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품목록</h1>
		</div>
	</div>
	<div class="container">
		<div class="row" align="center">
	<%
		ArrayList<Product> listOfProducts = productDAO.getAllProducts();
		for(int i = 0; i< listOfProducts.size(); i++){
			Product product = listOfProducts.get(i);
		
	%>
	
			<div class="col-md-4">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=NumberFormat.getInstance().format(product.getUnitPrice())%>원
			</div>
			<%
				}	
			%>
		</div>	
	</div>
	<%@ include file ="./footer.jsp" %>
</body>
</html>