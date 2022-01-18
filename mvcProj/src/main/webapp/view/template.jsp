<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mvc 게시판</title>
</head>
<script type="text/javascript" src="../qqq/jquery-3.6.0.js"></script>
<script type="text/javascript">
	$(function(){
		$("button").click(function(){
			
			var ttt = $(this).html()
			alert(ttt)
			
			$.ajax({
				url:"voicepage1.jsp",
				data:{kind:ttt},
				type:'post',
				success:function(ddd){	//성공을하면
					$("#con").html(ddd)	//#con에 내용을 뿌린다
				},
				error:function(e){
					alert(e.responseText)
				}
			})
			
		})
		
	})
</script>
<body>
<h1>mvc 게시판</h1>
<table border="">
	<tr>
		<td width="1000px">
			<jsp:include page="inc/header.jsp"/>
		</td>
	</tr>
	<tr>
		<td id = "con">
			<jsp:include page="board/${mainUrl }.jsp"/>
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