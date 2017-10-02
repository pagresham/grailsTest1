<html xmlns:g="http://www.w3.org/1999/html">
<head>
    <%
    def num = 500

    %>
    <title>Show Shapes</title>
    <meta charset="UTF-8">
    <meta name="layout" content="user">
    <style>
        .box {
            height: ${num}px;
            width: 100%;
            background-color: #ccc;
            padding: 2em;
            text-align: center;
        }
        #square {
            padding: 1em;
            border: 1px solid black;
            height: ${sq.height}px;
            width: ${sq.width}px;
            background-color: ${sq.color};
        }
        #circle {
            padding: 1em;
            border: 1px solid black;
            border-radius: 50%;
            width: ${cr.diameter}px;
            height: ${cr.diameter}px;
            background-color: ${cr.color};
        }
        .box div {
            margin-top: 2em;
        }

        .arrow-up {
          width: 0;
          height: 0;
          border-left: 50px solid transparent;
          border-right: 50px solid transparent;

          border-bottom: 50px solid rgba(100, 100, 100, .5);
        }
    </style>
</head>
<body>
<div>

        <h3>View your shapes!</h3>
    <g:form action="index" controller="shapes">
        <label for="height">Height:</label>
        <input id="height" type="number" min="100" max="500" name="height"/>
        <label for="width">Width:</label>
        <input id="width" type="number" min="100" max="500" name="width"/>
        <label for="color">Color:</label>
        <g:select name="color"
                  id="color"
                  from="${colors}"
                  value="${color}"
                  optionKey="${color}"
        />





        <g:actionSubmit value="Submit" action="index" controller="shapes"/>
    </g:form>
    <div class="box">
        <div id="square"></div>
        <div id="circle"></div>
        <div class="arrow-up">here</div>
    </div>






</div>

</body>
</html>