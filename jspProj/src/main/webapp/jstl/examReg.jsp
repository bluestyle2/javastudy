
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="per" class="basic.Person"/>
<jsp:setProperty property="*" name="per"/>
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
			${per.pname }
		</td>	
	</tr>
	<tr>
		<td>국어</td>
		<td>
			${per.kor }
		</td>	
	</tr>
	<tr>
		<td>영어</td>
		<td>
			${per.eng }
		</td>	
	</tr>
	<tr>
		<td>수학</td>
		<td>
			${per.mat }
		</td>				
	</tr>
	<tr>
		<td>총점</td>
		<td>
		${per.tot }
		</td>	
	</tr>
	<tr>
		<td>평균</td>
		<td>
			${per.avg }
		</td>	
	</tr>
	<tr>
		<td>등급</td>
		<td>
			
	<c:choose>
		<c:when test="${per.avg >=90 }">수</c:when>
		<c:when test="${per.avg >=80 }">우</c:when>
		<c:when test="${per.avg >=70 }">미</c:when>
		<c:when test="${per.avg >=60 }">양</c:when>
		<c:otherwise>가</c:otherwise>	
	</c:choose>
		</td>	
	</tr>
</table>





</body>
</html>