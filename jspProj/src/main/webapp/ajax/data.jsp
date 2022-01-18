<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String kind = request.getParameter("kind");
	System.out.println(kind);
	HashMap<String, String>map = new HashMap();
	map.put("sports","서장훈 트리플악셀 성공");
	map.put("eco","비트코인 드디어 비트박스 시장에 진입");
	map.put("enter","연예는 연애");
%>
<h2><%=kind%></h2>
<%=map.get(kind)%>