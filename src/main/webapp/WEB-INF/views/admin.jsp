<%@ page language="java" import="java.util.*,com.bank.service.*,com.bank.service.impl.*,com.bank.bean.*" pageEncoding="utf-8"%>
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
  <title>系统设置</title>
  <script type="text/javascript" src="<%=basePath %>static/admin/js/jquery-1.12.4.min.js"></script>
  <link rel="stylesheet" href="<%=basePath%>admin/layui/css/layui.css">
  <link rel="stylesheet" href="<%=basePath%>admin/css/global.css">
  <link rel="stylesheet" href="<%=basePath%>admin/icheck/minimal/red.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>static/admin/layui/css/layui.css"/>
	<link rel="stylesheet" type="text/css" href="<%=basePath%>static/admin/css/admin.css"/>
    <link rel="stylesheet" type="text/css" href="<%=basePath %>static/admin/css/bootstrap.min.css"/>
   
  
</head>
<body class="layui-layout-body">

<!-- 后台管理员修改的模态框 -->
<div class="modal fade" id="adminUpdateModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">后台管理员修改</h4>
				</div>
				<div class="modal-body">
                  
					<form action="UpdateHouTaiAdminServlet" class="form-horizontal" method="post">
					<div class="form-group">
							<label class="col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<input type="hidden"  name="adminId" class="form-control" id="adminId_Update_input"
									placeholder="ID不可修改">
									 <span class="help-block"></span>
							</div>
						</div>
						<div class="form-group">
							<label class="col-sm-2 control-label">账号<font color='red'>*</font></label>
							<div class="col-sm-10">
								<input type="text" name="adminUser" class="form-control" id="adminUser_Update_input"
									placeholder="请输入账号">
									 <span class="help-block"></span>
							</div>
						</div>
						
						<div class="form-group">
						  <label class="col-sm-2 control-label">姓名<font color='red'>*</font></label>
							<div class="col-sm-10">
								<input type="text" name="adminName" class="form-control" id="adminName_Update_input"
									placeholder="请输入管理员姓名">
									<span  class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">密码<font color='red'>*</font></label>
							<div class="col-sm-10">
								<input type="text" name="adminPassword" class="form-control" id="adminPassword_Update_input"
									placeholder="请输入用户密码">
									<span  class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">权限设置</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="adminPosition" id="adminPosition_Update_input" value="后台管理员" checked="checked">
									后台管理员
								</label> 
							</div>
						</div>
						
						<div class="form-group">
						  <label class="col-sm-2 control-label">手机号码<font color='red'>*</font></label>
							<div class="col-sm-10">
								<input type="text" name="adminPhoneNum" class="form-control" id="adminPhoneNum_Update_input"
									placeholder="请输入手机号码">
									<span  class="help-block"></span>
							</div>
						</div>
						<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="submit" class="btn btn-primary"  id="admin_update_btn">更新</button>
				</div>
				</form>

				</div>
			
			</div>
		</div>
	</div>

