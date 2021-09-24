
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="static/css/aaa.css">
    <script src="static/js/bbb.js"></script>
</head>
<body>

<form action="testRequest" method="post">
    <input type="submit" value="提交">
</form>
<form action="testRequest3" method="get">
    <input type="text" name="username">
    <input type="text" name="password">
    <input type="submit" value="测试params">
</form>
<form action="testRest/10" method="get">
    <input type="submit" value="GET">
</form>
<form action="testRest/10" method="post">
    <input type="submit" value="POST">
</form>
<form action="testRest/10" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="submit" value="PUT">
</form>
<form action="testRest/10" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" value="DELETE">
</form>


this is index.jsp
<img src="static/img/logo.png">
</body>
</html>
