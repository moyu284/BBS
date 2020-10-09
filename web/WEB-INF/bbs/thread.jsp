<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 28444
  Date: 2020/9/16
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>帖子详情</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/thread.css">
</head>
<body>
<div class="bg">
    <div style="float: left;width: 100%;">
        <%@include file="header.jsp" %>
    </div>
    <h3>${threadsList[0].subject}</h3>
    <div>
        <table class="t_table">
            <c:forEach items="${threadsList}" var="thread">
                <thead>
                    <tr>
                        <td class="t_head">${thread.author}</td>
                        <td class="t_head">${thread.addtime}</td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td class="t_center">
                            <div class="user">
                                <img src="${pageContext.request.contextPath}/imge/head/0.jpg" class="img_user">
                                <table align="center">
                                    <tr>
                                        <td>用户名：</td>
                                        <td>${thread.author}</td>
                                    </tr>
                                </table>
                            </div>
                        </td>
                        <td class="t_center">
                            <div class="content">
                                ${thread.content}
                            </div>
                        </td>
                    </tr>
                </tbody>
            </c:forEach>
        </table>
        <div class="messageBox">
            <div class="messageTitle">留言</div>
            <form action="${pageContext.request.contextPath}/bbs/message?fid=${param.fid}&pid=${param.pid}" method="post">
                <c:choose>
                    <c:when test="${sessionScope.user != null}">
                        <div>
                            <textarea cols="100px" rows="15" name="content" wrap="hard"></textarea><br>
                            <input type="submit" value="留言">
                        </div>
                    </c:when>
                    <c:otherwise>
                            未登录,请<a href="${pageContext.request.contextPath}/bbs/login">登录</a>
                    </c:otherwise>
                </c:choose>
            </form>
        </div>
    </div>
</div>
</body>
</html>
