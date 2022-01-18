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
Stud st = (Stud)application.getAttribute("me");
application.removeAttribute("me");
String msg = st.getName()+"님 로그아웃되었습니다.";
%>

<script>
alert("<%=msg%>")
location.href = "loginMain.jsp"
</script>
</body>
</html>