<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="pp" class="basic.Person"/>
<jsp:setProperty property="*" name="pp"/>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	label{
		display: block;
		
	}
</style>
</head>
<body>
<form action="joinReg.jsp" method="post">
	<label for="">id<input type="text" name="pid" /></label>
	<label for="">이름<input type="text" name="pname" /></label>
	<label for="">나이<input type="text" name="age" /></label>
	<label for="">친구<input type="text" name="friend" /></label>
	<input type="submit" value="등록"/><a href="personList.jsp">목록으로</a>
</form>
</body>
</html>