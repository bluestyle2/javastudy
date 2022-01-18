<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="cf" class="basic.Person"/>
<jsp:setProperty property="*" name="cf"/>
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
		<td>커피종류</td>
		<td>
			${cf.whatcof }
		</td>	
	</tr>	
	<tr>
		<td>잔수</td>
		<td>
			${cf.cofnum }
		</td>	
	</tr>
	<tr>
		<td>가격</td>
		<td>
			${cf.price }
		</td>	
	</tr>	
</table>





</body>
</html>