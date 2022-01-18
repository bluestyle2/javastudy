<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인메인</title>
</head>
<body>
<h1>session,interceptor 로그인</h1>
<c:choose>
	<c:when test="${mem!=null }">
	${mem.pname }님 안녕하세요 <a href="logout">logout</a>
	</c:when>	
	<c:otherwise>
		<form action="loginReg">
		id: <input type="text" name="pid" />
		암호 :<input type="text" name="pw" />
		<input type="submit" value="로그인" />
		</form>
	</c:otherwise>
</c:choose> 
</body>
</html>