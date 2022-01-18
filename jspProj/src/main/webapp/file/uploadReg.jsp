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
	
	File ff2 = new File(path+"\\"+mm.getFilesystemName("ff2"));
	ff2.delete();
	String goUrl = "uploadChk.jsp?pname="+mm.getParameter("pname")+
			"&age="+mm.getParameter("age")+			
			"&ff2="+mm.getFilesystemName("ff2");
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
			<td>이름</td>
			<td><%=mm.getParameter("pname") %></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=mm.getParameter("age") %></td>
		</tr>
		<tr>
			<td>파일1</td>
			<td>
				<%=mm.getFilesystemName("ff1") %><br>	<!-- 업로드된후 이름 -->
				<%=mm.getOriginalFileName("ff1") %><br> <!-- 업로드전 이름 -->
				<%=mm.getContentType("ff1") %>	<!-- 파일 타입 -->
			</td>
		</tr>
		<tr>
			<td>파일2</td>
			<td>
				<%=mm.getFilesystemName("ff2") %><br>
				<%=mm.getOriginalFileName("ff2") %><br>
				<%=mm.getContentType("ff2") %>
			</td>
		</tr>
	</table>
	
<script>
	alert("신청되었습니다.")
	location.href="<%=goUrl%>"

</script>
<h1>uploadReg</h1>
</body>
</html>