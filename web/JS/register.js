var flag = false;
    document.getElementById("userName").onblur = function (){
        flag = false;
        var uPattern = /^[a-zA-Z0-9_-]{4,16}$/;
        var name = document.getElementById("userName").value;
        if (uPattern.test(name)) {
            flag = true;
        } else {
            alert("用户名名不合法");
        }
    }
    document.getElementById("userPw").onblur = function (){
        flag = false;
        var uPattern = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,}$/;
        var password = document.getElementById("userPw").value;
        if (uPattern.test(password)) {
            flag = true;
        } else {
            alert("密码强度不够,至少8个字符，至少1个字母，1个数字和1个特殊字符");
        }
    }
    document.getElementById("userPw2").onblur = function (){
        flag = false;
        var pwd = document.getElementById("userPw").value;
        var pwd2 = document.getElementById("userPw2").value;
        if (pwd == pwd2) {
            flag = true;
        } else {
            alert("两次密码不相同");
        }
    }
    document.getElementById("phone").onblur = function (){
        flag = false;
        var uPattern = /^1(3|4|5|6|7|8|9)\d{9}$/;
        var phone = document.getElementById("phone").value;
        if (uPattern.test(phone)) {
            flag = true;
        } else {
            alert("手机号码不合法");
        }
    }
    document.getElementById("email").onblur = function (){
        flag = false;
        var uPattern = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;
        var email = document.getElementById("email").value;
        if (uPattern.test(email)) {
            flag = true;
        } else {
            alert("邮箱不合法");
        }
    }

    function submitFun(){
        flag = false;
        var name = document.getElementById("userName").value;
        var pwd = document.getElementById("userPw").value;
        var pwd2 = document.getElementById("userPw2").value;
        var phone = document.getElementById("phone").value;
        var email = document.getElementById("email").value;

        if (name != ""){
            if (pwd != ""){
                if (pwd2 != ""){
                    if (phone != ""){
                        if (email != ""){
                            flag = true;
                        }else {
                            alert("邮箱不能为空");
                        }
                    }else {
                        alert("手机号不能为空");
                    }
                }else {
                    alert("确认密码不能为空");
                }
            }else {
                alert("密码不能为空");
            }
        }else {
            alert("用户名不能为空");
        }
        return flag;
    }