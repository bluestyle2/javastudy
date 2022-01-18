<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>postList</title>
</head>
<body>
<h1>postList</h1>
<table border="">
	<tr>
		<td>반</td>
		<td>"${studArr.BInfo.ban }"</td>
		<td>급훈</td>
		<td>"${studArr.BInfo.motto }"</td>
	</tr>
	<tr>
		<td>이름</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
		<td>총점</td>
		<td>평균</td>
	</tr>
	<c:forEach var="dto" items="${studArr.arr }">
	<tr>
		<td>${dto.pname }</td>
		<td>${dto.kor }</td>
		<td>${dto.eng }</td>
		<td>${dto.mat }</td>
		<td>${dto.tot }</td>
		<td>${dto.avg }</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>