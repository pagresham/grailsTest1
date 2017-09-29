<html>
<head>
    <title>Login</title>
    <meta charset="UTF-8">
    <meta name="layout" content="user">
<body>
    <div>
        <div class="well">
            <h2>Choose user to authinticate as...</h2>
            <g:form controller="user" action="login" method="post">
                <g:select name="userLogin"
                          from="${users}"
                          optionKey="id"/>
                <g:actionSubmit action="logMe" class="btn btn-info btn-sm" value="Login!"/>
            </g:form>

        </div>
    </div>
</body>
</html>