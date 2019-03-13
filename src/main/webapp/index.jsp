<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <title>后台管理系统-登录</title>
    <%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
     %>

    <link rel="stylesheet" type="text/css" href="${APP_PATH }/static/layui/css/layui.css" media="all" />
    <link rel="stylesheet" type="text/css" href="${APP_PATH }/static/css/login.css" />
</head>
<body class="beg-login-bg">

<%
//     String ip = request.getHeader("x-forwarded-for");
//     if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
//         ip = request.getHeader("Proxy-Client-IP");
//     }
//     if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
//         ip = request.getHeader("WL-Proxy-Client-IP");
//     }
//     if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){
//         ip = request.getRemoteAddr();
//     }
//     ip = ip.equals("0:0:0:0:0:0:0:1")?"127.0.0.1":ip;
 %>
    <div class="beg-login-box">
        <header>
            <h1>农业银行预约后台管理</h1>
        </header>
        <div class="beg-login-main">
             <form action="${APP_PATH}/admin/checkLogin" method="post" class="layui-form">
           
                <div class="layui-form-item">
                    <label class="beg-login-icon">
                        <i class="layui-icon">&#xe612;</i>
                    </label>
                    <input type="text" lay-verify="required" name="adminuser" autocomplete="off" placeholder="这里输入账号" class="layui-input" >
                </div>
                <div class="layui-form-item">
                    <label class="beg-login-icon">
                        <i class="layui-icon">&#xe642;</i>
                    </label>
                    <input type="password" lay-verify="required" name="adminpassword" autocomplete="off" placeholder="这里输入密码" class="layui-input" >
                </div>
                <div class="layui-form-item">
                    <div class="beg-pull">
                        <button type="submit" class="layui-btn layui-btn-normal" style="width:100%;" lay-submit lay-filter="*">
                                                                      登　　录
                        </button>
                    </div>
                </div>
       
             </form>
      
        </div>
 
        <footer>
            <p>Design by 叮咚科技  © </p>
        </footer>
    </div>
    <script type="text/javascript" src="${APP_PATH }/static/javascript/jquery.min.js"></script>
    <script type="text/javascript" src="${APP_PATH }/static/layui/layui.all.js"></script>
   
</body>

</html>