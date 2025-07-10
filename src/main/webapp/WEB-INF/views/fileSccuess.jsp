<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10-07-2025
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sccuess</title>
</head>
<body>
  <h1>${message}</h1>
  <img src="<c:url value="/resources/images/${fileName}" />" alt="image">
</body>
</html>
