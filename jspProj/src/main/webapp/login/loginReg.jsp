<%@page import="basic.MemDTO"%>
<%@page import="basic.MemDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	request.setCharacterEncoding("UTF-8");

	MemDTO dto = new MemDTO();
	dto.setMid(request.getParameter("mid"));
	dto.setMpw(request.getParameter("mpw"));

	
	String msg = "로그인 실패";
	
	
	
	MemDTO res = new MemDAO().signIn(dto);
	if(res!=null){
		msg = res.getMname() + "님 로그인 되었습니다.";
		
		application.setAttribute("me", res);
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<h1>로그인</h1>
<script>
	alert("<%=msg%>")
	location.href="index.jsp";
</script>
</body>
</html>