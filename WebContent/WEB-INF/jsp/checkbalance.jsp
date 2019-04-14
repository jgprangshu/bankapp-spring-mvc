<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/bankapp-spring-mvc/app/mumbaibank/check" method="post">
	<marquee><h1>Check Balance</h1></marquee>
	Enter Account Id :<input type="text" name="accountId" /> <br>
	
	<input type="submit" value="Check" />
	</form>
	
</body>
</html>