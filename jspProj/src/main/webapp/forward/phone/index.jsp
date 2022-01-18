<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%	//요부분은 실무에서 db로 처리함..
    ArrayList<String> arr= new ArrayList();
    arr.add("아이폰");
    arr.add("초등폰");
    arr.add("중딩폰");
    arr.add("대딩폰");
    arr.add("딩딩폰");
    
    request.setAttribute("mainData", arr);
    request.setAttribute("mainPage", "inc/phone/index.jsp");
    %>
    <jsp:forward page="../template.jsp" />