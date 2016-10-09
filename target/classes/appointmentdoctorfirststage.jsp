<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

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
        .disabledoption {
            background: forestgreen;
            font: bold 170% djvu-sans;
            color: white;
        }
        .option {
            font: bold 170% djvu-sans;
        }
        .form-control {
            background: rgba(0, 240, 0, 0.1);
        }
        .legend {
            border-bottom: solid;
            border-bottom-color: darkgreen;
            margin-bottom: 3%;
        }
        .datagrid table { border-collapse: collapse; text-align: center; width: 100%; margin-top: 3%}
        .datagrid table thead th {background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, rgba(61, 180, 52, 0.9)), color-stop(1, rgba(47, 155, 40, 0.9)) );
            background-color:#36752D; color:#FFFFFF; font-size: 18px; font-weight: bold; border: 1px solid #43b93a; text-align: center; }
        .datagrid table tbody td { background: rgba(7, 195, 0, 0.1); color: #275420;border-right: 1px solid #00b400; border-left: 1px solid #00b400;font-size: 18px;font-weight: normal; }
        .datagrid table tbody tr:last-child td { border-bottom: 1px solid #43b93a; }
        .datagrid {margin-top: 1%;}
    </style>
</head>
<body class="body">
<div class="container-fluid">
    <div class="row">
        <div class="row">
            <div class="col-md-2"></div>

            <div class="col-md-8 datagrid">
                <h3 align="center" class="legend">Оберіть лікаря зі списку<br><br></h3>
                <form class="form-horizontal" role="form" action="appointmentdoctorbegin"
                      name="appointmentdoctorbegin" method="post">
                    <div class="form-group">
                        <label for="selectDoctorId" class="col-sm-3 control-label">
                            Номер лікаря
                        </label>
                        <div class="col-sm-6">
                            <select class="form-control" id="selectDoctorId" name="selectdoctor">
                                <c:forEach items="${doctors}" var="doctor">
                                    <option class="option">${doctor.idDoctor}</option>
                                    <option disabled class="disabledoption">${doctor.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-6">
                            <button type="submit" class="btn-lg btn-success btn-block">
                                Перейти до вибору дня прийому
                            </button>
                        </div>
                    </div>
                </form>

                <table class="table">
                    <thead>
                    <tr>
                        <th>Номер в реєстрі</th>
                        <th>Прізвище, ім'я, по батькові</th>
                        <th>Вік, років</th>
                        <th>Стать</th>
                        <th>Медична спеціалізація</th>
                        <th>Неосновна медична спеціалізація</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${doctors}" var="doctor">
                        <tr>
                            <td>${doctor.idDoctor}</td>
                            <td>${doctor.name}</td>
                            <td>${doctor.age}</td>
                            <td>${doctor.sex}</td>
                            <td>${doctor.firstMedicalSpecialization}</td>
                            <td>${doctor.secondMedicalSpecialization}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>

        <div class="col-md-2"></div>
    </div>
</div>
</body>
</html>