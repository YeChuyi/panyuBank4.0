<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
  <title>网点详情</title>
  <link rel="stylesheet" href="<%=basePath%>admin/layui/css/layui.css">
  <link rel="stylesheet" href="<%=basePath%>admin/css/global.css">
  <link rel="stylesheet" href="<%=basePath%>admin/icheck/minimal/red.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">预约后台管理</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          贤心
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
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
        
        <li class="layui-nav-item layui-nav-itemed">
          <a class="" href="javascript:;">服务网点管理</a>
          <dl class="layui-nav-child">
            <dd><a class="layui-this" href="<%=basePath%>admin/serverBank.jsp">网点信息</a></dd>
          </dl>
        </li>
        
        <li class="layui-nav-item ">
          <a class="" href="javascript:;">预约管理</a>
          <dl class="layui-nav-child">
            <dd><a href="<%=basePath%>admin/personal.jsp">个贷预约</a></dd>
            <dd><a href="<%=basePath%>admin/perBank.jsp">私行预约</a></dd>
          </dl>
        </li>
        
        <li class="layui-nav-item">
          <a href="javascript:;">用户管理</a>
          <dl class="layui-nav-child">
            <dd><a href="<%=basePath%>admin/userPersonal.jsp">个贷用户</a></dd>
            <dd><a href="<%=basePath%>admin/userPerBank.jsp">私行用户</a></dd>
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
                    <dd><a href="<%=basePath%>admin/appInfo.jsp">通知管理</a></dd>
                </dl>
            </li>

        <li class="layui-nav-item">
            <a href="javascript:;">系统设置</a>
            <dl class="layui-nav-child">
                <dd><a href="<%=basePath%>admin/admin.jsp">后台用户</a></dd>
                <dd><a href="<%=basePath%>admin/manager.jsp">客户经理</a></dd>
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
		  			<a href="<%=basePath%>admin/serverBank.jsp"><button class="layui-btn"><i class="layui-icon"></i></button></a>
		  		服务网点-新增
		  		</legend>
			</fieldset>
		</blockquote>
 
 
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
		  <legend>新增网点</legend>
		</fieldset>
		 
		<form class="layui-form" action="">
			  
			  
				<div class="layui-form-item">

				    <div class="layui-inline">
					    <label class="layui-form-label">名称</label>
					    <div class="layui-input-inline">
					      <input type="text" name="" lay-verify="required" class="layui-input" value="">
					    </div>
				    </div>
				    
				    <div class="layui-inline">
					    <label class="layui-form-label">类型</label>
					    <div class="layui-input-inline">
					      <select name="interest" lay-filter="aihao">
					        <option selected="selected" value="网点">网点</option>
					        <option value="支行">支行</option>
					      </select>
					    </div>
				    </div>
				</div>
				
				
			  
			  	<div class="layui-form-item">
			  	
				    <div class="layui-inline">
					    <label class="layui-form-label">纬度</label>
					    <div class="layui-input-inline">
					      <input type="text" name="" lay-verify="required|number" class="layui-input" value="">
					    </div>
				    </div>
				    
				    <div class="layui-inline">
					    <label class="layui-form-label">经度</label>
					    <div class="layui-input-inline">
					      <input type="text" name="" lay-verify="required|number" class="layui-input" value="">
					    </div>
				    </div>
				    
		  		</div>
			  
			  	<div class="layui-form-item">
			  		<label class="layui-form-label">地址</label>
			  		<div class="layui-input-block">
						<input type="text" name="" lay-verify="required" placeholder="请输入网点地址" class="layui-input">
					</div>
				</div>
			  
			  
		  
		  
		  		<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">备注</label>
					<div class="layui-input-block">
						<textarea class="layui-textarea" name="xxx">{{绑定的}}</textarea>
					</div>
			  	</div>
			  	
			  	
			  	<div class="layui-form-item">
					  	<div class="layui-input-block">
						    <div class="layui-inline">
						      	<button type="submit" lay-submit lay-filter="*" class="layui-btn" >保存</button>
						    </div>
						</div>
				</div>
		</form>
		
		
		
		
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
		  <legend>查询纬、经度</legend>
		</fieldset>
		
			<style type="text/css"> 
			 	.wrapper{ width:1000px; height:650px; margin:0 auto; overflow:hidden; position:relative; border:1px;}
			  	.iframe { width:120%;height:800px; position:absolute; top:-130px; left:-200px; }
			</style> 
			<div class="wrapper"> 
				<iframe class="iframe" src="https://lbs.qq.com/tool/getpoint/" scrolling="no" frameborder="0"></iframe>
			</div>
  
  
		









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
</body>
</html>