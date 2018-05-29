<%--
  Created by IntelliJ IDEA.
  User: 安晓
  Date: 2018/5/25
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/login" method="post">
    账号：<input type="text" name="username"/>${username}<br/>
    密码:<input type="password" name="password"/>${password}<br/>
    <input type="submit" value="提交"/>${errorMsg}
</form>
</body>
</html>
