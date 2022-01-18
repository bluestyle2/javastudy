<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
</head>
<body>
<form action="calcss" method="post">
	<table>
		<tr>						
			<td colspan="2"><input type="text" name="calc1" size="4" /></td>
			<td colspan="2"><input type="text" name="calc2" size="4"/></td>			
		</tr>			
		<tr>		
			<td><input type="button" name="plus" value="+"/></td>
			<td><input type="button" name="minus" value="-"/></td>
			<td><input type="button" name="gop" value="X"/></td>
			<td><input type="button" name="nanu" value="%"/></td>
		</tr>
		<tr>						
			<td colspan="4" align="center"><input type="submit" value="계산" /></td>
		</tr>
	</table>
</form>
</body>
</html>