<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    	//declatation --클래스 정의부와 같음
    	// 01_lifeCycle_jsp.java
    	
    	/* 이 부분은 이와 동일하다
    	
    	public class 01_lifeCycle{
    	
    	
   		}
    	
    	
    	*/
    	//System.out.println("와 정의부다");
    	
    	String pname = "장동건";
    	
    	void meth_1(){	//멤버메소드
    		System.out.println("meth_1() 실행:"+pname);
    	
    	}
    	
    	public void jspInit(){
    		System.out.println("jspInit() 실행:");
    		
    	}
    
    	public void jspDestroy(){
    		System.out.println("jspDestroy() 실행:");
    		
    	}
    %>
    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_lifeCycle</title> 
</head>
<body>
	<h1>01_lifeCycle</h1>
	
	 <%
	 String pname = "장서건";	//지역변수
    	//scriptlet		-->		_jspService( ) 재정의 ::> doGet(), doPost()
    	//자동 실행
    	System.out.println("scriptlet 실행");
    	
    	//out --> 내장 객체
    	out.println("scriptlet 실행2"+pname);
    	
    	/*
    	void meth_1(){
    		System.out.println("meth_2() 실행");
    	}*/
    	meth_1();
    	
%>
<br>
<%="expression 실행" %>
<br>
<%=pname %>
</body>
</html>