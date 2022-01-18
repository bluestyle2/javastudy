<%@page import="basic.MemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	boolean res2 = new MemDAO().telChk(request.getParameter("tel"));
	String msgg2;
	if(res2){
		msgg2 = "전화번호 중복입니다.";
	}else{
		msgg2 = "전화번호 사용가능.";
	}
%>
<%=msgg2%>