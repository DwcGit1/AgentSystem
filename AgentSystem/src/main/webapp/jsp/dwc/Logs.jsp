<%--
  Created by IntelliJ IDEA.
  User: 丿啊文
  Date: 2019/10/18
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看操作日志</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/css/layui.css">
</head>
<body>
<table class="layui-hide" id="test" lay-filter="test"></table>

<script src="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/layui.all.js" charset="utf-8"></script>
<script>
    layui.use('table', function() {
        var table = layui.table;

        table.render({
            elem: '#test',
            url: '${pageContext.request.contextPath}/sys/showLogs.json',
            title: '日志表',
            cols: [
                [{
                    field: 'id',
                    title: '序号',
                    fixed: 'left',
                    unresize: true,
                    sort: true
                }, {
                    field: 'userName',
                    title: '用户名称',
                    unresize: true
                }, {
                    field: 'operateInfo',
                    title: '操作信息',
                    unresize: true
                },{
                    field: 'operateDatetime',
                    title: '操作时间',
                    unresize: true
                }]
            ],
            page: true,
            limit: 3
        });
    });
</script>
</body>
</html>
