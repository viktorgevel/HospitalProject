<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Select client to add new information</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .body {
            background: rgba(255, 255, 0, 0.1);
        }
        .form-horizontal {
            margin-top: 50px;
        }
        .disabledoption {
            background: #ff8a00;
            font: bold 170% djvu-sans;
            color: white;
        }
        .option {
            font: bold 170% djvu-sans;
        }
        .form-control {
            background: rgba(255, 255, 0, 0.35);
        }
    </style>
</head>
<body class="body">
<div class="col-sm-4"></div><div class="col-sm-4">
<form class="form-horizontal" role="form" action="generalbloodanalysisbegin"
      name="appointmentdoctorbegin" method="post">
    <div class="form-group">
        <label for="selectClientId" class="col-sm-6 control-label">
            Оберіть пацієнта
        </label>
        <div class="col-sm-6">
            <select class="form-control" id="selectClientId" name="selectclient" style="width: 100%; display: block;">
                <c:forEach items="${clients}" var="client">
                    <option class="option">${client.login}</option>
                    <option disabled class="disabledoption">${client.name}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-6 col-sm-6">
            <button type="submit" class="btn-lg btn-block btn-warning">
                Додати результати загального аналізу крові
            </button>
        </div>
    </div>
</form>
</div><div class="col-sm-4"></div>
</body>
</html>