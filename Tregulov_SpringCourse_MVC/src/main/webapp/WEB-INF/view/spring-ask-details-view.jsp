<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>

<h2>Enter your details</h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    Department <form:select path="department">

    <form:options items="${employee.departments}"/>

    </form:select>
    <br>
    Choose your car
    BMW<form:radiobutton path="car" value = "BMW"/>
    Audi<form:radiobutton path="car" value = "Audi"/>
    Volkswagen<form:radiobutton path="car" value = "Volkswagen"/>
    <br>
    Flag your languages
    <form:checkboxes path="languages" items="${employee.availableLanguages}"/>

<input type="submit" value="OK">

</form:form>

</body>

</html>