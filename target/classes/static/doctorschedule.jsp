<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Doctor's schedule</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="jumbotron well text-center">
    <h2>Робочий розклад ${doctor.name} (${doctor.firstMedicalSpecialization})</h2>
</div>
<table class="table">
    <thead>
    <tr>
        <th><h4 align="center">День</h4></th>
        <th><h4 align="center">${doctor.firstTime}</h4></th>
        <th><h4 align="center">${doctor.secondTime}</h4></th>
        <th><h4 align="center">${doctor.thirdTime}</h4></th>
        <th><h4 align="center">${doctor.fourthTime}</h4></th>
        <th><h4 align="center">${doctor.fifthTime}</h4></th>
        <th><h4 align="center">${doctor.sixthTime}</h4></th>
        <th><h4 align="center">${doctor.seventhTime}</h4></th>
        <th><h4 align="center">${doctor.eighthTime}</h4></th>
        <th><h4 align="center">${doctor.ninthTime}</h4></th>
        <th><h4 align="center">${doctor.tenthTime}</h4></th>
        <th><h4 align="center">${doctor.eleventhTime}</h4></th>
        <th><h4 align="center">${doctor.twelfthTime}</h4></th>
        <th><h4 align="center">${doctor.thirteenthTime}</h4></th>
        <th><h4 align="center">${doctor.fourteenthTime}</h4></th>
        <th><h4 align="center">${doctor.fifteenthTime}</h4></th>
        <th><h4 align="center">${doctor.sixteenthTime}</h4></th>
        <th><h4 align="center">${doctor.seventeenthTime}</h4></th>
        <th><h4 align="center">${doctor.eighteenthTime}</h4></th>
        <th><h4 align="center">${doctor.nineteenthTime}</h4></th>
        <th><h4 align="center">${doctor.twentiethTime}</h4></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${workingDays}" var="workingDay">
        <tr>

            <td><h4 align="center"><fmt:formatDate value="${workingDay.date}" pattern="yyyy-MM-dd"/></h4></td>
            <td><h5>${workingDay.firstTimeClient}</h5></td>
            <td><h5>${workingDay.secondTimeClient}</h5></td>
            <td><h5>${workingDay.thirdTimeClient}</h5></td>
            <td><h5>${workingDay.fourthTimeClient}</h5></td>
            <td><h5>${workingDay.fifthTimeClient}</h5></td>
            <td><h5>${workingDay.sixthTimeClient}</h5></td>
            <td><h5>${workingDay.seventhTimeClient}</h5></td>
            <td><h5>${workingDay.eighthTimeClient}</h5></td>
            <td><h5>${workingDay.ninthTimeClient}</h5></td>
            <td><h5>${workingDay.tenthTimeClient}</h5></td>
            <td><h5>${workingDay.eleventhTimeClient}</h5></td>
            <td><h5>${workingDay.twelfthTimeClient}</h5></td>
            <td><h5>${workingDay.thirteenthTimeClient}</h5></td>
            <td><h5>${workingDay.fourteenthTimeClient}</h5></td>
            <td><h5>${workingDay.fifteenthTimeClient}</h5></td>
            <td><h5>${workingDay.sixteenthTimeClient}</h5></td>
            <td><h5>${workingDay.seventeenthTimeClient}</h5></td>
            <td><h5>${workingDay.eighteenthTimeClient}</h5></td>
            <td><h5>${workingDay.nineteenthTimeClient}</h5></td>
            <td><h5>${workingDay.twentiethTimeClient}</h5></td>
        </tr>
    </c:forEach>
    </tbody>
</table>




</body>
</html>