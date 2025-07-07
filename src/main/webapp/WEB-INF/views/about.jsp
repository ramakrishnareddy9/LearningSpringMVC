<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 06-07-2025
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>about page</title>
</head>
<body>
  <h1>About Page</h1>
    <% String name = (String) request.getAttribute("name"); %>
    <p>Name: <%=name%></p>

    <p>City: ${city}</p>

    <p>Time : ${time}</p>

  <p>List of marks : ${marks}</p>

  <h1>Marks : </h1>
  <c:forEach items="${marks}" var="mark">
      <p>${mark}</p>
      <h1><c:out value="${mark}"></c:out></h1>
  </c:forEach>
</body>
</html>
