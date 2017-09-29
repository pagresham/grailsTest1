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
        <g:link class="btn btn-info btn-sm" action="adduser" controller="user">Add User</g:link>
    </div>
    <div class="user_select_grid">
        <table>

            <g:form action="show" controller="user" method="post">
            <tr>
                <td><label for="letter">Search by First Letter</label></td>
                <td><select id="letter" name="letter">
                    <g:each var="letter" in="${("A".."Z")}">
                        %{-- Did some sticky form fun here--}%
                        <g:if test="${letter == selLetter}">
                            <option value="${letter}" selected>${letter}</option>
                        </g:if>
                        <g:else>
                            <option value="${letter}">${letter}</option>
                        </g:else>
                    </g:each>
                </select></td>
                <td><g:actionSubmit class="btn btn-info btn-sm" value="Find Users By Letter" action="show"/></td>
            </tr>
            </g:form>


            <g:form action="show" controller="user" method="post">
                <tr>
                <td><label for="userName">Search by Name</label></td>
                <td><select id="userName" name="userID">
                    <option value="">All Users</option>
                    <g:each var="user" in="${allUsers}">

                        <g:if test="${Long.parseLong(selID) == user.id}">
                            <option value="${user.id}" selected>${user.fname} ${user.lname}</option>
                        </g:if>
                        <g:else >
                            <option value="${user.id}">${user.fname} ${user.lname}</option>
                        </g:else>

                    </g:each>
                </select></td>
                 <td><g:actionSubmit class="btn btn-info btn-sm" value="Find This User" action="show"/></td>
                </tr>
            </g:form>
            <tr><td></td><td></td><td><g:link action="show" class="btn btn-info btn-sm">All Users</g:link></td></tr>


        </table>
        <h3>Note the sticky form data in the above two fields</h3>
    </div>

</div>

</body>
</html>