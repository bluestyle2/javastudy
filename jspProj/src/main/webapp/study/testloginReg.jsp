<%@page import="basic.MemberDTO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
   String id = request.getParameter("pid");
   String passwd = request.getParameter("pw"); 
   String msg = "로그인 실패";
   MemberDTO account1 = new MemberDTO("aaa","1111","오준혁");
   MemberDTO account2 = new MemberDTO("bbb","2222","이준혁");
   MemberDTO account3 = new MemberDTO("ccc","3333","삼준혁");
 
   Map<String,MemberDTO> map = new HashMap<String,MemberDTO>();
   map.put("aaa", account1);
   map.put("bbb", account2);
   map.put("ccc", account3);   
   if(id != null && passwd != null){	   
	   if(id.equals(map.get("aaa").getId()) && passwd.equals(map.get("aaa").getPw())){		   
		   msg = map.get("aaa").getName()+"님이 로그인을 성공하셨습니다";
		   session.setAttribute("me", map.get("aaa").getName());
		   
	   }else if(id.equals(map.get("bbb").getId()) && passwd.equals(map.get("bbb").getPw())){
		   
		   msg = map.get("bbb").getName()+"님이 로그인을 성공하셨습니다";
		   session.setAttribute("me", map.get("bbb").getName());
		   
	   }else if(id.equals(map.get("ccc").getId()) && passwd.equals(map.get("ccc").getPw())){
		   
		   msg = map.get("ccc").getName()+"님이 로그인을 성공하셨습니다";
		   session.setAttribute("me", map.get("ccc").getName());
	   }	   
   }   
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginReg</title>
</head>
<body>
	<h1>loginReg</h1>
	<script>
alert("<%=msg%>")
location.href = "testloginMain.jsp"
</script>
</body>
</html>