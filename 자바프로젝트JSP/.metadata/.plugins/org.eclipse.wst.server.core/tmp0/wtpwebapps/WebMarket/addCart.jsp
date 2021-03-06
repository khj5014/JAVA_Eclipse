<%@page import="java.util.ArrayList"%>
<%@page import="com.dto.Product"%>
<%@page import="com.dto.ProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//주문한 제품을 잡아구니에 담아서 세션에 저장하는 페이지
		
		String id = request.getParameter("id");
		if(id == null || id.trim().equals("")){
			response.sendRedirect("product.jsp");
			return;
		}



		//제품의 리스트를 가져온다.
		ProductRepository dao = ProductRepository.getInstance();
		//제품의 아이디를 가져온다.
		Product goods = dao.getProductById(id);
		if(goods == null){
			response.sendRedirect("exceptionNoProductId.jsp");
			}
		
		//장바구니에 추가해서 저장하기 전에 먼저 장바구니를 불러와서 세션에 저장된 장바구니를 호출
		ArrayList<Product> lists = (ArrayList<Product>)session.getAttribute("cartlist");
		
		//장바구니 없다면 신규생성
		if(lists == null){
			lists = new ArrayList<Product>();
			session.setAttribute("cartlist", lists);
		}
		//장바구니에 제품 중복 여부 판단
		boolean isNotInLIst = true;
		
		//장바구니에 있는 제품이라는 1증가
		for(Product p : lists){
			if(p.getProductId().equals(id)){	//같은제품이 장바구니에 있다면
				p.setQuantity(p.getQuantity()+ 1 );
				isNotInLIst = false;
			}
		}
		
		//장바구니에 없는 제품이라면 1추가
		if(isNotInLIst){
			goods.setQuantity(1);
			lists.add(goods);
		}
		
		response.sendRedirect("product_info.jsp?id="+id);
		%>
</body>
</html>