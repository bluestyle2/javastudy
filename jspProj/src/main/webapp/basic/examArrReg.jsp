<%@page import="basic.Stud"%>
<%@page import="java.util.TreeSet"%>
<%@page import="java.util.Map"%>
<%@page import="basic.ExamArr"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examArrReg</title>
</head>
<body>
<h1>examArrReg</h1>
<table border="">
	<tr>
		<td>반</td>
		<td>이름</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
		<td>총점</td>
		<td>평균</td>
		<td>등급</td>
		<td>등수</td>
	</tr>
	<% for(Map.Entry<Integer, TreeSet<Stud>> me : new ExamArr(request).map.entrySet()){ %>
	<tr>
		<td colspan="9"><%=me.getKey() %>반</td>
		</tr>
		<% for(Stud st: me.getValue()) {%>
			<%=st.tr() %>
		<%}} %>
</table>

</body>
</html>