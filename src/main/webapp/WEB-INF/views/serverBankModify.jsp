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
  <title>网点修改</title>
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
		  		服务网点-详情
		  		</legend>
			</fieldset>
		</blockquote>
 
 
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
		  <legend>信息修改</legend>
		</fieldset>
		 
		<form class="layui-form" action="">
			  <div class="layui-form-item">
				    <label class="layui-form-label">单行输入框</label>
				    <div class="layui-input-block">
				      <input type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
				    </div>
			  </div>
			  <div class="layui-form-item">
				    <label class="layui-form-label">验证必填项</label>
				    <div class="layui-input-block">
				      <input type="text" name="username" lay-verify="required" placeholder="请输入" autocomplete="off" class="layui-input">
				    </div>
			  </div>
			  
			  <div class="layui-form-item">
				    <div class="layui-inline">
				      <label class="layui-form-label">验证手机</label>
				      <div class="layui-input-inline">
				        <input type="tel" name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input">
				      </div>
				    </div>
				    <div class="layui-inline">
				      <label class="layui-form-label">验证邮箱</label>
				      <div class="layui-input-inline">
				        <input type="text" name="email" lay-verify="email" autocomplete="off" class="layui-input">
				      </div>
				    </div>
		  		</div>
		  
		  
			  
			  <div class="layui-form-item">
			    <div class="layui-inline">
			      <label class="layui-form-label">范围</label>
			      <div class="layui-input-inline" style="width: 100px;">
			        <input type="text" name="price_min" placeholder="￥" autocomplete="off" class="layui-input">
			      </div>
			      <div class="layui-form-mid">-</div>
			      <div class="layui-input-inline" style="width: 100px;">
			        <input type="text" name="price_max" placeholder="￥" autocomplete="off" class="layui-input">
			      </div>
			    </div>
			  </div>
			
		  
		
		  
			  <div class="layui-form-item">
			    <label class="layui-form-label">联动选择框</label>
			    <div class="layui-input-inline">
			      <select name="quiz1">
			        <option value="">请选择省</option>
			        <option value="浙江" selected="">浙江省</option>
			        <option value="你的工号">江西省</option>
			        <option value="你最喜欢的老师">福建省</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="quiz2">
			        <option value="">请选择市</option>
			        <option value="杭州">杭州</option>
			        <option value="宁波" disabled="">宁波</option>
			        <option value="温州">温州</option>
			        <option value="温州">台州</option>
			        <option value="温州">绍兴</option>
			      </select>
			    </div>
			    <div class="layui-input-inline">
			      <select name="quiz3">
			        <option value="">请选择县/区</option>
			        <option value="西湖区">西湖区</option>
			        <option value="余杭区">余杭区</option>
			        <option value="拱墅区">临安市</option>
			      </select>
			    </div>
			    <div class="layui-form-mid layui-word-aux">此处只是演示联动排版，并未做联动交互</div>
			  </div>
		  
		
			  <div class="layui-form-item">
			    <div class="layui-input-block">
			      <button class="layui-btn" lay-submit="" lay-filter="demo1">保存</button>
			      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
			    </div>
			  </div>
		</form>


<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
layui.use(['form', 'layedit', 'laydate'], function(){
  var form = layui.form
  ,layer = layui.layer
  ,layedit = layui.layedit
  ,laydate = layui.laydate;
  
  //监听指定开关
  form.on('switch(switchTest)', function(data){
    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {
      offset: '6px'
    });
    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)
  });
  
  //监听提交
  form.on('submit(demo1)', function(data){
    layer.alert(JSON.stringify(data.field), {
      title: '最终的提交信息'
    })
    return false;
  });
 
  //表单初始赋值
  form.val('example', {
    "username": "贤心" // "name": "value"
    ,"password": "123456"
    ,"interest": 1
    ,"like[write]": true //复选框选中状态
    ,"close": true //开关状态
    ,"sex": "女"
    ,"desc": "我爱 layui"
  })
  
  
});
</script>



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