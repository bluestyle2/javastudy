<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exammodify2</title>
</head>
<body>
<h1>exammodify2</h1>
<%

	Cookie exam1 = new Cookie("pid","aa");
	Cookie exam2 = new Cookie("pass","1111");
	Cookie exam3 = new Cookie("pname","이효리");
	response.addCookie(exam1); 
	response.addCookie(exam2);
	response.addCookie(exam3);

%>
</body>
</html>