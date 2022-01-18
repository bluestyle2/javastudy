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
	try{
		//int a = 10/5;
		int a = 10/0;
		out.println("정상실행");
	}catch(Exception e){
		out.println("try~catch 처리 : "+e.getMessage());
				
		//errorPage="../excep/ex02.jsp" 가 있어도 
		//try~catch 가 우선순위가 높아서 try~catch로 처리
	}


%>
</body>
</html>