<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>

<html>

<body>
<h3>Main information</h3>
<br>
<security:authorize access="hasRole('HR')">
    <input type="button" value="Salary(HR Only)" onclick="window.location.href = 'hr-info'">
    <br>
</security:authorize>

<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="Performance(Manager Only)" onclick="window.location.href = 'manager-info'">
    <br>
</security:authorize>
</body>

</html>