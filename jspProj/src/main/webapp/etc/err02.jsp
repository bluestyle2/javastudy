<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="../excep/ex02.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>err01</h1>
<%
	
		int a = 10/0;
		out.println("정상실행");
		//에러 발생시 errorPage="../excep/ex02.jsp"로 처리
%>

</body>
</html>