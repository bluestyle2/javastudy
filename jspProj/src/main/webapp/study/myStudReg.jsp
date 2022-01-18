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
				<td>학생번호</td>
				<td><%=pp.getPnum() %></td>
			</tr>
			<tr>
				<td>성명</td>
				<td><%=pp.getPname() %></td>
			</tr>
			<tr>
				<td>국어</td>
				<td><%=pp.getKor() %></td>
			</tr>
			<tr>
				<td>영어</td>
				<td><%=pp.getEng() %></td>
			</tr>
			<tr>
				<td>수학</td>
				<td><%=pp.getMat() %></td>
			</tr>
			<tr>
				<td>총점</td>
				<td><%=pp.getTot() %></td>
			</tr>
			<tr>
				<td>평균</td>
				<td><%=pp.getAvg() %></td>
			</tr>
			<tr>
				<td>등급</td>
				<td><%=pp.getGrade() %></td>
			</tr>
		</table>

</body>
</html>