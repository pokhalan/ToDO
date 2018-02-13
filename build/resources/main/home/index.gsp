<html>
<head>
    <meta name="layout" content="headerAndFooter"/>
    <title>ToDo</title>
</head>
<body>
<g:form controller ="home" action="save">
<div class="form-group">
    <h1>To-Do <small>List</small></h1>

        <input type="text" class="form-control" placeholder="Your Task" name="content">
</div>
        <button type="submit" class="btn btn btn-primary">Add</button>
</g:form>
<g:if test="${tasksList}">
    <table class="table table-striped">
        <g:each in="${tasksList}" var="show">
            <tr>

                <td>${show.content} </td>
                <td><button type="submit"  class="btn btn btn-primary">Done</button></td>

            </tr>
        </g:each>
    </table>
</g:if>
</body>
</html>