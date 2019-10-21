<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/10/13
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><%@ page import="java.text.SimpleDateFormat" %>
    <%@ page import="java.util.Calendar" %>
    <%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/10/9
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

    <html>

    <head>

        <title>Title</title>
        <script src="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/layui.js"type="text/javascript">

        </script>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/css/layui.css"/>
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <%--<link rel="stylesheet" href="layui\css\layui.css"  media="all">--%>
        <script src="https://heerey525.github.io/layui-v2.4.3/layui/layui.js"></script>
        <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
        <link rel="stylesheet" href="https://heerey525.github.io/layui-v2.4.3/layui/css/layui.css">
        <style type="text/css">
            #addusers{
                color:white;
            }
        </style>
        <script>
            /*layui.use('layer', function(){
                var layer = layui.layer;
                layer.msg('hello');
            });*/


            function updateconfig(thist,id){
                var configTypeName=$(thist).parent().parent().children().eq(1).text();
                var configValue=$(thist).parent().parent().children().eq(2).text();
                var isStart=$(thist).parent().parent().children().eq(3).text();
                /*if(typeof userPassword=="number"){
                    userPassword+='';
                }*/
                console.log($(thist)+'-----------------')
                layer.confirm('<div style="padding: 50px 30px;">'+'<b>您正在进行修改操作</b><hr><br>' +
                    '<form action="${pageContext.request.contextPath}/serviceconfig/updateConfig?id='+id+'" method="post" id="Sub"><table  align="center" style="border-collapse:separate; border-spacing:0px 10px;">'
                    +'<tr align="center"><td align="center">配置类型:<input type="text" name="configTypeName" id="configTypeName" style="width:150px;" value='+configTypeName+'></td></tr>'+
                    '<tr align="center"><td align="center">配置数值:<input type="text" name="configValue" id="configValue" style="width:150px;" value='+configValue+'></td></tr>'+
                    '<tr align="center"><td align="center"><span>是否启用:</span><select  name="isStart" id="isStart" style="width:150px;text-align:center;height:25px" value='+isStart+'><option  value="1">启用' +
                    '</option><option value="0">不启用</option></select></td><tr>'+
                    '<input type="hidden" id="sa" name="id"></table></form>'+'</div>',{
                    btn: ['保存', '取消']
                    ,yes: function(index, layero){
                        $("#Sub").submit();
                    }
                }, function(index, layero){
                });
            }

            function add(){
                layer.confirm('<div style="padding: 50px 30px;">'+'<b>您正在进行添加操作</b><hr><br>' +
                    '<form action="${pageContext.request.contextPath}/serviceconfig/addConfig" method="post" id="Sub"><table  align="center" style="border-collapse:separate; border-spacing:0px 10px;">'
                    +'<tr align="center"><td align="center">类型名称:'+'<input type="text" name="configTypeName" id="configTypeName" style="width:150px;">'+'</td></tr>'+
                    '<tr align="center"><td align="center">类型数值:<input type="text" name="configValue" id="configValue" style="width:150px;"></td></tr>'+
                    '<tr align="center"><td align="center"><span>是否启用:</span><select  name="isStart" id="isStart" style="width:150px;text-align:center;height:25px">' +
                    '<option  value="1">启用' + '</option><option value="0">不启用</option></select></td><tr>'+
                    '<input type="hidden" id="sa" name="id"></table></form>'+'</div>',{
                    btn: ['保存', '取消']
                    ,yes: function(index, layero){
                        $("#Sub").submit();
                    }
                }, function(index, layero){
                });
            }
            layui.use('layer', function(){ //独立版的layer无需执行这一句
                var $ = layui.jquery, layer = layui.layer; //独立版的layer无需执行这一句
                $('#layerDemo .layui-btn').on('click', function(){
                    var othis = $(this), method = othis.data('method');
                    active[method] ? active[method].call(this, othis) : '';
                });
            });
            function delet(id){
                var msg = "您确定要删除吗？";
                if (confirm(msg)==true){
                    //将被绑定的元素（a）转换成jquery对象，可以使用jquery方

                    window.location.href="${pageContext.request.contextPath}/serviceconfig/deleteconfig/?id="+id;
                    //你也可以在这里做其他的操作
                }else{
                    return false;
                }
            }

        </script>
    </head>
<body>
<%
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String value = format.format(new Date());
%>
<table style="width:1300px;" class="layui-table" align="center">
    <tr align="center">
        <td align="center"><h2><span style="text-align: center">服务类型</span></h2></td>
    </tr>
</table>
<table style="width: 1500px;">
    <thead>
    <tr>
        <th align="left">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     &nbsp;
            <button type="button" class="layui-btn layui-btn-sm" onclick="add()" style="width: 50px">
                <i class="layui-icon">&#xe654;</i>
            </button>
        </th>
    </tr>
    </thead>
</table>
<table class="layui-table" style="width: 1300px;text-align: center">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>

    <thead>
    <tr align="center">
        <th align="center" style="text-align: center">序号</th>
        <th align="center" style="text-align: center">配置类型</th>
        <th align="center" style="text-align: center">配置数值</th>
        <th align="center" style="text-align: center">是否启用</th>
        <th align="center" style="text-align: center">操作</th>
    </tr>
    </thead>
    <tbody align="center">
    <c:forEach items="${serviceSystemconfigs}" var="serviceconfigInfo" varStatus="status">
        <tr align="center" style="text-align: center">
            <th align="center" width="17%" style="text-align: center">${serviceconfigInfo.id}</th>
            <th align="center" width="17%" style="text-align: center">${serviceconfigInfo.configTypeName}</th>
            <th align="center" width="17%" style="text-align: center">${serviceconfigInfo.configValue}</th>
            <c:if test="${serviceconfigInfo.isStart==1}"><th width="17%" style="text-align: center">启用</th></c:if>
            <c:if test="${serviceconfigInfo.isStart==0}"><th width="17%" style="text-align: center">不启用</th></c:if>
            <th width="20%" align="center" style="text-align: center">
                <button type="button" class="layui-btn layui-btn-sm" onclick="updateconfig(this,${serviceconfigInfo.id})">
                    <i class="layui-icon">&#xe642;</i>
                </button>

                    <%-- <a href="${pageContext.request.contextPath}/role/deleteRoles?id=${roleInfo.id}">--%>
                <button type="button" class="layui-btn layui-btn-sm" onclick="delet(${serviceconfigInfo.id})">
                    <i class="layui-icon">&#xe640;
                    </i>
                </button>
                    <%--</a>--%>

            </th>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

<title>Title</title>
</head>
<body>

</body>
</html>
