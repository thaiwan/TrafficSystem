<%--@elvariable id="route" type="domain.Route"--%>
<%--@elvariable id="busNumber" type="domain.Bus"--%>
<%--@elvariable id="departureStationId" type="domain.Station"--%>
<%--@elvariable id="arrivalStationId" type="domain.Station"--%>
<%--@elvariable id="allBuses" type="java.util.List"--%>
<%--@elvariable id="allStations" type="java.util.List"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
<form:form action="/route/add" method="post" modelAttribute="routeAttribute">
    <form:label path="bus" for="busNumber">Выберите автобус: <br>
        <form:select path="bus" id="bus" name="busNumber">
            <%--@elvariable id="busIterator" type="com.thaiwan.domain.Bus"--%>
            <c:forEach items="${allBuses}" var="busIterator">
                <form:option name="busNumber" id="busNumber" value="${busIterator.busNumber}">${busIterator.busNumber}</form:option>
            </c:forEach>
        </form:select>
    </form:label><br>

    <form:label path="departureStation" for="departureStation">Выберите станцию отправления: <br>
        <form:select path="departureStation" id="departureStationId" name="departureStation">
            <c:forEach items="${allStations}" var="departureStationIterator">
                <option name="departureStationId" id="departureStation" value="${departureStationIterator.stationId}">${departureStationIterator.stationName}</option>
            </c:forEach>
        </form:select>
    </form:label><br>

    <form:label path="departureTime" for="departureTime">Введите время отправления: <br>
        <form:input path="departureTime" type="time" name="departureTime" id="departureTime" value="${route.departureTime}" />
    </form:label>  <br />

    <form:label path="arrivalStation" for="arrivalStation">Выберите станцию прибытия: <br>
        <form:select path="arrivalStation" id="arrivalStationId" name="arrivalStation">
            <c:forEach items="${allStations}" var="arrivalStationIterator">
                <option name="arrivalStationId" id="arrivalStation" value="${arrivalStationIterator.stationId}">${arrivalStationIterator.stationName}</option>
            </c:forEach>
        </form:select>
    </form:label><br>

    <form:label path="arrivalTime" for="arrivalTime">Введите время прибытия: <br>
        <form:input path="arrivalTime" type="time" name="arrivalTime" id="arrivalTime" value="${route.arrivalTime}"/>
    </form:label>  <br />

    <form:input path="routeNumber" type="hidden" name="id" value="${route.routeNumber}" />
    <input type="submit" value="Сохранить" />
</form:form>

</body>
</html>
