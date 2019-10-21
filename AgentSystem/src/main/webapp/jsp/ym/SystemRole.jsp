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
        #borderNice{
            border: 1px solid #FFFFFF;
        }
        #colorNice{
            background-color: #009688;
            color:white;
        }
        #oneDiv{
            margin-left:10cm;
            border:1px solid #FFFFFF;
            width: 1050px;
            height: 1050px;
            font-size: 15px;
        }

    </style>
    <script>






    </script>
</head>
<body>
<%
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String value = format.format(new Date());
%>
<table style="width:1300px;" class="layui-table" align="center">
    <tr align="center">
        <td align="center"><h2><span style="text-align: center">角色权限管理</span></h2></td>
    </tr>
</table>
<table class="layui-table" style="width: 1300px;text-align: center" id="borderNice">
    <tr id="colorNice">
        <c:forEach items="${role}" var="roleInfo" varStatus="status">
            <td>${roleInfo.roleName}</td>
        </c:forEach>
    </tr>
</table>
    <table class="layui-table" style="width: 1300px;text-align: center" id="hidden">
        <tr>
            <td>功能名称</td>
            <td>功能URL</td>
            <td>创建时间</td>
            <td>是否启用</td>
        </tr>
        <c:forEach items="${function}" var="functionInfo" varStatus="status">
            <tr align="center" >
                <td align="center">${functionInfo.functionName}</td>
                <td align="center">${functionInfo.funcUrl}</td>
                <td align="center"><%--${functionInfo.creationTime}--%>
                    <%--    ${functionInfo.creationTime}--%>
                     <fmt:formatDate value="${functionInfo.creationTime}" type="both"/>
                </td>
                <c:if test="${functionInfo.isStart==1}"><td>启用</td></c:if>
                <c:if test="${functionInfo.isStart==0}"><td>不启用</td></c:if>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
