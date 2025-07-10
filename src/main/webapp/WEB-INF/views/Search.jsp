<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>My Search</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #f8f9fa;
        }
        .search-container {
            background-color: #007bff;
            color: white;
            padding: 50px;
            border-radius: 10px;
            max-width: 600px;
            margin: 100px auto;
            box-shadow: 0 0 15px rgba(0, 0, 0, 0.2);
        }
        .form-control {
            height: 45px;
            font-size: 16px;
        }
        .btn-search {
            margin-top: 15px;
        }
        .btn-home {
            margin-top: 10px;
        }
    </style>
</head>
<body>

<div class="search-container text-center">
    <h3 class="mb-4">MY SEARCH</h3>

    <form action="${pageContext.request.contextPath}/search" method="GET">
        <div class="mb-3 text-start">
            <label for="queryBox" class="form-label">Enter your keyword:</label>
            <input type="text" class="form-control" id="queryBox" name="queryBox" placeholder="Search anything..." required>
        </div>
        <button type="submit" class="btn btn-outline-light btn-search">Search</button>
    </form>

</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
