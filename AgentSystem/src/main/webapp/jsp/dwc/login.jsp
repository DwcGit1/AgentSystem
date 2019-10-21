<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>系统登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/css/layui.css">
    <style>
        .divcss5-a{margin-top: 30px; margin-bottom: 50px; font-size: 25px; font-weight: bold;}
        .login{text-align: center;}
    </style>
</head>
<body>
<form class="layui-form" action="${pageContext.request.contextPath}/user/dologin.html" align="center" method="post">
    <div>
        <div><img src="${pageContext.request.contextPath}/statics/img/u2.png"></div>
        <div class="divcss5-a">
            登录系统 | Sign in
        </div>
        <table align="center">
            <tr>
                <td>
                    <div class="layui-form-item">
                        <label class="layui-form-label">账号：</label>
                        <div class="layui-input-block">
                            <input type="text" name="userCode" required lay-verify="required" placeholder="请输入账号" autocomplete="off"
                                   class="layui-input">
                        </div>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <div class="layui-form-item">
                        <label class="layui-form-label">密码：</label>
                        <div class="layui-input-block">
                            <input type="password" name="userPassword" required lay-verify="required" placeholder="请输入密码" autocomplete="off"
                                   class="layui-input">
                        </div>
                    </div>
                </td>
            </tr>
        </table>
        <div style="margin-top: 10px; font-weight: bold;">
            <button class="layui-btn" lay-submit lay-filter="formDemo" type="submit">登录 | Login</button>
        </div>
    </div>
</form>
<script src="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/layui.js"></script>
<script>
    //Demo
    layui.use(['form','jquery'], function() {
        var form = layui.form;
        var $ = layui.jquery;

        //监听提交
        form.on('submit(formDemo)', function(data) {
            layer.msg(JSON.stringify(data.field));
            var data1 = form.val("formDemo");
            $(data1).each(function(){
                alert($(this))
            })
            return true;
        });
    });
</script>
</body>
</html>
