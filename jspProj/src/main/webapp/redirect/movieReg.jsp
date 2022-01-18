<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 

	String title = request.getParameter("title");
	int cnt = Integer.parseInt(request.getParameter("cnt"));
	
	int pp = 0;
	switch(title){
	
	case "super":
		pp = cnt+1;
		break;
	case "mart":
		pp = cnt*2;
		break;
	case "convenience":
		pp = 1234;
		break;
	}
	
	response.sendRedirect(title+".jsp?pp="+pp);

%>