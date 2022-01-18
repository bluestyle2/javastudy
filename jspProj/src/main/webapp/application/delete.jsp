<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
<h1>delete</h1>
<%
	
	application.removeAttribute("pname");
	application.removeAttribute("title");
	
%>
</body>
</html>