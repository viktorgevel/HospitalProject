<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

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
                <div class="col-md-3">
                </div>
                <div class="col-md-6">
                    <h3 align="center">Запис до ${doctor.name}</h3>
                    <form class="form-horizontal" role="form" action="appointmentdoctorend" name="appointmentdoctorend" method="post">

                        <div class="form-group">
                            <input type="hidden" name="selectdoctor" value="${doctor.idDoctor}">
                        </div>

                        <div class="form-group">
                            <input type="hidden" name="calendar" value="${calendar}">
                        </div>

                        <div class="form-group">
                            <label for="selecttime" class="col-sm-3 control-label">
                                Оберіть час
                            </label>
                            <div class="col-sm-9" id="selecttime">
                                <select name="selecttime" style="width: 50%; display: block;">
                                    <option><h4>${doctorDay.firstTime}</h4></option>
                                    <option><h4>${doctorDay.secondTime}</h4></option>
                                    <option><h4>${doctorDay.thirdTime}</h4></option>
                                    <option><h4>${doctorDay.fourthTime}</h4></option>
                                    <option><h4>${doctorDay.fifthTime}</h4></option>
                                    <option><h4>${doctorDay.sixthTime}</h4></option>
                                    <option><h4>${doctorDay.seventhTime}</h4></option>
                                    <option><h4>${doctorDay.eighthTime}</h4></option>
                                    <option><h4>${doctorDay.ninthTime}</h4></option>
                                    <option><h4>${doctorDay.tenthTime}</h4></option>
                                    <option><h4>${doctorDay.eleventhTime}</h4></option>
                                    <option><h4>${doctorDay.twelfthTime}</h4></option>
                                    <option><h4>${doctorDay.thirteenthTime}</h4></option>
                                    <option><h4>${doctorDay.fourteenthTime}</h4></option>
                                    <option><h4>${doctorDay.fifteenthTime}</h4></option>
                                    <option><h4>${doctorDay.sixteenthTime}</h4></option>
                                    <option><h4>${doctorDay.seventeenthTime}</h4></option>
                                    <option><h4>${doctorDay.eighteenthTime}</h4></option>
                                    <option><h4>${doctorDay.nineteenthTime}</h4></option>
                                    <option><h4>${doctorDay.twentiethTime}</h4></option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-3 col-sm-9">
                                <button type="submit" class="btn btn-default btn-block">
                                    Підтвердити запис на прийом до лікаря
                                </button>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="col-md-3">
                </div>
            </div>

        <div class="col-md-1"></div>
    </div>
</div>
</body>
</html>