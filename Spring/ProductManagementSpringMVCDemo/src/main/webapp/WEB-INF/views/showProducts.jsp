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
	</tr>
	<c:forEach var="p" items="${plist}">
		<tr>
			
			<td></td>
			<td></td>
		</tr>
	</c:forEach>
</table>

</body>
</html>