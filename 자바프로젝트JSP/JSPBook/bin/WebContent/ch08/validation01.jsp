<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function chechForm() {
		var form = document.LoginForm;
		if(form.id.value == "" || (form.id.value.length < 4 || form. id.value.length > 12)
				|| !isNaN(form.id.value.substr(0, 1))){
			alert("아이디는 빈공백일 수 없고 4~12자 이내의 문자를 입력하세요.");
			form.id.focus();
			form.id.select();
			return false;
		}else if(form.passwd.value == "" || form.passwd.value.length < 4){
			alert("패스워드는 빈공백일 수 없고 4자 이상으로 입력하세요.");
			form.passwd.focus();
			return false;
		}
		form.submit();
	}
</script>
<body>
	<form action="validation01_process.jsp" name="LoginForm" method="post">
		<p>
			이름 : <input type="text" name="id">
		<p>
			비밀번호 : <input type="password" name="passwd">
		<p>
			<input type="button" value="전송" onclick="chechForm()">
	</form>
</body>
</html>