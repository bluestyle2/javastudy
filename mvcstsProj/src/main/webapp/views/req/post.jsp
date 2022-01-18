<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>exam post</title>
</head>
<body>
<h1>exam/post</h1>

<table border="">
	<tr>
		<td>이름</td>
		<td>${st.pname }</td>
	</tr>
	<tr>
		<td>국어</td>
		<td>${st.kor }</td>
	</tr>
	<tr>
		<td>영어</td>
		<td>${st.eng }</td>
	</tr>
	<tr>
		<td>수학</td>
		<td>${st.mat }</td>
	</tr>
	<tr>
		<td>총점</td>
		<td>${st.tot }</td>
	</tr>
	<tr>
		<td>평균</td>
		<td>${st.avg }</td>
	</tr>
</table>
</body>
</html>