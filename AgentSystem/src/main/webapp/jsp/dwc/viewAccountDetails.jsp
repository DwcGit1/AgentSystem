<%--
  Created by IntelliJ IDEA.
  User: 丿啊文
  Date: 2019/10/10
  Time: 10:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>查看账户明细</title>
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
                url: '${pageContext.request.contextPath}/sys/showAccountDetailService.json',
                title: '用户数据表',
                cols: [
                    [{
                        field: 'id',
                        title: '序号',
                        fixed: 'left',
                        unresize: true,
                        sort: true
                    }, {
                        field: 'detailTypeName',
                        title: '账务类型',
                        unresize: true
                    }, {
                        field: 'money',
                        title: '账务资金',
                        unresize: true,
                        sort: true
                    }, {
                        field: 'accountMoney',
                        title: '账户余额',
                        unresize: true
                    }, {
                        field: 'memo',
                        title: '备注信息',
                        unresize: true
                    },  {
                        field: 'detailDateTime',
                        title: '明细时间',
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
