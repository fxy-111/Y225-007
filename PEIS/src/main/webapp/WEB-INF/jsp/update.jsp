<%--
  Created by IntelliJ IDEA.
  User: 段康家
  Date: 2019/12/6
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>修改页面</title>
</head>

<body>

<h1>项目信息维护</h1>
<form method="post" action="${pageContext.request.contextPath}/physical//update/">

    <input type="hidden" name="intemId" value="${peItem.intemId}"/>
    项目名称:<input type="text" name="intemName" value="${peItem.intemName}"/><br/>
    所属类型:
    <select class="selected" name="typeId">
          <c:forEach items="${itemTypesList}" var="item" >
                <option value="${item.typeId}"
                     <c:if test="${item.typeId==peItem.typeId}">
                        selected="selected"
                     </c:if>>
                    ${item.typeName}
                </option>
          </c:forEach>
    </select>
    <br/>
    是否必填：<input type="checkbox" name="necessary" value="1"
                <c:if test="${peItem.necessary==1}">
                    checked="checked"
                </c:if>
                 <c:if test="${peItem.necessary==2}">
                </c:if>
             />
    <br/>
    参考值:<input type="text" name="ref" value="${peItem.ref}"/><br/>
    价格:<input type="text" name="price" value="${peItem.price}"/><br/>
    说明:<input type="text" name="info" value="${peItem.info}"/><br/>

<input type="submit" value="修改"/> <input type="button" value="取消"/>
</form>
</body>
</html>
