<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Admin page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            padding: 30px;
        }
        .btn-customa {
            background-color: hsl(225, 70%, 81%) !important;
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#acbdf0", endColorstr="#acbdf0");
            background-image: -khtml-gradient(linear, left top, left bottom, from(#acbdf0), to(#acbdf0));
            background-image: -moz-linear-gradient(top, #acbdf0, #acbdf0);
            background-image: -ms-linear-gradient(top, #acbdf0, #acbdf0);
            background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #acbdf0), color-stop(100%, #acbdf0));
            background-image: -webkit-linear-gradient(top, #acbdf0, #acbdf0);
            background-image: -o-linear-gradient(top, #acbdf0, #acbdf0);
            background-image: linear-gradient(#acbdf0, #acbdf0);
            border-color: #acbdf0 #acbdf0 hsl(225, 70%, 81%);
            color: #333 !important;
            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.00);
            -webkit-font-smoothing: antialiased;
        }
        .btn-customb {
            background-color: hsl(49, 70%, 81%) !important;
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#f0e4ac", endColorstr="#f0e4ac");
            background-image: -khtml-gradient(linear, left top, left bottom, from(#f0e4ac), to(#f0e4ac));
            background-image: -moz-linear-gradient(top, #f0e4ac, #f0e4ac);
            background-image: -ms-linear-gradient(top, #f0e4ac, #f0e4ac);
            background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #f0e4ac), color-stop(100%, #f0e4ac));
            background-image: -webkit-linear-gradient(top, #f0e4ac, #f0e4ac);
            background-image: -o-linear-gradient(top, #f0e4ac, #f0e4ac);
            background-image: linear-gradient(#f0e4ac, #f0e4ac);
            border-color: #f0e4ac #f0e4ac hsl(49, 70%, 81%);
            color: #333 !important;
            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.00);
            -webkit-font-smoothing: antialiased;
        }
        .btn-customc {
            background-color: hsl(360, 70%, 81%) !important;
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#f0acac", endColorstr="#f0acac");
            background-image: -khtml-gradient(linear, left top, left bottom, from(#f0acac), to(#f0acac));
            background-image: -moz-linear-gradient(top, #f0acac, #f0acac);
            background-image: -ms-linear-gradient(top, #f0acac, #f0acac);
            background-image: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #f0acac), color-stop(100%, #f0acac));
            background-image: -webkit-linear-gradient(top, #f0acac, #f0acac);
            background-image: -o-linear-gradient(top, #f0acac, #f0acac);
            background-image: linear-gradient(#f0acac, #f0acac);
            border-color: #f0acac #f0acac hsl(360, 70%, 81%);
            color: #333 !important;
            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.00);
            -webkit-font-smoothing: antialiased;
        }
        .btn-customd {
            background-color: hsla(97, 100%, 66%, 0.51) !important;
            background-repeat: repeat-x;
            filter: progid:DXImageTransform.Microsoft.gradient(startColorstr="#f0acac", endColorstr="#f0acac");
            border-color: #94ff52 #94ff52 hsl(97, 100%, 66%);
            color: #333 !important;
            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.00);
            -webkit-font-smoothing: antialiased;
        }
    </style>
</head>
<body>
    <div class="btn-toolbar" role="toolbar">
        <h1 class="text-center">Doctors data</h1>
        <div class="btn-group btn-group-lg btn-group-justified">
            <a href="adddoctor.html" class="btn btn-customa">
                Add new doctor</a>
            <a href="updatedoctor" class="btn btn-customb">
                Add working time</a>
            <a href="deletedoctor.html" class="btn btn-customc">
                Delete doctor</a>
        </div>
    </div>
    <br>
    <div class="btn-toolbar" role="toolbar">
        <div class="btn-group btn-group-lg btn-group-justified">
            <a href="selectdoctortoseeschedule" class="btn btn-customd" >
                Doctor's schedule</a>
        </div>
    </div>
    <br><br>
    <div class="btn-toolbar" role="toolbar">
        <h1 class="text-center">Clients data</h1>
        <div class="btn-group btn-group-lg btn-group-justified">
            <a href="registration.html" class="btn btn-customa" >
                Add new client</a>
            <a href="selectclient" class="btn btn-customb">
                Add new test</a>
            <a href="deleteclient" class="btn btn-customc">
                Delete client</a>
        </div>
    </div>


</body>
</html>