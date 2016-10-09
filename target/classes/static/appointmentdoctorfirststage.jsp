<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>To make an appointment to the doctor</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/bootstrap.min.js" type="text/javascript"> </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="row" style="margin: 30px">
            <div class="col-md-2"></div>

            <div class="col-md-8">
                <form class="form-horizontal" role="form" action="appointmentdoctorbegin"
                      name="appointmentdoctorbegin" method="post">
                    <div class="form-group">
                        <label for="selectDoctorId" class="col-sm-3 control-label">
                            Оберіть лікаря
                        </label>
                        <div class="col-sm-6">
                            <select id="selectDoctorId" name="selectdoctor" style="width: 100%; display: block;">
                                <option disabled>Оберіть лікаря</option>
                                <c:forEach items="${doctors}" var="doctor">
                                    <option><h4>${doctor.idDoctor}</h4></option>
                                    <option disabled><h4>${doctor.name}</h4></option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-6">
                            <button type="submit" class="btn btn-default btn-success btn-block">
                                Перейти до вибору дня прийому
                            </button>
                        </div>
                    </div>
                </form>

                <table class="table" style="margin: 30px">
                    <thead>
                    <tr>
                        <th>Номер в реєстрі</th>
                        <th>Прізвище, ім'я, по батькові</th>
                        <th>Вік</th>
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
</div>
</body>
</html>