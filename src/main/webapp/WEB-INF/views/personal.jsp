<%@ page language="java" import="java.util.*,com.bank.bean.*,com.bank.service.*,com.bank.service.impl.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
 
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <title>个贷预约</title>
        <%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
     %>
  <link rel="stylesheet" href="${APP_PATH}/static/layui/css/layui.css">
  <link rel="stylesheet" href="${APP_PATH}/static/css/global.css">
  <link rel="stylesheet" href="${APP_PATH}/static/icheck/minimal/red.css">
  
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/bootstrap.min.css"/>
   
   <style type="text/css">
		a:link{text-decoration:none ;}
		a:visited {text-decoration:none ; }
		a:hover {text-decoration:underline ; }
		a:active {text-decoration:none ; }
		a.aa{text-decoration:none ;}
   </style>
   
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
          ${sessionScope.admin.adminposition} : ${sessionScope.admin.adminname }
        </a>
        <dl class="layui-nav-child">
         	<dd><a href="<%=basePath%>admin/adminPersonal.jsp">基本信息</a></dd>
          	<dd><a href="<%=basePath%>admin/updatePassword.jsp">修改密码</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a class="aa" href="LogoutServlet">注销</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
      
        <li class="layui-nav-item"><a class="aa" href="${APP_PATH }/index">首页</a></li>
        
        <li class="layui-nav-item layui-nav-itemed">
          <a class="aa" href="javascript:;">预约管理</a>
          <dl class="layui-nav-child">
            <dd><a class="layui-this aa" href="<%=basePath%>admin/personal.jsp">个贷预约</a></dd>
          </dl>
        </li>
        
        <li class="layui-nav-item">
          <a class="aa" href="javascript:;">用户管理</a>
          <dl class="layui-nav-child">
            <dd><a class="aa" href="<%=basePath%>admin/userPersonal.jsp">个贷用户</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
            <a class="aa" href="javascript:;">留言管理</a>
            <dl class="layui-nav-child">
                <dd><a class="aa" href="<%=basePath%>admin/speak.jsp">留言板</a></dd>
            </dl>
        </li>
        
        <li class="layui-nav-item">
                <a class="aa" href="javascript:;">前端设置</a>
                <dl class="layui-nav-child">
                    <dd><a class="aa" href="<%=basePath%>admin/appText.jsp">页面说明</a></dd>
                </dl>
        </li>

        <li class="layui-nav-item">
            <a class="aa" href="javascript:;">系统设置</a>
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
            <legend>个贷业务 - 预约列表</legend>
            <div class="layui-field-box">
              <form class="layui-form" action="queryPeLoOrderServlet" method="post">
                <div class="layui-form-item" style="text-align:center;">
                  <div class="layui-inline">
                    <div class="layui-input-inline">
                      <input autocomplete="off" class="layui-input" placeholder="请输入借款人姓名" type="text" name="PeLoOrName" value="">
                
                    </div>
                     <div class="layui-input-inline">
                      <input autocomplete="off" class="layui-input" placeholder="请输入借款人手机号码" type="text" name="PeLoOrPhoneNum" value="">

                    </div>
                     <div class="layui-input-inline">
                      <input autocomplete="off" class="layui-input" placeholder="办理时间,例2019-01-01 9:00" type="text" name="PeLoOrDate" value="">
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
                      <i class="layui-icon">&#xe666;</i>刷新
                  </button>
                  <a href="uploadPeLoOrderServlet">
              	  <button onclick="Export()" class="layui-btn layui-btn-sm layui-btn-normal">
                      <i class="layui-icon">&#xe601;</i>导出
                  </button>
                  </a>
                  <a href="queryPeLoOrderNumServlet">
	                  <button class="layui-btn layui-btn-sm layui-btn-danger">
	                      <i class="layui-icon">&#xe614;</i>预约设置
	                  </button>
                  </a>
              </div>
              <hr>
              <table class="layui-table" id="tableSort">
                  <colgroup>
                      <col>
                      <col>
                      <col>
                      <col>
                      <col width="150">
                      <col width="150">
                      <col>
                      <col>
                      <col>
                  </colgroup>
                  <thead>
                      <tr>
                      <th class="selectAll"><input type="checkbox"></th>
                      <th data-type="num">ID</th>
	                  <th data-type="string">业务类型</th>
	                  <th data-type="date">下单时间</th>
	                  <th data-type="string">预约办理时间</th>
	                  <th data-type="string">借款人姓名</th>
	                  <th data-type="num">借款人手机号</th>
                      <th style="text-align:center;">操作</th>
                      </tr> 
                  </thead>
                  
                  <tbody>
                <c:forEach items="${requestScope.peloorderlist }" var="peloorder">
                      <tr>
	                      <td><input type="checkbox" name="id" value="1"></td>
	                      <td>${peloorder.id}</td>
	                      <td>${ peloorder.peloorbusinesstype}</td>
	                      <td>${ peloorder.peloorcreaterdate}</td>
	                      <td>${ peloorder.peloordate} <br>${ peloorder.peloortime}</td>
	                      <td>${ peloorder.peloorname}</td>
	                      <td>${ peloorder.peloorphonenum}</td>
	                      <td class="text-center">
	                        <div class="layui-btn-group">
	                         <a href="${APP_PATH}/PersonalDetail?id=${peloorder.id}"   >
	                          <button  class="layui-btn layui-btn-xs layui-btn-normal" >
	                            <i class="layui-icon">&#xe642;</i>详情
	                          </button>
	                          </a>
	                          <button onclick="deletePeLoOrder()" class="layui-btn layui-btn-xs layui-btn-danger" >
	                            <i class="layui-icon">&#xe640;</i>删除
	                          </button>
	                        </div>
	                      </td>
                      </tr>
                    	</c:forEach>
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
<script type="text/javascript" src="${APP_PATH}/static/javascript/jquery.min.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/layui/layui.all.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/icheck/icheck.js"></script>
<script type="text/javascript" src="${APP_PATH}/static/javascript/dw.js"></script>

