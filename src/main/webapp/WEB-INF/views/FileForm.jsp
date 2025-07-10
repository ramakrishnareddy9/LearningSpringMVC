<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10-07-2025
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Upload Image</title>

    <!-- Bootstrap 4 CDN -->
    <link
            rel="stylesheet"
            href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
    >
</head>
<body>
<div class="container mt-5 p-4 border rounded shadow-sm" style="max-width: 500px;">
    <h2 class="mb-4 text-center text-primary">Upload Image</h2>

    <!-- Image Upload Form -->
    <form action="uploadimage" method="post" enctype="multipart/form-data">
        <div class="form-group">
            <label for="exampleFormControlFile1">Select your image</label>
            <input
                    type="file"
                    name="profile"
                    class="form-control-file"
                    id="exampleFormControlFile1"
                    accept="image/*"
                    required
            >
        </div>

        <button type="submit" class="btn btn-outline-success btn-block">
            Upload
        </button>
    </form>
</div>

<!-- Bootstrap JS (Optional) -->
<script
        src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
></script>
<script
        src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.2/dist/js/bootstrap.bundle.min.js"
></script>
</body>
</html>

