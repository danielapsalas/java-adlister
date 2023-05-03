<%--
  Created by IntelliJ IDEA.
  User: danielasalas
  Date: 5/3/23
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>
<%--A user goes to /pickcolor and sees a page where they are prompted to enter their favorite color (using a text input).--%>
<%--Upon clicking submit, they are redirected to /viewcolor and see a page with a background color of the submitted color.--%>

<%--use a POST request on the form--%>
<%--use two JSPs and two servlets--%>
<%--use style tags to set the background color on the HTML body--%>
<%--pass the data from one servlet to another by adding the color value in a query string--%>
<form action="/pick-color" method="POST">
  <label for="color-picker">Enter your favorite color: </label>
  <input type="text" id="color-picker" name="color-picker">
  <button type="submit">Submit</button>
</form>
</body>
</html>
