<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_examArr</title>
<script src="../qqq/jquery-3.6.0.js"></script>
	<script>
		$(function(){
			var titleArr = ["ban","pname","kor","eng","mat"]
			var cnt = 5
			
			function cntAdd(){
				
				$(".line").remove()
				
				for(var i = 0; i<cnt; i++){
				var line = $("	<tr class='line'>")
				
				$.each(titleArr, function(i,e){
					
					var tt = $("<td><input type='text' name='"+e+"' /></td>")
					
					line.append(tt)
				})
				
				$("#sss").before(line)
				
				}
			}
			
			cntAdd()	
		
			
			$("#cnt").on("change",function(){
				
				//alert("바뀐다"+$(this).val())
				cnt = $(this).val()
				cntAdd()
			})
			
		})
	</script>


</head>
<body>
반 > 등수 > 이름 순으로 정렬되어 출력 --> 정렬 안함
출력 내용 - 반 , 이름, 국, 영, 수, 총점, 평균, 등급, 등수(반등수)
이름이 없으면 데이터 처리 X
점수가 없을 경우 0 으로 처리 --> 10명칸으로 고정
<h1>04_examForm2</h1>
<form action="examArrReg.jsp" method="post">
	<table border="">	
		<tr>
			<td colspan="5" align="right">
				인원수:<select id="cnt">
				<% for(int i = 5; i<=30; i+=5){ %>
					<option><%=i %></option>
					<%} %>
				</select>
				
			</td>
		</tr>
		<tr>
			<td>반</td>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
		</tr>
		
	
			
		<tr id = "sss">
			<td colspan="5" align="right"><input type="submit" value="작성" ></td>
		</tr>
		
	</table>
</form>


</body>
</html>