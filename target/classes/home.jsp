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
        .datagrid table { border-collapse: collapse; text-align: left; width: 100%; }
        .datagrid table thead th {background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, rgba(54, 117, 45, 0.9)), color-stop(1, rgba(39, 84, 32, 0.9)) );
            background-color:#36752D; color:#FFFFFF; font-size: 18px; font-weight: bold; border-left: 1px solid #36752D; text-align: center; }
        .datagrid table thead th:first-child { border: none; }
        .datagrid table tbody td { background: rgba(7, 195, 0, 0.1); color: #275420;; border-left: 1px solid #C6FFC2;font-size: 18px;font-weight: normal; }
        .datagrid table tbody tr:last-child td { border-bottom: none; }
        .datagrid {padding-right: 3%;}
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
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
        </div>
    </div>
</div>
</body>
</html>