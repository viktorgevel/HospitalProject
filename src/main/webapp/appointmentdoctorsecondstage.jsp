<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>To make an appointment to the doctor</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .body {
            background: rgba(0, 240, 0, 0.05);
        }
        .legend {
            border-bottom: solid;
            border-bottom-color: darkgreen;
            margin: 3%;
        }
    </style>
</head>
<body class="body">
<div class="col-md-3"></div>
<div class="col-md-6">
    <h3 align="center" class="legend">Запис до ${doctor.name}<br><br></h3>
    <form class="form-horizontal" role="form" action="appointmentdoctorsequel" method="post">
        <div class="form-group">
            <input type="hidden" name="selectdoctor" value="${doctor.idDoctor}">
        </div>
        <div class="form-group">
            <label for="inputDate" class="col-sm-3 control-label">Оберіть день</label>
            <div class="col-sm-9">
                <input type="date" class="form-control" name="calendar" id="inputDate" />
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-3 col-sm-9">
                <button type="submit" class="btn-lg btn-block btn-success">
                    Перейти до вибору часу прийому
                </button>
            </div>
        </div>
    </form>
</div>
<div class="col-md-3"></div>
</body>
</html>