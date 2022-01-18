<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="pInsert.jsp">
<table>
	<tr>
		<td>아이디</td>
		<td><input type="text" name="pid"/></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="pname"/></td>
	</tr>	
	<tr>
		<td>나이</td>
		<td><input type="text" name="age"/></td>
	</tr>	
	<tr>
		<td>친구</td>
		<td><input type="text" name="friend"/></td>
	</tr>
	<tr>		
		<td colspan="2" align="center"><input type="submit" value="제출"/></td>
	</tr>
</form>
</table>
</body>
</html>