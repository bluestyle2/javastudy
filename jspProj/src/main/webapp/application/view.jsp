<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
<h1>view</h1>
<%-- 이런 방식으로는 안됨 
names:<%=Arrays.toString(application.getAttributeNames()) %><br> 
--%>
<%
	Enumeration en = application.getAttributeNames();
	while(en.hasMoreElements()){
		out.println(en.nextElement()+"<br>");
	}
%>
<%=application.getAttribute("pname") %>님 안녕하세요<br>
pid : <%=application.getAttribute("pid") %><br>
pname : <%=application.getAttribute("pname") %><br>
title : <%=application.getAttribute("title") %><br>
age : <%=application.getAttribute("age") %><br>
bb:<%=request.getAttribute("bb") %><br>	
</body>
</html>