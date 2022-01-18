<%@page import="basic.PersonDAO"%>
<%@page import="basic.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Person pp = new PersonDAO().detail(request.getParameter("pid"));
%>
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
<form action="personModifyReg.jsp" method="post">
	<label for="">id<input type="text" name="pid" readonly="readonly" value="<%=pp.getPid()%>" /></label>
	<label for="">이름<input type="text" name="pname" value="<%=pp.getPname()%>"/> </label>
	<label for="">나이<input type="text" name="age" value="<%=pp.getAge()%>"/></label>
	<label for="">가입일<input type="text" name="reg_date" value="<%=pp.getReg_date()%>"/></label>
	<label for="">친구<input type="text" name="friend" value="<%=pp.getFriend()%>"/></label>
	<input type="submit" value="수정"/><a href="personDetail.jsp?pid=<%=pp.getPid()%>">뒤로</a>
</form>
</body>
</html>