<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title }</title>
</head>
<body>
<h1>${title }</h1>
<table border="">
	<tr>
		<td>이름</td>
		<td>${pname}</td>
	</tr>
	<tr>
		<td>나이</td>
		<td>${age}</td>
	</tr>
	<tr>
		<td>파일1</td>
		<td><img src="/up/${upfile_1_img }"></td>
	</tr>
	<tr>
		<td>파일2</td>
		<td><img src="${upfile_2}"></td>
	</tr>
</table>
</body>
</html>