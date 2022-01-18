<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	//ArrayList<Person> arr = new PersonDAO().list("bbb");
	
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
	<c:forEach var="pp" varStatus="no" items="<$=new PersonDAO().list() %>">
	<tr>
		<td><a href="personDetail.jsp?pid=${pp.pid}">${pp.pid()}</a></td>
		<td>${pp.name()}</td>
		<td>${pp.age()}</td>
		<td>${pp.reg_date()}</td>
		<td>${pp.friend()}</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5"><a href="joinForm.jsp">회원가입</a></td>
	</tr>
</table>
</body>
</html>