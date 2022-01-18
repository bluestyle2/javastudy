<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
</head>
<body>
<h1>modify</h1>
<%
	session.setAttribute("aaa", "미토콘드리아나이크로벡터");	
	session.setAttribute("ddd", 1234);
	session.setMaxInactiveInterval(10); //초단위 --> 갱신하지 않고 10초가 지날경우임
%>
</body>
</html>