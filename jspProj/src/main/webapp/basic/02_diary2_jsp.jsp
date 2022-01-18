<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    Calendar today = Calendar.getInstance();

    int year =  today.get(Calendar.YEAR);
    int month = today.get(Calendar.MONTH);
    int day =  today.get(Calendar.DATE);

    int yy = 2021;
    
    String title = "  "+String.join("  \t ", "일","월","화","수","목","금","토");
    String pre = "";
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
for (int mm = 0; mm < 12; mm++) {
	today.set(yy, mm, 1);
	//CalendarMain.ppp(today);
	
	out.println("\n\n\t\t"+yy+"년 "+(mm+1)+"월\n");
	out.println(title);
	int last = today.getActualMaximum(Calendar.DATE);
	//System.out.println(last);
	
	for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
		out.print("\t");
	}
	
	for (int i = 1; i <=last; i++) {
		today.set(Calendar.DATE, i);
		//System.out.print(i+","+today.get(Calendar.DAY_OF_WEEK)+"\t");
		
		int cm = today.get(Calendar.MONTH);
		//System.out.println(cm+","+i);
		

		
		
		if(year == yy && cm==month && i==day) {
			pre = "[";
			sur = "]";
		}
		if(i<10) {
			pre += " ";
		}

		System.out.print(pre+i+sur+"\t");
		
		if(today.get(Calendar.DAY_OF_WEEK)==7) {
			out.println();
%>

<% /*
Calendar today = Calendar.getInstance();

int year =  today.get(Calendar.YEAR);
int month = today.get(Calendar.MONTH);
int day =  today.get(Calendar.DATE);

int yy = 2021;

String title = "  "+String.join("  \t ", "일","월","화","수","목","금","토");

for (int mm = 0; mm < 12; mm++) {
	today.set(yy, mm, 1);
	//CalendarMain.ppp(today);
	
	System.out.println("\n\n\t\t"+yy+"년 "+(mm+1)+"월\n");
	System.out.println(title);
	int last = today.getActualMaximum(Calendar.DATE);
	//System.out.println(last);
	
	for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
		System.out.print("\t");
	}
	
	for (int i = 1; i <=last; i++) {
		today.set(Calendar.DATE, i);
		//System.out.print(i+","+today.get(Calendar.DAY_OF_WEEK)+"\t");
		
		int cm = today.get(Calendar.MONTH);
		//System.out.println(cm+","+i);
		

		String pre=" ", sur=" ";
		
		
		if(year == yy && cm==month && i==day) {
			pre = "[";
			sur = "]";
		}
		if(i<10) {
			pre += " ";
		}

		System.out.print(pre+i+sur+"\t");
		
		if(today.get(Calendar.DAY_OF_WEEK)==7) {
			System.out.println();
		}
	}
}

*/ %>


</body>
</html>