<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/saveProduct" method="POST" modelAttribute="product">
		Product-Name: <input type="text" name="name" /> Product-Price: <input
			type="text" name="price"> <input type="submit" value="Submit">
	</form>
</body>
</html>