<%@page import="basic.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>core</title>
</head>
<body>
<h1>core</h1>
<!-- pageContext.setAttribute("mm1","정우성"); -->
<c:set var="mm1" value="정우성"/>
<c:set var="mm2" value="정좌성" scope="request"/>
<c:set var="mm3" value="정남성" scope="session"/>
<c:set var="mm4" value="정북성" scope="application"/>
${mm1 }<br>
${mm2 }<br>
${mm3 }<br>
${mm4 }<br>
-------------------------<br>
<c:remove var="mm1"/>
<c:remove var="mm3"/>
${mm1 }<br>
${mm2 }<br>
${mm3 }<br>
${mm4 }<br>
-------------------------<br>
<c:set var="per1" value="<%=new Person() %>" /><!--클래스도 넣을수있다  -->
<c:set property="pid" target="${per1 }" value="aaa" />
\${per1 } : ${per1 }<br>
\${per1.pid } : ${per1.pid }<br>
-------------------------<br>
<c:if test="${true }">
참이지룽요<br>
</c:if><!-- jsp에선 else의 기능이 없다 -->
-------------------------<br>
<c:set var="jum" value="48"/>
<c:choose>	<!-- jsp에선 자바 if문을 이렇게 쓴다 -->
	<c:when test="${jum>=90 }">수</c:when>
	<c:when test="${jum>=80 }">우</c:when>
	<c:when test="${jum>=70 }">미</c:when>
	<c:when test="${jum>=60 }">양</c:when>
	<c:otherwise>가</c:otherwise>
	
	
	
</c:choose>
<br>
-------------------------<br>
</body>
</html>