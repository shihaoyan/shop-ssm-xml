<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html class="x-admin-sm">
<head>
    <c:set var="ctx" value="${pageContext.request.contextPath}"/>
    <meta charset="UTF-8">
    <title>后台登录</title>
    <link rel="stylesheet" href="${stx}/css/font.css">
    <link rel="stylesheet" href="${stx}/css/login.css">
    <link rel="stylesheet" href="${stx}/css/xadmin.css">
    <script type="text/javascript" src="${stx}/js/jquery.min.js"></script>
    <script src="${stx}/lib/layui/layui.js" charset="utf-8"></script>
</head>
<body class="login-bg">

<div class="login layui-anim layui-anim-up">
    <div class="message">管理员登录</div>
    <div id="darkbannerwrap"></div>

    <form method="post" class="layui-form">
        <input name="username" placeholder="用户名" type="text" lay-verify="required" class="layui-input">
        <hr class="hr15">
        <input name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input">
        <hr class="hr15">
        <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
        <hr class="hr20">
    </form>
    <ul></ul>
</div>

<script>
    /*在这个里面处理的登陆*/
    $(function () {

        layui.use('form', function () {
            var form = layui.form;
            //监听提交
            form.on('submit(login)', function (data) {
                $.ajax({
                    url: "${pageContext.request.contextPath}/login",
                    type: 'POST',
                    data: {username: data.field.username, password: data.field.password},
                    async: false,
                    dataType: 'json',
                    success: function (data) {
                        //登陆成功，重定向到主界面
                        if (data.status == 1) {
                            location.href = "/page/toIndex";
                        }
                        //当登陆失败的时候需要进行一次页面提示
                        if (data.status != 1) {
                            //显示提示消息，这个时从后台传递过来的
                            layer.msg(data.msg, {
                                    icon: 5,
                                    time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                }, function () {
                                }
                            );
                        }

                    }

                });
                return false;
            });
        });
    })
</script>
<!-- 底部结束 -->
</body>
</html>