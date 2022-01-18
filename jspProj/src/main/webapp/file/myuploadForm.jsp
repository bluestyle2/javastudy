<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadForm</title>
</head>
<body>
<h1>uploadForm</h1>
<form action="myuploadReg.jsp" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<td>id</td>
			<td><input type="text" name="id" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><input type="file" name="ff2" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="제출" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>