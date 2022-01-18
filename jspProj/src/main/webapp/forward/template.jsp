<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>하성민 컴퍼니에 오신걸 환영합니다.</title>
</head>
<body>
<table>
	<tr>
		<td>
			<jsp:include page="inc/header.jsp"></jsp:include>
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="${mainPage  }"></jsp:include>
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="inc/footer.jsp"></jsp:include>
		</td>
	</tr>
</table>
</body>
</html>