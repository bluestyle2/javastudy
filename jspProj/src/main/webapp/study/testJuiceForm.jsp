<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>그린 코틀린 오준혁</title>
<style>
	
	#con{
		width:500px;
		height:500px;
		background: #CCA63D;	
		padding: 50px;
		margin: 50px;
	}
	#menu{
		width:500px;
		height:500px;		
		text-align :center;
		font-size: 1.5rem;
		
		
	}
</style>
<script type="text/javascript" src="../qqq/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		$("button").click(function(){
			
			var ggg = $(this).html()
			alert(ggg+"를 검색하셨습니다.")
			
			$.ajax({
				url:"testJuiceSearch.jsp",
				data:{kind:ggg},
				type:'post',
				success:function(ddd){
					$("#con").html(ddd)	
				},
				error:function(e){
					alert(e.responseText)
				}
			})
			
		})
		
	})
</script>
</head>
<body>
<h1>검색하실 메뉴를 골라주세요</h1>
<button>커피</button>
<button>스무디</button>
<button>차</button>

<div id="con"></div>
</body>
</html>