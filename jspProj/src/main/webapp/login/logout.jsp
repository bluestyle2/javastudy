<%@page import="basic.MemDTO"%>
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
MemDTO st = (MemDTO)application.getAttribute("me");
application.removeAttribute("me");
String msg = st.getMname()+"님 로그아웃되었습니다.";
%>

<script>
alert("<%=msg%>")
location.href = "index.jsp"
</script>
</body>
</html>