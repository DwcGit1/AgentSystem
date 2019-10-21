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
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/statics/layui-v2.5.5/layui/css/layui.css"/>
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
        #fontcolor{
            color:#009688;
        }
        #onetb{
            border:1px solid #cccccc;
        }
        .selectNice{
            color:white;
        }
        .selectNices{
            color:white;
        }
    </style>
    <script>



        /*alert($(this).parent().eq(1).text());*/

       /* 修改客户使用状态*/
        function updateKeywordsGo(thist,id){
            var id=$(thist).parent().parent().children().eq(0).text();
            var msg = "您确定要修改其为使用状态吗？";
            if (confirm(msg)==true){
                //将被绑定的元素（a）转换成jquery对象，可以使用jquery方
                window.location.href="${pageContext.request.contextPath}/keywords/updatekeywords/?id="+id;
            }else{
                return false;
            }
        }
        /*修改客户不使用状态*/
        function updatenotKeywordsGo(thist,id){
            var id=$(thist).parent().parent().children().eq(0).text();
            var msg = "您确定要修改其为不使用状态吗？";
            if (confirm(msg)==true){
                //将被绑定的元素（a）转换成jquery对象，可以使用jquery方
                window.location.href="${pageContext.request.contextPath}/keywords/updatenotkeywords/?id="+id;
            }else{
                return false;
            }
        }

      /*  查询客户审核信息*/
        function keywordsGo(){
            var keywords=$('#key').val();
            window.location.href="${pageContext.request.contextPath}/keywords/showLikekeywords/?key="+keywords+"";
        }
    </script>
</head>
<body>
<%
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    String value = format.format(new Date());
%>
<table>
    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<table width="1500px" id="onetb">
    <tr>
        <td>&nbsp;</td>
    </tr>
    <tr align="center">
        <td align="center"><h2><span style="text-align: center">关键词审核</span></h2></td>
    </tr>
    <tr align="center">
        <td align="center"><hr></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
        <tr>
            <td align="left">&nbsp;&nbsp;&nbsp;
                <span style="line-height: 30px" class="selectNice">关键词:&nbsp;&nbsp;&nbsp;</span>
                <input type="text" height="30px" name="key" style="height:25px;line-height:25px" id="key">
                <input type="button" height="30px"  class="layui-btn" style="height:25px;line-height:25px" onclick="keywordsGo()" class="selectNices" value="查询">&nbsp;&nbsp;&nbsp;

                <span id="fontcolor" style="line-height: 30px">审核流程：已申请(代理商申请)》审核中》通过》续费 | </span>
            </td>
        </tr>

    <tr>
        <td>&nbsp;</td>
    </tr>
</table>
<table class="layui-table" style="width: 1500px;text-align: center">
    <colgroup>
        <col width="150">
        <col width="200">
        <col>
    </colgroup>

    <thead>
    <tr align="center">
        <th align="center" style="text-align: center"width="6%">序号</th>
        <th align="center" style="text-align: center"width="6%">关键词</th>
        <th align="center" style="text-align: center" width="10%">客户名称</th>
        <th align="center" style="text-align: center"width="11%">代理商</th>
        <th align="center" style="text-align: center"width="6%">申请年限</th>
        <th align="center" style="text-align: center"width="11.5%">申请日期</th>
        <th align="center" style="text-align: center"width="12%">到期日期</th>
        <th align="center" style="text-align: center"width="12%">申请到期日期状态</th>
        <th align="center" style="text-align: center"width="7%">审核状态</th>
        <th align="center" style="text-align: center"width="7%">使用状态</th>
        <th align="center" style="text-align: center"width="10%">操作</th>
    </tr>
    </thead>
    <tbody align="center">
    <c:forEach items="${keywords}" var="keywordsInfo" varStatus="status">
        <tr align="center" style="text-align: center">
            <th align="center" style="text-align: center">${keywordsInfo.id}</th>
            <th align="center" style="text-align: center">${keywordsInfo.keywords}</th>
            <th align="center"  style="text-align: center">${keywordsInfo.customName}</th>
            <th align="center" style="text-align: center">${keywordsInfo.agentName}</th>
            <th align="center"  style="text-align: center">${keywordsInfo.serviceYears}</th>
            <th align="center"  style="text-align: center">
                    <span><fmt:formatDate value="${keywordsInfo.regDatetime}" type="both" />
            </th>
            <th align="center"  style="text-align: center">
                    <span><fmt:formatDate value="${keywordsInfo.regPassDatetime}" type="both" />
            </th>
            <c:if test="${keywordsInfo.isPass==0}"><th style="text-align: center">不过期</th></c:if>
            <c:if test="${keywordsInfo.isPass==1}"><th style="text-align: center">预注册过期</th></c:if>
            <c:if test="${keywordsInfo.isPass==2}"><th style="text-align: center">正式注册过期</th></c:if>

            <c:if test="${keywordsInfo.checkStatus==0}"><th  style="text-align: center">已申请</th></c:if>
            <c:if test="${keywordsInfo.checkStatus==1}"><th  style="text-align: center">审核中</th></c:if>
            <c:if test="${keywordsInfo.checkStatus==2}"><th  style="text-align: center">已通过</th></c:if>
            <c:if test="${keywordsInfo.checkStatus==3}"><th  style="text-align: center">未通过</th></c:if>

            <c:if test="${keywordsInfo.isUse==0}"><th style="text-align: center">已使用</th></c:if>
            <c:if test="${keywordsInfo.isUse==1}"><th  style="text-align: center">未使用</th></c:if>

            <th align="center" style="text-align: center">
                <button type="button" class="layui-btn layui-btn-sm" onclick="updateKeywordsGo(this,${keywordsInfo.id})">
                    <i class="layui-icon">&#x1005;</i>
                </button>
                <button type="button" class="layui-btn layui-btn-sm"onclick="updatenotKeywordsGo(this,${keywordsInfo.id})">
                    <i class="layui-icon">&#x1006;</i>
                </button>

            </th>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
