<%@page import="java.util.Date"%>
<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>myDiary</title>
</head>
<body>
<h1>myDiary</h1>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
first = today.get(Calendar.DAY_OF_WEEK);
last = today.getActualMaximum(Calendar.DATE);

<%=
DecimalFormat df = new DecimalFormat("00");
Calendar ca = Calendar.getInstance();

//현재 날짜 구하기
String strYear = Integer.toString(ca.get(Calendar.YEAR));
String strMonth = df.format(ca.get(Calendar.MONTH) + 1);
String strDay = df.format(ca.get(Calendar.DATE));
String first = df.format(ca.get(Calendar.Day_OF_WEEK));
String strDate = strYear + strMonth + strDay;

//일주일 전 날짜 구하기
ca.add(ca.DATE, -7);
String strYear7 = Integer.toString(ca.get(Calendar.YEAR));
String strMonth7 = df.format(ca.get(Calendar.MONTH) + 1);
String strDay7 = df.format(ca.get(Calendar.DATE));
String strDate7 = strYear7 + strMonth7 + strDay7;

//한달 전 날짜 구하기
ca.add(ca.DATE, -24);
String strYear31 = Integer.toString(ca.get(Calendar.YEAR));
String strMonth31 = df.format(ca.get(Calendar.MONTH) + 1);
String strDay31 = df.format(ca.get(Calendar.DATE));
String strDate31 = strYear31 + strMonth31 + strDay31;
%>
System.out.println(first);
<!-- 현재날짜 -->
<c:set var="nowdate" value='<%=strDate%>' />

<!-- 일주일전 -->


<c:set var="nowdate7" value='<%=strDate7%>' />
<!-- 한달전 -->

<c:set var="nowdate31" value='<%=strDate31%>' />

	<table border=""><tr>
		<%  for(char ch : "일월화수목금토".toCharArray()){ %>
				<td><%=ch %></td>
		<% } %>		
		
		</tr>
		<tr>
		<%  for(int i = 1; i<first ; i++){ %>
				<td></td>
		<% } 		
		for(int i = 1; i<=last ; i++){ %>
		<td> <%=i %></td>
		<% 
			today.set(Calendar.DATE, i);
			if(today.get(Calendar.DAY_OF_WEEK)==7){
				//System.out.println("토요일:"+i);
		%>
		</tr><tr>
		<%}} %>	
		</tr>
	</table>
</body>
</html>