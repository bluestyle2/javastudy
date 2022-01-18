<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	String path = request.getRealPath("/ttt");	//실제서버에 올릴때는 getRealPath를 쓰는게 맞음
	
	System.out.println(path);
	//수업에서 가상 서버 아닌 현재 저장폴더 경로 --? 배포시에는 주석처리하여 절대경로로 저장되지 않게 한다.
//path = "E:\\ojh\\study\\java_work\\jspProj\\src\\main\\webapp\\ttt";  //.java_work\\jspProj\\.meta로 저장된다 
																		//.meta는 가상서버폴더임 이클립스쓸때에는 가상서버로 연습권장
	MultipartRequest mm = new MultipartRequest(
			request,
			path,
			1024*1024*10,	// 1키로바이트*1메가바이트*10메가바이트파일크기를 얼마나할꺼냐
			"utf-8",	// 인코딩방식
			new DefaultFileRenamePolicy()
			);	   
	   
	  
File ff2 = new File(path+"\\"+mm.getFilesystemName("ff2"));
	

	String goUrl = "myuploadChk.jsp?id="+mm.getParameter("id")+
			"&name="+mm.getParameter("name")+
			"&age="+mm.getParameter("age")+
			"&ff2="+mm.getFilesystemName("ff2");

	String fn= mm.getOriginalFileName("ff2");
	//String fp2 = fn.substring(fn.lastIndexOf(".")+1);
	String fp= fn.toLowerCase();
	System.out.println(fn);
	System.out.println(fp);
	  boolean chk = false;
	
	if(mm.getOriginalFileName("ff2")!=null){
	if(!fp.endsWith(".pptx") && !fp.endsWith(".hwp") && !fp.endsWith(".txt") ){
		System.out.println("성공"); 
		chk = true;
		
		}
	}
	System.out.println(chk);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>uploadReg</title>
</head>
<body>

<table border="">
		<tr>
			<td>id</td>
			<td><%=mm.getParameter("id") %></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><%=mm.getParameter("name") %></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=mm.getParameter("age") %></td>
		</tr>
		<tr>
			<td>파일</td>
			<td>
				<%=mm.getFilesystemName("ff2") %><br>
				<%=mm.getOriginalFileName("ff2") %><br>
				<%=mm.getContentType("ff2") %>
			</td>
		</tr>
	</table>
	
<script>
<%if(chk==true){
session.setAttribute("id", mm.getParameter("id") );
session.setAttribute("name", mm.getParameter("name") );
session.setAttribute("age", mm.getParameter("age") );
%>
alert("신청되었습니다.")
location.href="<%=goUrl%>"

<% 
}else{
ff2.delete();
%>  
alert("잘못된 파일 확장자입니다.")
location.href="myuploadForm.jspj";
<%} %>
</script>
<h1>uploadReg</h1>
</body>
</html>