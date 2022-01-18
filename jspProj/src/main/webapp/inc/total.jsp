<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
int aa = 10;

%>
<% 

	request.setAttribute("bb", 20);	//다른 jsp에서도 쓸수있게 설정(다른 jsp에서도 값을 불러올수 있음)
	
	String str = "c.jsp";
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>total</title>
</head>
<body>
<h1>total</h1>
total 입니다.1 : <%=aa %>, <%=request.getAttribute("bb") %> ,
<%=request.getParameter("qqq") %>, <%=request.getParameter("www") %><br>
<jsp:include page="a.jsp?qqq=zxcv&eee=asdf"></jsp:include>
total 입니다.2 : <%=aa %>, <%=request.getAttribute("bb") %><br>
<jsp:include page="b.jsp">
	<jsp:param value="1010" name="rrr"/>
	<jsp:param value="2020" name="ttt"/>
</jsp:include>
total 입니다.3 : <%=aa %>, <%=request.getAttribute("bb") %><br>
<jsp:include page="<%=str %>"></jsp:include>
<%--어플리케이션은 서버가 존재하는 한 어디서나 사용가능하고 리퀘스트는 폴더 근방에서만 사용가능하다 --%>
pname : <%=application.getAttribute("pname") %><br>	
</body>
</html>