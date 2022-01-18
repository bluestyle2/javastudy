<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>validator/form</title>
</head>
<body>
<h1>validator/form</h1>
<form action="" method="post">
	<table border="">
		<tr>
			<td>id</td>
			<td>
				<input type="text" name="pid" />
				<form:errors path="stud.pid"/>
			</td>
		</tr>
		<tr>
			<td>pw</td>
			<td>
			<input type="text" name="pw" />
			<form:errors path="stud.pw"/>
			</td>			
		</tr>
		<tr>			
			<td colspan="2" align="center">
				<input type="submit" value="로그인" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>