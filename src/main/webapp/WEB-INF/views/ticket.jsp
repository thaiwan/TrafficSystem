<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Билеты</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
    <script src='/resources/js/tablesort.min.js'></script>
    <script src='/resources/js/tablesort.number.js'></script>
    <script src='/resources/js/tablesort.date.js'></script>
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

<h3>Список билетов:</h3>

<br>
<table id="table-id">
    <thead>
    <tr>
        <th>Номер билета</th>
        <th>Пассажир</th>
        <th>Номер маршрута</th>
        <th data-sort-method='none'>Удалить</th>
    </tr>
    </thead>
    <tbody>
    <%--@elvariable id="ticket" type="java.util.List"--%>
    <c:forEach items="${allTickets}" var="ticket">
        <tr>
            <td>${ticket.ticketId}</td>
            <td>${ticket.passenger}</td>
            <td>${ticket.route}</td>
            <td><a href="/ticket/delete/${ticket.ticketId}"><img src="/resources/icons/delete.png"></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<br>
<a href="/ticket/"><img src="/resources/icons/add.png" title="Добавить билет"></a>
<script>
    new Tablesort(document.getElementById('table-id'));
</script>
</body>
</html>