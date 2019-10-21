<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/10/9
  Time: 7:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>

    <script src="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/layui.js"type="text/javascript"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/css/layui.css"/>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

</head>
<body>

<ul class="layui-nav" lay-filter="">
    <li class="layui-nav-item">
        <a href="">代理商管理</a>
        <dl class="layui-nav-child"> <!-- 二级菜单 -->
            <dd><a href="">关键词申请</a></dd>
            <dd><a href="">代理商客户管理</a></dd>
            <dd><a href="">代理商预付款</a></dd>
            <dd><a href="">关键词申请管理</a></dd>
            <dd><a href="">操作日志</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item layui-this">
        <a href="">门户管理</a>
    </li>
    <li class="layui-nav-item">
        <a href="">报表管理</a>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;">系统管理</a>
        <dl class="layui-nav-child"> <!-- 二级菜单 -->
            <dd><a href="">财务管理</a></dd>
            <dd><a href="">角色管理</a></dd>
            <dd><a href="">角色权限配置</a></dd>
            <dd><a href="">用户管理</a></dd>
            <dd><a href="">关键词审核</a></dd>
        </dl>
    </li>
    <li class="layui-nav-item">
        <a href="javascript:;">系统配置管理</a>
        <dl class="layui-nav-child">
            <dd><a href="">财务类型</a></dd>
            <dd><a href="">服务类型</a></dd>
            <dd><a href="">服务年限</a></dd>
            <dd><a href="">APP地址</a></dd>
            <dd><a href="">客户类型</a></dd>
            <dd><a href="">证据类型</a></dd>
            <dd><a href="">优惠类型</a></dd>
        </dl>

    </li>
</ul>
<script>
  /*  //一般直接写在一个js文件中
    layui.use(['layer', 'form'], function(){
        var layer = layui.layer
            ,form = layui.form;

        layer.msg('Hello World');
    });*/
    //注意：导航 依赖 element 模块，否则无法进行功能性操作
    layui.use('element', function(){
        var element = layui.element;

        //…
    });
</script>

</body>
</html>
