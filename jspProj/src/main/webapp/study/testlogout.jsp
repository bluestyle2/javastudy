<%@page import="basic.Stud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout</title>
</head>
<body>
	<h1>logout</h1>
<%
session.getAttribute("me");

String msg = session.getAttribute("me")+"님 로그아웃되었습니다.";
session.removeAttribute("me");
session.invalidate();
%>

<script>
alert("<%=msg%>")
location.href = "testloginMain.jsp"
</script>
</body>
</html>