<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <asset:stylesheet href="font-awesome.css"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>
<div id="wrap">
    <div id="main">
        <div class="navbar navbar-default navbar-static-top coloredNavs" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/#">
                        <i class="fa grails-icon">
                            %{--<asset:image src="grails-cupsonly-logo-white.svg"/>--}%
                        </i>$$ MVC Loan Demo $$
                    </a>
                </div>
                <div class="navbar-collapse collapse" aria-expanded="false" style="height: 1px;">
                    <ul class="nav navbar-nav navbar-right">
                        <g:pageProperty name="page.nav" />

                        <li><g:link controller="user" action="show">Loan Demo</g:link></li>

                        <li><g:link controller="shapes" action="index">Shapes</g:link></li>

                    </ul>
                </div>
            </div>
        </div>
        <g:render template="/templates/greetingTemplate" model="[loggedUser: loggedUser]"/>
        <g:layoutBody/>
    </div>
</div>

<div class="footer">

    <div class="navbar navbar-default navbar-static-bottom coloredNavs" role="navigation">

        <div class="container ">

            <div class="navbar-header ">
            </div>

            <div class="navbar-collapse collapse" aria-expanded="false" style="height: 1px;">

                <ul class="nav navbar-nav navbar-left">
                    <g:render template="/layouts/footerInfo"/>

                </ul>
                <ul class="nav navbar-nav navbar-right">


                </ul>
            </div>
        </div>

    </div>
</div>

<div id="spinner" class="spinner" style="display:none;">
    %{--<g:message code="spinner.alt" default="Loading&hellip;"/>--}%
</div>

<asset:javascript src="application.js"/>

</body>
</html>
