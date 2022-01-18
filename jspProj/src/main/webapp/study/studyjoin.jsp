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
<form action="studyjoin_wr.jsp" method="post">
이름 : <input type="text" name="pname"><br>
주민번호 : <input type="text" name="age" size="9" maxlength="6">
		<input type="text" name="age2" size="9" maxlength="7"><br>
		<input type="submit" value="전송">
<%--
$("#join").on("click",function(){

	 var birth = document.jumin1.value.substring(0,2);
	  if(parseInt(birth) < 95) {
	   alert("성인");
	  }
	  else {
	   alert("미성년자");
	  }
      
})
  </script>

 <tr>
  <td align="center">주민번호</td>
  <td>
  <input name="jumin1" type="text" size="6" maxlength="6">
  - <input name="jumin2" type="password" size="7" maxlength="7">
  </td>
  </tr>

<tr align="center">
  <td>
   <input type="button" id="join" value="가입" onclick="join">
   <input type="reset" value="취소">
  </td>
  </tr>
--%>
</body>
</html>