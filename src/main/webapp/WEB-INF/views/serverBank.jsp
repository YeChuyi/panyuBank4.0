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
  <title>网点管理</title>
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
        <li class="layui-nav-item">
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



<fieldset class="layui-elem-field">
            <legend>服务网点 - 列表</legend>
            <div class="layui-field-box">
              <form class="layui-form" action="">
                <div class="layui-form-item" style="text-align:center;">
                  <div class="layui-inline">
                    <div class="layui-input-inline">
                      <input autocomplete="off" class="layui-input" placeholder="请输入名称" type="text" name="name" value="">
                    </div>
                  </div>
                  <div class="layui-inline" style="text-align:left;">
                    <div class="layui-input-inline">
                      <button class="layui-btn"><i class="layui-icon">&#xe615;</i>查询</button>
                    </div>
                  </div>
                </div>
              </form>
              <hr>
              <div class="layui-btn-group">
					<a href="<%=basePath%>admin/serverBankAdd.jsp">
						<button class="layui-btn layui-btn-xs layui-btn-normal">
	                      <i class="layui-icon">&#xe654;</i>新增
	                  	</button>
                  	</a>
                  	
					<button class="layui-btn layui-btn-xs dw-refresh">
                      <i class="layui-icon">&#x1002;</i>刷新
                  	</button>
              </div>
              <hr>
              <table class="layui-table">
                  <colgroup>
                      <col>
                      <col>
                      <col>
                      <col>
                      <col>
                      <col>
                  </colgroup>
                  <thead>
                      <tr>
                      <th class="selectAll"><input type="checkbox"></th>
                      <th>ID</th>
                      <th>网点名称</th>
                      <th>创建时间</th>
                      <th>网点地址</th>
                      <th style="text-align:center;">操作</th>
                      </tr> 
                  </thead>
                  
                  <tbody>
                      <tr>
	                      <td><input type="checkbox" name="id" value="1"></td>
	                      <td>2</td>
	                      <td>珠江支行</td>
	                      <td>2019-1-28 9:00</td>
	                      <td>广东省广州市荔湾区2018号</td>
	                      <td class="text-center">
	                        <div class="layui-btn-group">
	                          <a href="<%=basePath%>admin/serverBankDetail.jsp?id=1">
		                          <button class="layui-btn layui-btn-xs layui-btn-normal">
		                            <i class="layui-icon">&#xe642;</i>详情
		                          </button>
	                          </a>
	                          
	                          <button class="layui-btn layui-btn-xs layui-btn-danger">
	                            <i class="layui-icon">&#xe640;</i>删除
	                          </button>
	                        </div>
	                      </td>
                      </tr>

                  </tbody>
              </table>
            </div>
        </fieldset>
		




    </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>admin/javascript/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/layui/layui.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/icheck/icheck.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/javascript/dw.js"></script>
</body>
</html>