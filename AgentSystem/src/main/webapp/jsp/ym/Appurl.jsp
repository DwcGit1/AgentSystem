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
    <script src="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/layui.js"type="text/javascript"></script>
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
        function updateAppConfig(){
            var configValue=$('#configValue').val();
            var msg = "您确定要修改吗？";
            if (confirm(msg)==true){
                //将被绑定的元素（a）转换成jquery对象，可以使用jquery方
                window.location.href="${pageContext.request.contextPath}/appurlConfig/updateConfig/?configValue="+configValue;
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
<table style="width: 1500px;">

</table>
<table class="layui-table" style="width: 1300px;text-align: center">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>
    <%-- <thead>

     </thead>--%>
    <tbody align="center">
    <tr align="center" style="text-align: center;line-height: 50px">
        <th align="center" style="text-align: center"><h2>APP URL管理-填写制作APP的系统的URL地址</h2></th>
    </tr>
    <tr align="center" style="text-align: center;line-height: 50px">
        <th align="center" style="text-align: center;line-height: 50px">
            <c:forEach items="${appConfig}" var="appConfigInfo" varStatus="status">
                配置名称:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="text" value="${appConfigInfo.configTypeName}" readonly="true" style="height: 30px;text-align: center" >
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                配置数值:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="text"  id="configValue" value="${appConfigInfo.configValue}" style="height: 30px;text-align: center"><br>
                <button type="button" class="layui-btn layui-btn-sm" onclick="updateAppConfig()" style="width:60px;text-align: center">保存</button>
            </c:forEach>
        </th>
    </tr>
    <%--  <tr align="center" style="line-height: 50px">
          <th  align="center" style="text-align: center">

          </th>
      </tr>--%>
    </tbody>
</table>
</body>
</html>
