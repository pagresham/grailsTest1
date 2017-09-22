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
            <tr><th>Lender Name</th><th>Loan Type</th><th>Start Date</th><th>Loan Number</th><th>Loan Balance</th></tr>
            <g:each var="loan" in="${loans}">
                <tr>
                    <td>${loan.lenderName} ${loan.loanType}</td><td>${loanstartDate.format( 'MM-dd-yyyy')}</td><td>${loan.loanNumber}</td><td>${loan.balance}</td>
                </tr>
            </g:each>
        </table>
    </div>

</div>

</body>
</html>