<%@ page language="java" import="java.util.*,com.bank.bean.*,com.bank.service.*,com.bank.service.impl.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">

  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>留言回复</title>
         <%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
     %>
  <link rel="stylesheet" href="${APP_PATH }/static/layui/css/layui.css">
  <link rel="stylesheet" href="${APP_PATH }/static/css/global.css">
  <link rel="stylesheet" href="${APP_PATH }/static/icheck/minimal/red.css">
</head>
<body class="layui-layout-body">
 <%
   request.setCharacterEncoding("UTF-8");
   response.setCharacterEncoding("UTF-8");
  // int messId=Integer.parseInt(request.getParameter("id"));
  // MessageBoardService mbs=new MessageBoardServiceImpl();
 //  MessageBoard mab=mbs.getMessageBoardById(messId);
  
 
  %>
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">农行广州番禺支行预约系统</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
          ${sessionScope.admin.adminposition} : ${sessionScope.admin.adminname }
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
            <dd><a href="<%=basePath%>admin/userPersnal.jsp">个贷用户</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">留言管理</a>
            <dl class="layui-nav-child">
                <dd><a class="layui-this" href="<%=basePath%>admin/speak.jsp">留言板</a></dd>
            </dl>
        </li>
        
        <li class="layui-nav-item">
                <a href="javascript:;">前端设置</a>
                <dl class="layui-nav-child">
                    <dd><a href="<%=basePath%>admin/appText.jsp">页面说明</a></dd>
                </dl>
        </li>

        <li class="layui-nav-item">
            <a href="javascript:;">系统设置</a>
            <dl class="layui-nav-child">
                <dd><a href="<%=basePath%>admin/adminPersonal.jsp">管理员信息</a></dd>
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
		  			<a href="${APP_PATH }/Speak"><button class="layui-btn"><i class="layui-icon"></i></button></a>
		  		留言-回复
		  		</legend>
			</fieldset>
		</blockquote>
 
	
			<div class="layui-form-item layui-form-text">
		    	<label class="layui-form-label">用户留言</label>
			    <div class="layui-input-block">
			      <textarea placeholder=""  name="messusermessage" id="messusermessage" class="layui-textarea" disabled="" ></textarea>
			    </div>
		  	</div>
		  	<form class="layui-form" action="${APP_PATH }/ReplyMessageBoard" method="post">
		  	    <input type="hidden" name="_method" value="PUT"/>
				<input type="hidden" name="messusermessage" id="base_case_2" value=${requestScope.messageBoard.messusermessage }>
					
		  	    <input type="hidden" name="id" value=${requestScope.messageBoard.id }></input>
			<div class="layui-form-item layui-form-text">
		    	<label class="layui-form-label">回复：</label>
			    <div class="layui-input-block">
			      <textarea placeholder="请输入内容" name="adminmessage" class="layui-textarea"></textarea>
			    </div>
		  	</div>
		  	
			<div class="layui-form-item">
			    <div class="layui-input-block">
			      <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
			      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
			  	</div>
		  	</div>
		</form>


<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

<script type="text/javascript">

	    	document.getElementById("messusermessage").value=document.getElementById("base_case_2").value;	

</script>



    </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>
<script type="text/javascript" src="${APP_PATH }/static/javascript/jquery.min.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/layui/layui.all.js"></script>

<script type="text/javascript" src="${APP_PATH }/static/icheck/icheck.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/javascript/dw.js"></script>
</body>
</html>