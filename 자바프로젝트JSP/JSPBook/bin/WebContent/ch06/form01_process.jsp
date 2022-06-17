<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String password = request.getParameter("passwd");
		String name = request.getParameter("name");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String comment = request.getParameter("comment");
	%>
	<p>아이디 : <%=id %> 
	<p>비밀번호 : <%=password %>
	<p>이름 : <%=name %>
	<p>연락처 : <%=phone1 %> - <%=phone2 %> - <%=phone3 %>   
	<p>성별 : <%=gender %>
	<p>취미 : <%
				if(hobby != null){
					for(int i = 0; i < hobby.length; i++){
						out.println(hobby[i] + " ");
					}
				}
			  %>
	<p>가입인사 : <%=comment %>
	
	<table border="1">
		<tr>
			<th>요청파라미터 이름</th><th>요청파라미터 값</th>
		</tr>
		<% 
			request.setCharacterEncoding("utf-8");
			Enumeration en = request.getParameterNames();
			while(en.hasMoreElements()){
				String name1 = (String)en.nextElement();
				String paramValue = request.getParameter(name1);
				if(en.hasMoreElements() == false ){
					if(hobby != null){
						for(int i = 1; i < hobby.length; i++){
							out.print("<tr><td>" + "hobby"+ (i+1) + "</td>" + "<td>" + hobby[i] + "</td></tr>");					
						}
						out.println("<tr><td>" + name1 + "</td>" + "<td>" +  paramValue + "</td></tr>");
					}	
				}else out.println("<tr><td>" + name1 + "</td>" + "<td>" +  paramValue + "</td></tr>");
					
				
			}			
		%>
	</table> 
