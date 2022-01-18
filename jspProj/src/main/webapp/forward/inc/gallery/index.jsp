<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
	#wrapper{
		width:800px;
		height: 1200px;
		padding: 50px;
		border: 1px solid #ccc;
		
	}
	
	#wrapper > a{
		width:800px;
		height: 200px;
		box-sizing:border-box;
		border: 1px solid #ccc;
		display:block;
		float: left;
		text-align:center;
	}
	
	#wrapper > a > img{
		width:150px;
		height: 150px;
		
	}
	
</style>

<div id="wrapper">

<c:forEach items="${mainData }" var="ph">
	<a href="detail.jsp?ss=${ph.src } %>&nn=${ph.name}">
		<img src="../../fff/${ph.src }"><br>${ph.name}
	</a>
</c:forEach>
</div>