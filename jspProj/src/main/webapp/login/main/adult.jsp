<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <script src="../qqq/jquery-3.6.0.js"></script>
  <script>
  		$(function(){	//정규식으로 유효성검사
  			
  			$("#btn").click(function(){
  				
  				//alert("btn클릭")
  				if($("#mid").attr("readonly") != "readonly"){	
  					alert("id 에러!")
  					$("#mid").focus()
  					return 
  				}
  					//들어가야할 조건
  				if(!
  					/^[0-9a-zA-Z!@#$%^&*]{5,}$/.test($("#mpw").val()) &&
  					/[0-9]/.test(   $("#mpw").val() ) &&
  					/[a-z]/.test(   $("#mpw").val() ) &&
  					/[A-Z]/.test(   $("#mpw").val() ) &&
  					/[!@#$%^&*]/.test(   $("#mpw").val() )
  						
  				)){
  					alert("pw 에러!")
  					$("#mpw").focus()
  					return 
  				}
  		
		  		if($("#mpw").val()!=$("#mpw2").val()){
		  			alert("pw확인 에러")
		  			$("#mpw2").focus()
		  			return
		  		}
  					
		  		if(! /^[가-힣]{2,}$/.test($("#mname").val()) ){
	  						
	  					alert("이름 에러!")
	  					$("#mname").focus()
	  					return 
	  				}
		  	
  				if($("#tel").attr("readonly") != "readonly"){	
  					alert("전화 에러!")
  					$("#tel").focus()
  					return 
		  				}
  				
		  		if(! /^[0-9a-zA-Z가-힣]{2,}$/.test($("#company").val()) ){					
					alert("회사 에러!")
					$("#mname").focus()
					return 
				}
  				
  				$("#frm").submit()
  			})
  			
		 	$("#midChk").click(function(){
  				
		 		if(/^[0-9a-zA-Z]{5,}$/.test($("#mid").val())){
		 			
		 		
		 		
  				$.ajax({
  					url:"chk.jsp",
  					data:{mid : $("#mid").val(),
  						col : "mid"		},
  					
  					type:"post",
  					success:function(ddd){
  						
 						if(eval(ddd)){
  							
	  						alert("중복입니다")
	  						$("#mid").focus()
	  						
  						}else{
  							
							alert("사용가능 합니다")
	  						$("#mid").attr("readOnly","readOnly")
	  						$("#midChk").attr("disabled","disabled")
  						}
  					},
  					error:function(e){
  						alert(e.responseText)
  				
  					}
  				})
		 		}else{
		 			alert("id 형식 에러")
		 			$("#mid").focus()
		 		}
  				return false	//button의 자동 submit 하지 못하도록 막음
  			})
  		
			$("#telChk").click(function(){
				if(/^[0-9a]{9,11}$/.test($("#tel").val())){
	  				$.ajax({
	  					url:"chk.jsp",
	  					data:{mid : $("#tel").val(),
	  						col : "tel"
	  					},
	  					type:"post",
	  					success:function(ddd){
	  						
	 						if(eval(ddd)){
	  							
		  						alert("중복입니다")
		  						$("#tel").focus()
		  						
	  						}else{
	  							
								alert("사용가능 합니다")
		  						$("#tel").attr("readOnly","readOnly")
		  						$("#telChk").attr("disabled","disabled")
	  						}
	  					},
	  					error:function(e){
	  						alert(e.responseText)
	  				
	  					}
	  				})
				}else{
		 			alert("id 형식 에러")
		 		}
  				return false	//button의 자동 submit 하지 못하도록 막음
  			})
  		
  		
  			
  		})	
  
  </script>

<h1>성인 회원가입</h1>
<form action="signUpReg.jsp" method="post" id = "frm">
<input type="hidden" name="kind" value="adult" />
<label for="">아이디<input name="mid" type="text" id="mid"/></label>
	<button id="midChk">아디중복확인</button>
<br>
<label for="">비밀번호<input name="mpw" type="text" id="mpw" /></label>대소문자조합5자 이상<br>
<label for="">비밀번호확인<input name="mpw2" type="text" id="mpw2"/></label><br>
<label for="">이름<input name="mname" id="mname" type="text" value="<%=request.getParameter("mname") %>" /></label><br>
<label for="">전화<input name="tel" id="tel" type="text" id="tel"/></label>
<button id="telChk">전화중복확인</button>
<br>
<label for="">회사<input id="company" name="company" type="text" /></label><br>
<button type="button" id="btn">확인</button>
</form>
