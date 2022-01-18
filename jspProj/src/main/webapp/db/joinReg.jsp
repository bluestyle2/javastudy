<%@page import="basic.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="pp" class="basic.Person"/>
<jsp:setProperty property="*" name="pp"/>
<%

	new PersonDAO().insert(pp);
	
%>


<script>
	alert("가입되었습니다.")
	location.href="personDetail.jsp?pid="<%=pp.getPid()%>
</script>