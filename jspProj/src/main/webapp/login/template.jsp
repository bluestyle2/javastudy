<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String mPage = (String)(request.getAttribute("mPage"));
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="">
	<tr>
		<td>
			<jsp:include page="inc/header.jsp"/>
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="<%=mPage %>"/>
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="inc/footer.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>