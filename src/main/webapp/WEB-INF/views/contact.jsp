<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 06-07-2025
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Contact Form</title>

    <!-- Bootstrap CSS -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
    />

    <!-- Tailwind CSS -->
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6 bg-white p-5 rounded shadow-xl">
            <h2 class="text-2xl font-bold mb-4 text-center text-gray-800">Register</h2>
            <form action="processForm" method="post">
                <div class="mb-3">
                    <label for="name" class="form-label text-gray-700 font-medium">Name</label>
                    <input
                            type="text"
                            name="UserName"
                            class="form-control border border-gray-300 rounded-md"
                            id="name"
                            placeholder="Enter your name"
                            required
                    />
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label text-gray-700 font-medium">Email</label>
                    <input
                            type="email"
                            name="UserEmail"
                            class="form-control border border-gray-300 rounded-md"
                            id="email"
                            placeholder="Enter your email"
                            required
                    />
                </div>

                <div class="mb-3">
                    <label for="password" class="form-label text-gray-700 font-medium">Password</label>
                    <input
                            type="password"
                            name="UserPassword"
                            class="form-control border border-gray-300 rounded-md"
                            id="password"
                            placeholder="Enter your password"
                            required
                    />
                </div>

                <button type="submit" class="btn btn-primary w-full bg-blue-600 hover:bg-blue-700">
                    Submit
                </button>
            </form>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
