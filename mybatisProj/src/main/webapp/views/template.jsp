<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 ${boardDTO.service}</title>
</head>
<body>
<table border="">
	<tr>
		<td width="800px">
			<jsp:include page="inc/header.jsp"/>
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="board/${boardDTO.service}.jsp"/>
		</td>
	</tr>
	<tr>
		<td>
			<jsp:include page="inc/footer.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>