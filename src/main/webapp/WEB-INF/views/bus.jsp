<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Транспортная система</title>
</head>
<body>



<h2>Транспортная система</h2>

<form:form method="post" action="add" commandName="bus">

    <table>
        <tr>
            <td><form:label path="numberOfSeats">
                Количество мест
            </form:label></td>
            <td><form:input path="numberOfSeats" /></td>
        </tr>


        <tr>
            <td colspan="2"><input type="submit"
                                   value="добавить автобус" /></td>
        </tr>
    </table>
</form:form>

<h3>Показать все автобусыавтобусы</h3>
<c:if test="${!empty allBuses}">
    <table class="data">
        <tr>
            <th>Количество мест</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${allBuses}" var="bus">
            <tr>
                <td>${bus.busNumber}</td>
                <td>${bus.numberOfSeats}</td>
                <td><a href="delete/${bus.numberOfSeats}">Удалить</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
