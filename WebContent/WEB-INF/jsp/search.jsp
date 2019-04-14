<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}
th, td {
	padding: 15px;
	text-align: left;
}
table#t01 {
	width: 100%;
	background-color: #0ce2f1;
}
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #030303;
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
	background-color: rgb(240, 104, 25);
}
</style>
</head>
<ul>
	<li style="float: center"><a href="index.html" class="active">Home</a>
	</li>
	<li style="float: center"><a href="account.html" class="active">New
			Account</a></li>
	<li style="float: center"><a href="withdraw.html" class="active">Withdraw</a>
	</li>
	<li style="float: center"><a href="deposit.html" class="active">Deposit</a>
	</li>
	<li style="float: center"><a href="fundtransfer.html"
		class="active">Fund Transfer</a></li>
	<li style="float: center"><a href="checkbalance.html"
		class="active">Check Balance</a></li>
	<li style="float: center"><a href="searchaccount.html">Search
			Account</a></li>
	<li style="float: center"><a href="getAllBankAccounts.jsp"
		class="active">Account Details</a></li>
	<li style="float: center"><a href="deleteaccount.html">Delete
			Details</a></li>
	<li style="float: center"><a href="updatedetails.html">Update
			Details</a></li>

</ul>

<body>

	<h2>Customer Details</h2>



	<table id="t02">
		<thead>
			<tr>
				<th>Account Number</th>
				<th>Customer Name</th>
				<th>Type</th>
				<th>Balance</th>
			</tr>
		</thead>
		<tbody>

			<tr>
				<td>${service.accountId}</td>
				<td>${accounts.accountType}</td>
				<td>${accounts.accountHolderName}</td>
				<td>${accounts.accountBalance}</td>
			</tr>


		</tbody>

	</table>

</body>
</html>