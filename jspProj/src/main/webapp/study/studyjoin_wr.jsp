<%@page import="basic.StudyjoinDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../qqq/jquery-3.6.0.js"></script>
	
</head>
<body>
<%
 request.setCharacterEncoding("utf-8");
 String name = request.getParameter("pname");
 String age = request.getParameter("age");	//나이저장
 int num = Integer.parseInt(age.substring(0,2));	//앞 두자리 int로 변환

 if(num<=21){
	 num = Integer.parseInt(20+age.substring(0,2));    
 }else{
	 num = Integer.parseInt(19+age.substring(0,2));    
 }

 num = 2021-num+1;
 
 if(num>15){
     System.out.println("성안");
 }else{
     System.out.println("미성년자");
 }
 System.out.println("나이: "+num);
	
%>

입력한 이름은 <%=name %>이고, 나이는 <%=num %>살 입니다.<br>
<% 
boolean chk = false;
if(num>15){
	chk = false;
 %>
 <%=name %>님은 성인 입니다.<br>
 <% 
}else{
 %>
 <%=name %>님은 미성년입니다.<br>
 	
 <%
 	chk = true;
	System.out.println(chk);
	
}
%>

<h1>회원가입</h1>
<form action="studylogin.jsp">	
	<table>
		<tr>
			<td>아이디 : </td>
			<td><input name="id" /></td>
		</tr>
		<tr>
			<td">비밀번호 : </td>
			<td><input name="pw" /></td>
		</tr>
		<tr>
			<td">이름 : </td>
			<td><input name="name" /></td>
		</tr>
		<tr>
			<td>생년월일 : </td>
			<td><input name="birth" /></td>
		</tr>
		<tr>
			<td>취미 : </td>
			<td><input name="hobby" /></td>
		</tr>
		<tr>
			<td>전화 : </td>
			<td><input name="tel" /></td>
		</tr>
		
		<% 
		if(chk==true){%>
			<tr><td>부모님의 성함</td>
			<td><input type='text' name='say1' /></td></tr>
			<tr><td>학교</td>
			<td><input type='text' name='say2' /></td></tr>
		<%
		}else{%>
			<tr><td>회사명</td>
			<td><input type='text' name='say3' /></td></tr>		
		<%	
		}
		%>
		<tr>
		<tr id = "aaa">
			<td colspan="2" align="center">	
				<input type="submit" value="회원가입">
			</td>	

		<%
		         
	  StudyjoinDTO dto =new StudyjoinDTO();
		   
		   dto = new StudyjoinDTO(				   
				   "id","pw","name","birth","tel","hobby","say1","say2","say3");

		   new StudyjoinDAO().insert(dto);
		   %>
		</tr>
	</table>
</form>
<%--<script>
		$(function(){
			
				if(chk){
				var line = $("	<tr>")
						
					var tt = $("<td>학교</td><td><input type='text' name='child' /></td>")
					
					line.append(tt)			
				
				$("#aaa").before(line)
				
				}
		
		})
	</script>
 --%>
</body>
</html>