<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="addnew" method="post">
		Student ID : <input type="number" name="id">
		<br>
		Student First Name : <input type="text" name="fname">
		<br>
		Student Last Name : <input type="text" name="lname">
		<br>
		Student DOB : <input type="date" name="dob">
		<br>
		Student Email : <input type="text" name="email">
		<br>
		<button>Submit</button>
	</form>

</body>
</html>