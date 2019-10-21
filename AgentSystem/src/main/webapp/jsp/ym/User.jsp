<%@ page import="java.text.SimpleDateFormat" %>
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
        function updat(names,ids,finid){
            layer.confirm('<div style="padding: 50px 30px;">'+'<b>您正在进行添加操作</b><hr><br>'
                + '<form action="${pageContext.request.contextPath}/updatFian" method="post" id="Sub">类型名称:<input type="text" name="type" id="name" value='+names+'>' +
                '<br><br>是否启用:<select  name="enabled" id="index"><option  value="1">启用'+'</option><option  id="index" value="2">禁用</option></select><br> <br><'+'input type="hidden" id="sa" name="finid" value='+finid+'></form>'+'</div>',{
                btn: ['修改', '取消']
                ,yes: function(index, layero){
                    $("#Sub").submit();
                }
            }, function(index, layero){

            });
            if(ids==1){
                var a= $("#index").val();
                $("#index").attr("selected",true);

            }else if(ids==2){
                document.getElementById("index")[1].selected=true;
            }
        }
        /*alert($(this).parent().eq(1).text());*/


        function updateUser(thist,id,userPassword){
         /*  var userCode=$(thist).parent().parent().children(":first").text();*/
            var userCode=$(thist).parent().parent().children().eq(0).text();
            var userName=$(thist).parent().parent().children().eq(1).text();
            var roleId=$(thist).parent().parent().children().eq(2).text();
            var isStart=$(thist).parent().parent().children().eq(4).text();
            var userPassword=parseInt(userPassword) ;
            /*if(typeof userPassword=="number"){
                userPassword+='';
            }*/
            console.log($(thist)+'-----------------')
            layer.confirm('<div style="padding: 50px 30px;">'+'<b>您正在进行修改操作</b><hr><br>' +
                '<form action="${pageContext.request.contextPath}/user/updateUser?id='+id+'" method="post" id="Sub"><table  align="center" style="border-collapse:separate; border-spacing:0px 10px;">'
                +'<tr align="center"><td align="center">登录账号:<input type="text" name="userCode" id="userCode" style="width:150px;" value='+userCode+'></td></tr>'+
                '<tr align="center"><td align="center">用户名称:'+'<input type="text" name="userName" id="userName" style="width:150px;" value='+userName+'></td></tr>'+
                '<tr align="center"><td align="center">登录密码:'+'<input type="text" name="userPassword" id="userPassword" style="width:150px;" value='+userPassword+'></td></tr>'+
                '<tr align="center"><td align="center">用户角色:' +
                '<select  name="roleId" id="roleId" style="width:150px;text-align:center;height:25px" value='+roleId+'><option  value="1">系统管理员' +
                '</option><option   value="40">代理商</option><option   value="41">财务</option><option   value="42">客服</option>' +
                '<option   value="43">市场</option><option   value="44">大区市场</option><option   value="45">渠道经理</option></select></td></tr>'+
                '<tr align="center"><td align="center"><span>是否启用:</span><select  name="isStart" id="isStart" style="width:150px;text-align:center;height:25px" value='+isStart+'><option  value="1">启用' +
                '</option><option value="2">不启用</option></select></td><tr>'+
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
                '<form action="${pageContext.request.contextPath}/user/addUser" method="post" id="Sub"><table  align="center" style="border-collapse:separate; border-spacing:0px 10px;">'
                    +'<tr align="center"><td align="center">登录账号:<input type="text" name="userCode" id="userCode" style="width:150px;"></td></tr>'+
                    '<tr align="center"><td align="center">用户名称:'+'<input type="text" name="userName" id="userName" style="width:150px;"></td></tr>'+
                    '<tr align="center"><td align="center">登录密码:'+'<input type="password" name="userPassword" id="userPassword" style="width:150px;"></td></tr>'+
                    '<tr align="center"><td align="center">用户角色:' +
                '<select  name="roleId" id="roleId" style="width:150px;text-align:center;height:25px"><option  value="1">系统管理员' +
                '</option><option   value="40">代理商</option><option   value="41">财务</option><option   value="42">客服</option>' +
                '<option   value="43">市场</option><option   value="44">大区市场</option><option   value="45">渠道经理</option></select></td></tr>'+
                '<tr align="center"><td align="center"><span>是否启用:</span><select  name="isStart" id="isStart" style="width:150px;text-align:center;height:25px"><option  value="1">启用' +
                '</option><option value="2">不启用</option></select></td><tr>'+

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

                window.location.href="${pageContext.request.contextPath}/user/deleteNice/?id="+id;
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
            <td align="center"><h2><span style="text-align: center">用户管理</span></h2></td>
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
            <th align="center" style="text-align: center">登录账号</th>
            <th align="center" style="text-align: center">用户名称</th>
            <th align="center" style="text-align: center">角色名称</th>
            <th align="center" style="text-align: center">创建时间</th>
            <th align="center" style="text-align: center">是否启用</th>
            <th align="center" style="text-align: center">操作</th>
        </tr>
        </thead>
        <tbody align="center">
        <c:forEach items="${userNice}" var="users" varStatus="status">
            <tr align="center" style="text-align: center">
                <th align="center" width="17%" style="text-align: center">${users.userCode}</th>
                <th align="center" width="17%" style="text-align: center">${users.userName}</th>
                <th align="center" width="17%" style="text-align: center">${users.role.roleName}</th>
                    <%--<td>${users.roleName}</td>--%>
                <th align="center" width="17%" style="text-align: center">
                    <fmt:formatDate value="${users.creationTime}" type="both" />
                </th>
                <c:if test="${users.isStart==1}"><th width="17%" style="text-align: center">是</th></c:if>
                <c:if test="${users.isStart==2}"><th width="17%" style="text-align: center">否</th></c:if>
                <th width="20%" align="center" style="text-align: center">
                   <%-- <a href="${pageContext.request.contextPath}/user/addUser?userCode=${users.userCode}">--%>

                    <%--</a>--%>

                    <button type="button" class="layui-btn layui-btn-sm" onclick="updateUser(this,${users.id},${users.userPassword})">
                    <i class="layui-icon">&#xe642;</i>
                    </button>

                    <%--<a href="${pageContext.request.contextPath}/user/deleteNice?id=${users.id}">--%>
                    <button type="button" class="layui-btn layui-btn-sm" onclick="delet(${users.id})">
                        <i class="layui-icon">&#xe640;
                        </i>
                    </button>
                   <%-- </a>--%>

                </th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
