<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
		
	<form action="/bankapp-spring-mvc/app/mumbaibank/updatedetails" method="post">
	<marquee><h1>Update Details</h1></marquee>
	Account Id :<input type="number" name="accountId" /> <br>
	Updated Name :<input type="text" name="accountHolderName" /> <br>
	Account Type: <input type="text" name="accountType" /> <br>
	
	<input type="submit" value="Update Details" />
	</form>
	
</body>
</html>