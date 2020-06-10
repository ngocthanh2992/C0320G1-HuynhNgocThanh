<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/10/2020
  Time: 9:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Vietnamese Dictionary</title>
</head>
<body>
<h2>Dictionary</h2>
<c:if test="${result != null}">
    <p>Word: ${word} </p>
    <p>Result: ${result}</p>
</c:if>
<c:if test="${result == null}">
    <p>Word: ${word}</p>
    <p>Message: ${message}</p>
</c:if>
</body>
</html>
