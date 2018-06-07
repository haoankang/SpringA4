<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/18
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a>this is my home page.</a>
<form id="form" action="/upload" method="post" enctype="multipart/form-data">
    <input name="photo" type="file"/>
    <br>
    <input type="submit" value="upload">
</form>
<hr>
<form action="/upload2" method="post" enctype="multipart/form-data">
    <input type="file" name="multipartFile">
    <br>
    <input type="submit" value="upload2">
</form>

<a href="/exception/0">normal</a>
<hr>
<a href="/exception/1">error</a>
</body>
</html>
