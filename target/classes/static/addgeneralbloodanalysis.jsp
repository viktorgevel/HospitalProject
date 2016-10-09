<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new General blood analysis</title>
    <link href="css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4"></div>
        <div class="col-md-4">
            <form class="form-horizontal" role="form" action="generalbloodanalysisend" method="post">

                <div class="form-group">
                    <input type="hidden" name="selectclient" value="${client.login}">
                </div>
                <div class="form-group">
                    <label for="inputDate" class="col-sm-4 control-label">
                        День отримання аналізу
                    </label>
                    <div class="col-sm-8">
                        <input type="date" name="date" id="inputDate" class="form-control"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="HGB" class="col-sm-4 control-label">
                        Гемоглобін
                    </label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" id="HGB" name="aHemoglobin"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="RBC" class="col-sm-4 control-label">
                        Еритроцити
                    </label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" id="RBC" step="0.01" name="aRedBloodCell"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="HCT" class="col-sm-4 control-label">
                        Гематокрит
                    </label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" id="HCT" step="0.1" name="aHematocrit"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="MCH" class="col-sm-4 control-label">
                        Середній вміст гемоглобіну в еритроциті
                    </label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" id="MCH" step="0.1" name="aMeanCorpuscularHemoglobin"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="PLT" class="col-sm-4 control-label">
                        Тромбоцити
                    </label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" id="PLT" name="aPlatelet"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="WBC" class="col-sm-4 control-label">
                        Лейкоцити
                    </label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" id="WBC" step="0.1" name="aWhiteBloodCell"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="ESR" class="col-sm-4 control-label">
                        Швидкість осідання еритроцитів
                    </label>
                    <div class="col-sm-8">
                        <input type="number" class="form-control" id="ESR" name="aErythrocyteSedimentationRate"/>
                    </div>
                </div>


                <div class="form-group">
                    <div class="col-sm-offset-4 col-sm-8">

                        <button type="submit" class="btn btn-default">
                            Додати результати аналізу
                        </button>
                    </div>
                </div>
            </form>
        </div>
        <div class="col-md-4"></div>
    </div>
</div>
</body>
</html>