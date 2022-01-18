<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("aaa:"+request.getParameter("qqq")+","+request.getParameter("www"));

	request.setAttribute("zz", new int[]{11,22,33,44});
	request.setAttribute("xx", 123.456);
%><%-- 포워드는 프로그램로직부분을 보여주고싶지않을때 사용한다 위에처럼 aaa를 숨길수있음 bbb를출력  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>aaa</title>
</head>
<body>
<h1>aaa 입니다.</h1>
<jsp:forward page="bbb.jsp">
	<jsp:param value="789" name="eee"/>	<%--파라미터도 날릴수있음 --%>
</jsp:forward>
</body>
</html>