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
</head>
<body>
<div class="container">
    <div style="background: white;height: 50%;width: 400px;margin: 10% auto">
        <div class="bj_bai">
            <p class="text-gradient">登录</p>
            <form action="" method="post">
                <div><input name="" type="text" class="kuang_txt" placeholder="手机号"
                            style="width:236px; height:32px; border:1px solid #dddddd; line-height:32px; padding-left:5px; color:#b1a9a9;  margin-bottom:20px;">
                </div>
                <div><input name="" type="text" class="kuang_txt" placeholder="密码"
                            style="width:236px; height:32px; border:1px solid #dddddd; line-height:32px; padding-left:5px; color:#b1a9a9;  margin-bottom:20px;">
                </div>

                <input name="登录" type="button" class="btn_zhuce" value="登录"
                       style=" width:236px; height:33px; background:#37b5f9; font-size:14px; line-height:33px; text-align:center; border:0px; color:#fff; border-radius:3px; cursor:pointer;margin: 0px 0px 30px 0px">
            </form>
        </div>
    </div>
</div>
</body>
</html>
