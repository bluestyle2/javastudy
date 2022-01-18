<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	Calendar today = Calendar.getInstance();
int first,last;
	public void jspInit(){
		today.set(Calendar.DATE, 1);
		first = today.get(Calendar.DAY_OF_WEEK);
		last = today.getActualMaximum(Calendar.DATE);
		System.out.println(first+","+last);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_diary</title>
</head>
<body>

	<h1>02_diary</h1>
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