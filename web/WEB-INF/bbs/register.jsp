<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/register.css">
</head>
<body>
    <div class="bg">
        <div style="float: left;width: 100%;">
            <%@include file="header.jsp" %>
        </div>
        <div id="div1">
            <c:if test="${errorInfo != null}">
                <c:if test="${errorInfo == 'userExists'}">
                    <p style="color: red">用户已存在</p>
<%--                    <% request.setAttribute("errorInfo",null);%>--%>
                </c:if>
                <c:if test="${errorInfo == 'registerFail'}">
                    <p style="color: red">注册失败，请重试</p>
<%--                    <% request.setAttribute("errorInfo",null);%>--%>
                </c:if>
<%--                <% request.setAttribute("errorInfo",null);%>--%>
            </c:if>
            <form action="${pageContext.request.contextPath}/bbs/userRegister" method="POST" onsubmit="return submitFun();">
                <table>
                    <tr>
                        <td class="right">用户名：</td>
                        <td><input type="text" name="userName" id="userName"></td>
                    </tr>
                    <tr>
                        <td class="right">密码：</td>
                        <td><input type="password" name="userPw" id="userPw"></td>
                    </tr>
                    <tr>
                        <td class="right">确认密码：</td>
                        <td><input type="password" id="userPw2"></td>
                    </tr>
                    <tr>
                        <td class="right">手机号：</td>
                        <td><input type="text" name="phone" id="phone" maxlength="11"></td>
                    </tr>
                    <tr>
                        <td class="right">邮箱：</td>
                        <td><input type="text" name="email" id="email"></td>
                    </tr>
                    <tr>
                        <td colspan="2" align="center"><input type="submit" value="注册"></td>
                    </tr>
                </table>
            </form>
        </div>
    </div>

</body>
<script src="../../JS/register.js"></script>
</html>