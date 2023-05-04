<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: danielasalas
  Date: 5/4/23
  Time: 10:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Here are all the products:</h1>
<c:forEach var="ad" items="${ads}">
    <div class="ads">
        <h2>${ad.title}</h2>
        <p>Description: $ ${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
