<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://jakarta.apache.org/taglibs/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Update Form</title>
</head>
<body>

<form action="/ProductMgmtMVCDemo/product/modifyprod" method="Post">
Product ID : <input type="text" name="prodId" id="prodId" value="${p.prodId}" readonly>
<br>
Product Description : <input type="text" name="desc" id="desc" value="${p.desc}">
<br>
Product Price : <input type="text" name="price" id="price" value="${p.price}">
<br>
<button type="submit">Update Product</button>
</form>
</body>
</html>