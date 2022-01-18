<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>elExam</title>
</head>
<body>
<h1>elExam</h1>
<table border="">
	<tr>
		<td>국어</td>
			<td>${param.kor }</td>
	</tr>
		<tr>
		<td>영어</td>
			<td>${param.eng }</td>
	</tr>
		<tr>
		<td>수학</td>
			<td>${param.mat }</td>
	</tr>
		<tr>
		<td>총점</td>
			<td>${param.kor+param.eng+param.mat }</td>
	</tr>
		<tr>
		<td>평균</td>
			<td>${(param.kor+param.eng+param.mat)/3 }</td>
	</tr>
		<tr>
		<td>등급</td>
			<td>${
			(param.kor+param.eng+param.mat)/3 >= 90 ? "수" : 
			(param.kor+param.eng+param.mat)/3 >= 80 ? "우" : 
			(param.kor+param.eng+param.mat)/3 >= 70 ? "미" : 
			(param.kor+param.eng+param.mat)/3 >= 60 ? "양" : "가"
			}</td>
	</tr>
	
</table>
</body>
</html>