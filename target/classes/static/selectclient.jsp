<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Select client to add new information</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form class="form-horizontal" role="form" action="generalbloodanalysisbegin"
      name="appointmentdoctorbegin" method="post">
    <div class="form-group">
        <label for="selectClientId" class="col-sm-3 control-label">
            Оберіть пацієнта
        </label>
        <div class="col-sm-6">
            <select id="selectClientId" name="selectclient" style="width: 100%; display: block;">
                <c:forEach items="${clients}" var="client">
                    <option><h4>${client.login}</h4></option>
                    <option disabled><h4>${client.name}</h4></option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-3 col-sm-6">
            <button type="submit" class="btn btn-default btn-block">
                Додати результати загального аналізу крові
            </button>
        </div>
    </div>
</form>
</body>
</html>