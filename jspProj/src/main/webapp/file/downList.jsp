<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>downList</title>
</head>
<body>
<h1>downList</h1>
<%
	String path = request.getRealPath("fff");
	path = "E:\\ojh\\study\\java_work\\jspProj\\src\\main\\webapp\\fff";
	
%>
<c:forEach items="<%=new File(path).listFiles() %>" var="ff">
<c:if test="${ff.file }">
	<a href="downOne.jsp?fname=${URLEncoder.encode(ff.name,"utf-8") }">${ff.name }</a><br>
	</c:if>
	</c:forEach>
</body>
</html>