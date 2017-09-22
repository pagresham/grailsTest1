<html>
<head>
    <title>Add Users</title>
    <meta charset="UTF-8">
    <meta name="layout" content="user">
</head>
<body>
<div>

    <div class="userInputForm">
        <h2><b>Add New Users</b></h2>
        <g:form action="adduser" controller="user">
            <p>
                <label for="fname">First Name:</label>
                <input class="form-control user" type="text" name="fname">
            </p>
            <p>
                <label for="lname">Last Name:</label>
                <input class="form-control user" type="text" name="lname">
            </p>
            <p>
                <label for="birthday">Birthday:</label>
                <input class="form-control user" type="date" name="birthday">
            </p>
            <p>

            </p>
        </g:form>
    </div>
    <div class="addUser">
        <g:link class="btn btn-info" action="addnewuser" controller="user">Enter New User</g:link>
    </div>
</div>

</body>
</html>