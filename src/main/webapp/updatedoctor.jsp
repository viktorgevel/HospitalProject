<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add doctor</title>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
    <style>
        .row {
            margin-top: 2%;
        }
    </style>
</head>
<body>

<div class="col-md-3"></div>
<div class="col-md-6">
    <form class="form-horizontal" action="addworkingtime" method="POST">
        <div class="form-group">

            <div class="row">
            <div class="form-group">
                <label for="idDoctor" class="col-md-4 control-label">
                    Оберіть лікаря
                </label>
                <div class="col-md-6">
                    <select class="form-control" id="idDoctor" name="selectdoctor" style="width: 100%; display: block;">
                        <option disabled>Оберіть лікаря</option>
                        <c:forEach items="${doctors}" var="doctor">
                            <option><h4>${doctor.idDoctor}</h4></option>
                            <option disabled><h4>${doctor.name}</h4></option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            </div>

            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
            <label for="firstTime" class="col-md-6 control-label">First time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" required id="firstTime" placeholder="Час першого прийому" value="" name="aFirstTime">
            </div>
        </div>
        <div class="form-group">
            <label for="secondTime" class="col-md-6 control-label">Second time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="secondTime" placeholder="Час другого прийому" value="" name="aSecondTime">
            </div>
        </div>
        <div class="form-group">
            <label for="thirdTime" class="col-md-6 control-label">Third time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="thirdTime" placeholder="Час третього прийому" value="" name="aThirdTime">
            </div>
        </div>
        <div class="form-group">
            <label for="fourthTime" class="col-md-6 control-label">Fourth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="fourthTime" placeholder="Час четвертого прийому" value="" name="aFourthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="fifthTime" class="col-md-6 control-label">Fifth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="fifthTime" placeholder="Час п'ятого прийому" value="" name="aFifthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="sixthTime" class="col-md-6 control-label">Sixth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="sixthTime" placeholder="Час шостого прийому" value="" name="aSixthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="seventhTime" class="col-md-6 control-label">Seventh time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="seventhTime" placeholder="Час сьомого прийому" value="" name="aSeventhTime">
            </div>
        </div>
        <div class="form-group">
            <label for="eighthTime" class="col-md-6 control-label">Eighth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="eighthTime" placeholder="Час восьмого прийому" value="" name="aEighthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="ninthTime" class="col-md-6 control-label">Ninth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="ninthTime" placeholder="Час дев'ятого прийому" value="" name="aNinthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="tenthTime" class="col-md-6 control-label">Tenth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="tenthTime" placeholder="Час десятого прийому" value="" name="aTenthTime">
            </div>
        </div>
        </div>

        <div class="col-md-6">
        <div class="form-group">
            <label for="eleventhTime" class="col-md-6 control-label">Eleventh time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="eleventhTime" placeholder="Час одинадцятого прийому" value="" name="aEleventhTime">
            </div>
        </div>
        <div class="form-group">
            <label for="twelfthTime" class="col-md-6 control-label">Twelfth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="twelfthTime" placeholder="Час дванадцятого прийому" value="" name="aTwelfthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="thirteenthTime" class="col-md-6 control-label">Thirteenth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="thirteenthTime" placeholder="Час тринадцятого прийому" value="" name="aThirteenthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="fourteenthTime" class="col-md-6 control-label">Fourteenth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="fourteenthTime" placeholder="Час чотирнадцятого прийому" value="" name="aFourteenthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="fifteenthTime" class="col-md-6 control-label">Fifteenth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="fifteenthTime" placeholder="Час п'ятнадцятого прийому" value="" name="aFifteenthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="sixteenthTime" class="col-md-6 control-label">Sixteenth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="sixteenthTime" placeholder="Час шістнадцятого прийому" value="" name="aSixteenthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="seventeenthTime" class="col-md-6 control-label">Seventeenth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="seventeenthTime" placeholder="Час сімнадцятого прийому" value="" name="aSeventeenthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="eighteenthTime" class="col-md-6 control-label">Eighteenth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="eighteenthTime" placeholder="Час вісімнадцятого прийому" value="" name="aEighteenthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="nineteenthTime" class="col-md-6 control-label">Nineteenth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="nineteenthTime" placeholder="Час девятнадцятого прийому" value="" name="aNineteenthTime">
            </div>
        </div>
        <div class="form-group">
            <label for="twentiethTime" class="col-md-6 control-label">Twentieth time</label>
            <div class="col-md-6">
                <input type="text" class="form-control" id="twentiethTime" placeholder="Час двадцятого прийому" value="" name="aTwentiethTime">
            </div>
        </div>
        </div>
        </div>

        <div class="row">
        <div>
            <button type="submit" class="btn-lg btn-block" value="add">Create working time</button>
        </div>
        </div>
            </div>
    </form>
</div>
</div>
<div class="col-md-3"></div>
</body>
</html>