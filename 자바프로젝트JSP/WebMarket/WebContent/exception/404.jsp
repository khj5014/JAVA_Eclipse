<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>페이지 없음 오류</title>
</head>	
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="alert alert-danger">요청하신 페이지를 찾을 수 없습니다..</h1>
		</div>
	</div>
	
	<div class="container">
		<p><%= request.getRequestURI() %>
		<p><a href="./product.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
	</div>
</body>
</html>