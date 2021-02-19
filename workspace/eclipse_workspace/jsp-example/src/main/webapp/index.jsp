<%-- <%@page errorPage="error.jsp" %> --%>
<html>
<body>
<h2>Hello World!</h2>
<form action="process.jsp">
	Name: <input type="text" name="name">
	<input type="submit" value="submit">
</form>
<%
//Java code goes here.
int age = 12;
System.out.println("Age: " + age);
System.out.println("Config name is : "+config.getInitParameter("name"));

System.out.println("org name : "+ getServletContext().getInitParameter("address"));
session.setAttribute("Name", "Rohan_Baba");
//int a = 100/0;
%>
</body>
</html>
