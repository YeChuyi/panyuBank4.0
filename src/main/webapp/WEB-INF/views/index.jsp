<%@ page language="java" import="java.util.*,com.bank.service.*,com.bank.service.impl.*,com.bank.bean.*,java.text.SimpleDateFormat,java.util.Date" pageEncoding="utf-8"%>
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
  <title>首页 </title>
      <%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
     %>
  <link rel="stylesheet" type="text/css" href="${APP_PATH }/static/layui/css/layui.css"/>
   <link rel="stylesheet" type="text/css" href="${APP_PATH }/static/css/index.css" />
<script type="text/javascript" src="${APP_PATH }/static/javascript/echarts.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/javascript/jquery.min.js"></script>

</head>

<body class="layui-layout-body">
<%
         request.setCharacterEncoding(("utf-8"));
		 response.setCharacterEncoding("utf-8");
         
        //获取当前时间
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	/* 	
        //根据当前时间，获取用户总量
		UserPersonalService userPersonalService = new UserPersonalServiceImpl();
		int countUser = userPersonalService.countUserIndexData(df.format(date));
		
		//获取有效预约,即未过期的个贷预约总量
		PeLoOrderService por=new PeLoOrderServiceImpl();
        int countPeLoOrder_All=por.countPeLoOrderIndexData_All();
		
		//根据当前时间，获取留言板总量
		MessageBoardService messageBoardService = new MessageBoardServiceImpl();
		int countMessage = messageBoardService.countMessageIndexData(df.format(date));
		//调用方法，统计留言板已读/未读消息
		int countMessageYes = messageBoardService.countMessageStatusIndexData(1);
		int countMessageNo = messageBoardService.countMessageStatusIndexData(0); */


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
    
      <!-- 左侧导航区域  -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">
      
        <li class="layui-nav-item"><a class="layui-this" href="${APP_PATH }/index">首页</a></li>
        
        <li class="layui-nav-item">
          <a class="" href="javascript:;">预约管理</a>
          <dl class="layui-nav-child">
            <dd><a href="${APP_PATH}/personal">个贷预约</a></dd>
          </dl>
        </li>
        
        <li class="layui-nav-item">
          <a href="javascript:;">用户管理</a>
          <dl class="layui-nav-child">
            <dd><a href="<%=basePath%>admin/userPersonal.jsp">个贷用户</a></dd>
          </dl>
        </li>
        <li class="layui-nav-item">
            <a href="javascript:;">留言管理</a>
            <dl class="layui-nav-child">
                <dd><a href="${APP_PATH }/Speak">留言板</a></dd>
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
    
	<div class="top flex-container">
	
		<div class="flex-item">
	  		<div class="icon-div" style="background-color: #F7B824;">
		  		<div class="icon">
					<i class="layui-icon" style="font-size: 60px; color: white;">&#xe613;</i>
				</div>
			</div>
			<div class="value-div">
				<div class="value">
					<a href="<%=basePath%>admin/userPersonal.jsp">
						<h1>${requestScope.countUser} </h1>
						<h3>用户总量</h3>
					</a>
				</div>
			</div>
	  	</div>

		
	  	<div class="flex-item">
	  		<div class="icon-div" style="background-color: #5FB878;">
		  		<div class="icon">
					<i class="layui-icon" style="font-size: 60px; color: white;">&#xe612;</i>
				</div>
			</div>
			<div class="value-div">
				<div class="value">
					<a href="${APP_PATH }/personal">
						<h1> ${requestScope.countPeLoOrder_All}  </h1>
						<h3>个贷预约</h3>
					</a>
				</div>
			</div>
	  	</div>
	  	
	  	<div class="flex-item">
	  		<div class="icon-div" style="background-color: #393D49;">
		  		<div class="icon">
					<i class="layui-icon" style="font-size: 60px; color: white;">&#xe638;</i>
				</div>
			</div>
			<div class="value-div">
				<div class="value">
					<a href="<%=basePath%>admin/speak.jsp">
						<h1>  ${requestScope.countMessage}  </h1>
						<h3>留言总量</h3>
					</a>
				</div>
			</div>
	  	</div>
	  	
	  	<div class="flex-item">
	  		<div class="icon-div" style="background-color: #1E9FFF;">
		  		<div class="icon">
					<i class="layui-icon" style="font-size: 60px; color: white;">&#xe63a;</i>
				</div>
			</div>
			<div class="value-div">
				<div class="value">
					<a href="<%=basePath%>admin/speak.jsp">
						<h1> ${requestScope.countMessageNo} </h1>
						<h3>未读留言</h3>
					</a>
				</div>
			</div>
	  	</div>  
	</div>
	
	
	
    <div class="flex-container" style="width: 100%;height: 76%;">
 
		<div id="charts-left" class="" style="width: 55%;height:90%; " ></div>
		<div id="charts-right" style="width: 35%;height:90%;"></div>
		
		<script type="text/javascript">
	        // 基于准备好的dom，初始化echarts实例
        	var myChart_left = echarts.init(document.getElementById('charts-left'));
        	var myChart_right = echarts.init(document.getElementById('charts-right'));
	        
	        // 异步加载数据
			$.get('${APP_PATH}/IndexData').done(function (data) {
				
				data = JSON.parse(data);
				 
			    // 左边，柱状图
			    myChart_left.setOption({
			        title : {
			        text: '每日新增统计图示',
			        subtext: ''
				    },
				    tooltip : {
				        trigger: 'axis'
				    },
				    legend: {
				        data:['新增用户','新增个贷预约','新增留言']
				    },
				    toolbox: {
				        show : true,
				        feature : {
				            dataView : {show: true, readOnly: false},
				            
				            saveAsImage : {show: true}
				        }
				    },
				    calculable : true,
				    xAxis : [
				        {
				            type : 'category',
				            data : data.date_Array
				        }
				    ],
				    yAxis : [
				        {
				            type : 'value'
				        }
				    ],
				    series : [
				        {
				            name:'新增用户',
				            type:'bar',
				            data:data.countUser_Array,
				            markPoint : {
				                data : [
				                    {type : 'max', name: '最大值'},
				                ]
				            },
				            itemStyle:{
                            	normal:{
                            		color:'#F7B824'
                            	}
                            }
				        },
				        {
				            name:'新增个贷预约',
				            type:'bar',
				            data:data.countPeLoOrder_Array,
				            markPoint : {
				                data : [
				                    {type : 'max', name: '最大值'},
				
				                ]
				            },
				            itemStyle:{
                            	normal:{
                            		color:'#5FB878'
                            	}
                            }
				        },
				        {
				            name:'新增留言',
				            type:'bar',
				            data:data.countMessage_Array,
				            markPoint : {
				                data : [
				                    {type : 'max', name: '最大值'},
				
				                ]
				            },
				            itemStyle:{
                            	normal:{
                            		color:'#393D49'
                            	}
                            }
				        }
				    ]
			    });
			    
			    // 右边，留言板扇形图
			    myChart_right.setOption({
			        title : {
				        text: '留言板消息',
				        subtext: '',
				        x:'center'
				    },
				    tooltip : {
				        trigger: 'item',
				        formatter: "{a} <br/>{b} : {c} ({d}%)"
				    },
				    legend: {
				        orient: 'vertical',
				        left: 'left',
				        data: ['未读留言','已读留言']
				    },
				    series : [
				        {
				            name: '数据：',
				            type: 'pie',
				            radius : '65%',
				            center: ['50%', '60%'],
				            data:[
				                {value:data.countMessageNo, name:'未读留言'},
				                {value:data.countMessageYes, name:'已读留言'}
				            ],
				            itemStyle: {
				                emphasis: {
				                    shadowBlur: 10,
				                    shadowOffsetX: 0,
				                    shadowColor: 'rgba(0, 0, 0, 0.5)'
				                }
				            }
				        }
				    ]
			    });
			});
		</script>
	
		
    </div>

  </div>



  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>


<script type="text/javascript" src="${APP_PATH }/static/javascript/jquery.min.js"></script>
<script type="text/javascript" src="${APP_PATH }/static/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="${APP_PATH }/static/javascript/index.js"></script>


</body>
</html>