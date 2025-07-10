<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Complex Form</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-200 min-h-screen flex items-center justify-center">

<div class="card shadow-lg p-4 w-full max-w-md">
  <h2 class="text-center text-2xl font-semibold mb-4">Complex Form</h2>

  <div class="alert alert-danger" role="alert">
    <form:errors path="complexForm.*"/>
  </div>

  <form action="ComplexForm" method="post" modelAttribute="complexForm">
    <div class="mb-3">
      <label for="name" class="form-label">Your name</label>
      <input type="text" class="form-control" id="name" name="name" placeholder="Enter Name">
    </div>

    <div class="mb-3">
      <label for="id" class="form-label">Your id</label>
      <input type="text" class="form-control" id="id" name="id" placeholder="Enter ID">
    </div>

    <div class="mb-3">
      <label for="dob" class="form-label">Your DOB</label>
      <input type="date" class="form-control" id="dob" name="dob">
    </div>

    <div class="mb-3">
      <label for="course" class="form-label">Courses</label>
      <select multiple class="form-select" id="course" name="course">
        <option>Java</option>
        <option>Python</option>
        <option>C++</option>
        <option>Django</option>
      </select>
    </div>

    <div class="mb-3">
      <label class="form-label">Select Gender</label>
      <div class="d-flex gap-3">
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gender" id="male" value="Male" checked>
          <label class="form-check-label" for="male">Male</label>
        </div>
        <div class="form-check">
          <input class="form-check-input" type="radio" name="gender" id="female" value="Female">
          <label class="form-check-label" for="female">Female</label>
        </div>
      </div>
    </div>

    <div class="mb-3">
      <label for="type" class="form-label">Select Type</label>
      <select class="form-select" id="type" name="type">
        <option selected>Old Student</option>
        <option>New Student</option>
      </select>
    </div>

    <!-- Address Fields (Nested Binding) -->
    <h5 class="text-center mt-4">Address Details</h5>

    <div class="mb-3">
      <label for="street" class="form-label">Street</label>
      <input type="text" class="form-control" id="street" name="address.street" placeholder="Enter Street">
    </div>

    <div class="mb-3">
      <label for="city" class="form-label">City</label>
      <input type="text" class="form-control" id="city" name="address.city" placeholder="Enter City">
    </div>

    <div class="mb-3">
      <label for="state" class="form-label">State</label>
      <input type="text" class="form-control" id="state" name="address.state" placeholder="Enter State">
    </div>

    <div class="mb-3">
      <label for="country" class="form-label">Country</label>
      <input type="text" class="form-control" id="country" name="address.country" placeholder="Enter Country">
    </div>

    <div class="mb-3">
      <label for="pincode" class="form-label">Pincode</label>
      <input type="text" class="form-control" id="pincode" name="address.pincode" placeholder="Enter Pincode">
    </div>

    <div class="text-center">
      <button type="submit" class="btn btn-primary px-5">Submit</button>
    </div>
  </form>
</div>

</body>
</html>
