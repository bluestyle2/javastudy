<%@page import="java.util.Arrays"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_request</title>
</head>
<body>
	<h1>03_request</h1>
	%EC%9E%A5%EB%8F%99%EA%B1%B4<br>
	<%
		String en = URLEncoder.encode("장동건","UTF-8");
		out.println(en+"<br>");
		out.println(URLEncoder.encode("장동건","EUC-KR")+"<br>");
		request.setCharacterEncoding("UTF-8");	//인코딩설정
		//프로토콜       서버        프로젝트?              주소        758037
		//https://comic.naver.com/webtoon/detail?titleId=758037&no=52&weekday=mon
		HttpServletRequest hsr = request;
		HttpServletRequest hsr2 = (HttpServletRequest)pageContext.getRequest();
		out.println(request+"<br>");
		out.println(hsr+"<br>");
		out.println(hsr2+"<br>");
		out.println(request.getRemoteAddr()+"<br>");
		out.println(request.getContentLength()+"<br>");
		out.println(request.getRemoteHost()+"<br>");	
		out.println(request.getRemoteUser()+"<br>");	
		out.println(request.getProtocol()+"<br>");
		out.println(request.getServerName()+"<br>");	//서버의 이름
		out.println(request.getMethod()+"<br>");
		out.println(request.getContentType()+"<br>");
		out.println(request.getRequestURI()+"<br>");	//지금 열고 들어온 주소에서 어디까지 인지 알려준다*중요*(경로자체를 변수로 쓸수있음)
		out.println(request.getRequestURL()+"<br>");
		out.println(request.getContextPath()+"<br>");	//경로까지만 가져온다*중요*
		out.println(request.getCharacterEncoding()+"<br>");		
		out.println(100+request.getParameter("titleId")+"<br>");		
		out.println(request.getParameter("no")+"<br>");
		out.println(request.getParameter("weekday")+"<br>");
		out.println(request.getParameter("weekday")+"<br>");
		out.println(request.getParameter("weekday")+"<br>");
		
		String [] weeks = request.getParameterValues("weekday");	//여러개의 weekday를 가져옴
		out.println(Arrays.toString(weeks)+"<br>");		//배열의 값들을 출력함
	%>
</body>
</html>