<html>
<head>
    <title>
        db_fun
    </title>
    <meta name="layout" content="user"/>
</head>
<div class="main_content">

    <div>
        <h3>Here are the things...</h3>
        <table>
            <form method="post">
            <tr><th>ID</th><th>Name</th><th></th></tr>
            <g:each var="thing" in="${things}">
                <tr><td>${thing.good_things_id}</td><td>${thing.name}</td>
                    <td>
                        <g:link action="remove_thing" controller="extras" id="${thing.good_things_id}">Remove</g:link>
                    </td>
                </tr>
            </g:each>
            </form>
        </table>
    </div>
    <div>
        <form action="add_thing" contoller="extras" method="post">
            <h3>Add a new thing...</h3>
            <label>Name:</label>
            <g:field type="text" name="name"/>
            <g:actionSubmit class="btn btn-default btn-sm" action="add_thing" controller="extras" value="Add Thing"/>
        </form>
        <div>
            <p>Message:  ${addStatusMessage}</p>
        </div>
    </div>
</div>
</html>