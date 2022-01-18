<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>난 디테일이여</h2>
<table border="">
	<tr>
		<td>id</td><td>${mainData.id}</td>
	</tr><tr>
		<td>제목</td><td>${mainData.title}</td>
	</tr><tr>
		<td>작성자</td><td>${mainData.pname }</td>
	</tr><tr>
		<td>작성일</td><td>${mainData.reg_dateStr }</td>
	</tr><tr>
		<td>조회수</td><td>${mainData.cnt }</td>
	</tr><tr>
	<c:if test="${mainData.lev==0 }">
		<td>파일</td><td>${mainData.upfile }</td>
	</tr><tr>
	</c:if>
		<td>내용</td><td>${mainData.contentBr }</td>
	</tr><tr>
		<td colspan="2" align="right">
			<a href="BoardList?page=${param.page }">목록으로</a>
			<a href="BoardModifyForm?id=${mainData.id }&page=${param.page }">수정</a>
			<a href="BoardDeleteForm?id=${mainData.id }&page=${param.page }">삭제</a>
			<a href="BoardReplyForm?id=${mainData.id }&page=${param.page }">답변</a>
		</td>
	</tr>
</table>