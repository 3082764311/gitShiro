<%--
  Created by IntelliJ IDEA.
  User: 安晓
  Date: 2018/5/28
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<shiro:hasPermission name="employee:save">
    <a href="/employee/save">员工增加</a>
</shiro:hasPermission>

<shiro:hasPermission name="employee:delete">
    <a href="/employee/delete">员工删除</a>
</shiro:hasPermission>

<shiro:hasPermission name="employee:update">
    <a href="/employee/update">员工修改</a>
</shiro:hasPermission>
</body>
</html>
