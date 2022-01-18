<%@page import="java.util.Date"%>
<%@page import="basic.PersonDAO"%>
<%@page import="basic.Person"%>
<%@page import="basic.MemDTO"%>
<%@page import="basic.MemDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	request.setCharacterEncoding("UTF-8");
	Date now = new Date();
	Person ps = new Person();
	ps.setPid(request.getParameter("pid"));
	ps.setPname(request.getParameter("pname"));
	ps.setAge(Integer.parseInt(request.getParameter("age")));
	ps.setFriend(request.getParameter("friend"));
	//dto.setReg_date(now);

	
	Person res = new PersonDAO().insert(ps);
	
	
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>

<script>
	
	location.href="personList.jsp";
</script>
</body>
</html>