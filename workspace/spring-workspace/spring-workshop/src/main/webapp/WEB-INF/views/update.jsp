<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>update page</h1>
	<%
		Product p = (Product)request.getAttribute("product");
	%>

	<form action="/updateProduct" modelAttribute="product" method="POST">
		Product-Id: <input type="text" name="id" value="<%=p.getId()%>"
			readonly="readonly" /> Product-Name: <input type="text" name="name"
			value="<%=p.getName()%>" /> Product-Price: <input type="text"
			name="price" value="<%=p.getPrice()%>" /> <input type="submit"
			value="Update">
	</form>
</body>
</html>