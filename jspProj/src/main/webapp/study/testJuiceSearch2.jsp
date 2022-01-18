<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="org.apache.tomcat.util.json.JSONParser"%>
<%@page import="com.mysql.cj.xdevapi.JsonArray"%>
<%@page import="java.util.ArrayList"%>
<%@page import="basic.JuiceDAO"%>
<%@page import="basic.JuiceDTO"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
/* Object obj = request.getParameter("kind"); */
/* String str = String.valueOf(obj); */
 String kind = request.getParameter("kind"); 

ArrayList<JuiceDTO> arr = new JuiceDAO().list(kind);

%>

[
<%int cnt = 0; %>
   <% for(JuiceDTO i : arr){
      
      request.setAttribute("id", i.getId());
      request.setAttribute("name",i.getName());
      request.setAttribute("product",i.getProduct());
      request.setAttribute("price",i.getPrice());
      cnt+=1;
      
      if(cnt==arr.size()){%>
         {
         "id": <%= request.getAttribute("id") %>,
         "name":"<%= request.getAttribute("name") %>",
         "product":"<%= request.getAttribute("product") %>",
         "price":<%= request.getAttribute("price") %>            
         }
      
   
      <% break;} %>   
      {
         "id": <%= request.getAttribute("id") %>,
         "name":"<%= request.getAttribute("name") %>",
         "product":"<%= request.getAttribute("product") %>",
         "price":<%= request.getAttribute("price") %>            
      },
      
   
   <% }%>

   
]

<%-- [
	
	{
		"id":"<%=arr.get(0)%>",
		"name":"<%=arr.get(1)%>",
		"product":"<%=arr.get(2)%>",
		"price":"<%=arr.get(3)%>"
	}
	

] --%>