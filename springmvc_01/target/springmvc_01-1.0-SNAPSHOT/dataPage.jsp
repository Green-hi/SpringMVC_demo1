<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 9/24/2021
  Time: 4:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="getParamByRequest" method="get">
    <input type="text" name="username">
    <input type="password" name="password">
    <input type="submit" value="byRequest">
</form>
<form action="getParamByArgName" method="get">
    <input type="text" name="username">
    <input type="password" name="pwd">
    <input type="submit" value="noRequest">
</form>

<form action="getDataByPojo">
    <p>姓名<input type="text" name="pname"></p>
    <p>年龄<input type="text" name="page"></p>
    <p>性别
        <input type="radio" name="gender" value="1">男
        <input type="radio" name="gender" value="0">女
    </p>
    <p>爱好
        <input type="checkbox" name="hobby" value="1">篮球
        <input type="checkbox" name="hobby" value="2">足球
        <input type="checkbox" name="hobby" value="3">羽毛球
    </p>
    <p>生日<input type="text" name="birthdate"></p>

    宠物：
    <p>
        宠物1： 名字：<input type="text" name="pets[0].petName">类型：<input type="text" name="pets[0].petType">
    </p>
    <p>
        宠物2： 名字：<input type="text" name="pets[1].petName">类型：<input type="text" name="pets[1].petType">
    </p>

    <input type="submit">
</form>

</body>
</html>
