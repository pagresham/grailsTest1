<html>
<head>
    <title>Show Users</title>
    <meta charset="UTF-8">
    <meta name="layout" content="user">
</head>
<body>
<div>
    <h2>View All Users</h2>
    <div>
        <table>
            <tr><th>User ID</th><th>Name</th><th>Birthdate</th><th>View Loans</th></tr>
            <g:each var="user" in="${users}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.fname} ${user.lname}</td>
                    <td>${user.birthdate}</td>
                    <td class="loanLink"><g:link action="show_user_loans" id="${user.id}">Loans</g:link></td>
                </tr>
            </g:each>
        </table>
    </div>
    <div class="addUser">
        <g:link class="btn btn-info" action="adduser" controller="user">Add User</g:link>
    </div>
</div>

</body>
</html>