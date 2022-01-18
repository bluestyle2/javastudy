<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <jsp:useBean id="pp" class="basic.Person"/>
   <%--  <jsp:setProperty property="pid" name="pp" param="pid"/>
  <jsp:setProperty property="pname" name="pp" param="pname"/>
   <jsp:setProperty property="age" name="pp" param="age"/>
   자료형이 맞지 않아서 매칭 실패 : 기본값 유지(false)
   <jsp:setProperty property="marriage" name="pp" param="marriage"/>
   --%>
    <jsp:setProperty property="*" name="pp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>javaBeanReg</title>
</head>
<body>
	<h1>javaBeanReg</h1>
	
		<table border="">
			<tr>
				<td>id</td>
				<td><%=pp.getPid() %></td>
			</tr>
			<tr>
				<td>이름</td>
				<td></td>
			</tr>
			<tr>
				<td>나이</td>
				<td><%=pp.getAge() %></td>
			</tr>
			<tr>
				<td>키</td>
				<td><%=pp.getHeight() %></td>
			</tr>
			<tr>
				<td>결혼</td>
				<td><%=pp.isMarriage() %></td>
			</tr>
			
		</table>

</body>
</html>