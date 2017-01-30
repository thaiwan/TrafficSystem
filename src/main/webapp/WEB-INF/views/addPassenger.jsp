<%--@elvariable id="passenger" type="domain.Passenger"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавление пассажира</title>
    <link href="/resources/css/mystyle.css" rel="stylesheet" type="text/css">
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
<h3>Добавление пассажира</h3>
<form action="/passenger/add" method="post">
    <label for="name">Введите имя: <br>
        <input type="text" id="name" value="${passenger.name}" name="name" required/>
    </label>  <br />
    <label for="surname">Введите фамилию: <br>
        <input type="text" id="surname" value="${passenger.surname}" name="surname" required/>
    </label>  <br />
    <label for="dateOfBirth">Выберите дату рождения: <br>
        <input type="date" name="dateOfBirth" id="dateOfBirth" value="${passenger.dateOfBirth}" required/>
    </label>  <br />
    <input type="hidden" name="id" value="${passenger.passengerId}" />
    <input type="submit" value="Сохранить" />
</form>

</body>
</html>
