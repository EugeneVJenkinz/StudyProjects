<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>
<h2>Add new employee</h2>
<br>

<form:form action="saveEmployee" modelAttribute="employee">

    <form:hidden path="id"/>

    Name<form:input path="name"/>
    <br>
    Surname<form:input path="surname"/>
    <br>
    Salary<form:input path="salary"/>
    <br>
    Department<form:input path="department"/>
    <br>
    <input type="submit" value="Add">

</form:form>
</body>

</html>