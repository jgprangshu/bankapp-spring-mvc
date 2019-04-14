<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/bankapp-spring-mvc/app/mumbaibank/fundtransfer" method="post">
	<marquee><h1>Transfer Amount</h1></marquee>
	Sender's Account Id :<input type="number" name="senderAccountId" /> <br>
	Reciever's Account Id :<input type="number" name="RecieverAccountId" /> <br>
	Amount : <input type="number" name="amount" /> <br>
	
	<input type="submit" value="Transfer" />
	</form>
	

</body>
</html>