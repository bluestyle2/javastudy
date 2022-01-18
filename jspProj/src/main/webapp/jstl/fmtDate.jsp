<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fmtDate</title>
<style>
	#wrapper{
		width:700px;
		height:100px;
		margin:0 auto;
		
	}
	#wrapper > div{
		width:50px;
		height:50px;
		float: left;
		padding:20px;
		margin: 3px;
		border: 1px solid #000;
		line-height:50px;
		font-size: 2rem;
		text-align: right;
	}
	#wrapper > .title{		
		text-align: center;
	}
	#wrapper > .today{		
		background: #ff0;
	}
	
</style>
</head>
<body>
<h1>fmtDate</h1>
<c:set var="now" value="<%=new Date() %>"/>
${now }<br>
<fmt:formatDate value="${now }"/><br>
<fmt:formatDate value="${now }" type="date"/><br>
<fmt:formatDate value="${now }" type="time"/><br>
<fmt:formatDate value="${now }" type="both"/><br>	<!-- 둘다나오게 -->
<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/><br>	<!-- 날짜,시간 모두 풀 -->
<fmt:formatDate value="${now }" type="both" dateStyle="short" timeStyle="short"/><br>
<fmt:formatDate value="${now }" pattern="yyyy-MM-dd (E) HH:mm:ss"/><br>
<fmt:parseDate value="2011-06-09 17:48:35" pattern="yyyy-MM-dd HH:mm:ss"/><br>	<!-- 잘쓰지않음 -->
<fmt:formatDate value="${now }" pattern="MM_dd" var="nowTT"/><br>
${nowTT }
<div id="wrapper">
<h1><fmt:formatDate value="${now }" pattern="yyyy년 MM월"/></h1>
<c:forTokens items="일,월,화,수,목,금,토" delims="," var="i">
<div class="title">${i }</div>
</c:forTokens>
${now.setMonth(now.month+1) }
${now.setDate(0)}
<fmt:formatDate value="${now }" pattern="d" var="last"/>
 ${now.setDate(1)} 
<c:forEach begin="1" end="${now.day }" var="i">
	<div></div>
</c:forEach>
<c:forEach begin="1" end="${last }" var="i">
<%-- ${now.Date=i } --%>
<fmt:formatDate value="${now }" pattern="MM_dd" var="currTT"/>
<c:set var="dd" value=""/>
<c:if test="${nowTT==currTT }">
<c:set var="dd" value="class='today'"/>
</c:if>
	<div ${dd }>${i }</div>
</c:forEach>


</div>
</body>
</html>