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
            border-color: #acbdf0 #acbdf0 hsl(225, 70%, 81%);
            color: #333 !important;
            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.00);
            -webkit-font-smoothing: antialiased;
        }
        .btn-customb {
            background-color: hsl(49, 70%, 81%) !important;
            border-color: #f0e4ac #f0e4ac hsl(49, 70%, 81%);
            color: #333 !important;
            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.00);
            -webkit-font-smoothing: antialiased;
        }
        .btn-customc {
            background-color: hsl(360, 70%, 81%) !important;
            border-color: #f0acac #f0acac hsl(360, 70%, 81%);
            color: #333 !important;
            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.00);
            -webkit-font-smoothing: antialiased;
        }
        .btn-customd {
            background-color: hsla(97, 100%, 66%, 0.51) !important;
            border-color: #94ff52 #94ff52 hsl(97, 100%, 66%);
            color: #333 !important;
            text-shadow: 0 1px 1px rgba(255, 255, 255, 0.00);
            -webkit-font-smoothing: antialiased;
        }
    </style>
</head>
<body>
    <div class="col-md-6" role="toolbar">
        <h1 class="text-center">Doctors data</h1><br>

        <form action="adddoctor.html">
            <button type="submit" class="btn-lg btn-block btn-customa">
                Add new doctor
            </button>
        </form>
        <form action="updatedoctor">
            <button type="submit" class="btn-lg btn-block btn-customb">
                Add working time
            </button>
        </form>
        <form action="deletedoctor.html">
            <button type="submit" class="btn-lg btn-block btn-customc">
                Delete doctor
            </button>
        </form>
        <form action="selectdoctortoseeschedule">
            <button type="submit" class="btn-lg btn-block btn-customd">
                Doctor's schedule
            </button>
        </form>
    </div>

    <div class="col-md-6" role="toolbar">
        <h1 class="text-center">Clients data</h1><br>
        <form action="registration.html">
            <button type="submit" class="btn-lg btn-block btn-customa">
                Add new client
            </button>
        </form>
        <form action="selectclient">
            <button type="submit" class="btn-lg btn-block btn-customb">
                Add new test
            </button>
        </form>
        <form action="deleteclient">
            <button type="submit" class="btn-lg btn-block btn-customc">
                Delete client
            </button>
        </form>
    </div>
</body>
</html>