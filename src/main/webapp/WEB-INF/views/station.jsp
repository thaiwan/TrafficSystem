<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Станции</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
    <script src='/resources/js/tablesort.min.js'></script>
    <script src='/resources/js/tablesort.number.js'></script>
    <script src='/resources/js/tablesort.date.js'></script>
</head>
<body>
<ul>
    <li><a href="/route/index">Расписание</a></li>
    <li><a href="/bus/index">Автобусы</a></li>
    <li><a class="active" href="/">Станции</a></li>
    <li><a href="/ticket/index">Билеты</a></li>
    <li><a href="/passenger/index">Пассажиры</a></li>
    <li style="float:right"><a href="/">About</a></li>
</ul>

<h3>Список станций:</h3>

<br>
<table id="table-id">
    <thead>
    <tr>
        <th>ID станции</th>
        <th>Название станции</th>
        <th data-sort-method='none'>Удалить</th>
    </tr>
    </thead>
    <tbody>
    <%--@elvariable id="station" type="java.util.List"--%>
    <c:forEach items="${allStations}" var="station">
        <tr>
            <td>${station.stationId}</td>
            <td>${station.stationName}</td>
            <td><a href="/station/delete/${station.stationId}"><img src="/resources/icons/delete.png"></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<br>
<a href="/station/"><img src="/resources/icons/add.png" title="Добавить станцию"></a>
<script>
    new Tablesort(document.getElementById('table-id'));
</script>
</body>
</html>