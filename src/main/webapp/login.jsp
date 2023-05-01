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
<%--1.Build A Login Form

a.Create two files, login.jsp and profile.jsp

b.When a user visits /login.jsp, they should see a form for logging in
  This form should have a 'username' and 'password' field.

c.This form should submit a POST request to /login.jsp

d.Inside of login.jsp write some code to check the submmitted values. If the username submitted is "admin", and the password
 is "password", redirect the user to the profile page; otherwise, redirect back to the login form.--%>

<form action="/login.jsp" method="POST">
    <label for="username">Username : </label>
    <input type="text"  id="username" placeholder="Enter Username" name="username" required>

    <label>Password : </label>
    <input type="password" id="password" placeholder="Enter Password" name="password" required>

    <button type="submit">Login</button>
</form>

<p>Parameter username: <%= request.getParameter("username")%></p>
<p>Parameter password: <%= request.getParameter("password")%></p>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if(username != null && password != null && username.equals("admin") && password.equals("password")){
        response.sendRedirect("/profile.jsp");
    }else if(username != null || password != null){
        response.sendRedirect("/login.jsp");
    }
%>
</body>
</html>
