<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 

	request.setAttribute("bb", 1234);	//다른 jsp에서도 쓸수있게 설정(다른 jsp에서도 값을 불러올수 있음)
%>
<h1>b입니다. <%=request.getAttribute("bb") %>,
<%=request.getParameter("qqq") %>, <%=request.getParameter("www") %>,
<%=request.getParameter("eee") %>,<%=request.getParameter("rrr") %>,
<%=request.getParameter("ttt") %><br></h1>
