<%@page import="basic.Person"%>
<%@page import="basic.PersonDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%
	//ArrayList<Person> arr = new PersonDAO().list("bbb");
	ArrayList<Person> arr = new PersonDAO().list();
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
		<td>아이디</td>
		<td>이름</td>
		<td>나이</td>
		<td>가입일</td>
		<td>친구</td>
	</tr>
	<% for(Person pp : arr) {%>
	<tr>
		<td><a href="personDetail.jsp?pid=<%=pp.getPid() %>"><%=pp.getPid() %></a></td>
		<td><%=pp.getPname() %></td>
		<td><%=pp.getAge() %></td>
		<td>
		<fmt:formatDate value="<%=pp.getReg_date() %>" pattern="yyyy-MM-dd HH:mm:ss"/>
		</td>
		<td><%=pp.getFriend() %></td>
	</tr>
	<%} %>
	<tr>
		<td colspan="5"><a href="joinForm.jsp">회원가입</a></td>
	</tr>
</table>
</body>
</html>