<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 28444
  Date: 2020/9/15
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>帖子列表</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/viewTopic.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/post.css">
</head>
<body>
    <div class="bg">
        <div style="float: left;width: 100%;">
            <%@include file="header.jsp" %>
        </div>
        <div>
            <table style="border-collapse:collapse;">
                <thead>
                    <tr>
                        <th class="left">主题</th>
                        <th class="center">观看</th>
                        <th class="center">回复</th>
                        <th class="right">最后发表</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${topicList}" var="topic">
                        <tr>
                            <td class="left">
                                <a href="${pageContext.request.contextPath}/bbs/thread?fid=${param.fid}&pid=${topic.pid}">${topic.subject}</a>
                            </td>
                            <td class="center">${topic.view}</td>
                            <td class="center">${topic.replies}</td>
<%--                            <td class="right">${topic.addtime}</td>--%>
                            <td class="right"><fmt:formatDate value="${topic.addtime}" type="both" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="postBox">
            <div class="postTitle">发布主题</div>
            <form action="${pageContext.request.contextPath}/bbs/post?fid=${param.fid}" method="post">
                <c:choose>
                    <c:when test="${sessionScope.user != null}">
                        <div>
                            <table>
                                <tr>
                                    <td>主题</td>
                                    <td><input type="text" name="subject" class="subject"></td>
                                </tr>
                                <tr>
                                    <td>内容</td>
                                    <td><textarea cols="100px" rows="15" name="content" wrap="hard"></textarea></td>
                                </tr>
                                <tr>
                                    <td colspan="2" align="center">
                                        <input type="submit" value="发布">
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </c:when>
                    <c:otherwise>
                        未登录,请<a href="${pageContext.request.contextPath}/bbs/login">登录</a>
                    </c:otherwise>
                </c:choose>
            </form>
        </div>
    </div>
</body>
</html>
