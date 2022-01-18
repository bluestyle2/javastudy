<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>config</title>
</head>
<body>
	<h1>config</h1>
	<%=config.getServletName() %><br>
	<%
		Enumeration<String> en = config.getInitParameterNames();
		while(en.hasMoreElements()){
			String key = en.nextElement();
			
	%>
		<%=key %> : <%=config.getInitParameter(key) %><br>
	<%} %>
</body>
</html>