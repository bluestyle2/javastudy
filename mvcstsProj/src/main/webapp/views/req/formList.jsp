<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>formList</title>
</head>
<body>
<h1>formList</h1>
<form action="" method="post">

	<table border="">
	<tr>
		<td>담임</td>
		<td><input type="text" name="bInfo.ban" value="2"/></td>
		<td>급훈</td>
		<td><input type="text" name="bInfo.motto" value="취업만이 살길이다"/></td>
	</tr>
	<tr>
		<td>이름</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
	</tr>
<c:forEach begin="0" end="4" var="i">
		<tr>
			<td><input type="text" name="arr[${i }].pname" value="병철${i }" /></td>
			<td><input type="text" name="arr[${i }].kor" value="${i*19 }"/></td>
			<td><input type="text" name="arr[${i }].eng" value="${i*17 }"/></td>
			<td><input type="text" name="arr[${i }].mat" value="${i*13 }"/></td>
		</tr>
		
</c:forEach>
		<tr>
			<td colspan="4" align="center">
			<input type="submit" value="작성" />
			</td>
		</tr>
		
	</table>
</form>
</body>
</html>