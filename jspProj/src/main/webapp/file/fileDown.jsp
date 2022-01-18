<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getRealPath("ttt");
	path = "E:\\ojh\\study\\java_work\\jspProj\\src\\main\\webapp\\ttt";

	response.setHeader("Content-Disposition",
						"attachment;filename=qwer.txt");
	
	out.clear();	//기존의 outputStream 초기화
	out = pageContext.pushBody();	//저장할수있는 io를 받음?
	
	ServletOutputStream sos = response.getOutputStream(); //out에서가져온걸로 outputstream을 만든다
	
	FileInputStream fis = new FileInputStream(path+"\\zzz.txt");
		
	byte [] buf = new byte[1024];
	
	

	while(fis.available()>0){
		int len = fis.read(buf);
		sos.write(buf, 0, len);
	}
	
	fis.close();
	sos.close();
%>