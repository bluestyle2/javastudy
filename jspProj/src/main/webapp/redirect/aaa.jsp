<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>aaa</title>
</head>
<body>
<h1>aaa 입니다.</h1>
<script>
	alert("확인")
</script>
<%
//html구문을 먼저읽지 않고 실행되기 떄문에 기존에있던 구문을 무시함
	response.sendRedirect("bbb.jsp");	

%>
</body>
</html>