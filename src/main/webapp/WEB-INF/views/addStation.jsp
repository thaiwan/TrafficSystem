<%--@elvariable id="station" type="domain.Station"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление станции</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<ul>
    <li><a href="/route/index">Расписание</a></li>
    <li><a href="/">Автобусы</a></li>
    <li><a class="active" href="/">Станции</a></li>
    <li><a href="/ticket/index">Билеты</a></li>
    <li><a href="/passenger/index">Пассажиры</a></li>
    <li style="float:right"><a href="/">About</a></li>
</ul>
<h3>Добавление станции</h3>
<form action="/station/add" method="post">
    <label for="stationId">Введите имя станции: <br>
        <input type="text" id="stationId" value="${station.stationName}" name="stationName" required/>
    </label>  <br />
    <input type="hidden" name="id" value="${station.stationId}" />
    <input type="submit" value="Сохранить" />
</form>

</body>
</html>
