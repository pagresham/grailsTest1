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
                <input id="fname" class="form-control defInputs" type="text" name="fname">
            </p>
            <p>
                <label for="lname">Last Name:</label>
                <input id="lname" class="form-control defInputs" type="text" name="lname">
            </p>
            <p>
                <label for="birthday">Birthday:</label>
                <input id="birthday" class="form-control defInputs" type="date" name="birthday">
            </p>
            <p>

            </p>

            <div class="addUser">
                <g:actionSubmit class="btn btn-info" value="Submit" action="addnewuser"/>
            </div>
        </g:form>
        <div>
            <p class="errorText">${params.error_message}</p>
            %{--<p class="errorText">Default message</p>--}%
        </div>
    </div>

</div>

</body>
</html>