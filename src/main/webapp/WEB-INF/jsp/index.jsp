<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>登录</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <link rel="stylesheet" href="css/login.css">
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <script src="js/login.js"></script>
</head>
<body>
<div class="container">
    <div style="background-color: rgba(255,255,255,0.8);height: 50%;width: 400px;margin: 15% auto; border-radius: 5px;">
        <div class="bj_bai">
            <p class="text-gradient">登录</p>
            <form role="form" onsubmit="return LoginOnClick()">
                <div style="text-align: center"><input  type="text" class="kuang_txt" placeholder="手机号" id="user_name">
                </div>
                <div  style="text-align: center"><input  type="password" class="kuang_txt" placeholder="密码" id="user_password">
                </div>
                <div class="checkbox">
                    <input type="checkbox"><span style="color: grey">请记住我</span>
                </div>
                <input name="登录" type="submit" class="btn_zhuce" value="登录"  >
            </form>
        </div>
    </div>
</div>
</body>
</html>
