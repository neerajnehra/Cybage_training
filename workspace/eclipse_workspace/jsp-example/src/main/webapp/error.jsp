<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isErrorPage="true" %>
    <!-- It indicates this page is useful to report exception. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>
	<h1>Error Page</h1>
	Reason for error:<%=exception.getMessage() %>
</body>
</html>