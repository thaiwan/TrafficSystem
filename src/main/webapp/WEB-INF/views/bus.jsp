
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title><spring:message code="label.title" /></title>
</head>
<body>
<%--<a href="<c:url value="/logout" />">--%>
    <%--<spring:message code="label.logout" />--%>
<%--</a>--%>

<h2><spring:message code="label.title" /></h2>

<form:form method="post" action="add" commandName="bus">

    <table>
        <tr>
            <td><form:label path="numberOfSeats">
                <spring:message code="label.numberOfSeats" />
            </form:label></td>
            <td><form:input path="numberOfSeats" /></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit"
                                   value="<spring:message code="label.addBus"/>" /></td>
        </tr>
    </table>
</form:form>

<h3><spring:message code="label.buses" /></h3>
<c:if test="${!empty allBuses}">
    <table class="data">
        <tr>
            <th><spring:message code="label.numberOfSeats" /></th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${allBuses}" var="bus">
            <tr>
                <td>${bus.numberOfSeats}</td>
                <td><a href="delete/${bus.busNumber}"><spring:message code="label.delete" /></a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>
