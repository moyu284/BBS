<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
</head>
<body>
    <a href="${pageContext.request.contextPath}/bbs/index">
        <img src="${pageContext.request.contextPath}/imge/header.jpg">
    </a>
    <div style="float: left;width: 100%;text-align: right">
        <a href="${pageContext.request.contextPath}/bbs/index">首页</a>
        <c:choose>
            <c:when test="${sessionScope.user.userName != null}">
                <a href="${pageContext.request.contextPath}/bbs/logout">注销</a>
            </c:when>
            <c:otherwise>
                <a href="${pageContext.request.contextPath}/bbs/register">注册</a>
                <a href="${pageContext.request.contextPath}/bbs/login">登录</a>
            </c:otherwise>
        </c:choose>
    </div>

    <div style="float: left;width: 100%">
        <p>
        <c:choose>
            <c:when test="${sessionScope.user.userName != null}">
                欢迎回来，${sessionScope.user.userName}阁下。
            </c:when>
            <c:otherwise>
                游客，请<a href="${pageContext.request.contextPath}/bbs/login">登录</a>。
            </c:otherwise>
        </c:choose>
        </p>
    </div>
</body>
</html>