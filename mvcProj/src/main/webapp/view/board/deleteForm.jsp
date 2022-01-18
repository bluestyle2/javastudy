<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>삭제</h2>
<form action="BoardDeleteReg" method="post">
<input type="hidden" name="id" value="${param.id }"/> <!-- id와 pw가 같이갈수있도록 설정 -->
<input type="hidden" name="page" value="${param.page }"/> 
	<table border="">
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw" /></td>
		</tr>
		<tr>			
			<td colspan="2" align="center">
				<input type="submit" value="삭제" />
				<a href="BoardDetail?id=${param.id }&page=${param.page }">뒤로</a>
			</td>
		</tr>
	</table>
</form>