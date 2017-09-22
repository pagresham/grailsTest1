<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample title</title>
    </head>
    <body>
        <!-- Display the args sent in by respond -->

        <!-- Both ${} and <%= %> allows us to render info from the controller-->
        <h1>Endpoint: example/index</h1>
        <h2>Name: ${name} - ID: ${id}</h2>
        <g:each in="${values}">
            <p>${it}</p>
        </g:each>
        
        
    </body>
</html>
