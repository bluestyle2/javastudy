<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h2>난 목록이여</h2>
<table border="">
	<tr>
		<td>번호</td>
		<td>제목</td>
		<td>작성자</td>
		<td>작성일</td>
		<td>조회수</td>
	</tr>
<c:forEach items="${mainData }" var="dto" varStatus="no">
	<tr>
		<td>${first + no.index }</td>
		<td>		
		<c:forEach begin="1" end="${dto.lev}" >
			&nbsp;&nbsp;
		</c:forEach>
		<c:if test="${dto.lev>0 }">
			┗
		</c:if>
		<a href="BoardDetail?id=${dto.id}&page=${nowPage}">${dto.title }</a></td>
		<td>${dto.pname }</td>
		<td>${dto.reg_dateStr }</td>
		<td>${dto.cnt }</td>
	</tr>
</c:forEach>
	<tr>
	<td colspan="5" align="center">
		<c:if test="${firstPage>1 }">
			<a href="?page=${firstPage-1 }"> < </a>
		</c:if>
		<c:forEach begin="${firstPage }" end="${endPage}" var="i" >
			<c:choose>
				<c:when test="${nowPage==i }">
					[${i }]
				</c:when>
				<c:otherwise>
					<a href="?page=${i }">${i }</a>
				</c:otherwise>			
			</c:choose>			
		</c:forEach>
		<c:if test="${endPage<totalCnt }">
			<a href="?page=${endPage+1 }"> > </a>
		</c:if>
		</td>
	</tr><tr>
		<td colspan="5" align="right">
			<a href="BoardInsertForm?page=${param.page }">글쓰기</a>
		</td>
	</tr>
</table>