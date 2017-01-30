<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Пассажиры</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
    <script src='/resources/js/tablesort.min.js'></script>
    <script src='/resources/js/tablesort.number.js'></script>
    <script src='/resources/js/tablesort.date.js'></script>
</head>
<body>
<ul>
    <li><a href="/route/index">Расписание</a></li>
    <li><a class="/bus/index" href="/">Автобусы</a></li>
    <li><a href="/station/index">Станции</a></li>
    <li><a href="/ticket/index">Билеты</a></li>
    <li><a href="active">Пассажиры</a></li>
    <li style="float:right"><a href="/">About</a></li>
</ul>

<h3>Список пассажиров:</h3>

<br>
<table id="table-id">
    <thead>
    <tr>
        <th>ID пассажира</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Дата рождения</th>
        <th data-sort-method='none'>Удалить</th>
    </tr>
    </thead>
    <tbody>
    <%--@elvariable id="passenger" type="java.util.List"--%>
    <c:forEach items="${allPassengers}" var="passenger">
        <tr>
            <td>${passenger.passengerId}</td>
            <td>${passenger.name}</td>
            <td>${passenger.surname}</td>
            <td>${passenger.dateOfBirth}</td>
            <td><a href="/passenger/delete/${passenger.passengerId}"><img src="/resources/icons/delete.png"></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<a href="/passenger/"><img src="/resources/icons/add.png" title="Добавить пассажира"></a>
<script>
    new Tablesort(document.getElementById('table-id'));
</script>
</body>
</html>