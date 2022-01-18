<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setAttribute("mainPage", "inc/info/index.jsp");

/*
	template 페이지의 header 안에 위치한 a태그를 클릭하면
	mainPage 파일 주소를 설정해주는 곳으로 이동을 하고, 주소를 설정하면 
	다시 template.jsp로 페이지 이동을 해서 mainPage의 파일이 새로운 주소의 .jsp파일을
	가져오게 하는 방식
*/
%>
    
<jsp:forward page="../template.jsp"></jsp:forward>
