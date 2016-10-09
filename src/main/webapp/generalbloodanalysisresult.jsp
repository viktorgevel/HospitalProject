<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Results of general blood analysis</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .datagrid table { border-collapse: collapse; text-align: left; width: 96%; margin: 2%;}
        .datagrid {font: normal 12px/150% Arial, Helvetica, sans-serif; background: #fff; overflow: hidden; border: 1px solid #991821;
            -webkit-border-radius: 3px; -moz-border-radius: 3px; border-radius: 3px; }
        .datagrid table td, .datagrid table th { padding: 3px 10px; }
        .datagrid table thead th {text-align:center; background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #991821),
        color-stop(1, #80141C) );background:-moz-linear-gradient( center top, #991821 5%, #80141C 100% );
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#991821', endColorstr='#80141C');background-color:#991821;
            color:#FFFFFF; font-size: 15px; font-weight: bold; border-left: 1px solid #B01C26; }
        .datagrid table tbody td { color: #80141C; border-left: 1px solid #F7CDCD;font-size: 15px;font-weight: normal; }
        .alt td { background: #F7CDCD; color: #80141C; }
        .datagrid table tbody td:first-child { border-left: none; }
        .datagrid table tbody tr:last-child td { border-bottom: none; }
    </style>
</head>
<body>
<h3 align="center" class="text-danger">Результати ваших загальних аналізів крові</h3>
<div class="container-fluid datagrid">
<table class="table table-striped">
    <thead>
    <tr>
        <th>День здачі аналізу</th>
        <th>Гемоглобін</th>
        <th>Еритроцити</th>
        <th>Гематокрит</th>
        <th>Середній вміст гемоглобіну в еритроциті</th>
        <th>Тромбоцити</th>
        <th>Лейкоцити</th>
        <th>Швидкість осідання еритроцитів</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${generalbloodtests}" var="generalbloodtest">
        <tr>
            <td>${generalbloodtest.testDate}</td>
            <td>${generalbloodtest.hemoglobin}</td>
            <td>${generalbloodtest.redBloodCell}</td>
            <td>${generalbloodtest.hematocrit}</td>
            <td>${generalbloodtest.meanCorpuscularHemoglobin}</td>
            <td>${generalbloodtest.platelet}</td>
            <td>${generalbloodtest.whiteBloodCell}</td>
            <td>${generalbloodtest.erythrocyteSedimentationRate}</td>
        </tr>
        <tr><td></td>
            <td>
                <c:choose>
                    <c:when test="${client.sex == \"Чоловік\" && generalbloodtest.hemoglobin <= 130.0}">Нижче норми</c:when>
                    <c:when test="${client.sex == \"Чоловік\" && generalbloodtest.hemoglobin >= 160.0}">Вище норми</c:when>
                    <c:when test="${client.sex == \"Жінка\" && generalbloodtest.hemoglobin <= 120.0}">Нижче норми</c:when>
                    <c:when test="${client.sex == \"Жінка\" && generalbloodtest.hemoglobin >= 140.0}">Вище норми</c:when>
                    <c:otherwise>Норма</c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${client.sex == \"Чоловік\" && generalbloodtest.redBloodCell <= 4.0}">Нижче норми</c:when>
                    <c:when test="${client.sex == \"Чоловік\" && generalbloodtest.redBloodCell >= 5.0}">Вище норми</c:when>
                    <c:when test="${client.sex == \"Жінка\" && generalbloodtest.redBloodCell <= 3.0}">Нижче норми</c:when>
                    <c:when test="${client.sex == \"Жінка\" && generalbloodtest.redBloodCell >= 4.7}">Вище норми</c:when>
                    <c:otherwise>Норма</c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${client.sex == \"Чоловік\" && generalbloodtest.hematocrit <= 37.0}">Нижче норми</c:when>
                    <c:when test="${client.sex == \"Чоловік\" && generalbloodtest.hematocrit >= 52.0}">Вище норми</c:when>
                    <c:when test="${client.sex == \"Жінка\" && generalbloodtest.hematocrit <= 35.0}">Нижче норми</c:when>
                    <c:when test="${client.sex == \"Жінка\" && generalbloodtest.hematocrit >= 48.0}">Вище норми</c:when>
                    <c:otherwise>Норма</c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${generalbloodtest.meanCorpuscularHemoglobin <= 27.0}">Нижче норми</c:when>
                    <c:when test="${generalbloodtest.meanCorpuscularHemoglobin >= 40.0}">Вище норми</c:when>
                    <c:otherwise>Норма</c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${generalbloodtest.platelet <= 150.0}">Нижче норми</c:when>
                    <c:when test="${generalbloodtest.platelet >= 400.0}">Вище норми</c:when>
                    <c:otherwise>Норма</c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${generalbloodtest.whiteBloodCell <= 4.0}">Нижче норми</c:when>
                    <c:when test="${generalbloodtest.whiteBloodCell >= 10.0}">Вище норми</c:when>
                    <c:otherwise>Норма</c:otherwise>
                </c:choose>
            </td>
            <td>
                <c:choose>
                    <c:when test="${generalbloodtest.erythrocyteSedimentationRate <= 2.0}">Нижче норми</c:when>
                    <c:when test="${generalbloodtest.erythrocyteSedimentationRate >= 15.0}">Вище норми</c:when>
                    <c:otherwise>Норма</c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>