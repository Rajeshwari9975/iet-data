<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table>
	<tr>
		<th>Product ID</th>
		<th>Product Description</th>
		<th>Product Price</th>
		<th>Actions</th>
	</tr>
	<c:forEach var="p" items="${plist}">
		<tr>
			
			<td>${p.prodId}</td>
			<td>${p.desc}</td>
			<td>${p.price}</td>
			<td><a href=deleteprod/${p.prodId}>Delete</a>/<a href=updateprod/${p.prodId}>Edit</a></td>
		</tr>
	</c:forEach>
</table>

<a href="/ProductMgmtMVCDemo/product/addNewProductForm">Add New Product</a>

</body>
</html>