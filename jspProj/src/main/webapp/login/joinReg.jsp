<%@page import="java.net.URLEncoder"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 



    request.setCharacterEncoding("UTF-8");
	String mname = request.getParameter("mname"); 
	String jumin = request.getParameter("jumin");
	int pp = jumin.charAt(7)-'0';
	

	String goUrl = "adult";
	
	Calendar  today = Calendar.getInstance();
	today.add(Calendar.YEAR, -15);
	System.out.println(today);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
	Calendar  birth = Calendar.getInstance();
	birth.setTime(sdf.parse(((pp-1)%4/2+19)+jumin.substring(0,6)));
	System.out.println(birth);
	
	if((pp-1)/4==1){
		goUrl = "foreigner";
	
	}else if(today.before(birth)){
		goUrl = "juvenile";
	
	}
	
	response.sendRedirect(goUrl+".jsp?mname="+URLEncoder.encode(mname,"UTF-8"));
%>
