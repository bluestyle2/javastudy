<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 결과</title>
</head>
<body>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");



String id2 = "aaa";
String pw2 = "1111";

if(id2.equals(id)){
	
	if(pw2.equals(pw)){
		
	
		Cookie cc = new Cookie("id",id);
		response.addCookie(cc);
		response.sendRedirect("exammain.jsp");
		
	}else{
		
		
		response.sendRedirect("examlogin.jsp");
	}
	
	}else{
	
	
		response.sendRedirect("examlogin.jsp");
	}
%>

</body>
</html>