<%@page import="com.dto.ProductRepository"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="com.dto.Product"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>상품 목록</title>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<jsp:useBean id="productDAO" class="com.dto.ProductRepository" scope="page"/>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<%
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>
	<div class="container">
		<div class="row" align="center">
 			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
				<img alt="이미지입니다." src="<%=request.getContextPath()%>/upload/<%= product.getFilename()%>"
						style="width: 100%">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=NumberFormat.getInstance().format(product.getUnitPrice())%>원
				<p><a href="./product_info.jsp?id=<%=product.getProductId()%>" class="btn btn-secondary" role="button">상세정보&raquo;</a>
			</div>
			<% 
				}	
			%>
		</div>	
	</div>
	<%@ include file ="./footer.jsp" %>
</body>
</html>