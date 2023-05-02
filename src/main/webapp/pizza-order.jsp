<%--
  Created by IntelliJ IDEA.
  User: danielasalas
  Date: 5/2/23
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<%--A user goes to /pizza-order and sees a pizza order form. This form features choices to select the crust type, --%>
<%--sauce type, size type (use select inputs), toppings (checkboxes), and delivery address (text input). --%>
<%--Use System.out.println to output the values submitted by the user.--%>
<form action="order-form" method="POST">
  <label for="crust-type">Crust Type: </label>
  <select name="crust-type" id="crust-type">
    <option value="thick">Thick Crust</option>
    <option value="deep">Deep Crust</option>
    <option value="thin">Thin Crust</option>
  </select>
  <br>
  <label for="sauce-type">Sauce Type: </label>
  <select name="sauce-type" id="sauce-type">
    <option value="marinara">Marinara Sauce</option>
    <option value="bbq">BBQ Sauce</option>
    <option value="buffalo">Buffalo Sauce</option>
  </select>
  <br>
  <label for="size-type">Size: </label>
  <select name="size-type" id="size-type">
    <option value="small">Small</option>
    <option value="medium">Medium</option>
    <option value="large">Large</option>
  </select>
  <br>
  <fieldset>
    <legend>Toppings:</legend>
    <input type="checkbox" name="toppings" id="pepperoni" value="pepperoni">
    <label for="pepperoni">Pepperoni</label>
    <input type="checkbox" name="toppings" id="ham" value="ham">
    <label for="ham">Sausage</label>
  </fieldset>
  <label for="delivery-address">Delivery Address:</label>
  <input type="text" name="delivery-address" id="delivery-address">
  <br>
  <input type="submit" value="Place Order">
</form>
</body>
</html>
