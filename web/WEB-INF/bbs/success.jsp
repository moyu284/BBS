<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 28444
  Date: 2020/9/18
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${sessionScope.pageTies}成功</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/background.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/success.css">
</head>
<body>
<div class="bg">
    <div style="float: left;width: 100%;">
        <%@include file="header.jsp"%>
    </div>
    <div class="context">
        <p>${sessionScope.pageTies}成功，即将跳转回之前页面，如果未跳转请点击<a href="${sessionScope.redirectUrl}">这里</a></p>
    </div>
</div>
<script>
    setInterval(function (){window.location.href='${sessionScope.redirectUrl}'},3000);
</script>
</body>
</html>
