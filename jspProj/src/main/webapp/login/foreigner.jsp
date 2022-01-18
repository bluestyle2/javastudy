<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<% 
	String mPage = "main/"+request.getRequestURI().substring((request.getContextPath()+"/login/").length());
    
request.setAttribute("mPage",mPage); %>
<jsp:include page="template.jsp"/>