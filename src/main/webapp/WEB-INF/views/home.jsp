<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 05-07-2025
  Time: 16:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Learning spring</title>
    <link rel="stylesheet" href="<c:url value="/resources/CSS/style.css"/>"/>
</head>
<body>
    <h1>HomePage</h1>
    <h1>My name is ramakrishanreddy</h1>
    <p>qwert yui opl kjhg fds azxc vb nm</p>

    <%
        String name = (String) request.getAttribute("city");
    %>
    <h1>I am from <%= name %></h1>
    <%
        List<String> friendList = (List<String>) request.getAttribute("friends");
        if (friendList != null) {
            for(String s : friendList){
                out.println("<p>" + s + "</p>");
            }
        } else {
            out.println("<p>No friends found.</p>");
        }
    %>

    <a href="about">about page</a>
    <a href="contact">about page</a>
    
    
    <img src="<c:url value="/resources/images/demo.jpg"/> ">
    
    <script src="<c:url value="/resources/JavaScript/Script.js"/>"></script>

</body>
</html>
