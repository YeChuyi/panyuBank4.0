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
  <title>留言管理</title>
       <%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
     %>
  <link rel="stylesheet" href="${APP_PATH }/static/layui/css/layui.css">
  <link rel="stylesheet" href="${APP_PATH }/static/css/global.css">
  <link rel="stylesheet" href="${APP_PATH }/static/icheck/minimal/red.css">
    <script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
  
   
</head>
<body class="layui-layout-body">
<%
  request.setCharacterEncoding("UTF-8");
  response.setCharacterEncoding("UTF-8");
  
  MessageBoardService mbs=new MessageBoardServiceImpl();
  //List<MessageBoard> messboardlist=mbs.getAllMessageBoard();
  //mbs.updateExcelOfMessageBoard();
  

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
      
        <li class="layui-nav-item"><a href="${APP_PATH }/index">首页</a></li>

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
		
		<fieldset class="layui-elem-field">
            <legend>留言板 - 列表</legend>
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
                  <button class="layui-btn layui-btn-sm dw-refresh">
                      <i class="layui-icon">&#x1002;</i>刷新
                  </button>
              </div>
             
              <a href="${APP_PATH }/SpeakReplied" class="layui-btn layui-btn-sm" >查看已回复留言</a>
                  <a href="uploadMessOrderServlet"  onclick="if(confirm('确定导出上个月至之前的所有记录?')==false)return false;">
              	  <button id="exportMessage_btn" onclick="exportMessage()" class="layui-btn layui-btn-sm layui-btn-normal">
                      <i class="layui-icon">&#xe601;</i>导出留言
                  </button>
                  </a> 
              <hr>
              	<!-- 表格顶部左侧工具栏 -->
				<script type="text/html" id="toolbarDemo">
					<div class="layui-btn-container">
	             
						<button class="layui-btn layui-btn-sm layui-btn-danger" onclick="delMany()">
	                    	<i class="layui-icon">&#xe640;</i>批量删除
	                	</button>
                	</div>
				</script>
              
              <table class="layui-hide" id="test" lay-filter="test"></table>
				
				<script type="text/html" id="barDemo">
	                <a class="layui-btn layui-btn-normal layui-btn-sm dw-batch-delete" lay-event="reply">回复</a>
					<a class="layui-btn layui-btn-danger layui-btn-sm dw-batch-delete" lay-event="del">删除</a>
				</script>
				
            </div>
        </fieldset>
		
		



    </div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>
<script type="text/javascript" src="${APP_PATH }/static/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/layui/layui.all.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/icheck/icheck.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/javascript/dw.js"></script>

<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
    ,url:'${APP_PATH}/GetMessageBoardNoReply'
    ,defaultToolbar: ['print', 'exports']
//     ,toolbar: true //仅开启工具栏，不显示左侧模板
    ,toolbar: '#toolbarDemo'
    ,limits: [10,20,30]
    ,limit: 10 //每页默认显示的数量
    ,cols: [[
    	{type: 'checkbox'}
      ,{field:'id',width:40, title: 'ID', sort: true}
      ,{field:'messusername',width:80, title: '用户名'}
      ,{field:'messuserphonenum',width:130, title: '手机号码', sort: true}
      ,{field:'messdate', width:165,title: '留言时间', sort: true}
      ,{field:'messusermessage',width:920, minWidth:130, title: '留言详情'}
      ,{field:'status',width:80, minWidth:180, title: '状态',templet:'#forStatusTpl', sort: true}
      ,{title:'操作',width:180, toolbar: '#barDemo', align:'center'}
    ]]
    ,page: true //开启分页
    
  });

  //监听行工具事件,单个删除按钮事件
  table.on('tool(test)', function(obj){
    var data = obj.data;
    var one_id = new Array();//声明数组,统一同一个servlet进行删除
    one_id[0] = data.id;
//     console.log(obj);
//     console.log(one_id);
    if(obj.event === 'del'){
      layer.confirm('真的删除 用户【'+data.messusername+'】留言 吗？', function(index){
        obj.del();
        layer.close(index);
        $.ajax({
			url : '${APP_PATH}/DeleteMessageBoard',
			type : "GET",
			traditional : true,//传数组一定要加的
			data : {
				'id' : one_id
			},
			dataType : "json",
			success : function(result) {
     		//	console.log(result);	//返回的json数据，后台要toString，不然out.println单个数据时会被当成String，报错
				if (result.status == 1) {
					layer.msg('删除成功');
// 					table.reload('test',{});	//刷新重载表格数据
				} else {
					layer.msg('操作失败，请刷新后再试！');
				}
			},
			'error':function () {
				layer.msg('系统错误');
			}
		});
		
      });
    }
    
    if(obj.event === 'reply'){
        
          
        
         window.location.href="${APP_PATH}/speakReply?id="+ encodeURI(encodeURI(one_id))
           
        
	
      
    }
  });

});



//批量删除 按钮事件
	function delMany() {
		var datas;
		var id = new Array();//声明数组
		layui.use('table', function() {
			var table = layui.table;
			var checkStatus = table.checkStatus('test');//声明复选框，'test'为table的id标识
			datas = checkStatus.data;	//获取选中行的数据
			//console.log(datas); 
			for ( var i in datas) {
				id[i] = datas[i].id;//得到复选框的值，获取选中行的ID列的id值
			}
			if(checkStatus.data.length==0){
				parent.layer.msg('请先选择要删除的数据行！', {icon: 5});	//icon的值是小图标，详情看api文档
// 				parent.layer.msg('删除中...', {icon: 16,shade: 0.3,time:5000});
				return ;
			} else {
				//选择框
				layer.confirm('真的删除这 '+checkStatus.data.length+' 行数据吗？', function(index){
			        layer.close(index);		//选择后关闭
			        $.ajax({
						url : '${APP_PATH}/DeleteMessageBoard',
						type : "GET",
						traditional : true,//传数组一定要加的
						data : {
							'id' : id
						},
						dataType : "json",
						success : function(result) {
// 							console.log(result);	//返回的json数据。后台要toString，不然out.println单个数据时会被当成String，报错
							if (result.status == 1) {
								layer.msg('删除成功');
								table.reload('test',{});	//刷新重载表格数据
							} else {
								layer.msg('操作失败，请刷新后再试！');
							}
						},
						'error':function (result) {
							layer.msg('系统错误');
						}
					});
					
					
			    });
				
			}
		});
		
	}
</script>
<script type="text/html" id="forStatusTpl">
{{# if(d.status=='0'){d.status='未回复'}}
<span style="color:#FF7F00;">{{d.status}}</span>
{{#} else{d.status='已回复'}}
{{d.status}}
{{#}}}


</script>

</body>
</html>