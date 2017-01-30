<%--@elvariable id="route" type="domain.Route"--%>
<%--@elvariable id="bus" type="domain.Bus"--%>
<%--@elvariable id="departureStation" type="domain.Station"--%>
<%--@elvariable id="arrivalStation" type="domain.Station"--%>
<%--@elvariable id="allBuses" type="java.util.List"--%>
<%--@elvariable id="allStations" type="java.util.List"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление маршрута</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<ul>
    <li><a class="active" href="/">Расписание</a></li>
    <li><a href="/bus/index">Автобусы</a></li>
    <li><a href="/station/index">Станции</a></li>
    <li><a href="/ticket/index">Билеты</a></li>
    <li><a href="/passenger/index">Пассажиры</a></li>
    <li style="float:right"><a href="/">About</a></li>
</ul>
<h3>Добавление маршрута</h3>
<form action="/route/add" method="post">
    <label for="bustdropdown">Выберите автобус: <br>
        <select id="bustdropdown" name="busNumber" required>
            <c:forEach items="${allBuses}" var="bus">
                <option name="busNumber" id="busNumber" value="${bus.busNumber}">${bus.busNumber}</option>
            </c:forEach>
        </select>
    </label><br>
    <label for="departureStation">Выберите станцию отправления: <br>
        <select id="departureStation" name="departureStation" required>
            <c:forEach items="${allStations}" var="departureStation">
                <option name="departureStation" id="departureStationId" value="${departureStation.stationId}">${departureStation.stationName}</option>
            </c:forEach>
        </select>
    </label><br>
    <label for="departureTime">Введите время отправления: <br>
        <input type="time" name="departureTime" id="departureTime" value="${route.departureTime}" required/>
    </label>  <br />
    <label for="arrivalStation">Выберите станцию прибытия: <br>
        <select id="arrivalStation" name="arrivalStation" required>
            <c:forEach items="${allStations}" var="arrivalStation">
                <option name="arrivalStation" id="arrivalStationId" value="${arrivalStation.stationId}">${arrivalStation.stationName}</option>
            </c:forEach>
        </select>
    </label><br>
    <label for="arrivalTime">Введите время прибытия: <br>
        <input type="time" name="arrivalTime" id="arrivalTime" value="${route.arrivalTime}" required/>
    </label>  <br />
    <input type="hidden" name="id" value="${route.routeNumber}" />
    <input type="submit" value="Сохранить" />
</form>

</body>
</html>
