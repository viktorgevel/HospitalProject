<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Doctor's schedule</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <style>
        .datagrid {margin: 2%}
        .datagrid table { border-collapse: collapse; text-align: left; width: 96%; margin: 2%;}
        .datagrid {font: normal 10px/150% Arial, Helvetica, sans-serif; background: rgba(0, 255, 0, 0.05); overflow: hidden;
            border: 2px solid #36752D; -webkit-border-radius: 3px; -moz-border-radius: 3px; border-radius: 3px; }
        .datagrid table thead th {text-align: center; background:-webkit-gradient( linear, left top, left bottom,
        color-stop(0.05, #159401), color-stop(1, #107A00) );background:-moz-linear-gradient( center top, #159401 5%, #107A00 100% );
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#159401', endColorstr='#107A00');
            background-color:#159401; color:#FFFFFF; font-size: 20px; font-weight: bold; border-left: 1px solid #36752D; }
        .datagrid table tbody td { vertical-align: middle; background: #DFFFDE; color: #275420;
            border-left: 1px solid #C6FFC2;font-size: 15px;border-bottom: 3px solid #c5d1d7;font-weight: normal; }
    </style>
</head>
<body><br>
<h3 align="center" class="text-success">Робочий розклад ${doctor.name} (${doctor.firstMedicalSpecialization})</h3>
<div class="datagrid">
<table class="table">
    <thead>
    <tr>
        <th>День</th>
        <th>${doctor.firstTime}</th>
        <th>${doctor.secondTime}</th>
        <th>${doctor.thirdTime}</th>
        <th>${doctor.fourthTime}</th>
        <th>${doctor.fifthTime}</th>
        <th>${doctor.sixthTime}</th>
        <th>${doctor.seventhTime}</th>
        <th>${doctor.eighthTime}</th>
        <th>${doctor.ninthTime}</th>
        <th>${doctor.tenthTime}</th>
        <th>${doctor.eleventhTime}</th>
        <th>${doctor.twelfthTime}</th>
        <th>${doctor.thirteenthTime}</th>
        <th>${doctor.fourteenthTime}</th>
        <th>${doctor.fifteenthTime}</th>
        <th>${doctor.sixteenthTime}</th>
        <th>${doctor.seventeenthTime}</th>
        <th>${doctor.eighteenthTime}</th>
        <th>${doctor.nineteenthTime}</th>
        <th>${doctor.twentiethTime}</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${workingDays}" var="workingDay">
        <tr>
            <td><h4 align="center"><fmt:formatDate value="${workingDay.date}" pattern="yyyy-MM-dd"/></h4></td>
            <td>${workingDay.firstTimeClient}</td>
            <td>${workingDay.secondTimeClient}</td>
            <td>${workingDay.thirdTimeClient}</td>
            <td>${workingDay.fourthTimeClient}</td>
            <td>${workingDay.fifthTimeClient}</td>
            <td>${workingDay.sixthTimeClient}</td>
            <td>${workingDay.seventhTimeClient}</td>
            <td>${workingDay.eighthTimeClient}</td>
            <td>${workingDay.ninthTimeClient}</td>
            <td>${workingDay.tenthTimeClient}</td>
            <td>${workingDay.eleventhTimeClient}</td>
            <td>${workingDay.twelfthTimeClient}</td>
            <td>${workingDay.thirteenthTimeClient}</td>
            <td>${workingDay.fourteenthTimeClient}</td>
            <td>${workingDay.fifteenthTimeClient}</td>
            <td>${workingDay.sixteenthTimeClient}</td>
            <td>${workingDay.seventeenthTimeClient}</td>
            <td>${workingDay.eighteenthTimeClient}</td>
            <td>${workingDay.nineteenthTimeClient}</td>
            <td>${workingDay.twentiethTimeClient}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>

<script>
    var empty=[];
    var tr =$('table tr');
    tr.each(function(i){
        $(this).children().each(function(j){
            empty[j]=empty[j] || $(this).html().length;
        })
    });
    tr.each(function(i){
        $(this).children().each(function(j){
            if (!empty[j]) $(this).remove();
        })
    });
</script>
</body>
</html>