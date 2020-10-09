<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">

    <title>后台::狐妖论坛</title>

    <link type="text/css" rel="stylesheet" href="./css/base.css">
    <link type="text/css" rel="stylesheet" href="./css/notify.css">
    <style type="text/css">
        #app input {
            width: 88%;
        }

        #app label {
            width: 35px;
        }
    </style>

</head>
<body>
<div id="app" class="login">
    <div class="single-bg"></div>
    <div class="notify-container"></div>
    <div class="main padding-limiter">
        <div class="panel login-panel">
            <div class="double-column">
                <img class="panel-wide login-img" src="./image/login.jpg">
                <div class="panel-narrow" id="p-login">
                    <div class="title">
                        后台登录
                    </div>
                    <form action="${pageContext.request.contextPath}/admin/login" method="POST">
                        <div class="control-group">
                            <label>账户</label>
                            <div class="controls">
                                <input id="username" type="text" title="账户" name="username">
                            </div>
                        </div>
                        <div class="control-group">
                            <label>密码</label>
                            <div class="controls">
                                <input id="password" type="password" title="密码" name="password">
                            </div>
                        </div>
                        <div class="actions">
                            <button type="submit" class="btn" id="login">登录</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>