<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>coffeeOrderForm</title>
</head>
<body>
<form action="coffeeOrderReg.jsp" method="post">
	<label for="">메뉴
		<select name="menu">
			<option value="americano">아메리카노</option>
			<option value="africano">아프리카노</option>
			<option value="asiano">아시아노</option>
		</select>
	</label>
	
	<label for="">수량<input type="text" name="cnt" /></label>
	<label for=""><input type="submit" value="주문" /></label>
		
	
	
</form>
</body>
</html>