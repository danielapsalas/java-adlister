<%--
  Created by IntelliJ IDEA.
  User: danielasalas
  Date: 5/1/23
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form action="/login.jsp" method="POST">
    <label for="username">Username : </label>
    <input type="text"  id="username" placeholder="Enter Username" name="username" required>

    <label>Password : </label>
    <input type="password" id="password" placeholder="Enter Password" name="password" required>

    <button type="submit">Login</button>
</form>
</body>
</html>
