<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>make</title>
</head>
<body>
<h1>make</h1>
<%
	Cookie coo = new Cookie("aa","아부라카타부라");
	coo.setMaxAge(5);	//5초뒤에 쿠키가 사라짐
	response.addCookie(coo);
	Cookie coo2 = new Cookie("bb","익스팩토패트로늄");
	response.addCookie(coo2); //application으로 만들었던것처럼 로그인기능만들기
%>

</body>
</html>