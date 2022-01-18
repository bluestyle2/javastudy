<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyStudForm</title>
</head>
<body>
	<h1>MyStudForm</h1>
	<form action="myStudReg.jsp">
		<table border="">
			<tr>
				<td>학생번호</td>
				<td><input type="text" name="pnum" /></td>
			</tr>
			<tr>
				<td>성명</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><input type="text" name="kor" /></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><input type="text" name="eng" /></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><input type="text" name="mat" /></td>
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