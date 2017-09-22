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
        <h1>Add a new Message</h1>
        <div style="padding: 1em">
            <g:form method="post" url="[action: 'addmessage', controller: 'messages']" >
                <p><label>Author</label>
                    <input class="form-control" type="text" name="author"></p>
                <p><label>Message</label>
                <input  class="form-control" type="text" name="message"></p>
                <button  class="btn btn-info" type="submit">Add Your Message</button>
            </g:form>
            
        </div>
    </body>
</html>
