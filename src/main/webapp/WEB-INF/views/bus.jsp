<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Автобусы</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
    <script src='/resources/js/tablesort.min.js'></script>
    <script src='/resources/js/tablesort.number.js'></script>
    <script src='/resources/js/tablesort.date.js'></script>
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

<h3>Список автобусов:</h3>

<br>
<table id="table-id">
    <thead>
    <tr>
        <th>Номер автобуса</th>
        <th>Количество мест</th>
        <th data-sort-method='none'>Удалить</th>
    </tr>
    </thead>
    <tbody>
    <%--@elvariable id="bus" type="java.util.List"--%>
    <c:forEach items="${allBuses}" var="bus">
        <tr>
            <td>${bus.busNumber}</td>
            <td>${bus.numberOfSeats}</td>
            <td><a href="/bus/delete/${bus.busNumber}"><img src="/resources/icons/delete.png"></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<br>
<a href="/bus/"><img src="/resources/icons/add.png" title="Добавить автобус"></a>
<script>
    new Tablesort(document.getElementById('table-id'));
</script>
</body>
</html>