<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>req/uploadForm</title>
</head>
<body>
<h1>req/파일올리기</h1>
<h2>form1</h2>
<form action="upCom1" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>파일1</td>
			<td><input type="file" name="upfile_1" /></td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><input type="file" name="upfile_2" /></td>
		</tr>
		<tr>
			
			<td colspan="2" align="center">
			<input type="submit" value="전송" /></td>
		</tr>
	</table>
</form>
<h2>form2</h2>
<form action="upCom2" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>파일1</td>
			<td><input type="file" name="upfile_1" /></td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><input type="file" name="upfile_2" /></td>
		</tr>
		<tr>
			
			<td colspan="2" align="center">
			<input type="submit" value="전송" /></td>
		</tr>
	</table>
</form>
<h2>form3</h2>
<form action="upCom3" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>파일1</td>
			<td><input type="file" name="upfile_1" /></td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><input type="file" name="upfile_2" /></td>
		</tr>
		<tr>
			
			<td colspan="2" align="center">
			<input type="submit" value="전송" /></td>
		</tr>
	</table>
</form>
<h2>회원가입</h2>
<form action="upCom4" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>ID</td>
			<td><input type="text" name="pid" /></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td><input type="text" name="phone" /></td>
		</tr>
		<tr>
			<td>파일1</td>
			<td><input type="file" name="upfile_1" /></td>
		</tr>
		<tr>
			<td>이력서</td>
			<td><input type="file" name="upfile_2" /></td>
		</tr>
		<tr>
			
			<td colspan="2" align="center">
			<input type="submit" value="전송" /></td>
		</tr>
	</table>
</form>
</body>
</html>