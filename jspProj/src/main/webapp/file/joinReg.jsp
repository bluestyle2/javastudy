<%@page import="basic.Person"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = "E:\\ojh\\study\\java_work\\jspProj\\src\\main\\webapp\\ttt";
	MultipartRequest mm = new MultipartRequest(
			request,
			path,
			1024*1024*10,	// 1키로바이트*1메가바이트*10메가바이트파일크기를 얼마나할꺼냐
			"utf-8",	// 인코딩방식
			new DefaultFileRenamePolicy()
			);
	
	Person mem = new Person();
	mem.setPid(mm.getParameter("pid"));
	mem.setPname(mm.getParameter("pname"));
	mem.setPw(mm.getParameter("pw"));
	mem.setPic( mm.getFilesystemName("pic").trim().toLowerCase());
	
	session.setAttribute("mem", mem);
	
	String url = "joinDetail.jsp";
	String msg = "가입되었습니다";
	if(!Pattern.matches(".*[.](jpg|jpeg|gif|bmp|png)", mem.getPic())){
		
		File pic = new File(path+"\\"+mem.getPic());	
		pic.delete();
		
			url = "joinForm.jsp";
			msg = "이미지 파일이 아닙니다.";
	}
	
	
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadReg</title>
</head>
<body>
<script>
	alert("<%=msg%>")
	location.href="<%=url%>"

</script>
<h1>uploadReg</h1>
</body>
</html>