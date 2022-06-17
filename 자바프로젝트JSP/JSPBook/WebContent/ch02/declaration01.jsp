<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 

<!-- contentType="text/html; : 웹브라우저가 받아볼 페이지의 인코딩 방식 -->
<!-- pageEncoding="UTF-8" : JSP파일에 기록된 소스코드 자체의 인코딩 방식 -->
<!-- <meta charset="UTF-8"> : html페이지의 인코딩방식 -->
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- 선언문태그 -->
	<%!
		int data = 50;
		int sum(int a, int b){
			return a + b;
		}
		
		String makeTOLower(String str){
			return str.toLowerCase();
		}
		
	%>
	
	<!-- 스클립틀릿태그 -->
	<!-- 서블릿으로 변환시 _jspService()메서드 내부에 배치 -->
	<%
		out.println("data : " + data + "<br>");
		out.println("2+3 : " + sum(2,3) + "<br>");
		out.println(makeTOLower("KIM HUI JAE" + "<br>"));
		
		int count = 0; //지역변수
		out.println("count : " + ++count + "<br>");
		
		for(int i =0; i<=10; i++){
			if(i % 2==0){
				out.println("i : " + i + "<br>");			
			}
		}
		
	%>
	
	<!-- 표현문태그 : 웹브라우저에 출력할 부분을 표현, 기본데이터타입과 자바객체타입도 사용가능 -->
	count : <%= count++	%><br>
	data : <%= data	%><br>
	소문자 변환 : <%= makeTOLower("KIM HUI JAE") %><br>
	Today's date : <%= new java.util.Date() %><br>
	Today's date : <%= Calendar.getInstance().getTime() %> <br> 	
</body>
</html>