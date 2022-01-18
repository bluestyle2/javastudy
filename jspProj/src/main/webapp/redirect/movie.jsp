<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>movie</title>
<style>
label{
display: block;
}
</style>
</head>
<body>

<h1>movie</h1>

<form action="movieReg.jsp">
	<label for="">영화
	<select name="title">
		<option value="super">수퍼맨</option>
		<option value="mart">마트맨</option>
		<option value="convenience">편의점맨</option>
	</select></label>
	<label for="">인원수<input type="text" name="cnt" /></label>
	<label for=""><input type="submit" value="예약"/></label>
</form>

</body>
</html>