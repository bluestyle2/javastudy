<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete</title>
</head>
<body>
<h1>delete</h1>
<%	
	Cookie coo = new Cookie("aa","");
	coo.setMaxAge(0);	//초단위 태어나자마자 죽는개념
	response.addCookie(coo);
	
%>

</body>
</html>