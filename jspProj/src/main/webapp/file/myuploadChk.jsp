<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadReg</title>
</head>
<body>
<table border="">
		<tr>
			<td>id</td>
			<td><%=session.getAttribute("id") %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=session.getAttribute("name")%></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=session.getAttribute("age")%></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><!--<img src="../ttt/${param.ff1}" alt="" />-->
			
				<img src="<c:url value="/ttt/${param.ff2}" />" alt="" />
			</td>
		</tr>		
	</table>


</body>
</html>