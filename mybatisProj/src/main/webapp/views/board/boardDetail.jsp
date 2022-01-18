<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
상세입니다<br>


<table border="" >
	<tr>
		<td width="100">id</td><td width="600">${mainData.id}</td>
	</tr><tr>	
		<td>제목</td><td>${mainData.title}</td>
	</tr><tr>	
		<td>작성자</td><td>${mainData.pname}</td>
	</tr><tr>	
		<td>작성일</td><td>${mainData.reg_date}</td>
	</tr><tr>	
		<td>조회수</td><td>${mainData.cnt}</td>
	</tr><tr>	
		<td>파일</td><td>${mainData.upfile}</td>
	</tr><tr>	
		<td>내용</td><td>${mainData.content}</td>
	</tr><tr>				
		<td colspan="2" align="right">
			<a href="boardModifyReg?id=${mainData.id }">수정</a>
			<a href="boardDeleteReg?id=${mainData.id }">삭제</a>
			<a href="boardList">목록으로</a>
		</td>
	</tr>
</table>