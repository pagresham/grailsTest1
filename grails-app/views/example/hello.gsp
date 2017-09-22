<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="layout" content="main">
        <title>Sample title</title>
        
    </head>
    <body>
        <h1>Here is the info in the response array</h1>
        <table><tr><th>Key</th><th>Value</th></tr>
        <g:each var="param" in="${params}">
            <tr>
                <td>${param.key}</td>
                <td>${param.value}</td>
            </tr>
        </g:each>
        </table>
        <h2>GForm</h2>
        <g:form class="well" url="[action: 'exampleform', controller: 'example']" method="post" name="exampleForm">
            Message:<input class="form-control" type="text" name="msg"><br>
            <button class="btn btn-success" type="submit">Submit</button>
            <!-- url="[action:'list',controller:'book']" // This is from the GPost -->
        
        </g:form>
    </body>
</html>
