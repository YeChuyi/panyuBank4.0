<%@page import="com.bank.service.impl.AdminServiceImpl"%>
<%@page import="com.bank.service.AdminService"%>
<%@ page language="java" import="java.util.*,com.bank.bean.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <base href="<%=basePath%>">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>管理员信息</title>
  <link rel="stylesheet" href="<%=basePath%>admin/layui/css/layui.css">
  <link rel="stylesheet" href="<%=basePath%>admin/css/global.css">
  <link rel="stylesheet" href="<%=basePath%>admin/icheck/minimal/red.css">
</head>

<body class="layui-layout-body">
<%
        request.setCharacterEncoding("utf-8");
   		response.setCharacterEncoding("utf-8");
   		
%>

<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">农行广州番禺支行预约系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
        叶子
        </a>
        <dl class="layui-nav-child">
        	<dd><a href="<%=basePath%>admin/adminPersonal.jsp">基本信息</a></dd>
          	<dd><a href="<%=basePath%>admin/updatePassword.jsp">修改密码</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="LogoutServlet">注销</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
      
        <li class="layui-nav-item"><a href="<%=basePath%>admin/index.jsp">首页</a></li>
        
        <li class="layui-nav-item ">
          <a class="" href="javascript:;">预约管理</a>
          <dl class="layui-nav-child">
            <dd><a href="<%=basePath%>admin/personal.jsp">个贷预约</a></dd>
          </dl>
        </li>
        
        <li class="layui-nav-item">
          <a href="javascript:;">用户管理</a>
          <dl class="layui-nav-child">
            <dd><a href="<%=basePath%>admin/userPersonal.jsp">个贷用户</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item ">
            <a href="javascript:;">留言管理</a>
            <dl class="layui-nav-child">
                <dd><a href="<%=basePath%>admin/speak.jsp">留言板</a></dd>
            </dl>
        </li>
        
        <li class="layui-nav-item">
                <a href="javascript:;">前端设置</a>
                <dl class="layui-nav-child">
                    <dd><a href="<%=basePath%>admin/appText.jsp">页面说明</a></dd>
                </dl>
            </li>

        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">系统设置</a>
            <dl class="layui-nav-child">
            	<dd><a class="layui-this" href="<%=basePath%>admin/adminPersonal.jsp">管理员信息</a></dd>
                <dd><a href="<%=basePath%>admin/system_log.jsp">系统日志</a></dd>
            </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">
		<blockquote class="layui-elem-quote">
			<fieldset class="layui-elem-field layui-field-title">
		  		<legend>
		  		管理员-设置
		  		</legend>
			</fieldset>
		</blockquote>
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
		  	<legend>基本信息</legend>
		</fieldset>
		
		<form class="layui-form" action="updateAdminPersonalServlet" method="post">
			
				<div class="layui-form-item">
				    <div class="layui-inline">
				      <label class="layui-form-label">ID</label>
				      <div class="layui-input-inline">
				        <input type="text" class="layui-input" readonly="readonly" name="adminPersonalId" value="">
				      </div>
				    </div>
				    
				    <div class="layui-inline">
				      <label class="layui-form-label">账号</label>
				      <div class="layui-input-inline">
				        <input type="text" class="layui-input" readonly="readonly" value="">
				      </div>
				    </div>
				    
				    <!-- 隐藏提示msg -->
				    <div class="layui-inline">
				      <label class="layui-form-label"></label>
				      <div class="layui-input-inline">
				        <input type="hidden" class="layui-input" readonly="readonly" id="msg" value="">
				      </div>
				    </div>
			 	</div>
		
		  		<div class="layui-form-item">
				    <div class="layui-inline">
				      <label class="layui-form-label">经理姓名</label>
				      <div class="layui-input-inline">
				        <input type="text" class="layui-input" lay-verify="required" name="adminPersonalName" value="" placeholder="（必填）">
				      </div>
				    </div>
				    
				    <div class="layui-inline">
				      <label class="layui-form-label">手机号</label>
				      <div class="layui-input-inline">
				        <input type="text" class="layui-input" lay-verify="required|phone" name="adminPersonalPhone" value="" placeholder="（必填）">
				      </div>
				    </div>
				    
				    <div class="layui-inline">
				      <label class="layui-form-label">所属网点</label>
				      <div class="layui-input-inline">
				        <input type="text" class="layui-input" disabled="disabled" value="" placeholder="番禺支行营业部">
				      </div>
				    </div>
				</div>
		  		
<hr >
				<div class="layui-form-item">
					<div class="layui-input-block">
						<div class="layui-inline">
						    <button type="submit" lay-submit lay-filter="*" class="layui-btn">保存</button>
						</div>
						<a href="<%=basePath%>admin/updatePassword.jsp">
							<div class="layui-inline">
							    <button type="button" class="layui-btn layui-btn-danger" >修改密码</button>
							</div>
						</a>
					</div>
				</div>
		</form>

		

		
		

    </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>admin/javascript/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/layui/layui.all.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/icheck/icheck.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/javascript/dw.js"></script>

<script type="text/javascript">

layui.use(['layer', 'carousel', 'element'], function(){
	  	var layer = layui.layer	//弹层
		var msg1 = document.getElementById("msg").value;
		
		if(msg1 != "null"){
			
			layer.msg(msg1, {
		        time: 2000, //2s后自动关闭
      		});
		}
});
</script>
</body>
</html>