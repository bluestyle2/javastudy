<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
목록들이지<br>


<table border="">
	<tr>		
		<td colspan="5" align="center">
			<form action="">
				<select name="kind" >
					<option value="title">제목</option>
					<option value="pname">작성자</option>
					<option value="content">내용</option>
					<option value="cnt">조회수</option>
				</select>
				<input type="text" name="sch" />
				<input type="submit" value="검색" /></form>
		</td>
	</tr>


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
			<a href="boardInsertReg">글쓰기</a> <!-- Form은 내가 나중에 알아서 만들라고함 -->
			<a href="boardInsertList">다중 글쓰기</a>
			<a href="boardInsertList2">다중 글쓰기2</a>
			<a href="boardInsertGid">글쓰기gid</a>
			<a href="boardInsertGid2">글쓰기gid2</a>
			<a href="boardInsertGid3">글쓰기gid3</a>
			<a href="boardInsertGid4">글쓰기gid4</a>
		</td>
	</tr>
</table>