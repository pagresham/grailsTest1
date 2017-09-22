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
        <h1>View All Messages</h1>
        <table><tr><th>Author</th><th>Message</th><th>Time Posted</th></tr>
            
        <g:each var="it" in="${messages}">
            <tr>
                <td>${it.author}</td>
                <td>${it.msg}</td>
                <td>${it.timePosted}</td>
            </tr>
        </g:each>
        </table>
        <g:link action="add" controller="messages" >Add a new Message!</g:link>
    </body>
</html>
