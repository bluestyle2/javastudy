<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examForm</title>
</head>
<body>
<h1>examForm</h1>
<form action="examReg.jsp">
<table border="">
	<tr>
	<td>이름</td>
	<td>
		<input name="pname">
	</td>
	
	</tr>
	<tr>
	<td>국어</td>
	<td>
		<input name="kor">
	</td>
	
	</tr><tr>
	<td>영어</td>
	<td>
		<input name="eng">
	</td>
	
	</tr><tr>
	<td>수학</td>
	<td>
		<input name="mat">
		</td>	
	</tr>
	<tr>
	<td colspan="2" align="center">	
		<input type="submit" value="작성">
	</td>
	
	</tr>

</table>


</form>


</body>
</html>