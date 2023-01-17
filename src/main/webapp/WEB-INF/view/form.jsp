<%--
  Created by IntelliJ IDEA.
  User: quang
  Date: 17/01/2023
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/translate">
    <h1>Dictionary</h1>
    <input type="text" name="eng" placeholder="Enter an English word">
    <input type="submit" value="Search">
</form>
</body>
</html>
