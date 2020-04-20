<%--
  Created by IntelliJ IDEA.
  User: BHB-DB-SHY
  Date: 2019/11/13
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <head>
        <c:set var="ctx" value="${pageContext.request.contextPath}"/>
        <meta charset="UTF-8">
        <title>错误</title>
        <link rel="stylesheet" href="${ctx}/css/font.css">
        <link rel="stylesheet" href="${ctx}/css/xadmin.css">
    </head>
</head>
<body>
<div class="layui-container">
    <div class="fly-panel">
        <div class="fly-none">
            <h2><i class="layui-icon">${code}</i></h2>
            <p>${msg}</p>
        </div>
    </div>
</div>
</body>
</html>
