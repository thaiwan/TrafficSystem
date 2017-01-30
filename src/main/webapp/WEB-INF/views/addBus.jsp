<%--@elvariable id="bus" type="domain.Bus"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление автобуса</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<ul>
    <li><a href="/route/index">Расписание</a></li>
    <li><a class="active" href="/">Автобусы</a></li>
    <li><a href="/station/index">Станции</a></li>
    <li><a href="/ticket/index">Билеты</a></li>
    <li><a href="/passenger/index">Пассажиры</a></li>
    <li style="float:right"><a href="/">About</a></li>
</ul>
<h3>Добавление автобуса</h3>
<form action="/bus/add" method="post">
    <label for="numberOfSeats">Введите количество мест: <br>
        <input type="text" id="numberOfSeats" value="${bus.numberOfSeats}" name="numberOfSeats" required/>
    </label>  <br />
    <input type="hidden" name="id" value="${bus.busNumber}" />
    <input type="submit" value="Сохранить" />
</form>

</body>
</html>
