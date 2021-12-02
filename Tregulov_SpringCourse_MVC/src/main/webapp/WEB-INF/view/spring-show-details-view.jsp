<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>

<html>

<body>

<h2>Good day!</h2>
<br>
<br>

Your name: ${employee.name}
<br>
Your surname ${employee.surname}
<br>
Your salary ${employee.salary}
<br>
Your department ${employee.department}
<br>
Your car ${employee.car}
<br>
Your email ${employee.email}
<br>
Languages:
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>
            ${lang}
        </li>
    </c:forEach>
</ul>

</body>

</html>