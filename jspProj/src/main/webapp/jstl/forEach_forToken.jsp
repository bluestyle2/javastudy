<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>forEach_forToken</title>
</head>
<body>
<h1>forEach</h1>
<c:forEach begin="3" end="20" step="4" var="i" varStatus="no"><!-- 3부터 20까지 3씩간다 -->
	${i }-${no.index } <br>
</c:forEach>



<c:set var="tot" value="0"/><!-- 1부터 100까지 짝수들의 합 -->
 <c:forEach begin="1" end="100" step="1" var="i" >
 	<c:if test="${i%2 ==0 }">
 		<c:set var="tot" value="${tot+i }"/>
 	</c:if>
</c:forEach>  
1-> 100까지 짝수들의 합 : ${tot }<br>

<c:forEach items="<%=new int[]{300,400,500,600}%>" var="i" varStatus="no"><!-- 3부터 20까지 3씩간다 -->
	${no.index } : ${i }<br>
</c:forEach>

<h1>forToken</h1>
<c:forTokens items="하성민,오병철,양기홍_중성민,사병철,염소기홍,상성민,육병철,개기홍" delims=",._" var="i" varStatus="no">
${no.index } : ${i }<br>
</c:forTokens>
--------------------------<br>
<c:forTokens items="11,33,4,6,8,5,12,44" delims="," var="i" varStatus="no">
${no.index } : ${i*100 }<br>
</c:forTokens>
</body>
</html>