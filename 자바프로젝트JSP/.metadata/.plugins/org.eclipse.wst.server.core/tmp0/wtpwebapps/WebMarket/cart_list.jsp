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
<title>장바구니</title>
<script type="text/javascript">
	function deleteallCart() {
		if(confirm("장바구니에 있는 모든 상품을 삭제하시겠습니까?")){
			document.delallcart.submit();
		}else{
			document.delallcart.reset()
		}
	}
	function selectdeletCart() {
		if(confirm("선택한 제품을 삭제하시겠습니까?")){
			document.delcart.submit();
		}else{
			document.delcart.reset()
		}
	}
</script>
</head>
<body>
	<%
		
		String cartId = session.getId();
	%>
	
	<jsp:include page="menu.jsp"></jsp:include>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">장바구니</h1>
		</div>
	</div>
	
	<div class="container">
		<div class="row">
			<table width="100%">
				<tr>
					<td align="left">
						<form action="./deleteAllCart.jsp?cartId=<%=cartId%>" name="delallcart" method="post">
							<a href="#" class="btn btn-danger"
					 onclick="deleteallCart()">장바구니 비우기</a></form></td>
					<td align="right"><a href="#" class="btn btn-success">주문하기 </a></td>
				</tr>
			</table>
		</div>
		<div style="padding-top:50px">
			<table class="table table-hover">
				<tr>
					<th>상품</th>
					<th>가격</th>
					<th>수량</th>
					<th>소계</th>
					<th>비고</th>
				</tr>
				<%
					int sum = 0;
					 ArrayList<Product> lists = (ArrayList<Product>)session.getAttribute("cartlist");
					if(lists == null)
						lists = new ArrayList<Product>();
						//상품리스트 하나씩 출력하기
						for(Product product:lists){
							int total = product.getUnitPrice() * product.getQuantity();
						sum=sum+total;
				%>
				<tr>
					<td><%= product.getProductId() %> - <%= product.getPname() %></td>
					<td><%=NumberFormat.getInstance().format(product.getUnitPrice())%></td>
					<td><%= product.getQuantity()%></td>
					<td><%=NumberFormat.getInstance().format(total) %></td>
					<td><form action="./removeCart.jsp?id=<%=product.getProductId()%>" name="delcart" method="post">
					<a href="#" class="badge badge-danger" onclick="selectdeletCart()">삭제</a></form></td>
					 
				</tr>
				<%
						}
				%>
				<tr>
					<th></th>
					<th></th>
					<th>총액</th>
					<th><%=NumberFormat.getInstance().format(sum)%></th>
					<th></th>
				</tr>
			</table>
			
			
			<a href="./product.jsp" class = "btn btn-secondary">&laquo;쇼핑계속하기</a>
		</div>
			<hr>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>