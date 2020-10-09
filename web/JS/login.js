function submitFun(){
    var name = document.getElementById("userName").value;
    var pwd = document.getElementById("userPw").value;

    if (name != ""){
        if (pwd != ""){
            return true;
        }else {
            alert("密码不能为空");
        }
    }else {
        alert("用户名不能为空");
    }
    return false;
}