<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Hospital index page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .col-md-5 {padding: 35px;}
    </style>
</head>
<body>
<div class="container-fluid">

    <div class="row">
        <div class="col-md-12">
            <div class="jumbotron well text-center">
                <h2>
                    This site clinic, written for the purpose of advertising
                </h2>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-2" >
            <sec:authorize access="!isAuthenticated()">
                <p><a class="btn btn-lg btn-success btn-block" href="<c:url value="/login" />" role="button">Увійти</a></p>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <div class="row">
                <h4>Ваш логін: <sec:authentication property="principal.username" /></h4></div>
                <div class="row"><a class="btn btn-default btn-block" href="<c:url value="/home" />" role="button">Особиста сторінка</a></div>
                <div class="row"><a class="btn btn-default btn-block" href="<c:url value="/logout" />" role="button">Вийти</a></div>
            </sec:authorize>
            <div class="row">
                <a href="appointmentdoctorfirststage" class="btn btn-default btn-block">
                    Записатися на прийом
                </a>
            </div>

            <div class="row">
                <style>
                    #calendar2 {
                        width: 100%;
                        font: monospace;
                        line-height: 1.2em;
                        font-size: 15px;
                        text-align: center;
                    }
                    #calendar2 thead tr:last-child {
                        font-size: small;
                        color: rgb(85, 85, 85);
                    }
                    #calendar2 thead tr:nth-child(1) td:nth-child(2) {
                        color: rgb(50, 50, 50);
                    }
                    #calendar2 thead tr:nth-child(1) td:nth-child(1):hover, #calendar2 thead tr:nth-child(1) td:nth-child(3):hover {
                        cursor: pointer;
                    }
                    #calendar2 tbody td {
                        color: rgb(44, 86, 122);
                    }
                    #calendar2 tbody td:nth-child(n+6), #calendar2 .holiday {
                        color: rgb(231, 125, 6);
                    }
                    #calendar2 tbody td.today {
                        background: rgb(102, 220, 46);
                        color: #fff;
                    }
                </style>
                <br><br>
                <table id="calendar2">
                    <thead>
                    <tr><td>‹<td colspan="5"><td>›
                    <tr><td>Пн<td>Вт<td>Ср<td>Чт<td>Пт<td>Сб<td>Вс
                    <tbody>
                </table>
            </div>
        </div>

        <div class="col-md-5">
            <h3 align="center">
                Лікарі нашої поліклініки
            </h3>
            <table class="table">
                <thead>
                <tr>
                    <th>Прізвище, ім'я, по батькові</th>
                    <th>Медична спеціалізація</th>
                    <th>Інформація про лікаря</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${doctors}" var="doctor">
                    <tr>
                        <td>${doctor.name}</td>
                        <td>${doctor.firstMedicalSpecialization}</td>
                        <td>${doctor.shortInformation}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="col-md-5">
            <h1 class="text-center text-success">
                Here will be a cats
            </h1>
        </div>
    </div>
</div>


<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
    <script>
        function Calendar2(id, year, month) {
            var Dlast = new Date(year,month+1,0).getDate(),
                    D = new Date(year,month,Dlast),
                    DNlast = new Date(D.getFullYear(),D.getMonth(),Dlast).getDay(),
                    DNfirst = new Date(D.getFullYear(),D.getMonth(),1).getDay(),
                    calendar = '<tr>',
                    month=["Січень","Лютий","Березень","Квітень","Травень","Червень","Липень","Серпень","Вересень","Жовтень","Листопад","Грудень"];
            if (DNfirst != 0) {
                for(var  i = 1; i < DNfirst; i++) calendar += '<td>';
            }else{
                for(var  i = 0; i < 6; i++) calendar += '<td>';
            }
            for(var  i = 1; i <= Dlast; i++) {
                if (i == new Date().getDate() && D.getFullYear() == new Date().getFullYear() && D.getMonth() == new Date().getMonth()) {
                    calendar += '<td class="today">' + i;
                }else{
                    calendar += '<td>' + i;
                }
                if (new Date(D.getFullYear(),D.getMonth(),i).getDay() == 0) {
                    calendar += '<tr>';
                }
            }
            for(var  i = DNlast; i < 7; i++) calendar += '<td>&nbsp;';
            document.querySelector('#'+id+' tbody').innerHTML = calendar;
            document.querySelector('#'+id+' thead td:nth-child(2)').innerHTML = month[D.getMonth()] +' '+ D.getFullYear();
            document.querySelector('#'+id+' thead td:nth-child(2)').dataset.month = D.getMonth();
            document.querySelector('#'+id+' thead td:nth-child(2)').dataset.year = D.getFullYear();
            if (document.querySelectorAll('#'+id+' tbody tr').length < 6) {
                document.querySelector('#'+id+' tbody').innerHTML += '<tr><td>&nbsp;<td>&nbsp;<td>&nbsp;<td>&nbsp;<td>&nbsp;<td>&nbsp;<td>&nbsp;';
            }
        }
        Calendar2("calendar2", new Date().getFullYear(), new Date().getMonth());
        // перемикач мінус місяць
        document.querySelector('#calendar2 thead tr:nth-child(1) td:nth-child(1)').onclick = function() {
            Calendar2("calendar2", document.querySelector('#calendar2 thead td:nth-child(2)').dataset.year, parseFloat(document.querySelector('#calendar2 thead td:nth-child(2)').dataset.month)-1);
        }
        // перемикач плюс місяць
        document.querySelector('#calendar2 thead tr:nth-child(1) td:nth-child(3)').onclick = function() {
            Calendar2("calendar2", document.querySelector('#calendar2 thead td:nth-child(2)').dataset.year, parseFloat(document.querySelector('#calendar2 thead td:nth-child(2)').dataset.month)+1);
        }
    </script>


</body>
</html>