<!-- 后台管理员添加的模态框 -->
	<div class="modal fade" id="adminAddModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">系统后台管理员添加</h4>
				</div>
				<div class="modal-body">

					<form action="addHouTaiAdminServlet" class="form-horizontal" method="post">
						<div class="form-group">
							<label class="col-sm-2 control-label">账号<font color='red'>*</font></label>
							<div class="col-sm-10">
								<input type="text" name="adminUser" class="form-control" id="adminUser_add_input"
									placeholder="请输入账号">
									 <span class="help-block"></span>
							</div>
						</div>
						
						<div class="form-group">
						  <label class="col-sm-2 control-label">姓名<font color='red'>*</font></label>
							<div class="col-sm-10">
								<input type="text" name="adminName" class="form-control" id="adminName_add_input"
									placeholder="请输入管理员姓名">
									<span  class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">密码<font color='red'>*</font></label>
							<div class="col-sm-10">
								<input type="password" name="adminPassword" class="form-control" id="adminPassword_add_input"
									placeholder="请输入用户密码">
									<span  class="help-block"></span>
							</div>
						</div>

						<div class="form-group">
							<label class="col-sm-2 control-label">权限设置</label>
							<div class="col-sm-10">
								<label class="radio-inline"> <input type="radio"
									name="adminPosition" id="adminPosition_add_input" value="后台管理员" checked="checked">
									后台管理员
								</label> 
							</div>
						</div>
						
						<div class="form-group">
						  <label class="col-sm-2 control-label">手机号码<font color='red'>*</font></label>
							<div class="col-sm-10">
								<input type="text" name="adminPhoneNum" class="form-control" id="adminPhoneNum_add_input"
									placeholder="请输入手机号码">
									<span  class="help-block"></span>
							</div>
						</div>
						
						<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="submit" class="btn btn-primary"  id="emp_save_btn">保存</button>
				</div>
					</form>

				</div>
			    <!-- 上面button的位置，我复制上去了 -->
			</div>
		</div>
	</div>



