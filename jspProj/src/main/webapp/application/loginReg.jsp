<%@page import="basic.Stud"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	ArrayList<Stud> arr = new ArrayList();
	
	arr.add(new Stud("aa" , "1111", "이효리"));
	arr.add(new Stud("bb" , "2222", "삼효리"));
	arr.add(new Stud("cc" , "3333", "사효리"));
	arr.add(new Stud("dd" , "4444", "오효리"));
	arr.add(new Stud("ee" , "5555", "육효리"));
	
	
	String msg = "로그인 실패";
	
	for(Stud st: arr){
		
		if(st.loginChk(request.getParameter("pid"), request.getParameter("pw"))){
	
			application.setAttribute("me", st);
			msg = st.getName()+"님 로그인 성공";
			break;
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
location.href = "loginMain.jsp"
</script>
</body>
</html>