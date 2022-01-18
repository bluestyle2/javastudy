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
<h1>로그인 메인</h1>
<%
Object me =  application.getAttribute("me");	

//겟어트리뷰트에 me가 없으니까 로그인을해라
 if(me==null) {%>
 
 <form action="loginReg.jsp">
 <label for="">id<input type="text" name="pid" /></label>
 <label for="">pw<input type="text" name="pw" /></label>
 <input type="submit" value="로그인" />
 </form>
 <%}else{
	 
Stud st = (Stud)me;
%>
<%=st.getName() %>님 안녕하세요
<a href="logout.jsp">로그아웃</a>
<%} %>
 
</body>
</html>