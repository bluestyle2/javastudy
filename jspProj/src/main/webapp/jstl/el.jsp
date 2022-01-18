<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    pageContext.setAttribute("pp1", 10);
    request.setAttribute("pp2", 200);
    session.setAttribute("pp3", 3000);
    application.setAttribute("pp4", 40000);
    
    //같은 이름의 값이 작을경우 가장작은 scope가 우선순위를 가지게됨
    pageContext.setAttribute("ss", 10);
    request.setAttribute("ss", 200);
    session.setAttribute("ss", 3000);
    application.setAttribute("ss", 40000);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el</title>
</head>
<body>
	<h1>el</h1>
	${param.aaa } ==> ${param.aaa+100 }<br>	<!-- 연산자 사용가능 -->
	${param.bbb } ==> ${!param.bbb }<br>
	${param.ccc } ==> ${param.ccc*100 }<br>

	${pp1  }<br>
	${pp2  }<br>
	${pp3  }<br>
	${pp4  }<br>
	${pageScope.ss  }<br>	<!-- pageContext -->
	${requestScope.ss  }<br>
	${sessionScope.ss  }<br>
	${applicationScope.ss  }<br>
	${ss  }<br>
	<%
	 pageContext.removeAttribute("ss");
	 request.setAttribute("ss", 200);
	 session.setAttribute("ss", 3000);
	 application.setAttribute("ss", 40000);
	 request.removeAttribute("ss");	//작은부위부터 삭제됨
	%>
	${ss +3  }<br>	<!-- 형변환하지않아도 계산이됨 -->
	
	${15+7 }<br><!--연산이 됨-->
	${15-7 }<br>
	${15*7 }<br>
	${15/7 }<br>
	${15%7 }<br>
	
	\${15>7 } : ${15>7 }<br>
	${15>=7 }<br>
	${15<=7 }<br>
	${15<7 }<br>
	${15==7 }<br>
	${15!=7 }<br>
	\${'정우성'>'정좌성' } : ${'정우성'>'정좌성' }<br>
	\${'정우성'>='정좌성' } : ${'정우성'>='정좌성' }<br>
	\${'정우성'<='정좌성' } : ${'정우성'<='정좌성' }<br>
	\${'정우성'<'정좌성' } : ${'정우성'<'정좌성' }<br>
	\${'정우성'=='정좌성' } : ${'정우성'=='정좌성' }<br>
	\${'정우성'!='정좌성' } : ${'정우성'!='정좌성' }<br>
	\${true&&true} : ${true&&true }<br>
	\${true&&false} : ${true&&false }<br>
	\${false&&false} : ${false&&false }<br>
	\${true||true} : ${true||true }<br>
	\${true||false} : ${true||false }<br>
	\${78>80 ? '합격' : '불합격' } : ${88>80 ? '합격' : '불합격' }<br><!--삼항연산자도됨  -->
	
	
</body>
</html>