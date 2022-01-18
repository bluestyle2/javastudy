<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>트랜젝션게시판 ${boardDTO.service}</title>
</head>
<body>
<h1>트랜젝션 게시판 목록</h1>
<table border="">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
<c:forEach items="${mainData}" var="dto" varStatus="no">
	<tr>
		<td>${no.index }</td>
		<td><a href="boardDetail?id=${dto.id }">${dto.title }</a></td>
		<td>${dto.pname }</td>
		<td>${dto.reg_date }</td>
		<td>${dto.cnt }</td>
	</tr>
</c:forEach>
	<tr>		
		<td colspan="5" align="right">
			<a href="genInsert">일반 다중글쓰기</a> <!-- Form은 내가 나중에 알아서 만들라고함 -->
			<a href="genInsert2">일반 다중글쓰기2</a>
			<a href="genInsert3">트렌젝션 다중글쓰기3</a>
		</td>
	</tr>
</table>
</body>
</html>