<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Маршруты</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
    <script src='/resources/js/tablesort.min.js'></script>
    <script src='/resources/js/tablesort.number.js'></script>
    <script src='/resources/js/tablesort.date.js'></script>
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

<h3>Список маршрутов:</h3>

<br>
<table id="table-id">
    <thead>
    <tr>
        <th>Номер маршрута</th>
        <th>ID автобуса</th>
        <th>Станция отправления</th>
        <th>Время отправления</th>
        <th>Станция прибытия</th>
        <th>Время прибытия</th>
        <th data-sort-method='none'>Удалить</th>
    </tr>
    </thead>
    <tbody>
    <%--@elvariable id="route" type="java.util.List"--%>
    <c:forEach items="${allRoutes}" var="route">
        <tr>
            <td>${route.routeNumber}</td>
            <td>${route.bus}</td>
            <td>${route.departureStation}</td>
            <td>${route.departureTime}</td>
            <td>${route.arrivalStation}</td>
            <td>${route.arrivalTime}</td>
            <td><a href="/route/delete/${route.routeId}"><img src="/resources/icons/delete.png"></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<br>
<a href="/route/add"><img src="/resources/icons/add.png" title="Добавить маршрут"></a>
<script>
    new Tablesort(document.getElementById('table-id'));
</script>
</body>
</html>