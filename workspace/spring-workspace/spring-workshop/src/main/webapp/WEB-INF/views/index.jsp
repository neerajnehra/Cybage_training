<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.example.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List</h1>
	<br>
	<br>
	<a href="/addProduct">Add New Product</a>
	<br>
	<br>
	<table width="59%" border="1">
		<thead>
			<tr>
				<td>Product-Id</td>
				<td>Product-Name</td>
				<td>Product-Price</td>
				<td colspan=2>Operations</td>
			</tr>
		</thead>
		<tbody>
			<%
				List<Product> products = (List) request.getAttribute("product");
			//out.print(products);
			for (Product p : products) {
			%>
			<tr>
				<td><%=p.getId()%></td>
				<td><%=p.getName()%></td>
				<td><%=p.getPrice()%></td>
				<td><a href="/updateProduct/<%=p.getId() %>">Update</a></td>
				<td><a href="/deleteProduct/<%=p.getId() %>">Delete</a></td>
			</tr>
			<%
				}
			%>
		</tbody>


	</table>
</body>
</html>