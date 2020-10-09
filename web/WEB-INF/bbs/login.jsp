<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 28444
  Date: 2020/9/10
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>
  <div class="bg">
    <div style="float: left;width: 100%;">
      <%@include file="header.jsp" %>
      ${sessionScope.url}
    </div>

      <form action="${pageContext.request.contextPath}/bbs/loginCheck" method="POST" onsubmit="return submitFun();">
        <div id="div1">
          <div id="div2">
            <c:if test="${requestScope.errorInfo != null}">
                <p style="color: red">用户名或密码错误</p>
              <% request.setAttribute("errorInfo",null);%>
            </c:if>
            <table style="margin:auto">
              <tr>
                <td colspan="2" align="right"><a href="${pageContext.request.contextPath}/bbs/register">注册</a></td>
              </tr>
              <tr>
                <td class="right">用户名</td>
                <td><input type="text" name="userName" id="userName"></td>
              </tr>
              <tr>
                <td class="right">密码</td>
                <td><input type="password" name="userPw" id="userPw"></td>
              </tr>
              <tr>
                <td colspan="2" align="center"><input type="submit" value="登录"></td>
              </tr>
            </table>
          </div>
        </div>
      </form>
  </div> 
</body>
<script src="${pageContext.request.contextPath}/JS/login.js"></script>
</html>
