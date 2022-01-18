<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>make</title>
</head>
<body>
<h1>make</h1>
<%
	session.setAttribute("aaa", new int[]{10,20,30,40});
	session.setAttribute("bbb", 123.456);
	session.setAttribute("ccc", "스투페파이");
%>
</body>
</html>