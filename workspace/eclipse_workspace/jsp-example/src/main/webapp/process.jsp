<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Process File</title>
</head>
<body>
	<%!		//Code inside this goes outside _initService
		public int add(){
			return 1+2;	
		}
	%>
	<%
		//String name = request.getParameter("name");
		//System.out.println("Name: " + name);
		//out.print("Name: " + name + "<br> addition " + add());
	%>
	<%	
		int a = 100/0;
		//response.sendRedirect("https://www.google.com");
		System.out.println("Value from session: " + session.getAttribute("Name"));
	%>
</body>
</html>