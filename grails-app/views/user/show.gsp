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
            <tr><th>User ID</th><th>Name</th><th>Birthdate</th></tr>
            <g:each var="user" in="${users}">
                <tr>
                    <td>${user.id}</td><td>${user.fname} ${user.lname}</td><td>${user.birthdate.format( 'MM-dd-yyyy')}</td>
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