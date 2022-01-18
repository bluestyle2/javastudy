<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  

<h1>미성년자 회원가입</h1>
<form action="signUpReg.jsp" method="post">
<input type="hidden" name="kind" value="juvenile" />
<label for="">아이디<input name="mid" type="text" /></label><br>
<label for="">비밀번호<input name="mpw" type="password" /></label><br>
<label for="">이름<input name="mname" type="text"  value="<%=request.getParameter("mname") %>"/></label><br>
<label for="">전화<input name="tel" type="text" /></label><br>
<label for="">학교<input name="school" type="text" /></label><br>
<label for="">부모 주민번호<input name="jumin" type="text" /></label><br>
<button type="submit">확인</button>
</form>
