<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Select doctor to see schedule</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form class="form-horizontal" role="form" action="seedoctorschedule" method="post">
    <div class="form-group">
        <label for="selectDoctorId" class="col-sm-3 control-label">
            Оберіть лікаря
        </label>
        <div class="col-sm-6">
            <select id="selectDoctorId" name="aSelectdoctor" style="width: 100%; display: block;">
                <c:forEach items="${doctors}" var="doctor">
                    <option><h4>${doctor.idDoctor}</h4></option>
                    <option disabled><h4>${doctor.name}</h4></option>
                </c:forEach>
            </select>
        </div>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-3 col-sm-6">
            <button type="submit" class="btn btn-default btn-block">
                Переглянути розклад лікаря
            </button>
        </div>
    </div>
</form>
</body>
</html>