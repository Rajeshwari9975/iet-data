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
	<table border="2">
		<tr>
			<th>Book Name</th>
			<th>Book Type</th>
			<th>Book Cost</th>
			<th>Quantity</th>
			<th>Total Amount</th>
		</tr>

		
		<c:forEach var="b" items="${cart}">
			<tr>
				<td>${b.bookName}</td>
				<td>${b.bookType}</td>
				<td>${b.cost}</td>
				<td>${b.orderQty}</td>
				<td>${b.cost* b.orderQty}</td>
			</tr>
			<c:set var="finalAmt" value="${finalAmt + (b.cost* b.orderQty)}"></c:set>
		</c:forEach>
		<tr>
				<td colspan="3">Final Amount :</td>
				<td colspan="2">${finalAmt}</td>
			</tr>

	</table>
	
	<a href="checkout.jsp">Place Order</a>
	<a href="logout">Logout</a>
</body>
</html>