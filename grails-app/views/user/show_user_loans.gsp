<html>
<head>
    <title>Show User Loans</title>
    <meta charset="UTF-8">
    <meta name="layout" content="user">
</head>
<body>
<div>
    <div>
        <div class="userInfo">
            <h2>Viewing loans for ${username}</h2>
        </div>
        <table>
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
    <div class="addUser">
        <g:link class="btn btn-info" action="addloan" controller="user" id="${userid}">Add Loan</g:link>
    </div>
</div>

</body>
</html>