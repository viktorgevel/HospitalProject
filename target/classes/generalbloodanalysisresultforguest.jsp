<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Result of general blood analysis for guest</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .table {
            width: 95%;
            border: 1px solid seagreen;
            margin: auto;
        }
        thead {
            background: rgba(65, 105, 225, 0.30);
            border-bottom: 5px solid darkolivegreen;
        }
        th{
            text-align: center;
        }
        tr {
            border-bottom: 2px solid darkolivegreen;
        }

        td {
            text-align: justify;
        }
    </style>
    <script src="js/jquery.min.js"></script>
</head>
<body>
<br><br>
<table class="table" id = "maintable">
    <thead>
    <tr align="center">
        <th>Показник<br></th>
        <th>Оцінка значення показника</th>
        <th>Можливі причини відхилення значення показника від норми<br></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${hemoglobin}</td>
        <td>${bloodTest.indexHemoglobin}</td>
        <td>${bloodTest.assessmentHemoglobin}</td>
    </tr>
    <tr>
        <td>${redBloodCell}</td>
        <td>${bloodTest.indexRedBloodCell}</td>
        <td>${bloodTest.assessmentRedBloodCell}</td>
    </tr>
    <tr>
        <td>${hematocrit}</td>
        <td>${bloodTest.indexHematocrit}</td>
        <td>${bloodTest.assessmentHematocrit}</td>
    </tr>
    <tr>
        <td>${platelet}</td>
        <td>${bloodTest.indexPlatelet}</td>
        <td>${bloodTest.assessmentPlatelet}</td>
    </tr>
    <tr>
        <td>${whiteBloodCell}</td>
        <td>${bloodTest.indexWhiteBloodCell}</td>
        <td>${bloodTest.assessmentWhiteBloodCell}</td>
    </tr>
    <tr>
        <td>${erythrocyteSedimentationRate}</td>
        <td>${bloodTest.indexErythrocyteSedimentationRate}</td>
        <td>${bloodTest.assessmentErythrocyteSedimentationRate}</td>
    </tr>
    </tbody>
</table>
<br><br>
<script type="text/javascript">
    $("#maintable td").each(function(){
        if($(this).text()==="Норма") {$(this).addClass("success")}
        else if($(this).text()==="Вище норми") {$(this).addClass("danger")}
        else if($(this).text()==="Нижче норми") {$(this).addClass("danger")}
        else if($(this).text()==="Гемоглобін") {$(this).addClass("active")}
        else if($(this).text()==="Еритроцити") {$(this).addClass("active")}
        else if($(this).text()==="Гематокрит") {$(this).addClass("active")}
        else if($(this).text()==="Тромбоцити") {$(this).addClass("active")}
        else if($(this).text()==="Лейкоцити") {$(this).addClass("active")}
        else if($(this).text()==="Швидкість осідання еритроцитів") {$(this).addClass("active")}
        else if($(this).text()!==""){$(this).addClass("warning")}
        else {$(this).addClass("success")}
    });
</script>

</body>
</html>