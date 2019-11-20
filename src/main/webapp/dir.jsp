<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Home directory</title>
</head>
<body>
<h1>Whatever: {<c: out value="msg" />}</h1>
<ul>
    <c:forEach items="${files}">
        <li><var>file</var><c:out value="${file}" /></li>
    </c:forEach>
</ul>
</body>
</html>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<html>--%>
<%--<body>--%>
<%--<c:forEach var="i" begin="1" end="5" step="1">--%>
<%--    <p>Item <c:out value="${i}"></c:out></p>--%>
<%--    ${i}--%>
<%--    <p>${i}</p>--%>
<%--    <h1>${i}</h1>--%>
<%--</c:forEach>--%>
<%--</body>--%>
<%--</html>--%>