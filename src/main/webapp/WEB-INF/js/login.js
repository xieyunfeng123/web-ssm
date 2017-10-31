
function LoginOnClick() {
    var name = document.getElementById("user_name");
    var password = document.getElementById("user_password");
    var xmlhttp;
    if(name.value == ""){
        alert("用户名不能为空！");
        return false;
    }
    if(password.value == ""){
        alert("密码不能为空！");
        return false;
    }
    alert(window.location.pathname);
    var test = window.location.host;
    alert(window.location.pathname);
    if (window.XMLHttpRequest)
    {
        // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
        xmlhttp=new XMLHttpRequest();
    }
    else
    {
        // IE6, IE5 浏览器执行代码
        xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.open("POST","http:localhost:8080/user/login",true);
    xmlhttp.send("name="+ name+"&password="+password);
    xmlhttp.onreadystatechange=function()
    {
        if (xmlhttp.readyState==4 && xmlhttp.status==200)
        {
            alert(xmlhttp.responseText);
        }
        else
        {
            alert(xmlhttp.responseText+"======123=======");
        }
    }

    // xmlhttp.send();
    // return false;
}
