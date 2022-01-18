<%@page import="java.util.ArrayList"%>
<%@page import="basic.JuiceDAO"%>
<%@page import="basic.JuiceDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
String kind = request.getParameter("kind");
System.out.println(kind);

/* JuiceDTO arr = new JuiceDTO(); */

ArrayList<JuiceDTO> arr = new JuiceDAO().list(kind);
%>
<table border="" id="menu">
	<tr>
		<td>이름</td>
		<td>종류</td>
		<td>가격</td>		
	</tr>
<% for(JuiceDTO pp : arr) {%>

	<tr>
		<td><%=pp.getName() %></td>
		<td><%=pp.getProduct() %></td>
		<td align="right"><%=pp.getPrice() %></td>
	</tr>
	<%} %>
</table>