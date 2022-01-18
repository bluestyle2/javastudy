<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upCom3</title>
</head>
<body>
<h1>upCom3</h1>
<table border="">
	<tr>
		<td>이름</td>
		<td>${stud.pname}</td>
	</tr>
	<tr>
		<td>나이</td>
		<td>${stud.age}</td>
	</tr>
	<tr>
		<td>파일1</td>
		<td><img src="/up/${stud.upfile_1.originalFilename }"></td>
	</tr>
	<tr>
		<td>파일2</td>
		<td><img src="${stud.upfile_2}"></td>
	</tr>
</table>
</body>
</html>