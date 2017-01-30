<%--@elvariable id="ticket" type="domain.Ticket"--%>
<%--@elvariable id="allPassengers" type="java.util.List"--%>
<%--@elvariable id="allRoutes" type="java.util.List"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление билета</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<ul>
    <li><a href="/route/index">Расписание</a></li>
    <li><a href="/bus/index">Автобусы</a></li>
    <li><a href="/station/index">Станции</a></li>
    <li><a class="active" href="/">Билеты</a></li>
    <li><a href="/passenger/index">Пассажиры</a></li>
    <li style="float:right"><a href="/">About</a></li>
</ul>
<h3>Добавление билета</h3>
<form action="/ticket/add" method="post">
    <label for="passengerdropdown">Выберите пассажира: <br>
        <select id="passengerdropdown" name="passengerId" required>
            <c:forEach items="${allPassengers}" var="passenger">
                <option name="passenger" id="passenger" value="${passenger.passengerId}">${passenger.passengerName}</option>
            </c:forEach>
        </select>
    </label><br />
    <label for="routedropdown">Выберите маршрут: <br>
        <select id="routedropdown" name="routeNumber" required>
            <c:forEach items="${allRoutes}" var="route">
                <option name="routeNumber" id="routeNumber" value="${route.routeNumber}">${route.routeNumber}</option>
            </c:forEach>
        </select>
    </label><br />
    <input type="hidden" name="id" value="${ticket.ticketId}" />
    <input type="submit" value="Сохранить" />
</form>

</body>
</html>
