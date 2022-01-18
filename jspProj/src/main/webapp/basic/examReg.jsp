<%@page import="basic.Stud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	Stud st = new Stud(
				request.getParameter("pname"),
				request.getParameter("kor"),
				request.getParameter("eng"),
				request.getParameter("mat")
			);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examReg</title>
</head>
<body>
<h1>examReg</h1>

<table border="">
	<tr>
		<td>이름</td>
		<td>
			<%=st.getName() %>
		</td>	
	</tr>
	<tr>
		<td>국어</td>
		<td>
			<%=st.getJum(0) %>
		</td>	
	</tr>
	<tr>
		<td>영어</td>
		<td>
			<%=st.getJum(1) %>
		</td>	
	</tr>
	<tr>
		<td>수학</td>
		<td>
			<%=st.getJum(2) %>
		</td>				
	</tr>
	<tr>
		<td>총점</td>
		<td>
			<%=st.getTot() %>
		</td>	
	</tr>
	<tr>
		<td>평균</td>
		<td>
			<%=st.getAvg() %>
		</td>	
	</tr>
</table>





</body>
</html>