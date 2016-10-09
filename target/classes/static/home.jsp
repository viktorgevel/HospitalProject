<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Client's home page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .col-md-6 {padding: 35px;}
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="jumbotron">
                <h2 align="center">
                    Ваша особиста сторінка
                </h2>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <h3 align="center">Заплановані візити до лікаря</h3>
                    <table class="table" style="margin: 30px">
                        <thead>
                        <tr>
                            <th>Дата</th>
                            <th>Час</th>
                            <th>Лікар</th>
                        </tr>
                        </thead>
                        <tbody>
                        <c:forEach items="${visits}" var="visit">
                            <tr>
                                <td>${visit.visitDate}</td>
                                <td>${visit.visitTime}</td>
                                <td>${visit.doctorName}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                </div>
                <div class="col-md-6">
                    <div class="row">
                    <a href="generalbloodanalysisresults" class="btn btn-default btn-block"><h3>Переглянути результати аналізів</h3></a></div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>