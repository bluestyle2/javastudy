<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="sh" class="basic.ShapeData"/>
    <jsp:setProperty property="*" name="sh"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shape</title>
</head>
<body>
<h1>shape</h1>
이름:${sh.name }<br>
넓이:${sh.area }<br>
둘레:${sh.border }<br>


</body>
</html>