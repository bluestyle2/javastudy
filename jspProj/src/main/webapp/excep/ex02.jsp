<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>errorPage 방식</title>
</head>
<body>
errorPage 방식입니다.<br>
exception 사용할 경우 page directive에서 isErrorPage="true"지정 필요<br>
<%=exception.getMessage() %>
</body>
</html>