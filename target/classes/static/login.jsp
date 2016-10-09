<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background: #F0FFF0;
            padding: 50px;
        }
        footer { margin: 30px;}
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-4">
        </div>
        <div class="col-md-4">
            <div class="jumbotron well" style="margin-top: 20px; background:ghostwhite;">
                <c:url value="/j_spring_security_check" var="loginUrl" />
                <form role="form" action="${loginUrl}" method="post" >
                    <div>
                        <h4 align="center">Увійдіть до вашого облікового запису</h4>
                    </div>
                    <div class="form-group" style="margin-top: 20px;">

                        <label for="exampleInputEmail1">
                            Email address
                        </label>
                        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Email address" name="j_username"/>
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">
                            Password
                        </label>
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="j_password"/>
                    </div>

                    <button type="submit" class="btn btn-default btn-block">
                        Submit
                    </button>
                </form>
            </div>

            <div class="row">
                <div class="col-md-12">
                    <h6>
                        Ви ще не зареєструвалися?
                    </h6>
                    <a type="button" class="btn btn-default btn-block" href="registration.html">
                        Реєстрація
                    </a>
                </div>
            </div>
            <div class="footer" style="margin-top: 20px;" align="right">
                <hr>
                <p>© Viktor Gevel 2016</p>
            </div>
        </div>
        <div class="col-md-4">
        </div>
    </div>
</div>
</body>
</html>