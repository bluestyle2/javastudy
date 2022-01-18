<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm</title>
</head>
<body>
<h1>joinForm</h1>
<form action="joinReg.jsp" method="post" enctype="multipart/form-data">
<table>
	<tr>
		<td>id</td>
		<td><input type="text" name="pid" value="${mem.pid }%>" /></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="pname" value="${mem.pname }%>"/></td>
	</tr>
	<tr>
		<td>암호</td>
		<td><input type="text" name="pw"/></td>
	</tr>
	<tr>
		<td>사진</td>
		<td><input type="file" name="pic" /></td>
	</tr>
	<tr>
	
		<td colspan="2" align="center">
		<input type="submit" value="가입" />
		</td>
	</tr>
</table>>
</form>
</body>
</html>