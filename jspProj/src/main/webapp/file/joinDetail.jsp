<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm</title>
</head>
<body>
<h1>joinForm</h1>

<table>
	<tr>
		<td>id</td>
		<td>${mem.pid }</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>${mem.pname }</td>
	</tr>
	<tr>
		<td>암호</td>
		<td>${mem.pw }</td>
	</tr>
	<tr>
		<td>사진</td>
		<td>
		<img alt="" src='<c:url value="/ttt/${mem.pic }"/>'
		</td>
	</tr>	
</table>>

</body>
</html>