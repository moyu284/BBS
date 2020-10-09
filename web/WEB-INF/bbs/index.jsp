<%--
  Created by IntelliJ IDEA.
  User: 28444
  Date: 2020/9/11
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>狐妖动漫论坛</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/background.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
</head>
<body>
    <div class="bg">
        <div style="float: left;width: 100%;">
            <%@include file="header.jsp" %>
        </div>
        <div>
            <table style="border-collapse:separate; border-spacing:0px 15px;" >
                <thead>
                <tr>
                    <th class="left">板块</th>
                    <th class="center">主题</th>
                    <th class="center">帖子</th>
                    <th class="right">最后发表</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${indexList}" var="index">
                    <c:forEach items="${index.forumList}" var="forum">
                    <tr>
                        <td class="left">
                            <div>
                                <h3 style="margin:0;">${forum.name}</h3>
                                <p style="margin:0;"><strong>子版块:</strong>
                                <%--    ${pageContext.request.contextPath}    /BBS    --%>
                                    <c:forEach items="${index.subList}" var="sub">
                                        <c:if test="${sub.fup == forum.fid}">
                                            <a href="${pageContext.request.contextPath}/bbs/topic?fid=${sub.fid}">${sub.name}&nbsp;</a>
                                        </c:if>
                                    </c:forEach>
                                </p>
                            </div>
                        </td>
                        <td class="center">${forum.topicNum}</td>
                        <td class="center">${forum.threadNum}</td>
                        <td class="right">${forum.addTime}</td>
                    </tr>
                    </c:forEach>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>
