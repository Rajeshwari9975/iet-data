<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/ProductMgmtMVCDemo/product/addNewProductt" method="Post">
Product ID : <input type="text" name="prodId" id="prodId">
<br>
Product Description : <input type="text" name="desc" id="desc">
<br>
Product Price : <input type="text" name="price" id="price">
<br>
<button type="submit">Add New Product</button>
</form>
</body>
</html>