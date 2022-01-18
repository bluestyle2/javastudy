<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>core</title>
</head>
<body>
<h1>core2</h1>

\${mm1 } : ${mm1 }<br>
\${mm2 } : ${mm2 }<br><!-- request pagecontext는 안나옴 -->
\${mm3 } : ${mm3 }<br>
\${mm4 } : ${mm4 }<br><!-- 세션하고 어플리케이션은 scope가 살아있어서 나옴 -->
</body>
</html>