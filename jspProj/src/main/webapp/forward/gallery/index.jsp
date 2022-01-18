<%@page import="basic.GallData"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%	//요부분은 실무에서 db로 처리함..
    ArrayList<GallData> arr= new ArrayList();
    arr.add(new GallData("사과1","apple_image01.jpg"));
    arr.add(new GallData("사과2","apple_image02.jpg"));
    arr.add(new GallData("사과3","apple_image03.jpg"));
    arr.add(new GallData("사과4","apple_image04.jpg"));
    arr.add(new GallData("라지1","large01.jpg"));
    arr.add(new GallData("라지2","large02.jpg"));
    arr.add(new GallData("라지3","large03.jpg"));
    arr.add(new GallData("라지4","large04.jpg"));
   
    
    request.setAttribute("mainData", arr);
    request.setAttribute("mainPage", "inc/gallery/index.jsp");
    %>
    <jsp:forward page="../template.jsp" />