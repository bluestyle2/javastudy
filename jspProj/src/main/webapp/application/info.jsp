<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>info</title>
</head>
<body>
	<h1>info</h1>
	<%=application.getServerInfo() %><br>
	<%=application.getMajorVersion() %><br>
	<%=application.getMinorVersion() %><br>
	<%=application.getRealPath("/fff/aaa.txt") %><br>
</body>
</html>