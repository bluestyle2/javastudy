<%@page import="basic.Person"%>
<%@page import="basic.PersonDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Person pp = new PersonDAO().detail(request.getParameter("pid"));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>personList</title>
</head>
<body>
<h1>personList</h1>
<table border="">
	<tr>
		<td>아이디</td><td><%=pp.getPid() %></td>
	</tr>
	<tr>
		<td>이름</td><td><%=pp.getPname() %></td>
	</tr>
	<tr>
		<td>나이</td><td><%=pp.getAge() %></td>
	</tr>
	<tr>
		<td>가입일</td><td><%=pp.getReg_date() %></td>
	</tr>
	<tr>
		<td>친구</td><td><%=pp.getFriend() %></td>	
	</tr>
	<tr>
		<td colspan="2"><a href="personList.jsp"></a>
		</td>
	</tr>	
	<tr>
		<td colspan="2">
			<a href="personList.jsp">회원목록</a>
		<a href="personModifyForm.jsp?pid=<%=pp.getPid() %>">수정</a>
		<a href="personDelete.jsp?pid=<%=pp.getPid() %>">삭제</a>
		</td>
	</tr>
</table>
</body>
</html>