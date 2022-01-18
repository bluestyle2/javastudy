<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm</title>
</head>
<body>
	<form action=""  method="post" enctype="multipart/form-data">
		<table border="">
			<tr>
				<td>ID</td>
				<td><input type="text" name="pid" /></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="pname" /></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><input type="text" name="age" value="${param.age }" /></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel" /></td>
			</tr>
			<tr>
				<td>사진</td>
				<td><input type="file" name="upfile_1" /></td>
			</tr>
			<tr>
				<td>이력서</td>
				<td><input type="file" name="upfile_2" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="가입" /></td>
			</tr>
		</table>
	</form>
</body>
</html>