<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <style>
         body {
      font-family: Arial, Helvetica, sans-serif;
      background-color: rgb(56, 129, 69);
  background-repeat: no-repeat;
  background-size: cover;
}
    }
        ul {
          list-style-type: none;
          margin: 0;
          padding: 0;
          overflow: hidden;
          background-color: rgb(14, 13, 13);
        }
        
        li {
          float: left;
        }
        
        li a {
          display: block;
          color: rgb(248, 224, 9);
          text-align: center;
          padding: 14px 16px;
          text-decoration: none;
        }
        
        li a:hover {
          background-color: rgb(240, 57, 25);
        }
        .active {
  background-color: rgb(10, 10, 10);
}
height: 100%;
  margin: 0;
}
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
        </style>
</head>
<body background="new.jpg">
    <ul>
        <li style="float:center"><a href="index.html" class="active">Home</a> </li>
        <li style="float:center"><a href="/bankapp-spring-mvc/app/mumbaibank/getaccount" >New Account</a> </li>
        <li style="float:center"><a href="/bankapp-spring-mvc/app/mumbaibank/withdrawform" >Withdraw</a> </li>
        <li style="float:center"><a href="/bankapp-spring-mvc/app/mumbaibank/depositmoney" >Deposit</a> </li>
        <li style="float:center"><a href="/bankapp-spring-mvc/app/mumbaibank/fundtransferinput" >Fund Transfer</a> </li>
        <li style="float:center"><a href="/bankapp-spring-mvc/app/mumbaibank/getbalanceinput" >Check Balance</a> </li>
        <li style="float:center"><a href="searchAllBankAccounts.html">Search Account</a> </li>
        <li style="float:center"><a href="getAllBankAccounts.do">Account Details</a></li>
        <li style="float:center"><a href="/bankapp-spring-mvc/app/mumbaibank/deleteaccount">Delete Details</a></li>
        <li style="float:center"><a href="/bankapp-spring-mvc/app/mumbaibank/updatedetailsinput">Update Details</a></li>
        
    </ul>
     <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br> <br>
    <div align="center">
            <div class="container">
  <div class="jumbotron">
    <h1>WELCOME TO UBANK</h1> 
  </div>
  
</div>
</div>
    
</body>
</html>