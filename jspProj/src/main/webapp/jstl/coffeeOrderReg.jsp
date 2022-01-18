<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>coffeeOrderReg</title>
</head>
<body>
<c:choose>
	<c:when test="${param.menu=='americano' }"><c:set var = "price" value="2200"/></c:when>
	<c:when test="${param.menu=='africano' }"><c:set var = "price" value="2500"/></c:when>
	<c:when test="${param.menu=='asiano' }"><c:set var = "price" value="2700"/>
	</c:when>
	
</c:choose>
<h1>coffeeOrderReg</h1>
<table border="">
	<tr>
		<td>메뉴</td>
		<td>${param.menu }</td>
	</tr>
	<tr>
		<td>수량</td>
		<td>${param.cnt }</td>
	</tr>
	<tr>
		<td>단가</td>
		<td>${price }</td>
	</tr>
	<tr>
		<td>합계</td>
		<td>${param.cnt*price }</td>
	</tr>
</table>
</body>
</html>