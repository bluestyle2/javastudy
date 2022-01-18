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
<%
	Cookie [] arr = request.getCookies();

	for(Cookie cc: arr){	//Cookie를 확인하려면 배열을 게속돌려서 봐야한다
%>
<%=cc. getName() %> :<%=cc.getValue() %><br>

<%} %>
</body>
</html>