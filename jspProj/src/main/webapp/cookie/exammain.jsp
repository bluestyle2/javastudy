<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인페이지</title>
</head>
<body>
<h2>메인 페이지</h2>
<%
	String id = null;
	Cookie[] arr = request.getCookies();
	
	
	for(Cookie cc : arr){
		if(cc.getName().equals("id")){
			id = cc.getValue();
		}
	}
	if(id == null){
		
		response.sendRedirect("examlogin.jsp");
	}
%>
<%=id %> 님 안녕하세요
<a href="examlogout.jsp">로그아웃</a>
</body>
</html>