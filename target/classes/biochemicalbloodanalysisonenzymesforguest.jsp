<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Biochemical blood analysis on enzymes for guest</title>
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
        <td>${amylase}</td>
        <td>${bloodTest.indexAmylase}</td>
        <td>${bloodTest.assessmentAmylase}</td>
    </tr>
    <tr>
        <td>${lipase}</td>
        <td>${bloodTest.indexLipase}</td>
        <td>${bloodTest.assessmentLipase}</td>
    </tr>
    <tr>
        <td>${lactateDehydrogenase}</td>
        <td>${bloodTest.indexLactateDehydrogenase}</td>
        <td>${bloodTest.assessmentLactateDehydrogenase}</td>
    </tr>
    <tr>
        <td>${alanineAminotransferase}</td>
        <td>${bloodTest.indexAlanineAminotransferase}</td>
        <td>${bloodTest.assessmentAlanineAminotransferase}</td>
    </tr>
    <tr>
        <td>${aspartateAminotransferase}</td>
        <td>${bloodTest.indexAspartateAminotransferase}</td>
        <td>${bloodTest.assessmentAspartateAminotransferase}</td>
    </tr>
    <tr>
        <td>${alkalinePhosphatase}</td>
        <td>${bloodTest.indexAlkalinePhosphatase}</td>
        <td>${bloodTest.assessmentAlkalinePhosphatase}</td>
    </tr>
    </tbody>
</table>
<br><br>
<script type="text/javascript">
    $("#maintable td").each(function(){
        if($(this).text()==="Норма") {$(this).addClass("success")}
        else if($(this).text()==="Вище норми") {$(this).addClass("danger")}
        else if($(this).text()==="Нижче норми") {$(this).addClass("danger")}
        else if($(this).text()==="${amylase}") {$(this).addClass("active")}
        else if($(this).text()==="${lipase}") {$(this).addClass("active")}
        else if($(this).text()==="${lactateDehydrogenase}") {$(this).addClass("active")}
        else if($(this).text()==="${alanineAminotransferase}") {$(this).addClass("active")}
        else if($(this).text()==="${aspartateAminotransferase}") {$(this).addClass("active")}
        else if($(this).text()==="${alkalinePhosphatase}") {$(this).addClass("active")}
        else if($(this).text()!==""){$(this).addClass("warning")}
        else {$(this).addClass("success")}
    });
</script>
</body>
</html>