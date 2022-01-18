<%@page import="basic.Stud"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	ArrayList<Stud> arr = new ArrayList();
	
	arr.add(new Stud("aa", "1111", "이효리"));
	arr.add(new Stud("bb", "2222", "삼효리"));
	arr.add(new Stud("cc", "3333", "사효리"));
	arr.add(new Stud("dd", "4444", "오효리"));
	arr.add(new Stud("ee", "5555", "육효리"));

	String a;
	String b;
	String msg = "로그인 실패";
	 Cookie[] cookies = request.getCookies(); // 저장된 쿠키들을 담기위한 배열
     Cookie cookie = null;

     // 저장되어 있는 쿠키 배열 검색
     for(Cookie c: cookies){
         System.out.println("cookie name: "+c.getName());
         System.out.println("cookie value: "+c.getValue());

         // 쿠키의 이름이 "memberId"와 같으면 cookie에 그 정보를 담아라.
         if(c.getName().equals("memberId")){
             cookie = c;
         }
     }
	for(Stud st: arr ){
		
		if(st.loginChk(cookie.getValue(), cookie.getName())){
		
			application.setAttribute("me", st);
			msg = st.getName()+" 님 로그인 성공";
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