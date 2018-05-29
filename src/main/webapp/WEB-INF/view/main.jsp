<%--
  Created by IntelliJ IDEA.
  User: 安晓
  Date: 2018/5/25
  Time: 17:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
main
<a href="/logout">登出</a>
<shiro:hasPermission name="employee:list">
    <a href="/employee/list">员工列表</a>
</shiro:hasPermission>
<br>
<shiro:hasPermission name="department:list">
    <a href="/department/list">部门列表</a>
</shiro:hasPermission>
</body>
</html>
