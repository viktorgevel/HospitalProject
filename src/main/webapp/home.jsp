<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Client's home page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .jumbotron{
            background: rgba(0, 100, 0, 0.26);
        }
        .btn-success {
            height: 100%;
        }
        .datagrid table { border-collapse: collapse; text-align: left; width: 96%; margin: 2%;}
        .datagrid {font: normal 10px/150% Arial, Helvetica, sans-serif; background: rgba(0, 255, 0, 0.05); overflow: hidden;
            border: 2px solid #36752D; -webkit-border-radius: 3px; -moz-border-radius: 3px; border-radius: 3px; }
        .datagrid table thead th {text-align: center; background:-webkit-gradient( linear, left top, left bottom,
        color-stop(0.05, #159401), color-stop(1, #107A00) );background:-moz-linear-gradient( center top, #159401 5%, #107A00 100% );
            filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#159401', endColorstr='#107A00');
            background-color:#159401; color:#FFFFFF; font-size: 20px; font-weight: bold; border-left: 1px solid #36752D; }
        .datagrid table tbody td { vertical-align: middle; background: #DFFFDE; color: #275420;
            border-left: 1px solid #C6FFC2;font-size: 20px;border-bottom: 3px solid #c5d1d7;font-weight: normal; }
    </style>
</head>
<body>
            <div class="jumbotron well">
                <h2 align="center" class="text-success">
                    Ваша особиста сторінка
                </h2>
            </div>
            <div class="row">
                <div class="col-md-8 datagrid">
                    <h3 align="center" class="text-success">Заплановані візити до лікаря</h3>
                    <table class="table">
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
                <div class="col-md-4">
                    <form action="generalbloodanalysisresults">
                        <button type="submit" class="btn-lg btn-block btn-success">
                            Переглянути результати аналізів
                        </button>
                    </form>
                </div>
            </div>

</body>
</html>