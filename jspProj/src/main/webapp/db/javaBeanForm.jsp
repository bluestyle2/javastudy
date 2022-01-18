<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>javaBeanForm</title>
</head>
<body>
	<h1>javaBeanForm</h1>
	<form action="javaBeanReg.jsp">
		<table border="">
			<tr>
				<td>id</td>
				<td><input type="text" name="pid" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" /></td>
			</tr>
			<tr>
				<td>키</td>
				<td><input type="text" name="height" /></td>
			</tr>
			<tr>
				<td>결혼</td>
				<td><input type="text" name="marriage" /></td>
			</tr>
			<tr>
			
				<td colspan="2" align="center">
					<input type="submit" value="작성" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>