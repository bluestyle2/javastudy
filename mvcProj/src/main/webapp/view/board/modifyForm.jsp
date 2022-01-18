<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="../qqq/jquery-3.6.0.js"></script>
<script>
function fileDelete(){
	
	if(confirm("파일 삭제하시겠습니까?\n삭제된 파일은 복구할 수 없습니다.")){
		$("#frm").attr("action" , "FileDelete");
		$("#frm").submit()
	}
}

</script>
<h2>글수정</h2>
<form action="BoardModifyReg" method="post" enctype="multipart/form-data" id="frm">
	<input type="hidden" name="page" value="${param.page }"/> 
	<table border="">
		<tr>
			<td>id</td>
			<td><input type="text" name="id" readonly="readonly"  value="${mainData.id }" /></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" name="title"  value="${mainData.title }" /></td>
		</tr>
		<tr>
			<td>작성자</td>
			<td><input type="text" name="pname" value="${mainData.pname }" /></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw" /></td>
		</tr>
		<c:if test="${mainData.lev==0 }">
			<tr>
				<td>파일</td>
				<td>
					<c:choose>
						<c:when test="${mainData.upfile!=null }"><!-- db상에 upfile이 존재하면 -->
							<input type="text" name="upfile" readonly="readonly" value="${mainData.upfile }" />
							<input type="button" value="파일 삭제" onclick="fileDelete()"/>
						</c:when>
						<c:otherwise>	<!-- 파일이 없다면 파일을 올릴수있도록한다. -->
							<input type="file" name="upfile"/>
						</c:otherwise>
					</c:choose>
	
				</td>
			</tr>
		</c:if>
		<tr>
			<td>내용</td>
			<td><textarea name="content" >${mainData.content }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="수정" />
				<input type="reset" value="초기화" />
				<a href="BoardDetail?id=${mainData.id }&page=${param.page }">뒤로</a>
			</td>
		</tr>
	</table>
</form>