<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">预约后台管理</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="http://t.cn/RCzsdCq" class="layui-nav-img">
           小叶
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
        
        <li class="layui-nav-item ">
          <a class="" href="javascript:;">服务网点管理</a>
          <dl class="layui-nav-child">
            <dd><a href="<%=basePath%>admin/serverBank.jsp">网点信息</a></dd>
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

        <li class="layui-nav-item layui-nav-itemed">
            <a href="javascript:;">系统设置</a>
            <dl class="layui-nav-child">
                <dd><a class="layui-this" href="<%=basePath%>admin/admin.jsp">后台用户</a></dd>
                <dd><a href="<%=basePath%>admin/manager.jsp">客户经理</a></dd>
            </dl>
        </li>
      </ul>
    </div>
  </div>
   <!-- 这里开始画表格 -->
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">
           <div class="container">
		<!-- 标题 -->
		<div class="row">
			<div class="col-md-12">
				<h1>系统后台管理员</h1>
			</div>
		</div>
		<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
				<button class="btn btn-primary" id="admin_add_modal_btn">新增</button>
				<button class="btn btn-danger" id="emp_delete_all_btn">删除</button>
			</div>
		</div>
		
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="admin_table">
					<thead>
						<tr>
						    <th>
						      <input type="checkbox" id="check_all"></input>
						    </th>
							<th>#</th>
							<th>账号</th>
							<th>系统权限</th>
							<th>姓名</th>
							<th>手机号码</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
						<!-- 下面运用Ajax进行数据填充 -->
					
					</tbody>
				</table>
			</div>
		
	       </div>
					    </div>
    </div>
  </div>
  <script type="text/javascript">
      
        $(document).ready(function () {
         $.ajax({
	    		url:"GetHouTaiAdminServlet",
	    		data:"pn="+1,
	    		type:"post",
	    		success:function(result)
	    		{
	    			//console.log(result);
	    			build_admin_table(result);	
	    		}
	    	});
     
      });
       
	   function build_admin_table(result){
		   //清空table
		   $("#admin_table tbody").empty();
		   
		   var emps= result;
		   console.log(emps);
		   //jquery 中的遍历函数each方法
		   $.each($.parseJSON(emps),function(index,item){
			   var checkBoxTd=$("<td><input type='checkbox' class='check_item'/></td>");
			   var id=$("<td></td>").append(item.id);
			   var AdminUser= $("<td></td>").append(item.AdminUser);
			   var AdminPosition = $("<td></td>").append(item.AdminPosition);
			   var AdminName = $("<td></td>").append(item.AdminName);
			   var AdminPhoneNum= $("<td></td>").append(item.AdminPhoneNum);
			   
		
			   var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
			   .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
			   
			   //为编辑按钮增加自定义属性，来表示ID
			   editBtn.attr("edit-id",item.id);
			   
			   var delBtn= $("<button></button>").addClass("btn btn-danger btn-sm delete_btn")
			   .append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
			   
			   //为删除按钮增加自定义属性，来表示ID
			   delBtn.attr("del-id",item.id);
			   var btnTd= $("<td></td>").append(editBtn).append(" ").append(delBtn);
			   // append 方法执行完成以后还是返回原来的元素
			   $("<tr></tr>")
			   .append(checkBoxTd)
			   .append(id)
			   .append(AdminUser)
			   .append(AdminPosition)
			   .append(AdminName)
			   .append(AdminPhoneNum)
			   
			   .append(btnTd)
			   .appendTo("#admin_table tbody");
		   });
	   }
	  $(document).on("click",".edit_btn",function(){
		   //alert("edit");
		   
		   //1.查出后台管理员信息，显示员工信息
		    getAdmin($(this).attr("edit-id"));
		   
		   //2.把员工的ID传递给更新按钮
		   $("#admin_update_btn").attr("edit-id",$(this).attr("edit-id"));
		   $("#adminUpdateModal").modal({
			   backdrop:"static"  //设置是否可以通过背景来清楚模态框
		   });
		   
		    
	   });
	   function getAdmin(id){
		   $.ajax({
			   url:"GetHouTaiAdminByIdServlet",
			   data:"id="+id,
			   type:"post",
			   success:function(result){
				   
				   var adminData=$.parseJSON(result);
				   console.log(adminData)
				    $("#adminId_Update_input").val(adminData.id);
				   $("#adminUser_Update_input").val(adminData.AdminUser);
				   $("#adminName_Update_input").val(adminData.AdminName);
				   $("#adminPassword_Update_input").val(adminData.AdminPassword);
				   $("#adminPhoneNum_Update_input").val(adminData.AdminPhoneNum);
				 
				  // $("#empName_update_static").text(empData.empName);
				   //$("#email_update_input").val(empData.email);
				   //$("#empUpdateModal input[name=gender]").val([empData.gender]); //前面模态框已经定义了 M对应男，F对应女
				   //$("#empUpdateModal select").val([empData.dId]); //前面模态框已经定义了 1对应开发部，2对应测试部
				   
				   
				   
			   }
			   
		   });
	   }
	      //单个删除,下面绑定每个删除按钮的值
         $(document).on("click",".delete_btn",function(){
        	 //1.弹出是否删除确认框
        	 var adminName=$(this).parents("tr").find("td:eq(4)").text();
        	 var adminId=$(this).attr("del-id");
        	 //$(this).parents("tr").find("td:eq(1)").text();
        	 if(confirm("确认删除【"+adminName+"】吗？")){
        		 //确认,发送ajax请求
        		 $.ajax({
        			 url:"DeleteHouTaiAdminServlet",
        			 data:"adminId="+adminId,
        			 type:"post",
        			 success:function(result){
        				 //alert(result)
        				 //1.回到本页
        				window.location.reload()
        			 }
        		 });
        	 }
	   });
       
	   $("#admin_add_modal_btn").click(function(){
	       
		   
		   //清除表单数据(表单完整重置(表单的数据，表单的样式))
		   reset_form("#adminAddModal form");
		   
		   //表单重置
		   //$("#empAddModal form")[0].reset();
		   //发送ajax请求，查出部门信息，显示在下拉列表中
		  
		   //弹出模态框
		   $("#adminAddModal").modal({
			   backdrop:"static"  //设置是否可以通过背景来清楚模态框
		   });
	   });
	   
	     
	   function reset_form(ele){
		   $(ele)[0].reset();
		   //清空表单样式
		   $(ele).find("*").removeClass("has-error has-success");
		   $(ele).find(".help-block").text("");
	   }
  
  
  </script>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>
<script type="text/javascript" src="<%=basePath%>admin/javascript/jquery.min.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/layui/layui.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/icheck/icheck.js"></script>
<script type="text/javascript" src="<%=basePath%>admin/javascript/dw.js"></script>
<script src="<%=basePath %>static/admin/js/bootstrap.min.js"></script>
</body>
</html>