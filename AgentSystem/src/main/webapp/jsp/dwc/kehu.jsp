<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/css/layui.css">
<html>
<head>
    <title>客户类型</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cac he">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">


</head>
<body>

<script src="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/layui.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

<table class="layui-table" id="user" lay-filter="user"></table>

<script type="text/html" id="barDemo">
        <a><button class="layui-btn layui-btn-sm" type="button"><i class="layui-icon" lay-event="edit"></i></button></a>
        <a><button  class="layui-btn layui-btn-sm" type="button"><i class="layui-icon" lay-event="del"></i></button></a>
</script>


<script type="text/javascript">
    var j;
        //全部用户信息
    var datas;
    //窗口加载
    $(function() {
        $.ajax({
            url : '${pageContext.request.contextPath}/sys/kehu.json',
            type : 'GET',
            data : null,
            dataType : 'json',
            success : function(result){
                datas = result;
            },
            erorr : function() {
                alert("有异常！");
            }
        })
    })


    layui.use(['element','table'], function() {
        var element = layui.element;
        var table = layui.table;
        table.render({
            elem : '#user',
            cols : [ [
                {
                    field : 'id',
                    title : '用户id',
                    unresize : true,
                    sort : true
                },
                {
                    field : 'configTypeName',
                    title : '配置类型',
                    unresize : true,
                    sort : true
                },
                {
                    field : 'isStart',
                    title : '是否启用',
                    unresize : true,
                    templet : function(d) {
                        return d.isStart == 1 ? '启用' : '未启用';
                    }
                },
                {
                    fixed : 'right',
                    title : '操作',
                    toolbar : '#barDemo',
                    unresize : true
                }
            ] ],
            data : datas,
            page : true,
            limit : 8,
            limits : [ 8, 10, 15, 20 ]
        });


        //监听行工具事件
        table.on('tool(user)',function(obj) {
            var data = obj.data;
            //console.log(obj)
            if (obj.event === 'del') {
                layer.confirm('真的删除行么', function(index) {
                    var a=data.id;
                    window.location.href = '${pageContext.request.contextPath}/sys/del.json?id='+data.id;
                    layer.close(index);

                });
            } else if (obj.event === 'edit') {

                var a = data.id;
                $(function () {

                    $.ajax({
                        url: '${pageContext.request.contextPath}/sys/serveupdate.json',
                        type: 'GET',
                        data: {"id": a},
                        dataType: 'json',
                        success: function (result) {
                            j = result[0].configTypeName
                            var xi = result[0].isStart
                            var aaa = result[0].id
                            var cnm = result[0].configValue


                            layer.confirm('<div style="padding: 50px 30px;">' + '<b>您正在进行修改操作</b><hr><br><form action="${pageContext.request.contextPath}/sys/kehuupdate.json" method="get" id="Sub">类型名称:<input type="text" name="configTypeName" id="name"><br><br>是否启用:<select  name="isStart" id="index"><option  value="1">启用</option><option   value="0">不启用</option></select><br> <br><input type="hidden" id="sa" name="id"></form>' + '</div>', {
                                btn: ['修改', '取消'] //可以无限个按钮
                                , yes: function (index, layero) {
                                    $("#Sub").submit();
                                }
                            }, function (index, layero) {

                            });
                            $("#asd ").val(cnm);
                            $("#sa").val(aaa);
                            $("#name").val(j);

                            if (xi == 1) {
                                var a = $("#index").val();
                                $("#index").attr("selected", true);

                            } else if (xi == 2) {
                                document.getElementById("index")[1].selected = true;

                            }
                        },
                        erorr : function() {
                            alert("有异常！");
                        }
                    })
                })
            }
        });

    })

    function test(){
        layer.confirm('<div style="padding: 50px 30px;">' + '<b>您正在进行修改操作</b><hr><br><form action="${pageContext.request.contextPath}/sys/kehuadd.json" method="get" id="Sub">类型名称:<input type="text" name="configTypeName" id="name"><br><br>是否启用:<select  name="isStart" id="index"><option  value="1">启用</option><option   value="0">不启用</option></select><br> <br><input type="hidden" id="sa" name="configType" value="5"></form>' + '</div>', {
            btn: ['添加', '取消'] //可以无限个按钮
            ,yes: function(index, layero){
                $("#Sub").submit();
            }
        }, function(index, layero){

        });

    }
</script>
</body>
</html>
