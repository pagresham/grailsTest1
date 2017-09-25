<html>
<head>
    <title>Show Users</title>
    <meta charset="UTF-8">
    <meta name="layout" content="user">
</head>
<body>
<div>
    <h2>View All Loans</h2>
    <div>
        <table>
            <tr><th>Loan Owner</th><th>Lender Name</th><th>Loan Type</th><th>Loan Number</th><th>Loan Balance</th></tr>
            <g:each var="loan" in="${loans}">
                <tr>
                    <td>${loan.user.fname} ${loan.user.lname}</td>
                    <td>${loan.lenderName}</td>
                    <td>${loan.loanType}</td>
                    <td>${loan.loanNumber}</td>
                    <td>$${loan.balance}.00</td>
                </tr>
            </g:each>
        </table>
    </div>

</div>

</body>
</html>