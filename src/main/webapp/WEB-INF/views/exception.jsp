<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10-07-2025
  Time: 18:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error - Something Went Wrong</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap 5 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .error-container {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        .error-box {
            padding: 40px;
            background-color: #fff;
            border-radius: 12px;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        .error-code {
            font-size: 6rem;
            font-weight: bold;
            color: #dc3545;
        }
        .error-message {
            font-size: 1.25rem;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<div class="container error-container">
    <div class="error-box">
        <div class="error-code">Oops!</div>
        <h2 class="mt-3">Something went wrong</h2>
        <p class="error-message">We're sorry, but an unexpected error has occurred.</p>
        <a href="/" class="btn btn-danger mt-4">Go to Home</a>
    </div>
</div>
</body>
</html>

