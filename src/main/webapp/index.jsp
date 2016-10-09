<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <title>Hospital index page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        html,
        body {
            height: 100%;
            background-color: rgba(84, 123, 185, 0.05);
        }
        .jumbotron{
            background: rgba(0, 100, 0, 0.26);
        }
        .wrapper {
            display: flex;
            flex-direction: column;
            height: 100%;
            min-width: 480px;
            max-width: 70%;
            margin:0 auto;
        }
        .content {
            flex: 1 0 auto;
        }
        .footer {
            flex: 0 0 auto;
            background-color: rgba(84, 123, 185, 0.15);
            padding-top: 2%;
            padding-bottom: 1.5%;
        }
        .leftofpage {}
        .centerofpage {
            margin-top: 0.5%;
            background-color: rgba(0, 128, 0, 0.1);
            border-radius: 20px;
        }
        .rightofpage {
            padding: 1%;
        }
        h4{
            padding: 2%;
            text-align: center;
        }
        .btn-home {
            color: #f8f8f8;
            background-color: #4db251;
            border-color: #69af69;
            margin-bottom:0.5%;
        }
        .btn-appoint {
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            margin-bottom: 2%;
        }
        .header {
            color: #fff;
            background-color: rgba(66, 139, 202, 0.8);
            border-color: #357ebd;
        }
        .tablebody {
            color: #000000;
            background-color: rgba(66, 139, 202, 0.3);
            border-color: #357ebd;
        }
        .legend {
            border-bottom: solid;
            border-bottom-color: darkred;
        }
        .btn-general-blood {
            color: #fff;
            background-color: #d9534f;
            border-color: #d43f3a;
        }
        .btn-enzymes {
            color: #f8f8f8;
            background-color: rgba(75, 174, 79, 0.91);
            border-color: rgba(68, 157, 71, 0.9);
            margin-top:1%;
        }
        .btn-proteins {
            color: #f8f8f8;
            background-color: #4BAE4F;
            border-color: #579d57;
            margin-top:1%;
        }
        .btn-lipids {
            color: #f8f8f8;
            background-color: rgba(68, 135, 68, 0.91);
            border-color: rgba(65, 135, 69, 0.9);
            margin-top:1%;
        }
        .btn-minerals {
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            margin-top:1%;
        }
        img{
            margin-left: 1%;
        }
    </style>
</head>
<body>
<div class="wrapper">
    <div class = "content">
        <div class="jumbotron well text-center">
            <h2 class="text-success">Your health &ndash; our happiness</h2>
        </div>
        <div class="col-md-2 leftofpage" >
            <sec:authorize access="!isAuthenticated()">
                <br>
                <form action="<c:url value="/login" />">
                    <button type="submit" class='btn btn-lg btn-success btn-block'>
                        Увійти
                    </button>
                </form>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <div class="row">
                    <h4>Ваш логін: <sec:authentication property="principal.username" /></h4>
                </div>
                <form action="<c:url value="/home" />">
                    <button type="submit" class='btn-lg btn-block btn-home'>
                        Особиста сторінка
                    </button>
                </form>
                <form action="appointmentdoctorfirststage">
                    <button type="submit" class='btn-lg btn-block btn-appoint'>
                        Записатися на прийом
                    </button>
                </form>
                <form action="<c:url value="/logout" />">
                    <button type="submit" class='btn-lg btn-block'>
                        Вийти
                    </button>
                </form>
            </sec:authorize>


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

        <div class="col-md-6 centerofpage">
            <h3 align="center" class="text-success">Лікарі нашої поліклініки</h3>
            <table class="table">
                <thead class="header">
                <tr>
                    <th>Прізвище, ім'я, по батькові</th>
                    <th>Медична спеціалізація</th>
                    <th>Інформація про лікаря</th>
                </tr>
                </thead>
                <tbody class="tablebody">
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
        <div class="col-md-4 rightofpage">
            <h3 align="center" class="legend">Тут ви можете оцінити результати раніше проведених аналізів крові<br><br></h3>
            <form action="generalbloodanalysisinputdata.html"><button type="submit" class='btn-lg btn-block btn-general-blood'>
                Оцінювання результату загального аналізу крові</button></form>
            <form action="biochemicalbloodanalysisonenzymesinputdata.html"><button type="submit" class="btn-lg btn-block btn-enzymes">
                Оцінювання результату біохімічного аналізу крові на ферменти
                </button></form>
            <form action="biochemicalbloodanalysisonproteinsinputdata.html"><button type="submit" class="btn-lg btn-block btn-proteins">
                Оцінювання результату біохімічного аналізу крові на білки
                </button></form>
            <form action="biochemicalbloodanalysisonlipidsinputdata.html">
                <button type="submit" class="btn-lg btn-block btn-lipids">
                    Оцінювання результату біохімічного аналізу крові на ліпіди
                </button>
            </form>
            <form action="biochemicalbloodanalysisonmineralsinputdata.html">
                <button type="submit" class="btn-lg btn-block btn-minerals">Оцінювання результату аналізу крові на мінерали
                </button></form>
        </div>
</div>

<div class="footer" align="center">
    <a href="skype:viktorgevel?chat"><img src="images/skype.png" title="Write something to me"></a>
    <a href="https://www.facebook.com/viktor.gevel" title = "My page on facebook"><img src="images/facebook.png"></a>
    <a href="https://ua.linkedin.com/in/viktor-gevel-27917ba7" title = "My page on LinkedIn"><img src="images/linkedin.png"></a>
    <a href="https://github.com/viktorgevel" title="My profile on GitHub"><img src="images/github.png"></a>
</div>
</div>

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