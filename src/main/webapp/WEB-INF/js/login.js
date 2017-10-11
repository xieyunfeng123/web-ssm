
function LoginOnClick() {
    var name = document.getElementById("user_name");
    var password = document.getElementById("user_password");
    if(name.value == ""){
        alert("用户名不能为空！");
        return false;
    }
    if(password.value == ""){
        alert("密码不能为空！");
        return false;
    }
    return false;
}
