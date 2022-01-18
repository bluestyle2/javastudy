<%@page import="basic.MemDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<h1>난 헤더야</h1>
<% 
Object me = application.getAttribute("me");

if(me==null) {%>

<form action="loginReg.jsp" method="post">
<label for="">id<input type="text" name="mid" /></label>
<label for="">pw<input type="text" name="mpw" /></label>
<input type="submit" value="로그인" />
</form>
<a href="joinForm.jsp">회원가입</a>
<%}else { 

	MemDTO st = (MemDTO)me;
%>
<%=st.getKind() %> <%=st.getMname() %>님 안녕하세요
<a href="logout.jsp">로그아웃</a>
<%} %>