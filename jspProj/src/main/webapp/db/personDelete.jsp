<%@page import="basic.Person"%>
<%@page import="basic.PersonDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	new PersonDAO().delete(request.getParameter("pid"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>personDelete</title>
</head>
<body>
<h1>personDelete</h1>
<script>
	alert("삭제되었습니다.")
	location.href="personList.jsp"
</script>
</body>
</html> 