<script type="text/javascript">  
			


   function jump(id){
	  var id=id;
      alert(id); 
   
     window.location.href="${APP_PATH}/personalDetail?id="+id;
   
   }
   function deletePeLoOrder(id,name){
      var names=name;
      
     if(confirm("确认删除【"+names+"】吗？")){
        		 //确认,发送ajax请求
        		 $.ajax({
        			 url:"DeletePeLoOrServlet",
        			 data:"PeLoOrderId="+id,
        			 type:"post",
        			 success:function(result){
        				 //alert(result)
        				 //1.回到本页
        				window.location.reload()
        			 }
        		 });
        	 }
   
   
   
   }
  


</script>

<script type="text/javascript">
//点击表头排序
;(function(){
var tbody = document.querySelector('#tableSort').tBodies[0];
var th = document.querySelector('#tableSort').tHead.rows[0].cells;
var td = tbody.rows;
for(var i = 0;i < th.length;i++){
  th[i].flag = 1;
  th[i].onclick = function(){
    sort(this.getAttribute('data-type'),this.flag,this.cellIndex);
    this.flag = -this.flag;
  };
};
function sort(str,flag,n){
  var arr = [];
  for(var i = 0;i < td.length;i++){
    arr.push(td[i]);
  };
  arr.sort(function(a,b){
    return method(str,a.cells[n].innerHTML,b.cells[n].innerHTML) * flag;
  });
  for(var i = 0;i < arr.length;i++){
    tbody.appendChild(arr[i]);
  };
};
function method(str,a,b){
  switch(str){
  case 'num': 
    return a-b;
    break;
  case 'string': 
    return a.localeCompare(b);
    break;
  default:
    return new Date(a.split('-').join('/')).getTime()-new Date(b.split('-').join('/')).getTime();
  };
};
})();
</script>


</body>
</html>