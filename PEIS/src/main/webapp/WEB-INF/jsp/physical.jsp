<%--
  Created by IntelliJ IDEA.
  User: 段康家
  Date: 2019/12/6
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>主页面</title>

    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.js"></script>

    <script>
        $(function () {
            $("#from").submit(function () {
                var typeId = $(".selected").val();
                if (typeId=="-1"){
                    alert("前选择项目类别")
                    return false;
                }else {
                    return true;
                }
            })
        })
    </script>
</head>
<body>
    <h1>体检项目查询</h1>
    <form id="from" method="post" action="${pageContext.request.contextPath}/physical//query?page=1">
        <select class="selected" name="typeId">
            <option value="-1">--请选择项目类别--</option>
            <c:forEach items="${itemTypes}" var="item">
                <option value="${item.typeId}"
                        <c:if test="${item.typeId==typeId}">
                             selected="selected"
                        </c:if>>
                        ${item.typeName}
                </option>
            </c:forEach>
        </select>
        <input type="submit" value="提交"/>
    </form>
<br/>

    <a href="${pageContext.request.contextPath}/physical//addSaveUl">添加</a>
<table border="1px">
    <tr>
        <td>项目名称</td>
        <td>所属类别</td>
        <td>是否必查</td>
        <td>参考值</td>
        <td>价格</td>
        <td>说明</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${peItems.list}" var="items">
        <tr>
            <td>${items.intemName}</td>
            <td>
                ${items.itemTypes.typeName}
            </td>
            <td>
                <c:if test="${items.necessary==1}">
                    是
                </c:if>
                <c:if test="${items.necessary==2}">
                    否
                </c:if>
            </td>
            <td>${items.ref}</td>
            <td>${items.price}</td>
            <td>${items.info}</td>
            <td>
                <a href= "${pageContext.request.contextPath}/physical//addUpdateUl?intemId=${items.intemId}">修改</a>
                <a href= "${pageContext.request.contextPath}/physical//delete?intemId=${items.intemId}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
    <br/>
当前页是第${peItems.pageNum}页<br/>
一共${peItems.pages}页<br/>
<c:forEach begin="1" end="${peItems.pages}" var="index">
    <a href="${pageContext.request.contextPath}/physical//query?page=${index}&typeId=${typeId}">第${index}页</a>
</c:forEach>

</body>
</html>
