<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fmtNumber</title>
</head>
<body>
<h1>fmtNumber</h1>
<fmt:formatNumber value="123456" type="number"/><br>	<!-- 123,456 이녀석을 제일 많이씀 -->
<fmt:formatNumber value="654321" type="number" var="no"/>	<!-- var="no"는 변수를 입력해야 출력가능 -->
${no }<br>	<!-- 변수를 출력 -->
<fmt:parseNumber value="135,479" type="number"/><br>		<!-- 문자를 숫자로 바꿔서 출력 -->
<fmt:formatNumber value="123456" type="currency" currencySymbol="원"/><br>	
<fmt:formatNumber value="0.78" type="percent"/><br>	
<fmt:formatNumber value="123.456" pattern="0,000.0000"/><br> <!-- 두번째로 제일 많이쓴다 -->
</body>
</html>