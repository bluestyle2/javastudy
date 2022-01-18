<%@page import="java.util.HashMap"%>
<%@page import="basic.Stud" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 시험</h1>
<%



Object me =  session.getAttribute("me");	


 if(me==null) {%>
 
<form action="testloginReg.jsp">
	<table>	
		<tr>
			<td>id</td>
			<td><input type="text" name="pid" /></td>
		</tr>		
		<tr>
			<td>pw</td>
			<td><input type="text" name="pw" /></td>
		</tr>		
		<tr>
			<td colspan="2" align="center"><input type="submit" value="로그인" /></td>
		</tr>		
	</table>
</form>
<%}else{

//Stud st = (Stud)me;
%>
<%=me %>님 안녕하세요
<a href="testlogout.jsp">로그아웃</a>
<%} %> 
</body>
</html>