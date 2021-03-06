<%@page import="com.dto.ProductRepository"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="com.dto.Product"%>
<%@page errorPage="/exception/exceptionNoProductid.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="productDAO" class="com.dto.ProductRepository"	scope="session"/>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>상품상세정보</title>
<script type="text/javascript">
	function addToCart() {
		if(confirm("상품을 장바구니에 추가하시겠습니까?")){
			document.addForm.submit();
		}else{
			document.addForm.reset()
		}
	}
</script>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 상세 정보</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
		ProductRepository dao = ProductRepository.getInstance();
		Product product = dao.getProductById(id);
	%>
	<div class="container">
		<div class="row">
		<div class = "col-md-5">
		<img alt="이미지입니다." src="<%=request.getContextPath()%>/upload/<%= product.getFilename()%>"
						style="width: 100%">
		</div>
			<div class="col-md-6">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><b>상품코드 : </b> <span class="badge badge-danger"> <%=product.getProductId()%></span>
				<p>상품코드 : <% out.println(product.getProductId()); %>
				<p>제조사 : <%=product.getManufacturer()%>
				<p>분류 : <%=product.getCategory()%>
				<p>재고 수 : <%=product.getUnitsInStock()%>
				<h4><%=NumberFormat.getInstance().format(product.getUnitPrice())%>원</h4>
				
					<form action="./addCart.jsp?id=<%=product.getProductId()%>" name="addForm" method="post">
						<p><a href="#" class="btn btn-info" onclick="addToCart()">상품주문&raquo;</a>
						<a href="./cart_list.jsp" class="btn btn-warning"> 장바구니 &raquo;</a>
						<a href="./product.jsp" class="btn btn-secondary"> 상품 목록 &raquo;</a>
						
						
					</form>
			</div>
		</div>
	</div>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>