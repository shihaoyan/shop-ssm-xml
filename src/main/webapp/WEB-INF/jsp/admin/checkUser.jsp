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
    <div class="message">切换账号</div>
    <div id="darkbannerwrap"></div>

    <form method="post" class="layui-form">
        <input name="username" placeholder="用户名" type="text" lay-verify="required" class="layui-input">
        <hr class="hr15">
        <input name="password" lay-verify="required" placeholder="密码" type="password" class="layui-input">
        <hr class="hr15">
        <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
        <hr class="hr20">
    </form>
</div>

<script>
    $(function () {
        layui.use('form', function () {
            var form = layui.form;
            //监听提交
            form.on('submit(login)', function (data) {
                //我想登陆，需要把这个json字符串传递过去，后台进行处理
                $.ajax({
                    url: "${pageContext.request.contextPath}/login",
                    type: 'POST',
                    data: {username: data.field.username, password: data.field.password},
                    async: false,
                    dataType: 'json',
                    success: function (data) {
                        //登陆成功，重定向到主界面
                        if (data.status == 1) {
                            layer.msg("账号切换成功", {
                                    icon: 1,
                                    time: 1000 //2秒关闭（如果不配置，默认是3秒）
                                }, function () {
                                    var index = parent.layer.getFrameIndex(window.name);//获取当前的弹出层页
                                    parent.layer.close(index);//关闭当前页
                                    window.parent.location.replace("/page/toIndex")//刷新主页
                                }
                            );
                        }
                        if (data.status != 1) {
                            layer.msg(data.msg, {
                                    icon: 5,
                                    time: 2000 //2秒关闭（如果不配置，默认是3秒）
                                }, function () { }
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