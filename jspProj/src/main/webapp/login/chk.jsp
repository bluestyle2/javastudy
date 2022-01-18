<%@page import="basic.MemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	boolean res = new MemDAO().chk(request.getParameter("mid"),request.getParameter("col"));
	
%>
<%=res%>