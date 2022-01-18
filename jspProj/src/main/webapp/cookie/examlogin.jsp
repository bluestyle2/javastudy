<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form action="examReg.jsp" method="post">
   <table>
      <tr>
         <td>id</td>
         <td><input type="text" name="id"></td>
      </tr>
      <tr>
         <td>password</td>
         <td><input type="text" name="pw"></td>
      </tr>
      <tr>
         <td colspan="2" style="text-align: center;">
         <input type="submit" value="로그인">
         <input type="reset" value="취소">
         </td>
      </tr>
   </table>
</form>
</body>
</html>