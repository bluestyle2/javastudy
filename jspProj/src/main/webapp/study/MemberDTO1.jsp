<%@page import="basic.MemberDTO"%>
<%@page import="basic.MemberDAO"%>
<%@page import="java.util.HashMap"%>
<%@page import="basic.Stud"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
HashMap<String, String> member = new HashMap<>();
/*
member.put("aaa","1234"); //관리자 권한
member.put("bbb","1234");   //일반 권한
member.put("ccc","1234");    //일반 권한
*/

member.put("id1","aaa"); //관리자 권한
member.put("id2","bbb");   //일반 권한
member.put("id3","ccc");    //일반 권한
member.put("pw1","1234"); //관리자 권한
member.put("pw2","1234");   //일반 권한
member.put("pw3","1234");    //일반 권한
/*
HashMap<String, String> arr = new HashMap<>();
	
	arr.put("aa", "1111");
	arr.put("bb", "2222");
	arr.put("cc", "3333");
	arr.put("dd", "4444");
	arr.put("ee", "5555");
*/
	   
	   String id = request.getParameter("pid");
	   String passwd = request.getParameter("pw"); 
	   
	   String msg = "로그인 실패";
	   MemberDAO dao = new MemberDAO();
	   MemberDTO dto = dao.reaLogin(id, passwd);
	   if(dto != null){
		   if(id.equals(dto.getId())  && passwd.equals(dto.getPw()) ){
				  msg = dto.getName()+" 님 로그인 성공";
				  session.setAttribute("me", dto.getName());
				  System.out.print("@@@@@@@@@@@@@@@@@@@@@@@@@");
		   
	   }
	   }
	   
	   
	   
	   
/* 	   if(id.equals("aaa")&&passwd.equals("1234")){
		   session.setAttribute("me", "이효리");
		  //response.sendRedirect(testloginMain);
		   msg = session.getAttribute("me")+" 님 로그인 성공";
		   
	   }else if(id.equals("bbb")&&passwd.equals("1234")){
		   session.setAttribute("me", "삼효리");
		   //response.sendRedirect(testloginMain);
		   msg = session.getAttribute("me")+" 님 로그인 성공";
		   
	   }else if(id.equals("ccc")&&passwd.equals("1234")){
		   session.setAttribute("me", "사효리");
		   //response.sendRedirect(testloginMain);
		   msg = session.getAttribute("me")+" 님 로그인 성공";
		   
	   }else{
		   response.sendRedirect("ex06_default_el_jstl.jsp?error");
	   } */
	  /* 
	   if(id.equals("aaa")&&passwd.equals("1234")){
		   session.setAttribute("me", "이효리");
		  //response.sendRedirect(testloginMain);
		   msg = session.getAttribute("me")+" 님 로그인 성공";
		   
	   }else if(id.equals("bbb")&&passwd.equals("1234")){
		   session.setAttribute("me", "삼효리");
		   //response.sendRedirect(testloginMain);
		   msg = session.getAttribute("me")+" 님 로그인 성공";
		   
	   }else if(id.equals("ccc")&&passwd.equals("1234")){
		   session.setAttribute("me", "사효리");
		   //response.sendRedirect(testloginMain);
		   msg = session.getAttribute("me")+" 님 로그인 성공";
		   
	   }else{
		   response.sendRedirect("ex06_default_el_jstl.jsp?error");
	   }
	  */
	   /*
	String msg = "로그인 실패";
	
	//for(Stud st: arr ){
		
		if(st.loginChk(request.getParameter("pid"), request.getParameter("pw"))){
		
			application.setAttribute("me", st);
			msg = st.getName()+" 님 로그인 성공";
			break;
			//}
		}*/
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