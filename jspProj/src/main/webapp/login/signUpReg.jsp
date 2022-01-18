<%@page import="basic.MemDTO"%>
<%@page import="java.net.URLEncoder"%>
<%@page import="basic.MemDAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

///  회원종류 - 미성년자, 성인, 외국인

///  미성년자(만 15세 미만) -  이름 , 부모 주민번호, 전화, 학교

///  성인 - 이름, 전화, 회사

///  외국인 - 이름, 전화, 국적

	request.setCharacterEncoding("UTF-8");

	MemDTO dto = new MemDTO();
	dto.setMid(request.getParameter("mid").trim());
	dto.setMname(request.getParameter("mname").trim());
	dto.setMpw(request.getParameter("mpw").trim());
	dto.setTel(request.getParameter("tel").trim());

	dto.setKind(request.getParameter("kind"));
	
	String msg = "회원 가입실패";
	String url = dto.getKind()+".jsp?mname="+URLEncoder.encode(dto.getMname(),"UTF-8");
	
	///// 유효성 검사
	if(new MemDAO().idChk(dto.getMid())){
		 msg = "아이디 중복이요";
	}else{
	
		switch(dto.getKind()){
			case "adult":
				dto.setCompany(request.getParameter("company").trim());
				break;
			case "foreigner":
				dto.setNationality(request.getParameter("nationality").trim());
				break;
			case "juvenile":
				dto.setJumin(request.getParameter("jumin").trim());
				dto.setSchool(request.getParameter("school").trim());
				break;
		
		}
	
	
		int upCnt = new MemDAO().signUp(dto);
		
		msg = dto.getMname() + "님 회원가입을 축하합니다";
		url = "index.jsp";
	}
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입성공</title>
</head>
<body>
<h1>회원가입성공</h1>
<script>
	alert("<%=msg%>")
	location.href="<%=url%>";
</script>
</body>
</html>