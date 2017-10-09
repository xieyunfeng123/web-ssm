<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>云管理登录</title>
    <link rel="stylesheet" type="text/css" href="../../themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../demo.css">
    <script type="text/javascript" src="../../jquery.min.js"></script>
    <script type="text/javascript" src="../../jquery.easyui.min.js"></script>
</head>
<body>
<div class="easyui-window" style="width:400px;padding:30px 70px 50px 70px;background-color: orange" >
    <div style="margin-bottom:20px">
        <div>Name:</div>
        <input class="easyui-textbox" style="width:100%">
    </div>
    <div style="margin-bottom:20px">
        <div>File1:</div>
        <input class="easyui-filebox" name="file1" data-options="prompt:'Choose a file...'" style="width:100%">
    </div>
    <div style="margin-bottom:20px">
        <div>File2:</div>
        <input class="easyui-filebox" name="file2" data-options="prompt:'Choose another file...'" style="width:100%">
    </div>
    <div>
        <a href="#" class="easyui-linkbutton" style="width:100%">Upload</a>
    </div>
</div>
</body>
</html>
