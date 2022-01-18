<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Object oo1 = this;
	Object oo2 = pageContext.getPage();	//pageContext도 내장객체
	HttpJspPage oo3 = (HttpJspPage)page;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ppppage</title>
</head>
<body>
<h1>ppppage</h1>
<%=page %><br>
<%=oo1 %><br>
<%=oo2 %><br>
<%=oo3.getServletInfo() %><br>
<%=oo3.getServletConfig() %><br>

</body>
</html>