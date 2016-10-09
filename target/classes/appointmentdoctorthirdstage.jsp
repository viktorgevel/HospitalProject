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
        .option {
            font: bold 170% djvu-sans;
        }
    </style>
</head>
<body class="body">
<div class="col-md-4"></div>
<div class="col-md-4">
    <h3 class="legend" align="center">Запис до ${doctor.name}<br><br></h3>
    <form class="form-horizontal" role="form" action="appointmentdoctorend" name="appointmentdoctorend" method="post">
        <div class="form-group">
            <input type="hidden" name="selectdoctor" value="${doctor.idDoctor}">
        </div>
        <div class="form-group">
            <input type="hidden" name="calendar" value="${calendar}">
        </div>
        <div class="form-group">
            <label for="selecttime" class="col-sm-3 control-label">Оберіть час</label>
            <div class="col-sm-9" id="selecttime">
                <select name="selecttime" class="form-control">
                    <option class="option">${doctorDay.firstTime}</option>
                    <option class="option">${doctorDay.secondTime}</option>
                    <option class="option">${doctorDay.thirdTime}</option>
                    <option class="option">${doctorDay.fourthTime}</option>
                    <option class="option">${doctorDay.fifthTime}</option>
                    <option class="option">${doctorDay.sixthTime}</option>
                    <option class="option">${doctorDay.seventhTime}</option>
                    <option class="option">${doctorDay.eighthTime}</option>
                    <option class="option">${doctorDay.ninthTime}</option>
                    <option class="option">${doctorDay.tenthTime}</option>
                    <option class="option">${doctorDay.eleventhTime}</option>
                    <option class="option">${doctorDay.twelfthTime}</option>
                    <option class="option">${doctorDay.thirteenthTime}</option>
                    <option class="option">${doctorDay.fourteenthTime}</option>
                    <option class="option">${doctorDay.fifteenthTime}</option>
                    <option class="option">${doctorDay.sixteenthTime}</option>
                    <option class="option">${doctorDay.seventeenthTime}</option>
                    <option class="option">${doctorDay.eighteenthTime}</option>
                    <option class="option">${doctorDay.nineteenthTime}</option>
                    <option class="option">${doctorDay.twentiethTime}</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-3 col-sm-9">
                <button type="submit" class="btn-lg btn-block btn-success">
                    Підтвердити запис на прийом до лікаря
                </button>
            </div>
        </div>
    </form>
</div>
<div class="col-md-4"></div>
</body>
</html>