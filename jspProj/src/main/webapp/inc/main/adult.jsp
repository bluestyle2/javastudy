<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <script src="../qqq/jquery-3.6.0.js"></script>
  <script>
  		$(function(){	//정규식으로 유효성검사
  			
  			$("#btn").click(function(){
  				
  				//alert("btn클릭")
  				
  				if($("#mid").val() == "abc"){	//이부분에 정규식을 추가하면된다 지금은 예제
  					alert("abc 싫어!")
  					return
  				}
  				
  				$("#frm").submit()
  			})
			$("#midChk").click(function(){
  				
  				$.ajax({
  					url:"idChk.jsp",
  					data:{mid:$("#mid").val()},
  					type:"post",
  					success:function(ddd){
  						alert(ddd)
  						
  					},
  					error:function(e){
  						alert(e.responseText)
  				
  					}
  				})
  				return false	//button의 자동 submit() 하지 못하도록 막음
  			})					//이게 싫으면 인풋타입 버튼으로 하면됨
  			
  			
  		})	
  
  </script>

<h1>성인 회원가입</h1>
<form action="signUpReg.jsp" method="post" name = "frm">
<input type="hidden" name="kind" value="adult" />
<label for="">아이디<input name="mid" type="text" /></label>
	<button id="midChk">아디중복확인</button>
<br>
<label for="">비밀번호<input name="mpw" type="password" /></label><br>
<label for="">이름<input name="mname" type="text" value="<%=request.getParameter("mname") %>" /></label><br>
<label for="">전화<input name="tel" type="text" /></label><br>
<label for="">회사<input name="company" type="text" /></label><br>
<button type="button" id="btn">확인</button>
</form>
