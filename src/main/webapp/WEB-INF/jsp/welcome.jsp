<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html class="x-admin-sm">
<head>
    <c:set var="ctx" value="${pageContext.request.contextPath}"/>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <link rel="stylesheet" href="${ctx}/css/font.css">
    <link rel="stylesheet" href="${ctx}/css/xadmin.css">
    <script src="${ctx}/lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="${ctx}/js/xadmin.js"></script>
    <script type="text/javascript" src="${ctx}/js/jquery.min.js"></script>
    <script>
        /*获取时间函数*/
        function getTime() {
            var time = new Date();
            var y = time.getFullYear();
            var m = time.getMonth() + 1;
            var d = time.getDate();
            var h = time.getHours();
            var min = time.getMinutes();
            var s = time.getSeconds();
            m = m < 10 ? (m = "0" + m) : m;
            d = d < 10 ? (d = "0" + d) : d;
            h = h < 10 ? (h = "0" + h) : h;
            min = min < 10 ? (min = "0" + min) : min;
            s = s < 10 ? (s = "0" + s) : s;
            var myDate = y + "-" + m + "-" + d + " " + h + ":" + min + ":" + s;
            //设置时间
            document.getElementById("myDate").innerText = myDate;
        }
        /*获取会员数函数*/
        function getMemberNumber(){
            //发送ajax获取会员数

        }

        //每1s刷新一次时间
        $(function () {
            var number = getMemberNumber();
            setInterval(
                function () {
                    getTime();
                }, 1000
            );
        });


    </script>
</head>
<body>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-body ">
                    <blockquote class="layui-elem-quote">欢迎管理员：
                        <span class="x-red">${sessionScope.user.username}</span>！当前时间:<span id="myDate">${date}</span>
                    </blockquote>
                </div>
            </div>
        </div>
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">数据统计</div>
                <div class="layui-card-body ">
                    <ul class="layui-row layui-col-space10 layui-this x-admin-carousel x-admin-backlog">
                        <li class="layui-col-md2 layui-col-xs6">
                            <a href="javascript:;" class="x-admin-backlog-body">
                                <h3>管理员数</h3>
                                <p>
                                    <cite>12</cite></p>
                            </a>
                        </li>
                        <li class="layui-col-md2 layui-col-xs6">
                            <a href="javascript:;" class="x-admin-backlog-body">
                                <h3>会员数</h3>
                                <p>
                                    <cite>12</cite></p>
                            </a>
                        </li>
                        <li class="layui-col-md2 layui-col-xs6">
                            <a href="javascript:;" class="x-admin-backlog-body">
                                <h3>商品数</h3>
                                <p>
                                    <cite>67</cite></p>
                            </a>
                        </li>
                        <li class="layui-col-md2 layui-col-xs6">
                            <a href="javascript:;" class="x-admin-backlog-body">
                                <h3>订单数</h3>
                                <p>
                                    <cite>67</cite></p>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3">
            <div class="layui-card">
                <div class="layui-card-header">下载
                    <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span></div>
                <div class="layui-card-body  ">
                    <p class="layuiadmin-big-font">33,555</p>
                    <p>新下载
                        <span class="layuiadmin-span-color">10%
                                    <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                    </p>
                </div>
            </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3">
            <div class="layui-card">
                <div class="layui-card-header">下载
                    <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span></div>
                <div class="layui-card-body ">
                    <p class="layuiadmin-big-font">33,555</p>
                    <p>新下载
                        <span class="layuiadmin-span-color">10%
                                    <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                    </p>
                </div>
            </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3">
            <div class="layui-card">
                <div class="layui-card-header">下载
                    <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span></div>
                <div class="layui-card-body ">
                    <p class="layuiadmin-big-font">33,555</p>
                    <p>新下载
                        <span class="layuiadmin-span-color">10%
                                    <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                    </p>
                </div>
            </div>
        </div>
        <div class="layui-col-sm6 layui-col-md3">
            <div class="layui-card">
                <div class="layui-card-header">下载
                    <span class="layui-badge layui-bg-cyan layuiadmin-badge">月</span></div>
                <div class="layui-card-body ">
                    <p class="layuiadmin-big-font">33,555</p>
                    <p>新下载
                        <span class="layuiadmin-span-color">10%
                                    <i class="layui-inline layui-icon layui-icon-face-smile-b"></i></span>
                    </p>
                </div>
            </div>
        </div>
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">系统信息</div>
                <div class="layui-card-body ">
                    <table class="layui-table">
                        <tbody>
                        <tr>
                            <th>版本</th>
                            <td>1.0.0</td>
                        </tr>
                        <tr>
                            <th>服务器地址</th>
                            <td>www.shujuku.online/39.105.82.150</td>
                        </tr>
                        <tr>
                            <th>操作系统</th>
                            <td>Linux</td>
                        </tr>
                        <tr>
                            <th>运行环境</th>
                            <td>Tomcat8</td>
                        </tr>
                        <tr>
                            <th>jdk版本</th>
                            <td>1.8</td>
                        </tr>
                        <tr>
                            <th>MYSQL版本</th>
                            <td>5.5</td>
                        </tr>
                        <tr>
                            <th>Spring版本</th>
                            <td>5.2.0</td>
                        </tr>
                        <tr>
                            <th>上传附件限制</th>
                            <td>2M</td>
                        </tr>
                        <tr>
                            <th>执行时间限制</th>
                            <td>30s</td>
                        </tr>
                        <tr>
                            <th>图片服务器地址</th>
                            <td>39.105.82.150:9999</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div class="layui-col-md12">
            <div class="layui-card">
                <div class="layui-card-header">开发团队</div>
                <div class="layui-card-body ">
                    <table class="layui-table">
                        <tbody>
                        <tr>
                            <th>版权所有</th>
                            <td>北华大学-数据库工作室
                                <a href="http://www.beihua.edu.cn/" target="_blank">访问官网</a></td>
                        </tr>
                        <tr>
                            <th>石皓岩</th>
                            <td>石皓岩(923463567@qq.com)</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <style id="welcome_style"></style>
        <div class="layui-col-md12">
            <blockquote class="layui-elem-quote layui-quote-nm">感谢layui,百度Echarts,jquery,本系统由x-admin提供技术支持。</blockquote>
        </div>
    </div>
</div>
</div>
</body>
</html>