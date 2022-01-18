<%@page import="java.util.Arrays"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	HttpSession se = session;
	HttpSession se2 = request.getSession();

%>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
<h1>view</h1>
id : <%=session.getId()%><br>
생성시간 : <%=new Date(se2.getCreationTime()) %><br>
마지막접근시간 : <%=new Date( se.getLastAccessedTime()) %><br>
values -> 어트리뷰트들: <%= Arrays.toString(session.getValueNames()) %><br>
aaa:<%=session.getAttribute("aaa") %><br>
bbb:<%=se.getAttribute("bbb") %><br>
ccc:<%=se2.getAttribute("ccc") %><br>
ddd:<%=se2.getAttribute("ddd") %><br>
interval:<%=session.getMaxInactiveInterval() %><br>
</body>
</html>