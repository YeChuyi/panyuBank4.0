<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <meta charset="utf-8">
  <base href="<%=basePath%>">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>系统设置</title>
  <link rel="stylesheet" href="<%=basePath%>admin/layui/css/layui.css">
  <link rel="stylesheet" href="<%=basePath%>admin/css/global.css">
  <link rel="stylesheet" href="<%=basePath%>admin/icheck/minimal/red.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>/static/admin/layui/css/layui.css"/>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>/static/admin/css/admin.css"/>
      <!--  <script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script> -->
    <script type="text/javascript" src="<%=basePath %>/static/admin/js/jquery-1.12.4.min.js"></script>
<!--  <link href="${APP_PATH }/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">-->
    <link rel="stylesheet" type="text/css" href="<%=basePath %>/static/admin/css/bootstrap.min.css"/>
    <!--<script src="${APP_PATH }/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> -->
    <script src="<%=basePath %>/static/admin/js/bootstrap.min.js"></script>

  </head>
  
  <body class="layui-layout-body">
    <form>
  <div class="form-group">
    <label for="exampleInputEmail1">账号</label>
    <input type="adminUser" class="form-control" id="exampleInputEmail1" placeholder="账号">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">密码</label>
    <input type="adminPassword" class="form-control" id="exampleInputPassword1" placeholder="密码">
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">密码</label>
    <input type="adminPassword" class="form-control" id="exampleInputPassword1" placeholder="密码">
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">密码</label>
    <input type="adminPassword" class="form-control" id="exampleInputPassword1" placeholder="密码">
  </div>
  <div class="form-group">
    <label for="exampleInputFile">File input</label>
    <input type="file" id="exampleInputFile">
    <p class="help-block">Example block-level help text here.</p>
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox"> Check me out
    </label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
  </body>
</html>
