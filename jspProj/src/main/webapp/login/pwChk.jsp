<%@page import="basic.MemDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	boolean res3 = new MemDAO().pwChk(request.getParameter("mpw"));
	boolean res4 =  new MemDAO().pwChk(request.getParameter("mpw2"));	
	//System.out.println(res5);
	String msg3;
	String msg4;
	
/*	if(res3 != res4){
		
		msg3 = "비밀번호가 중복이거나 다릅니다.";
	}else{
		msg3 = "비밀번호 사용가능.";
	}*/
	
	if(res5 == res6){
		msg4 = "비밀번호 사용가능.";
	}else{
		msg4 = "입력한 비밀번호가 다릅니다";
	}
%><%=request.getAttribute("mpw2")%>
<%=msg4%>