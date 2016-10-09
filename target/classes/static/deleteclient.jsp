<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Delete Client</title>
<    <link href="css/bootstrap.min.css" rel="stylesheet"/>
    <style>
        .form-horizontal {
            margin-top: 30px;
        }
    </style>
</head>
<body>
<form class="form-horizontal" role="form" action="deletesomeclient" method="post">
    <div class="form-group">

        <label for="idClient" class="col-sm-2 control-label">
            Лікар
        </label>
        <div class="col-sm-10">
            <select id="idClient" name="deleteClientId" style="width: 30%; display: block;">
                <c:forEach items="${clients}" var="client">
                    <option><h4>${client.idClient}</h4></option>
                    <option disabled><h4>${client.name}</h4></option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">

            <button type="submit" class="btn btn-default btn-block" style="width: 30%;">
                Видалити запис про клієнта
            </button>
        </div>
    </div>
</form>
</body>
</html>