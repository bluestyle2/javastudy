<%@page import="java.net.URLEncoder"%>
<%@page import="java.io.FileInputStream"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String fname = request.getParameter("fname");
	//System.out.println(URLEncoder.encode(ff.name,"utf-8"))
	String path = request.getRealPath("fff");
	path = "E:\\ojh\\study\\java_work\\jspProj\\src\\main\\webapp\\fff";

	response.setHeader("Content-Disposition",
						"attachment;filename="+URLEncoder.encode(fname,"utf-8"));
	
	out.clear();	//기존의 outputStream 초기화
	out = pageContext.pushBody();	//저장할수있는 io를 받음?
	
	ServletOutputStream sos = response.getOutputStream(); //out에서가져온걸로 outputstream을 만든다
	
	FileInputStream fis = new FileInputStream(path+"\\"+fname);
		
	byte [] buf = new byte[1024];
	
	

	while(fis.available()>0){
		int len = fis.read(buf);
		sos.write(buf, 0, len);
	}
	
	fis.close();
	sos.close();
%>