<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>답변</h2>
<form action="BoardReplyReg" method="post" >
<input type="hidden" name="page" value="${param.page }"/> 
<input type="hidden" name="id" value="${mainData.id }"/>
<input type="hidden" name="lev" value="${mainData.lev }"/>
<input type="hidden" name="seq" value="${mainData.seq }"/> <!-- lev와 seq를 다음 넘어가는곳으로 가져가게 설정 -->
<input type="hidden" name="gid" value="${mainData.gid }"/>
	<table border="">		
		<tr>
			<td>제목</td>
			<td><input type="text" name="title"  value="[Re]${mainData.title }" /></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw" /></td>
		</tr>		
		<tr>
			<td>내용</td>
			<td><textarea name="content" >[Re]${mainData.content }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="답변" />
				<input type="reset" value="초기화" />
				<a href="BoardDetail?id=${mainData.id }&page=${param.page }">뒤로</a>
			</td>
		</tr>
	</table>
</form>