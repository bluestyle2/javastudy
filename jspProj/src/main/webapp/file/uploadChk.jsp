<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <!-- 폴더의 위치가 자주 바뀐다는 전제 하에 -->
  <!--  wep안의 ttt라서 이렇게 쓴거다 -->

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
			<td>${param.pname }</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${param.age }</td>
		</tr>
		<tr>
			<td>파일1</td>
			<td><!--<img src="../ttt/${param.ff1}" alt="" />-->
			
				<img src="<c:url value="/ttt/${param.ff1}" />" alt="" />
			</td>
		</tr>
		<tr>
			<td>파일2</td>
			<td>${param.ff2}</td>
		</tr>
	</table>


</body>
</html>